// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ConfigurationForUpdate;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationForUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationForUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"value\":\"yoxgvcltbgsnc\",\"description\":\"kjeszz\",\"defaultValue\":\"ijhtxf\",\"dataType\":\"Boolean\",\"allowedValues\":\"fsm\",\"source\":\"eh\",\"isDynamicConfig\":true,\"isReadOnly\":false,\"isConfigPendingRestart\":true,\"unit\":\"debfqkkrbmpukgri\",\"documentationLink\":\"lzlfbxzpuz\"}}")
                .toObject(ConfigurationForUpdate.class);
        Assertions.assertEquals("yoxgvcltbgsnc", model.value());
        Assertions.assertEquals("eh", model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationForUpdate model = new ConfigurationForUpdate().withValue("yoxgvcltbgsnc").withSource("eh");
        model = BinaryData.fromObject(model).toObject(ConfigurationForUpdate.class);
        Assertions.assertEquals("yoxgvcltbgsnc", model.value());
        Assertions.assertEquals("eh", model.source());
    }
}
