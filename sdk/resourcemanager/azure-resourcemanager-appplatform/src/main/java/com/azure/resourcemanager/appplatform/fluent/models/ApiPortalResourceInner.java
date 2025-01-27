// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.models.ApiPortalProperties;
import com.azure.resourcemanager.appplatform.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;

/** API portal resource. */
@Fluent
public final class ApiPortalResourceInner extends ProxyResource {
    /*
     * API portal properties payload
     */
    @JsonProperty(value = "properties")
    private ApiPortalProperties properties;

    /*
     * Sku of the API portal resource
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: API portal properties payload.
     *
     * @return the properties value.
     */
    public ApiPortalProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: API portal properties payload.
     *
     * @param properties the properties value to set.
     * @return the ApiPortalResourceInner object itself.
     */
    public ApiPortalResourceInner withProperties(ApiPortalProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Sku of the API portal resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku of the API portal resource.
     *
     * @param sku the sku value to set.
     * @return the ApiPortalResourceInner object itself.
     */
    public ApiPortalResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
