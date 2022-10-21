// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ScriptActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.LogLocationSettings;
import com.azure.resourcemanager.datafactory.models.ScriptActivityLogDestination;
import com.azure.resourcemanager.datafactory.models.ScriptActivityScriptBlock;
import com.azure.resourcemanager.datafactory.models.ScriptActivityTypePropertiesLogSettings;
import com.azure.resourcemanager.datafactory.models.ScriptType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ScriptActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        ScriptActivityTypeProperties model =
            BinaryData
                .fromString(
                    "{\"scripts\":[{\"type\":\"NonQuery\",\"parameters\":[]}],\"logSettings\":{\"logDestination\":\"ActivityOutput\",\"logLocationSettings\":{}}}")
                .toObject(ScriptActivityTypeProperties.class);
        Assertions.assertEquals(ScriptType.NON_QUERY, model.scripts().get(0).type());
        Assertions.assertEquals(ScriptActivityLogDestination.ACTIVITY_OUTPUT, model.logSettings().logDestination());
    }

    @Test
    public void testSerialize() {
        ScriptActivityTypeProperties model =
            new ScriptActivityTypeProperties()
                .withScripts(
                    Arrays
                        .asList(
                            new ScriptActivityScriptBlock()
                                .withType(ScriptType.NON_QUERY)
                                .withParameters(Arrays.asList())))
                .withLogSettings(
                    new ScriptActivityTypePropertiesLogSettings()
                        .withLogDestination(ScriptActivityLogDestination.ACTIVITY_OUTPUT)
                        .withLogLocationSettings(new LogLocationSettings()));
        model = BinaryData.fromObject(model).toObject(ScriptActivityTypeProperties.class);
        Assertions.assertEquals(ScriptType.NON_QUERY, model.scripts().get(0).type());
        Assertions.assertEquals(ScriptActivityLogDestination.ACTIVITY_OUTPUT, model.logSettings().logDestination());
    }
}