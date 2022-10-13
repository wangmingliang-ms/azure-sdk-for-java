// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsCollectionInner;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner;

/** An instance of this class provides access to all the operations defined in ManagedEnvironmentDiagnosticsClient. */
public interface ManagedEnvironmentDiagnosticsClient {
    /**
     * Get the list of diagnostics for a given Managed Environment.
     *
     * <p>Get the list of diagnostics for a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of diagnostics for a Managed Environment used to host container apps along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticsCollectionInner> listDetectorsWithResponse(
        String resourceGroupName, String environmentName, Context context);

    /**
     * Get the list of diagnostics for a given Managed Environment.
     *
     * <p>Get the list of diagnostics for a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of diagnostics for a Managed Environment used to host container apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticsCollectionInner listDetectors(String resourceGroupName, String environmentName);

    /**
     * Get the diagnostics data for a given Managed Environment.
     *
     * <p>Get the diagnostics data for a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param detectorName Name of the Managed Environment detector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostics data for a Managed Environment used to host container apps along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticsInner> getDetectorWithResponse(
        String resourceGroupName, String environmentName, String detectorName, Context context);

    /**
     * Get the diagnostics data for a given Managed Environment.
     *
     * <p>Get the diagnostics data for a Managed Environment used to host container apps.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Environment.
     * @param detectorName Name of the Managed Environment detector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostics data for a Managed Environment used to host container apps.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticsInner getDetector(String resourceGroupName, String environmentName, String detectorName);
}
