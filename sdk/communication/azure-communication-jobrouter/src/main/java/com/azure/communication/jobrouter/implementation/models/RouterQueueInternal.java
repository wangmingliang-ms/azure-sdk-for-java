// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * A queue that can contain jobs to be routed.
 */
@Fluent
public final class RouterQueueInternal {

    /*
     * The entity tag for this resource.
     */
    @Generated
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Id of a queue.
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Friendly name of this queue.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * Id of a distribution policy that will determine how a job is distributed to workers.
     */
    @Generated
    @JsonProperty(value = "distributionPolicyId")
    private String distributionPolicyId;

    /*
     * A set of key/value pairs that are identifying attributes used by the rules engines to make decisions. Values
     * must be primitive values - number, string, boolean.
     */
    @Generated
    @JsonProperty(value = "labels")
    private Map<String, Object> labels;

    /*
     * Id of an exception policy that determines various job escalation rules.
     */
    @Generated
    @JsonProperty(value = "exceptionPolicyId")
    private String exceptionPolicyId;

    /**
     * Creates an instance of RouterQueueInternal class.
     */
    @Generated
    public RouterQueueInternal() {
    }

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }

    public RouterQueueInternal setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the id property: Id of a queue.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set id.
     *
     * @param id id.
     * @return this.
     */
    public RouterQueueInternal setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Friendly name of this queue.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Friendly name of this queue.
     *
     * @param name the name value to set.
     * @return the RouterQueueInternal object itself.
     */
    @Generated
    public RouterQueueInternal setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the distributionPolicyId property: Id of a distribution policy that will determine how a job is distributed
     * to workers.
     *
     * @return the distributionPolicyId value.
     */
    @Generated
    public String getDistributionPolicyId() {
        return this.distributionPolicyId;
    }

    /**
     * Set the distributionPolicyId property: Id of a distribution policy that will determine how a job is distributed
     * to workers.
     *
     * @param distributionPolicyId the distributionPolicyId value to set.
     * @return the RouterQueueInternal object itself.
     */
    @Generated
    public RouterQueueInternal setDistributionPolicyId(String distributionPolicyId) {
        this.distributionPolicyId = distributionPolicyId;
        return this;
    }

    /**
     * Get the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions. Values must be primitive values - number, string, boolean.
     *
     * @return the labels value.
     */
    @Generated
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions. Values must be primitive values - number, string, boolean.
     *
     * @param labels the labels value to set.
     * @return the RouterQueueInternal object itself.
     */
    @Generated
    public RouterQueueInternal setLabels(Map<String, Object> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the exceptionPolicyId property: Id of an exception policy that determines various job escalation rules.
     *
     * @return the exceptionPolicyId value.
     */
    @Generated
    public String getExceptionPolicyId() {
        return this.exceptionPolicyId;
    }

    /**
     * Set the exceptionPolicyId property: Id of an exception policy that determines various job escalation rules.
     *
     * @param exceptionPolicyId the exceptionPolicyId value to set.
     * @return the RouterQueueInternal object itself.
     */
    @Generated
    public RouterQueueInternal setExceptionPolicyId(String exceptionPolicyId) {
        this.exceptionPolicyId = exceptionPolicyId;
        return this;
    }
}
