// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.AppleRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppleRegistrationTests {
    @Test
    public void testDeserialize() {
        AppleRegistration model =
            BinaryData
                .fromString("{\"clientId\":\"oqfbowskanyk\",\"clientSecretSettingName\":\"lcuiywgqywgndr\"}")
                .toObject(AppleRegistration.class);
        Assertions.assertEquals("oqfbowskanyk", model.clientId());
        Assertions.assertEquals("lcuiywgqywgndr", model.clientSecretSettingName());
    }

    @Test
    public void testSerialize() {
        AppleRegistration model =
            new AppleRegistration().withClientId("oqfbowskanyk").withClientSecretSettingName("lcuiywgqywgndr");
        model = BinaryData.fromObject(model).toObject(AppleRegistration.class);
        Assertions.assertEquals("oqfbowskanyk", model.clientId());
        Assertions.assertEquals("lcuiywgqywgndr", model.clientSecretSettingName());
    }
}