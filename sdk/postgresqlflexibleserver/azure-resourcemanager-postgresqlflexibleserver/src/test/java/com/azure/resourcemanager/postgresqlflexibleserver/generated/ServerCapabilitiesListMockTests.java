// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerCapability;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ServerCapabilitiesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"name\":\"zeyqxtjjfzqlqhyc\",\"supportedServerEditions\":[{\"name\":\"ggxdb\",\"defaultSkuName\":\"smieknlra\",\"supportedStorageEditions\":[{\"name\":\"wiuagydwqf\",\"defaultStorageSizeMb\":3449194025603935215,\"supportedStorageMb\":[{},{},{},{}],\"status\":\"Available\",\"reason\":\"gtcojocqwo\"},{\"name\":\"nzjvusfzldm\",\"defaultStorageSizeMb\":5113876316568872308,\"supportedStorageMb\":[{},{},{},{}],\"status\":\"Disabled\",\"reason\":\"tkad\"},{\"name\":\"s\",\"defaultStorageSizeMb\":7622932669056609531,\"supportedStorageMb\":[{},{},{}],\"status\":\"Available\",\"reason\":\"grjqctojcmi\"},{\"name\":\"fieypefojyqdhcup\",\"defaultStorageSizeMb\":7173629993516943647,\"supportedStorageMb\":[{},{},{},{}],\"status\":\"Disabled\",\"reason\":\"hihlhzdsqtzbs\"}],\"supportedServerSkus\":[{\"name\":\"wcjhfgmv\",\"vCores\":1233183309,\"supportedIops\":404644948,\"supportedMemoryPerVcoreMb\":6561780830584801221,\"supportedZones\":[\"e\",\"owcluqo\"],\"supportedHaMode\":[\"SameZone\",\"ZoneRedundant\"],\"status\":\"Visible\",\"reason\":\"uwifzmpjwyiv\"}],\"status\":\"Default\",\"reason\":\"xcvhrfs\"},{\"name\":\"uagrttikteusqc\",\"defaultSkuName\":\"vyklxuby\",\"supportedStorageEditions\":[{\"name\":\"mmfblcqcuubgqib\",\"defaultStorageSizeMb\":323149241327703760,\"supportedStorageMb\":[{},{},{},{}],\"status\":\"Available\",\"reason\":\"wgdsl\"}],\"supportedServerSkus\":[{\"name\":\"hrmooi\",\"vCores\":1309261520,\"supportedIops\":418488184,\"supportedMemoryPerVcoreMb\":6854004636755290327,\"supportedZones\":[\"cxa\",\"zhyrpeto\",\"e\",\"joxslhvnhla\"],\"supportedHaMode\":[\"SameZone\"],\"status\":\"Default\",\"reason\":\"jcjbt\"},{\"name\":\"aehvvibrxjjstoq\",\"vCores\":449265761,\"supportedIops\":774286462,\"supportedMemoryPerVcoreMb\":4666346090573112474,\"supportedZones\":[\"oobklftidgfcwq\"],\"supportedHaMode\":[\"ZoneRedundant\"],\"status\":\"Available\",\"reason\":\"zhe\"}],\"status\":\"Disabled\",\"reason\":\"ohu\"}],\"supportedServerVersions\":[{\"name\":\"wkozz\",\"supportedVersionsToUpgrade\":[\"lkb\"],\"status\":\"Disabled\",\"reason\":\"ajnjwltlwtjj\"},{\"name\":\"ktalhsnvkcdmxz\",\"supportedVersionsToUpgrade\":[\"aimlnwiaaom\",\"l\"],\"status\":\"Visible\",\"reason\":\"ulcsethwwnpj\"}],\"fastProvisioningSupported\":\"Enabled\",\"supportedFastProvisioningEditions\":[{\"supportedTier\":\"pchwa\",\"supportedSku\":\"bousn\",\"supportedStorageGb\":793996513,\"supportedServerVersions\":\"fewetwlyxgncx\",\"serverCount\":1527837396,\"status\":\"Available\",\"reason\":\"h\"},{\"supportedTier\":\"mmbcxfhbcp\",\"supportedSku\":\"xvxcjzhq\",\"supportedStorageGb\":546914966,\"supportedServerVersions\":\"pxtgqscjav\",\"serverCount\":1896179183,\"status\":\"Disabled\",\"reason\":\"qaz\"},{\"supportedTier\":\"tgguwpijrajcivmm\",\"supportedSku\":\"f\",\"supportedStorageGb\":1851539206,\"supportedServerVersions\":\"rxgkne\",\"serverCount\":942321971,\"status\":\"Default\",\"reason\":\"qodfvp\"},{\"supportedTier\":\"hoxgsgbpf\",\"supportedSku\":\"djtxvzflbq\",\"supportedStorageGb\":879778472,\"supportedServerVersions\":\"vl\",\"serverCount\":617486740,\"status\":\"Default\",\"reason\":\"srdvetn\"}],\"geoBackupSupported\":\"Disabled\",\"zoneRedundantHaSupported\":\"Enabled\",\"zoneRedundantHaAndGeoBackupSupported\":\"Disabled\",\"storageAutoGrowthSupported\":\"Enabled\",\"onlineResizeSupported\":\"Disabled\",\"restricted\":\"Disabled\",\"status\":\"Disabled\",\"reason\":\"hyrmewipmvekdx\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        PostgreSqlManager manager =
            PostgreSqlManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<FlexibleServerCapability> response =
            manager.serverCapabilities().list("faxvxil", "btgn", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zeyqxtjjfzqlqhyc", response.iterator().next().name());
    }
}
