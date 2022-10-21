// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.ResponsysLinkedService;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResponsysLinkedServiceTests {
    @Test
    public void testDeserialize() {
        ResponsysLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"Responsys\",\"typeProperties\":{\"clientSecret\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"cwv\",\"parameters\":{}},\"description\":\"qnt\",\"parameters\":{\"thvmaxgnuyeamcmh\":{\"type\":\"Object\"},\"jecehokwc\":{\"type\":\"SecureString\"}},\"annotations\":[],\"\":{}}")
                .toObject(ResponsysLinkedService.class);
        Assertions.assertEquals("cwv", model.connectVia().referenceName());
        Assertions.assertEquals("qnt", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("thvmaxgnuyeamcmh").type());
    }

    @Test
    public void testSerialize() {
        ResponsysLinkedService model =
            new ResponsysLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("cwv").withParameters(mapOf()))
                .withDescription("qnt")
                .withParameters(
                    mapOf(
                        "thvmaxgnuyeamcmh",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "jecehokwc",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withClientSecret(new SecretBase());
        model = BinaryData.fromObject(model).toObject(ResponsysLinkedService.class);
        Assertions.assertEquals("cwv", model.connectVia().referenceName());
        Assertions.assertEquals("qnt", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("thvmaxgnuyeamcmh").type());
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