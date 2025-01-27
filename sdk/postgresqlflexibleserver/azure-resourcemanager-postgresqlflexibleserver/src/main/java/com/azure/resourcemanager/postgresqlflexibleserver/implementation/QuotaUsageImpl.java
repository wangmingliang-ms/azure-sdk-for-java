// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.QuotaUsageInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.NameProperty;
import com.azure.resourcemanager.postgresqlflexibleserver.models.QuotaUsage;

public final class QuotaUsageImpl implements QuotaUsage {
    private QuotaUsageInner innerObject;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    QuotaUsageImpl(
        QuotaUsageInner innerObject,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public NameProperty name() {
        return this.innerModel().name();
    }

    public Long limit() {
        return this.innerModel().limit();
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public Long currentValue() {
        return this.innerModel().currentValue();
    }

    public String id() {
        return this.innerModel().id();
    }

    public QuotaUsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
