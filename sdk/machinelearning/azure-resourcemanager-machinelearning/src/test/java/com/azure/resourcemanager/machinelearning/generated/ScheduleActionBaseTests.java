// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ScheduleActionBase;
import org.junit.jupiter.api.Test;

public final class ScheduleActionBaseTests {
    @Test
    public void testDeserialize() {
        ScheduleActionBase model =
            BinaryData.fromString("{\"actionType\":\"ScheduleActionBase\"}").toObject(ScheduleActionBase.class);
    }

    @Test
    public void testSerialize() {
        ScheduleActionBase model = new ScheduleActionBase();
        model = BinaryData.fromObject(model).toObject(ScheduleActionBase.class);
    }
}