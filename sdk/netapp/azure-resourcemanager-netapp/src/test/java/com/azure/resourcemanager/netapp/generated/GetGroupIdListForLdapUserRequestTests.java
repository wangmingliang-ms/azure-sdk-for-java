// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.GetGroupIdListForLdapUserRequest;
import org.junit.jupiter.api.Assertions;

public final class GetGroupIdListForLdapUserRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GetGroupIdListForLdapUserRequest model =
            BinaryData.fromString("{\"username\":\"vxzbncb\"}").toObject(GetGroupIdListForLdapUserRequest.class);
        Assertions.assertEquals("vxzbncb", model.username());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GetGroupIdListForLdapUserRequest model = new GetGroupIdListForLdapUserRequest().withUsername("vxzbncb");
        model = BinaryData.fromObject(model).toObject(GetGroupIdListForLdapUserRequest.class);
        Assertions.assertEquals("vxzbncb", model.username());
    }
}
