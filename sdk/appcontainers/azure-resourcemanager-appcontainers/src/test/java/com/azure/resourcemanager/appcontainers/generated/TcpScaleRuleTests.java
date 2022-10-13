// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ScaleRuleAuth;
import com.azure.resourcemanager.appcontainers.models.TcpScaleRule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TcpScaleRuleTests {
    @Test
    public void testDeserialize() {
        TcpScaleRule model =
            BinaryData
                .fromString(
                    "{\"metadata\":{\"twaenuuzko\":\"ufgmjzrwrdg\",\"iefozbhdmsml\":\"bminrfdwoyuhhzi\"},\"auth\":[{\"secretRef\":\"oftrmaequia\",\"triggerParameter\":\"icslfaoq\"},{\"secretRef\":\"iyylhalnswhccsp\",\"triggerParameter\":\"aivwitqscywu\"},{\"secretRef\":\"woluhczbwemhair\",\"triggerParameter\":\"rgzdwmsweyp\"},{\"secretRef\":\"dxggicccnxqhuexm\",\"triggerParameter\":\"tlstvlzywem\"}]}")
                .toObject(TcpScaleRule.class);
        Assertions.assertEquals("ufgmjzrwrdg", model.metadata().get("twaenuuzko"));
        Assertions.assertEquals("oftrmaequia", model.auth().get(0).secretRef());
        Assertions.assertEquals("icslfaoq", model.auth().get(0).triggerParameter());
    }

    @Test
    public void testSerialize() {
        TcpScaleRule model =
            new TcpScaleRule()
                .withMetadata(mapOf("twaenuuzko", "ufgmjzrwrdg", "iefozbhdmsml", "bminrfdwoyuhhzi"))
                .withAuth(
                    Arrays
                        .asList(
                            new ScaleRuleAuth().withSecretRef("oftrmaequia").withTriggerParameter("icslfaoq"),
                            new ScaleRuleAuth().withSecretRef("iyylhalnswhccsp").withTriggerParameter("aivwitqscywu"),
                            new ScaleRuleAuth().withSecretRef("woluhczbwemhair").withTriggerParameter("rgzdwmsweyp"),
                            new ScaleRuleAuth().withSecretRef("dxggicccnxqhuexm").withTriggerParameter("tlstvlzywem")));
        model = BinaryData.fromObject(model).toObject(TcpScaleRule.class);
        Assertions.assertEquals("ufgmjzrwrdg", model.metadata().get("twaenuuzko"));
        Assertions.assertEquals("oftrmaequia", model.auth().get(0).secretRef());
        Assertions.assertEquals("icslfaoq", model.auth().get(0).triggerParameter());
    }

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
