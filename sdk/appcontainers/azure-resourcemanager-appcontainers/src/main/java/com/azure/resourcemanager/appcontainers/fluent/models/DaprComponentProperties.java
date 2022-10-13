// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appcontainers.models.DaprMetadata;
import com.azure.resourcemanager.appcontainers.models.Secret;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Dapr Component resource specific properties. */
@Fluent
public final class DaprComponentProperties {
    /*
     * Component type
     */
    @JsonProperty(value = "componentType")
    private String componentType;

    /*
     * Component version
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Boolean describing if the component errors are ignores
     */
    @JsonProperty(value = "ignoreErrors")
    private Boolean ignoreErrors;

    /*
     * Initialization timeout
     */
    @JsonProperty(value = "initTimeout")
    private String initTimeout;

    /*
     * Collection of secrets used by a Dapr component
     */
    @JsonProperty(value = "secrets")
    private List<Secret> secrets;

    /*
     * Name of a Dapr component to retrieve component secrets from
     */
    @JsonProperty(value = "secretStoreComponent")
    private String secretStoreComponent;

    /*
     * Component metadata
     */
    @JsonProperty(value = "metadata")
    private List<DaprMetadata> metadata;

    /*
     * Names of container apps that can use this Dapr component
     */
    @JsonProperty(value = "scopes")
    private List<String> scopes;

    /** Creates an instance of DaprComponentProperties class. */
    public DaprComponentProperties() {
    }

    /**
     * Get the componentType property: Component type.
     *
     * @return the componentType value.
     */
    public String componentType() {
        return this.componentType;
    }

    /**
     * Set the componentType property: Component type.
     *
     * @param componentType the componentType value to set.
     * @return the DaprComponentProperties object itself.
     */
    public DaprComponentProperties withComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * Get the version property: Component version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Component version.
     *
     * @param version the version value to set.
     * @return the DaprComponentProperties object itself.
     */
    public DaprComponentProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the ignoreErrors property: Boolean describing if the component errors are ignores.
     *
     * @return the ignoreErrors value.
     */
    public Boolean ignoreErrors() {
        return this.ignoreErrors;
    }

    /**
     * Set the ignoreErrors property: Boolean describing if the component errors are ignores.
     *
     * @param ignoreErrors the ignoreErrors value to set.
     * @return the DaprComponentProperties object itself.
     */
    public DaprComponentProperties withIgnoreErrors(Boolean ignoreErrors) {
        this.ignoreErrors = ignoreErrors;
        return this;
    }

    /**
     * Get the initTimeout property: Initialization timeout.
     *
     * @return the initTimeout value.
     */
    public String initTimeout() {
        return this.initTimeout;
    }

    /**
     * Set the initTimeout property: Initialization timeout.
     *
     * @param initTimeout the initTimeout value to set.
     * @return the DaprComponentProperties object itself.
     */
    public DaprComponentProperties withInitTimeout(String initTimeout) {
        this.initTimeout = initTimeout;
        return this;
    }

    /**
     * Get the secrets property: Collection of secrets used by a Dapr component.
     *
     * @return the secrets value.
     */
    public List<Secret> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: Collection of secrets used by a Dapr component.
     *
     * @param secrets the secrets value to set.
     * @return the DaprComponentProperties object itself.
     */
    public DaprComponentProperties withSecrets(List<Secret> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the secretStoreComponent property: Name of a Dapr component to retrieve component secrets from.
     *
     * @return the secretStoreComponent value.
     */
    public String secretStoreComponent() {
        return this.secretStoreComponent;
    }

    /**
     * Set the secretStoreComponent property: Name of a Dapr component to retrieve component secrets from.
     *
     * @param secretStoreComponent the secretStoreComponent value to set.
     * @return the DaprComponentProperties object itself.
     */
    public DaprComponentProperties withSecretStoreComponent(String secretStoreComponent) {
        this.secretStoreComponent = secretStoreComponent;
        return this;
    }

    /**
     * Get the metadata property: Component metadata.
     *
     * @return the metadata value.
     */
    public List<DaprMetadata> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Component metadata.
     *
     * @param metadata the metadata value to set.
     * @return the DaprComponentProperties object itself.
     */
    public DaprComponentProperties withMetadata(List<DaprMetadata> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the scopes property: Names of container apps that can use this Dapr component.
     *
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: Names of container apps that can use this Dapr component.
     *
     * @param scopes the scopes value to set.
     * @return the DaprComponentProperties object itself.
     */
    public DaprComponentProperties withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secrets() != null) {
            secrets().forEach(e -> e.validate());
        }
        if (metadata() != null) {
            metadata().forEach(e -> e.validate());
        }
    }
}
