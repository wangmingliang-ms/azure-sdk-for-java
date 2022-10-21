// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.CopyActivity;
import com.azure.resourcemanager.datafactory.models.CopySink;
import com.azure.resourcemanager.datafactory.models.CopySource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogSettings;
import com.azure.resourcemanager.datafactory.models.LogStorageSettings;
import com.azure.resourcemanager.datafactory.models.RedirectIncompatibleRowSettings;
import com.azure.resourcemanager.datafactory.models.SkipErrorFile;
import com.azure.resourcemanager.datafactory.models.StagingSettings;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CopyActivityTests {
    @Test
    public void testDeserialize() {
        CopyActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"Copy\",\"typeProperties\":{\"source\":{\"type\":\"CopySource\",\"\":{}},\"sink\":{\"type\":\"CopySink\",\"\":{}},\"stagingSettings\":{\"\":{}},\"redirectIncompatibleRowSettings\":{\"\":{}},\"logStorageSettings\":{\"\":{}},\"logSettings\":{},\"preserveRules\":[],\"preserve\":[],\"skipErrorFile\":{}},\"inputs\":[{\"referenceName\":\"whgsaodkww\",\"parameters\":{}},{\"referenceName\":\"foct\",\"parameters\":{}},{\"referenceName\":\"haquvwsxbgnvk\",\"parameters\":{}}],\"outputs\":[{\"referenceName\":\"hoadhrsxqvzv\",\"parameters\":{}},{\"referenceName\":\"bdsrgfajglzrsu\",\"parameters\":{}},{\"referenceName\":\"rxhjnltcet\",\"parameters\":{}}],\"linkedServiceName\":{\"referenceName\":\"ydi\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":1514056295,\"secureInput\":false,\"secureOutput\":true,\"\":{}},\"name\":\"xoebwg\",\"description\":\"bibanbau\",\"dependsOn\":[{\"activity\":\"zvpaklozkxbzrpej\",\"dependencyConditions\":[\"Completed\",\"Succeeded\"],\"\":{}}],\"userProperties\":[{\"name\":\"ttkgsux\"}],\"\":{}}")
                .toObject(CopyActivity.class);
        Assertions.assertEquals("xoebwg", model.name());
        Assertions.assertEquals("bibanbau", model.description());
        Assertions.assertEquals("zvpaklozkxbzrpej", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("ttkgsux", model.userProperties().get(0).name());
        Assertions.assertEquals("ydi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1514056295, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("whgsaodkww", model.inputs().get(0).referenceName());
        Assertions.assertEquals("hoadhrsxqvzv", model.outputs().get(0).referenceName());
    }

    @Test
    public void testSerialize() {
        CopyActivity model =
            new CopyActivity()
                .withName("xoebwg")
                .withDescription("bibanbau")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("zvpaklozkxbzrpej")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.SUCCEEDED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("ttkgsux")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ydi").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(1514056295)
                        .withSecureInput(false)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()))
                .withInputs(
                    Arrays
                        .asList(
                            new DatasetReference().withReferenceName("whgsaodkww").withParameters(mapOf()),
                            new DatasetReference().withReferenceName("foct").withParameters(mapOf()),
                            new DatasetReference().withReferenceName("haquvwsxbgnvk").withParameters(mapOf())))
                .withOutputs(
                    Arrays
                        .asList(
                            new DatasetReference().withReferenceName("hoadhrsxqvzv").withParameters(mapOf()),
                            new DatasetReference().withReferenceName("bdsrgfajglzrsu").withParameters(mapOf()),
                            new DatasetReference().withReferenceName("rxhjnltcet").withParameters(mapOf())))
                .withSource(new CopySource().withAdditionalProperties(mapOf("type", "CopySource")))
                .withSink(new CopySink().withAdditionalProperties(mapOf("type", "CopySink")))
                .withStagingSettings(new StagingSettings().withAdditionalProperties(mapOf()))
                .withRedirectIncompatibleRowSettings(
                    new RedirectIncompatibleRowSettings().withAdditionalProperties(mapOf()))
                .withLogStorageSettings(new LogStorageSettings().withAdditionalProperties(mapOf()))
                .withLogSettings(new LogSettings())
                .withPreserveRules(Arrays.asList())
                .withPreserve(Arrays.asList())
                .withSkipErrorFile(new SkipErrorFile());
        model = BinaryData.fromObject(model).toObject(CopyActivity.class);
        Assertions.assertEquals("xoebwg", model.name());
        Assertions.assertEquals("bibanbau", model.description());
        Assertions.assertEquals("zvpaklozkxbzrpej", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("ttkgsux", model.userProperties().get(0).name());
        Assertions.assertEquals("ydi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1514056295, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals("whgsaodkww", model.inputs().get(0).referenceName());
        Assertions.assertEquals("hoadhrsxqvzv", model.outputs().get(0).referenceName());
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