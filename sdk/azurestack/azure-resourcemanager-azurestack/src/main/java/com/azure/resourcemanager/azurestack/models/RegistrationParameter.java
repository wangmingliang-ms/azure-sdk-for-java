// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.fluent.models.RegistrationParameterProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Registration resource. */
@Fluent
public final class RegistrationParameter {
    /*
     * Properties of the Azure Stack registration resource
     */
    @JsonProperty(value = "properties", required = true)
    private RegistrationParameterProperties innerProperties = new RegistrationParameterProperties();

    /*
     * Location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private Location location;

    /** Creates an instance of RegistrationParameter class. */
    public RegistrationParameter() {
    }

    /**
     * Get the innerProperties property: Properties of the Azure Stack registration resource.
     *
     * @return the innerProperties value.
     */
    private RegistrationParameterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: Location of the resource.
     *
     * @return the location value.
     */
    public Location location() {
        return this.location;
    }

    /**
     * Set the location property: Location of the resource.
     *
     * @param location the location value to set.
     * @return the RegistrationParameter object itself.
     */
    public RegistrationParameter withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * Get the registrationToken property: The token identifying registered Azure Stack.
     *
     * @return the registrationToken value.
     */
    public String registrationToken() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationToken();
    }

    /**
     * Set the registrationToken property: The token identifying registered Azure Stack.
     *
     * @param registrationToken the registrationToken value to set.
     * @return the RegistrationParameter object itself.
     */
    public RegistrationParameter withRegistrationToken(String registrationToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegistrationParameterProperties();
        }
        this.innerProperties().withRegistrationToken(registrationToken);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model RegistrationParameter"));
        } else {
            innerProperties().validate();
        }
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model RegistrationParameter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RegistrationParameter.class);
}
