// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner;

/** An immutable client-side representation of Diagnostics. */
public interface Diagnostics {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: Diagnostics resource specific properties.
     *
     * @return the properties value.
     */
    DiagnosticsProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner object.
     *
     * @return the inner object.
     */
    DiagnosticsInner innerModel();
}
