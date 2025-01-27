// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.resourcemanager.netapp.fluent.models.NetworkSiblingSetInner;
import java.util.List;

/** An immutable client-side representation of NetworkSiblingSet. */
public interface NetworkSiblingSet {
    /**
     * Gets the networkSiblingSetId property: Network Sibling Set ID
     *
     * <p>Network Sibling Set ID for a group of volumes sharing networking resources in a subnet.
     *
     * @return the networkSiblingSetId value.
     */
    String networkSiblingSetId();

    /**
     * Gets the subnetId property: Subnet resource Id
     *
     * <p>The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes. Example
     * /subscriptions/subscriptionId/resourceGroups/resourceGroup/providers/Microsoft.Network/virtualNetworks/testVnet/subnets/{mySubnet}.
     *
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * Gets the networkSiblingSetStateId property: Network sibling set state Id
     *
     * <p>Network sibling set state Id identifying the current state of the sibling set.
     *
     * @return the networkSiblingSetStateId value.
     */
    String networkSiblingSetStateId();

    /**
     * Gets the networkFeatures property: Network features
     *
     * <p>Network features available to the volume, or current state of update.
     *
     * @return the networkFeatures value.
     */
    NetworkFeatures networkFeatures();

    /**
     * Gets the provisioningState property: Gets the status of the NetworkSiblingSet at the time the operation was
     * called.
     *
     * @return the provisioningState value.
     */
    NetworkSiblingSetProvisioningState provisioningState();

    /**
     * Gets the nicInfoList property: List of NIC information.
     *
     * @return the nicInfoList value.
     */
    List<NicInfo> nicInfoList();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.NetworkSiblingSetInner object.
     *
     * @return the inner object.
     */
    NetworkSiblingSetInner innerModel();
}
