// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WorkflowRunGetTests extends PurviewWorkflowClientTestBase {
    @Test
    public void testWorkflowRunGetTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                purviewWorkflowClient.getWorkflowRunWithResponse(
                        "41b1feae-1f90-4b35-835f-037f39d8ef67", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
