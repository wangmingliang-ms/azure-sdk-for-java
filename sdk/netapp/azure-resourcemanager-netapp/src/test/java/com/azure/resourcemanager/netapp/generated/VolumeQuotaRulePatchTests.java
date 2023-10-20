// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.Type;
import com.azure.resourcemanager.netapp.models.VolumeQuotaRulePatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VolumeQuotaRulePatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeQuotaRulePatch model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"zhjjklffhmouwq\":\"jabudurgkakmo\",\"eeyebi\":\"gzrf\",\"wrv\":\"ikayuhqlbjbsybb\",\"slthaq\":\"ldgmfpgvmpip\"},\"properties\":{\"provisioningState\":\"Accepted\",\"quotaSizeInKiBs\":152886456423473805,\"quotaType\":\"DefaultGroupQuota\",\"quotaTarget\":\"dsrezpdrhneuyow\"}}")
                .toObject(VolumeQuotaRulePatch.class);
        Assertions.assertEquals("jabudurgkakmo", model.tags().get("zhjjklffhmouwq"));
        Assertions.assertEquals(152886456423473805L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_GROUP_QUOTA, model.quotaType());
        Assertions.assertEquals("dsrezpdrhneuyow", model.quotaTarget());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeQuotaRulePatch model =
            new VolumeQuotaRulePatch()
                .withTags(
                    mapOf(
                        "zhjjklffhmouwq",
                        "jabudurgkakmo",
                        "eeyebi",
                        "gzrf",
                        "wrv",
                        "ikayuhqlbjbsybb",
                        "slthaq",
                        "ldgmfpgvmpip"))
                .withQuotaSizeInKiBs(152886456423473805L)
                .withQuotaType(Type.DEFAULT_GROUP_QUOTA)
                .withQuotaTarget("dsrezpdrhneuyow");
        model = BinaryData.fromObject(model).toObject(VolumeQuotaRulePatch.class);
        Assertions.assertEquals("jabudurgkakmo", model.tags().get("zhjjklffhmouwq"));
        Assertions.assertEquals(152886456423473805L, model.quotaSizeInKiBs());
        Assertions.assertEquals(Type.DEFAULT_GROUP_QUOTA, model.quotaType());
        Assertions.assertEquals("dsrezpdrhneuyow", model.quotaTarget());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
