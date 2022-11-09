// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.machinelearning.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkServiceConnectionStateTests {
    @Test
    public void testDeserialize() {
        PrivateLinkServiceConnectionState model =
            BinaryData
                .fromString(
                    "{\"status\":\"Disconnected\",\"description\":\"fpdvhpfxxypi\",\"actionsRequired\":\"nmayhuybb\"}")
                .toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("fpdvhpfxxypi", model.description());
        Assertions.assertEquals("nmayhuybb", model.actionsRequired());
    }

    @Test
    public void testSerialize() {
        PrivateLinkServiceConnectionState model =
            new PrivateLinkServiceConnectionState()
                .withStatus(PrivateEndpointServiceConnectionStatus.DISCONNECTED)
                .withDescription("fpdvhpfxxypi")
                .withActionsRequired("nmayhuybb");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionState.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.DISCONNECTED, model.status());
        Assertions.assertEquals("fpdvhpfxxypi", model.description());
        Assertions.assertEquals("nmayhuybb", model.actionsRequired());
    }
}