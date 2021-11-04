// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.schemaregistry;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.test.TestBase;
import com.azure.data.schemaregistry.models.SchemaFormat;
import com.azure.data.schemaregistry.models.SchemaProperties;
import com.azure.data.schemaregistry.models.SchemaRegistrySchema;
import com.azure.identity.DefaultAzureCredentialBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;

import static com.azure.data.schemaregistry.SchemaRegistryAsyncClientTests.PLAYBACK_TEST_GROUP;
import static com.azure.data.schemaregistry.SchemaRegistryAsyncClientTests.RESOURCE_LENGTH;
import static com.azure.data.schemaregistry.SchemaRegistryAsyncClientTests.SCHEMA_CONTENT;
import static com.azure.data.schemaregistry.SchemaRegistryAsyncClientTests.SCHEMA_REGISTRY_ENDPOINT;
import static com.azure.data.schemaregistry.SchemaRegistryAsyncClientTests.SCHEMA_REGISTRY_GROUP;
import static com.azure.data.schemaregistry.SchemaRegistryAsyncClientTests.assertSchemaProperties;
import static com.azure.data.schemaregistry.SchemaRegistryAsyncClientTests.assertSchemaRegistrySchema;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests {@link SchemaRegistryClient}.
 */
public class SchemaRegistryClientTests extends TestBase {

    private String schemaGroup;
    private SchemaRegistryClientBuilder builder;

    @Override
    protected void beforeTest() {
        final String endpoint;
        TokenCredential tokenCredential;
        if (interceptorManager.isPlaybackMode()) {
            tokenCredential = mock(TokenCredential.class);
            schemaGroup = PLAYBACK_TEST_GROUP;

            // Sometimes it throws an "NotAMockException", so we had to change from thenReturn to thenAnswer.
            when(tokenCredential.getToken(any(TokenRequestContext.class))).thenAnswer(invocationOnMock -> {
                return Mono.fromCallable(() -> {
                    return new AccessToken("foo", OffsetDateTime.now().plusMinutes(20));
                });
            });

            endpoint = "https://foo.servicebus.windows.net";
        } else {
            tokenCredential = new DefaultAzureCredentialBuilder().build();
            endpoint = System.getenv(SCHEMA_REGISTRY_ENDPOINT);
            schemaGroup = System.getenv(SCHEMA_REGISTRY_GROUP);

            assertNotNull(endpoint, "'endpoint' cannot be null in LIVE/RECORD mode.");
            assertNotNull(schemaGroup, "'schemaGroup' cannot be null in LIVE/RECORD mode.");
        }

        builder = new SchemaRegistryClientBuilder()
            .credential(tokenCredential)
            .fullyQualifiedNamespace(endpoint);

        if (interceptorManager.isPlaybackMode()) {
            builder.httpClient(interceptorManager.getPlaybackClient());
        } else {
            builder.addPolicy(new RetryPolicy())
                .addPolicy(interceptorManager.getRecordPolicy());
        }
    }

    @Override
    protected void afterTest() {
        Mockito.framework().clearInlineMock(this);
    }

    /**
     * Verifies that we can register a schema and then get it by its schemaId.
     */
    @Test
    public void registerAndGetSchema() {
        // Arrange
        final String schemaName = testResourceNamer.randomName("sch", RESOURCE_LENGTH);
        final SchemaRegistryClient client1 = builder.buildClient();
        final SchemaRegistryClient client2 = builder.buildClient();
        final SchemaFormat schemaFormat = SchemaFormat.AVRO;

        // Act
        final SchemaProperties response = client1.registerSchema(schemaGroup, schemaName, SCHEMA_CONTENT, schemaFormat);

        // Assert
        assertSchemaProperties(response, null, schemaFormat);

        // Assert that we can get a schema based on its id. We registered a schema with client1 and its response is
        // cached, so it won't make a network call when getting the schema. client2 will not have this information.
        final String schemaIdToGet = response.getId();

        // Act
        final SchemaRegistrySchema schema1 = client2.getSchema(schemaIdToGet);

        // Assert
        assertSchemaRegistrySchema(schema1, schemaIdToGet, SchemaFormat.AVRO, SCHEMA_CONTENT);
    }

    /**
     * Verifies that we can register a schema and then get it by its schemaId. Then add another version of it, and get
     * that version.
     */
    @Test
    public void registerAndGetSchemaTwice() {
        // Arrange
        final String schemaContentModified = "{\"type\" : \"record\",\"namespace\" : \"TestSchema\",\"name\" : \"Employee\",\"fields\" : [{ \"name\" : \"Name\" , \"type\" : \"string\" },{ \"name\" : \"Age\", \"type\" : \"int\" },{ \"name\" : \"Sign\", \"type\" : \"string\" }]}";
        final String schemaName = testResourceNamer.randomName("sch", RESOURCE_LENGTH);
        final SchemaRegistryClient client1 = builder.buildClient();
        final SchemaRegistryClient client2 = builder.buildClient();
        final SchemaFormat schemaFormat = SchemaFormat.AVRO;

        // Act & Assert
        final SchemaProperties response = client1.registerSchema(schemaGroup, schemaName, SCHEMA_CONTENT,
            SchemaFormat.AVRO);
        assertSchemaProperties(response, null, schemaFormat);

        // Expected that the second time we call this method, it will return a different schema because the contents
        // are different.
        final SchemaProperties response2 = client1.registerSchema(schemaGroup, schemaName, schemaContentModified,
            SchemaFormat.AVRO);
        assertSchemaProperties(response2, null, schemaFormat);

        // Assert that we can get a schema based on its id. We registered a schema with client1 and its response is
        // cached, so it won't make a network call when getting the schema. client2 will not have this information.
        assertNotEquals(response.getId(), response2.getId());

        // Act & Assert
        final SchemaRegistrySchema response3 = client2.getSchema(response2.getId());
        assertSchemaRegistrySchema(response3, response2.getId(), schemaFormat, schemaContentModified);
    }

    /**
     * Verifies that we can register a schema and then get it by its schema group, name, and content.
     */
    @Test
    public void registerAndGetSchemaId() {
        // Arrange
        final String schemaName = testResourceNamer.randomName("sch", RESOURCE_LENGTH);
        final SchemaRegistryClient client1 = builder.buildClient();
        final SchemaRegistryClient client2 = builder.buildClient();
        final SchemaFormat schemaFormat = SchemaFormat.AVRO;

        // Act & Assert
        final SchemaProperties response = client1.registerSchema(schemaGroup, schemaName, SCHEMA_CONTENT,
            schemaFormat);
        assertSchemaProperties(response, null, schemaFormat);

        // Assert that we can get a schema based on its id. We registered a schema with client1 and its response is
        // cached, so it won't make a network call when getting the schema. client2 will not have this information.
        final String schemaIdToGet = response.getId();
        assertNotNull(schemaIdToGet);

        // Act & Assert
        final SchemaProperties schemaProperties = client2.getSchemaProperties(schemaGroup, schemaName, SCHEMA_CONTENT,
            schemaFormat);

        assertEquals(schemaIdToGet, schemaProperties.getId());
        assertEquals(schemaFormat, schemaProperties.getFormat());
    }

    /**
     * Verifies that we can register a schema and then get it by its schemaId.
     */
    @Test
    public void registerBadRequest() {
        // Arrange
        final String invalidContent = "\"{\"type\" : \"record\",\"namespace\" : \"TestSchema\",\"name\" : \"Employee\",\"fields\" : [{ \"name\" : \"Name\" , \"type\" : \"string\" },{ \"name\" : \"Age\" }]}\"";
        final String schemaName = testResourceNamer.randomName("sch", RESOURCE_LENGTH);
        final SchemaRegistryClient client1 = builder.buildClient();

        // Act
        final HttpResponseException exception = assertThrows(HttpResponseException.class,
            () -> client1.registerSchema(schemaGroup, schemaName, invalidContent, SchemaFormat.AVRO));

        // Assert
        assertEquals(400, exception.getResponse().getStatusCode());
    }

    /**
     * Verifies that we get 404 when non-existent schema returned.
     */
    @Test
    public void getSchemaDoesNotExist() {
        // Arrange
        final String schemaId = "59f112cf-ff02-40e6-aca9-0d30ed7f7f94";
        final SchemaRegistryClient client1 = builder.buildClient();

        // Act & Assert
        final ResourceNotFoundException error = assertThrows(ResourceNotFoundException.class,
            () -> client1.getSchema(schemaId));

        assertEquals(404, error.getResponse().getStatusCode());
    }

    /**
     * Verifies that we get 404 when non-existent schema query is returned.
     */
    @Test
    public void getSchemaIdDoesNotExist() {
        // Arrange
        final SchemaRegistryClient client1 = builder.buildClient();

        // Act & Assert
        final ResourceNotFoundException error = assertThrows(ResourceNotFoundException.class,
            () -> client1.getSchemaProperties(PLAYBACK_TEST_GROUP, "bar", SCHEMA_CONTENT, SchemaFormat.AVRO));

        assertEquals(404, error.getResponse().getStatusCode());
    }
}
