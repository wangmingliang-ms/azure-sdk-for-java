// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityReason;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CheckNameAvailabilityResponseInnerTests {
    @Test
    public void testDeserialize() {
        CheckNameAvailabilityResponseInner model =
            BinaryData
                .fromString("{\"nameAvailable\":true,\"reason\":\"AlreadyExists\",\"message\":\"kteusqczk\"}")
                .toObject(CheckNameAvailabilityResponseInner.class);
        Assertions.assertEquals(true, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.ALREADY_EXISTS, model.reason());
        Assertions.assertEquals("kteusqczk", model.message());
    }

    @Test
    public void testSerialize() {
        CheckNameAvailabilityResponseInner model =
            new CheckNameAvailabilityResponseInner()
                .withNameAvailable(true)
                .withReason(CheckNameAvailabilityReason.ALREADY_EXISTS)
                .withMessage("kteusqczk");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResponseInner.class);
        Assertions.assertEquals(true, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.ALREADY_EXISTS, model.reason());
        Assertions.assertEquals("kteusqczk", model.message());
    }
}
