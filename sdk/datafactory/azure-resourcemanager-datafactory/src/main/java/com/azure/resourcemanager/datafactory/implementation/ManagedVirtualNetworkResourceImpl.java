// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedVirtualNetworkResourceInner;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetwork;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworkResource;

public final class ManagedVirtualNetworkResourceImpl implements ManagedVirtualNetworkResource,
    ManagedVirtualNetworkResource.Definition, ManagedVirtualNetworkResource.Update {
    private ManagedVirtualNetworkResourceInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public ManagedVirtualNetwork properties() {
        return this.innerModel().properties();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ManagedVirtualNetworkResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String factoryName;

    private String managedVirtualNetworkName;

    private String createIfMatch;

    private String updateIfMatch;

    public ManagedVirtualNetworkResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    public ManagedVirtualNetworkResource create() {
        this.innerObject
            = serviceManager.serviceClient().getManagedVirtualNetworks().createOrUpdateWithResponse(resourceGroupName,
                factoryName, managedVirtualNetworkName, this.innerModel(), createIfMatch, Context.NONE).getValue();
        return this;
    }

    public ManagedVirtualNetworkResource create(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getManagedVirtualNetworks().createOrUpdateWithResponse(resourceGroupName,
                factoryName, managedVirtualNetworkName, this.innerModel(), createIfMatch, context).getValue();
        return this;
    }

    ManagedVirtualNetworkResourceImpl(String name,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = new ManagedVirtualNetworkResourceInner();
        this.serviceManager = serviceManager;
        this.managedVirtualNetworkName = name;
        this.createIfMatch = null;
    }

    public ManagedVirtualNetworkResourceImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public ManagedVirtualNetworkResource apply() {
        this.innerObject
            = serviceManager.serviceClient().getManagedVirtualNetworks().createOrUpdateWithResponse(resourceGroupName,
                factoryName, managedVirtualNetworkName, this.innerModel(), updateIfMatch, Context.NONE).getValue();
        return this;
    }

    public ManagedVirtualNetworkResource apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getManagedVirtualNetworks().createOrUpdateWithResponse(resourceGroupName,
                factoryName, managedVirtualNetworkName, this.innerModel(), updateIfMatch, context).getValue();
        return this;
    }

    ManagedVirtualNetworkResourceImpl(ManagedVirtualNetworkResourceInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.factoryName = Utils.getValueFromIdByName(innerObject.id(), "factories");
        this.managedVirtualNetworkName = Utils.getValueFromIdByName(innerObject.id(), "managedVirtualNetworks");
    }

    public ManagedVirtualNetworkResource refresh() {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient().getManagedVirtualNetworks()
            .getWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName, localIfNoneMatch, Context.NONE)
            .getValue();
        return this;
    }

    public ManagedVirtualNetworkResource refresh(Context context) {
        String localIfNoneMatch = null;
        this.innerObject = serviceManager.serviceClient().getManagedVirtualNetworks()
            .getWithResponse(resourceGroupName, factoryName, managedVirtualNetworkName, localIfNoneMatch, context)
            .getValue();
        return this;
    }

    public ManagedVirtualNetworkResourceImpl withProperties(ManagedVirtualNetwork properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ManagedVirtualNetworkResourceImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
