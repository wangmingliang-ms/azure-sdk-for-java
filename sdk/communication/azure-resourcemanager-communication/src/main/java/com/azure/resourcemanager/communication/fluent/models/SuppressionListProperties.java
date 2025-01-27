// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A class that describes the properties of a SuppressionList resource.
 */
@Fluent
public final class SuppressionListProperties {
    /*
     * The the name of the suppression list. This value must match one of the valid sender usernames of the sending
     * domain.
     */
    @JsonProperty(value = "listName")
    private String listName;

    /*
     * The date the resource was last updated.
     */
    @JsonProperty(value = "lastUpdatedTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private String lastUpdatedTimestamp;

    /*
     * The date the resource was created.
     */
    @JsonProperty(value = "createdTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private String createdTimestamp;

    /*
     * The location where the SuppressionListAddress data is stored at rest. This value is inherited from the parent
     * Domains resource.
     */
    @JsonProperty(value = "dataLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String dataLocation;

    /**
     * Creates an instance of SuppressionListProperties class.
     */
    public SuppressionListProperties() {
    }

    /**
     * Get the listName property: The the name of the suppression list. This value must match one of the valid sender
     * usernames of the sending domain.
     * 
     * @return the listName value.
     */
    public String listName() {
        return this.listName;
    }

    /**
     * Set the listName property: The the name of the suppression list. This value must match one of the valid sender
     * usernames of the sending domain.
     * 
     * @param listName the listName value to set.
     * @return the SuppressionListProperties object itself.
     */
    public SuppressionListProperties withListName(String listName) {
        this.listName = listName;
        return this;
    }

    /**
     * Get the lastUpdatedTimestamp property: The date the resource was last updated.
     * 
     * @return the lastUpdatedTimestamp value.
     */
    public String lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * Get the createdTimestamp property: The date the resource was created.
     * 
     * @return the createdTimestamp value.
     */
    public String createdTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * Get the dataLocation property: The location where the SuppressionListAddress data is stored at rest. This value
     * is inherited from the parent Domains resource.
     * 
     * @return the dataLocation value.
     */
    public String dataLocation() {
        return this.dataLocation;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
