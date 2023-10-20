// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.EndpointType;
import com.azure.resourcemanager.netapp.models.ReplicationObject;
import com.azure.resourcemanager.netapp.models.ReplicationSchedule;
import org.junit.jupiter.api.Assertions;

public final class ReplicationObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicationObject model =
            BinaryData
                .fromString(
                    "{\"replicationId\":\"xdult\",\"endpointType\":\"dst\",\"replicationSchedule\":\"daily\",\"remoteVolumeResourceId\":\"tdzumveekgpw\",\"remoteVolumeRegion\":\"uh\"}")
                .toObject(ReplicationObject.class);
        Assertions.assertEquals(EndpointType.DST, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.DAILY, model.replicationSchedule());
        Assertions.assertEquals("tdzumveekgpw", model.remoteVolumeResourceId());
        Assertions.assertEquals("uh", model.remoteVolumeRegion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicationObject model =
            new ReplicationObject()
                .withEndpointType(EndpointType.DST)
                .withReplicationSchedule(ReplicationSchedule.DAILY)
                .withRemoteVolumeResourceId("tdzumveekgpw")
                .withRemoteVolumeRegion("uh");
        model = BinaryData.fromObject(model).toObject(ReplicationObject.class);
        Assertions.assertEquals(EndpointType.DST, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.DAILY, model.replicationSchedule());
        Assertions.assertEquals("tdzumveekgpw", model.remoteVolumeResourceId());
        Assertions.assertEquals("uh", model.remoteVolumeRegion());
    }
}
