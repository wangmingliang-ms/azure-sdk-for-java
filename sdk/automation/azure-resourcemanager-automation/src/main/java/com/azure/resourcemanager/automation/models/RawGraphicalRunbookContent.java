// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Raw Graphical Runbook content. */
@Fluent
public final class RawGraphicalRunbookContent {
    /*
     * Schema version of the serializer.
     */
    @JsonProperty(value = "schemaVersion")
    private String schemaVersion;

    /*
     * Serialized Graphical runbook
     */
    @JsonProperty(value = "runbookDefinition")
    private String runbookDefinition;

    /*
     * Runbook Type
     */
    @JsonProperty(value = "runbookType")
    private GraphRunbookType runbookType;

    /**
     * Get the schemaVersion property: Schema version of the serializer.
     *
     * @return the schemaVersion value.
     */
    public String schemaVersion() {
        return this.schemaVersion;
    }

    /**
     * Set the schemaVersion property: Schema version of the serializer.
     *
     * @param schemaVersion the schemaVersion value to set.
     * @return the RawGraphicalRunbookContent object itself.
     */
    public RawGraphicalRunbookContent withSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    /**
     * Get the runbookDefinition property: Serialized Graphical runbook.
     *
     * @return the runbookDefinition value.
     */
    public String runbookDefinition() {
        return this.runbookDefinition;
    }

    /**
     * Set the runbookDefinition property: Serialized Graphical runbook.
     *
     * @param runbookDefinition the runbookDefinition value to set.
     * @return the RawGraphicalRunbookContent object itself.
     */
    public RawGraphicalRunbookContent withRunbookDefinition(String runbookDefinition) {
        this.runbookDefinition = runbookDefinition;
        return this;
    }

    /**
     * Get the runbookType property: Runbook Type.
     *
     * @return the runbookType value.
     */
    public GraphRunbookType runbookType() {
        return this.runbookType;
    }

    /**
     * Set the runbookType property: Runbook Type.
     *
     * @param runbookType the runbookType value to set.
     * @return the RawGraphicalRunbookContent object itself.
     */
    public RawGraphicalRunbookContent withRunbookType(GraphRunbookType runbookType) {
        this.runbookType = runbookType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}