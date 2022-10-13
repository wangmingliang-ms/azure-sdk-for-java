// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securitydevops.fluent.AzureDevOpsRepoesClient;
import com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsRepoInner;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsRepo;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsRepoes;

public final class AzureDevOpsRepoesImpl implements AzureDevOpsRepoes {
    private static final ClientLogger LOGGER = new ClientLogger(AzureDevOpsRepoesImpl.class);

    private final AzureDevOpsRepoesClient innerClient;

    private final com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager;

    public AzureDevOpsRepoesImpl(
        AzureDevOpsRepoesClient innerClient,
        com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AzureDevOpsRepo> listByConnector(String resourceGroupName, String azureDevOpsConnectorName) {
        PagedIterable<AzureDevOpsRepoInner> inner =
            this.serviceClient().listByConnector(resourceGroupName, azureDevOpsConnectorName);
        return Utils.mapPage(inner, inner1 -> new AzureDevOpsRepoImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureDevOpsRepo> listByConnector(
        String resourceGroupName, String azureDevOpsConnectorName, Context context) {
        PagedIterable<AzureDevOpsRepoInner> inner =
            this.serviceClient().listByConnector(resourceGroupName, azureDevOpsConnectorName, context);
        return Utils.mapPage(inner, inner1 -> new AzureDevOpsRepoImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureDevOpsRepo> list(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName) {
        PagedIterable<AzureDevOpsRepoInner> inner =
            this
                .serviceClient()
                .list(resourceGroupName, azureDevOpsConnectorName, azureDevOpsOrgName, azureDevOpsProjectName);
        return Utils.mapPage(inner, inner1 -> new AzureDevOpsRepoImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureDevOpsRepo> list(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        Context context) {
        PagedIterable<AzureDevOpsRepoInner> inner =
            this
                .serviceClient()
                .list(resourceGroupName, azureDevOpsConnectorName, azureDevOpsOrgName, azureDevOpsProjectName, context);
        return Utils.mapPage(inner, inner1 -> new AzureDevOpsRepoImpl(inner1, this.manager()));
    }

    public Response<AzureDevOpsRepo> getWithResponse(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName,
        Context context) {
        Response<AzureDevOpsRepoInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName,
                    azureDevOpsConnectorName,
                    azureDevOpsOrgName,
                    azureDevOpsProjectName,
                    azureDevOpsRepoName,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureDevOpsRepoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureDevOpsRepo get(
        String resourceGroupName,
        String azureDevOpsConnectorName,
        String azureDevOpsOrgName,
        String azureDevOpsProjectName,
        String azureDevOpsRepoName) {
        AzureDevOpsRepoInner inner =
            this
                .serviceClient()
                .get(
                    resourceGroupName,
                    azureDevOpsConnectorName,
                    azureDevOpsOrgName,
                    azureDevOpsProjectName,
                    azureDevOpsRepoName);
        if (inner != null) {
            return new AzureDevOpsRepoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AzureDevOpsRepo getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureDevOpsConnectorName = Utils.getValueFromIdByName(id, "azureDevOpsConnectors");
        if (azureDevOpsConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureDevOpsConnectors'.",
                                id)));
        }
        String azureDevOpsOrgName = Utils.getValueFromIdByName(id, "orgs");
        if (azureDevOpsOrgName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'orgs'.", id)));
        }
        String azureDevOpsProjectName = Utils.getValueFromIdByName(id, "projects");
        if (azureDevOpsProjectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String azureDevOpsRepoName = Utils.getValueFromIdByName(id, "repos");
        if (azureDevOpsRepoName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'repos'.", id)));
        }
        return this
            .getWithResponse(
                resourceGroupName,
                azureDevOpsConnectorName,
                azureDevOpsOrgName,
                azureDevOpsProjectName,
                azureDevOpsRepoName,
                Context.NONE)
            .getValue();
    }

    public Response<AzureDevOpsRepo> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureDevOpsConnectorName = Utils.getValueFromIdByName(id, "azureDevOpsConnectors");
        if (azureDevOpsConnectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureDevOpsConnectors'.",
                                id)));
        }
        String azureDevOpsOrgName = Utils.getValueFromIdByName(id, "orgs");
        if (azureDevOpsOrgName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'orgs'.", id)));
        }
        String azureDevOpsProjectName = Utils.getValueFromIdByName(id, "projects");
        if (azureDevOpsProjectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String azureDevOpsRepoName = Utils.getValueFromIdByName(id, "repos");
        if (azureDevOpsRepoName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'repos'.", id)));
        }
        return this
            .getWithResponse(
                resourceGroupName,
                azureDevOpsConnectorName,
                azureDevOpsOrgName,
                azureDevOpsProjectName,
                azureDevOpsRepoName,
                context);
    }

    private AzureDevOpsRepoesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager() {
        return this.serviceManager;
    }

    public AzureDevOpsRepoImpl define(String name) {
        return new AzureDevOpsRepoImpl(name, this.manager());
    }
}