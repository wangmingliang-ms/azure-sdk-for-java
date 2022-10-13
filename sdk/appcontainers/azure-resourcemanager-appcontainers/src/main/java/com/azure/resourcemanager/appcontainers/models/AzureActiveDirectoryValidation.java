// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration settings of the Azure Active Directory token validation flow. */
@Fluent
public final class AzureActiveDirectoryValidation {
    /*
     * The configuration settings of the checks that should be made while validating the JWT Claims.
     */
    @JsonProperty(value = "jwtClaimChecks")
    private JwtClaimChecks jwtClaimChecks;

    /*
     * The list of audiences that can make successful authentication/authorization requests.
     */
    @JsonProperty(value = "allowedAudiences")
    private List<String> allowedAudiences;

    /*
     * The configuration settings of the default authorization policy.
     */
    @JsonProperty(value = "defaultAuthorizationPolicy")
    private DefaultAuthorizationPolicy defaultAuthorizationPolicy;

    /** Creates an instance of AzureActiveDirectoryValidation class. */
    public AzureActiveDirectoryValidation() {
    }

    /**
     * Get the jwtClaimChecks property: The configuration settings of the checks that should be made while validating
     * the JWT Claims.
     *
     * @return the jwtClaimChecks value.
     */
    public JwtClaimChecks jwtClaimChecks() {
        return this.jwtClaimChecks;
    }

    /**
     * Set the jwtClaimChecks property: The configuration settings of the checks that should be made while validating
     * the JWT Claims.
     *
     * @param jwtClaimChecks the jwtClaimChecks value to set.
     * @return the AzureActiveDirectoryValidation object itself.
     */
    public AzureActiveDirectoryValidation withJwtClaimChecks(JwtClaimChecks jwtClaimChecks) {
        this.jwtClaimChecks = jwtClaimChecks;
        return this;
    }

    /**
     * Get the allowedAudiences property: The list of audiences that can make successful authentication/authorization
     * requests.
     *
     * @return the allowedAudiences value.
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }

    /**
     * Set the allowedAudiences property: The list of audiences that can make successful authentication/authorization
     * requests.
     *
     * @param allowedAudiences the allowedAudiences value to set.
     * @return the AzureActiveDirectoryValidation object itself.
     */
    public AzureActiveDirectoryValidation withAllowedAudiences(List<String> allowedAudiences) {
        this.allowedAudiences = allowedAudiences;
        return this;
    }

    /**
     * Get the defaultAuthorizationPolicy property: The configuration settings of the default authorization policy.
     *
     * @return the defaultAuthorizationPolicy value.
     */
    public DefaultAuthorizationPolicy defaultAuthorizationPolicy() {
        return this.defaultAuthorizationPolicy;
    }

    /**
     * Set the defaultAuthorizationPolicy property: The configuration settings of the default authorization policy.
     *
     * @param defaultAuthorizationPolicy the defaultAuthorizationPolicy value to set.
     * @return the AzureActiveDirectoryValidation object itself.
     */
    public AzureActiveDirectoryValidation withDefaultAuthorizationPolicy(
        DefaultAuthorizationPolicy defaultAuthorizationPolicy) {
        this.defaultAuthorizationPolicy = defaultAuthorizationPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (jwtClaimChecks() != null) {
            jwtClaimChecks().validate();
        }
        if (defaultAuthorizationPolicy() != null) {
            defaultAuthorizationPolicy().validate();
        }
    }
}
