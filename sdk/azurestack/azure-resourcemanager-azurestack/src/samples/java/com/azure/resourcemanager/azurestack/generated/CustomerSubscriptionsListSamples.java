// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

/** Samples for CustomerSubscriptions List. */
public final class CustomerSubscriptionsListSamples {
    /*
     * x-ms-original-file: specification/azurestack/resource-manager/Microsoft.AzureStack/stable/2022-06-01/examples/CustomerSubscription/List.json
     */
    /**
     * Sample code: Returns a list of products.
     *
     * @param manager Entry point to AzureStackManager.
     */
    public static void returnsAListOfProducts(com.azure.resourcemanager.azurestack.AzureStackManager manager) {
        manager.customerSubscriptions().list("azurestack", "testregistration", com.azure.core.util.Context.NONE);
    }
}
