// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes a condition that must be met against a set of labels for worker selection. */
@Fluent
public final class WorkerSelector {
    /*
     * The label key to query against
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /*
     * Describes how the value of the label is compared to the value defined on
     * the label selector
     */
    @JsonProperty(value = "labelOperator", required = true)
    private LabelOperator labelOperator;

    /*
     * The value to compare against the actual label value with the given
     * operator
     */
    @JsonProperty(value = "value")
    private Object value;

    /*
     * Describes how long this label selector is valid in seconds.
     */
    @JsonProperty(value = "ttlSeconds")
    private Double ttlSeconds;

    /*
     * Pushes the job to the front of the queue as long as this selector is
     * active.
     */
    @JsonProperty(value = "expedite")
    private Boolean expedite;

    /*
     * The state of the worker selector.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private WorkerSelectorState state;

    /*
     * The time at which this worker selector expires in UTC
     */
    @JsonProperty(value = "expireTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expireTime;

    /**
     * Get the key property: The label key to query against.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The label key to query against.
     *
     * @param key the key value to set.
     * @return the WorkerSelector object itself.
     */
    public WorkerSelector setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the labelOperator property: Describes how the value of the label is compared to the value defined on the
     * label selector.
     *
     * @return the labelOperator value.
     */
    public LabelOperator getLabelOperator() {
        return this.labelOperator;
    }

    /**
     * Set the labelOperator property: Describes how the value of the label is compared to the value defined on the
     * label selector.
     *
     * @param labelOperator the labelOperator value to set.
     * @return the WorkerSelector object itself.
     */
    public WorkerSelector setLabelOperator(LabelOperator labelOperator) {
        this.labelOperator = labelOperator;
        return this;
    }

    /**
     * Get the value property: The value to compare against the actual label value with the given operator.
     *
     * @return the value value.
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value to compare against the actual label value with the given operator.
     *
     * @param value the value value to set.
     * @return the WorkerSelector object itself.
     */
    public WorkerSelector setValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the ttlSeconds property: Describes how long this label selector is valid in seconds.
     *
     * @return the ttlSeconds value.
     */
    public Double getTtlSeconds() {
        return this.ttlSeconds;
    }

    /**
     * Set the ttlSeconds property: Describes how long this label selector is valid in seconds.
     *
     * @param ttlSeconds the ttlSeconds value to set.
     * @return the WorkerSelector object itself.
     */
    public WorkerSelector setTtlSeconds(Double ttlSeconds) {
        this.ttlSeconds = ttlSeconds;
        return this;
    }

    /**
     * Get the expedite property: Pushes the job to the front of the queue as long as this selector is active.
     *
     * @return the expedite value.
     */
    public Boolean isExpedite() {
        return this.expedite;
    }

    /**
     * Set the expedite property: Pushes the job to the front of the queue as long as this selector is active.
     *
     * @param expedite the expedite value to set.
     * @return the WorkerSelector object itself.
     */
    public WorkerSelector setExpedite(Boolean expedite) {
        this.expedite = expedite;
        return this;
    }

    /**
     * Get the state property: The state of the worker selector.
     *
     * @return the state value.
     */
    public WorkerSelectorState getState() {
        return this.state;
    }

    /**
     * Get the expireTime property: The time at which this worker selector expires in UTC.
     *
     * @return the expireTime value.
     */
    public OffsetDateTime getExpireTime() {
        return this.expireTime;
    }
}