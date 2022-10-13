// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagedEnvironmentsStorages. */
public interface ManagedEnvironmentsStorages {
    /**
     * Get all storages for a managedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all storages for a managedEnvironment along with {@link Response}.
     */
    Response<ManagedEnvironmentStoragesCollection> listWithResponse(
        String resourceGroupName, String environmentName, Context context);

    /**
     * Get all storages for a managedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all storages for a managedEnvironment.
     */
    ManagedEnvironmentStoragesCollection list(String resourceGroupName, String environmentName);

    /**
     * Get storage for a managedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage for a managedEnvironment along with {@link Response}.
     */
    Response<ManagedEnvironmentStorage> getWithResponse(
        String resourceGroupName, String environmentName, String storageName, Context context);

    /**
     * Get storage for a managedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage for a managedEnvironment.
     */
    ManagedEnvironmentStorage get(String resourceGroupName, String environmentName, String storageName);

    /**
     * Delete storage for a managedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String environmentName, String storageName, Context context);

    /**
     * Delete storage for a managedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String environmentName, String storageName);

    /**
     * Get storage for a managedEnvironment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage for a managedEnvironment along with {@link Response}.
     */
    ManagedEnvironmentStorage getById(String id);

    /**
     * Get storage for a managedEnvironment.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage for a managedEnvironment along with {@link Response}.
     */
    Response<ManagedEnvironmentStorage> getByIdWithResponse(String id, Context context);

    /**
     * Delete storage for a managedEnvironment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete storage for a managedEnvironment.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ManagedEnvironmentStorage resource.
     *
     * @param name resource name.
     * @return the first stage of the new ManagedEnvironmentStorage definition.
     */
    ManagedEnvironmentStorage.DefinitionStages.Blank define(String name);
}
