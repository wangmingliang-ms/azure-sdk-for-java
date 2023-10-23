// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datadog.MicrosoftDatadogManager;
import com.azure.resourcemanager.datadog.models.LogRules;
import com.azure.resourcemanager.datadog.models.MetricRules;
import com.azure.resourcemanager.datadog.models.MonitoredSubscription;
import com.azure.resourcemanager.datadog.models.MonitoredSubscriptionProperties;
import com.azure.resourcemanager.datadog.models.MonitoringTagRulesProperties;
import com.azure.resourcemanager.datadog.models.Operation;
import com.azure.resourcemanager.datadog.models.Status;
import com.azure.resourcemanager.datadog.models.SubscriptionList;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MonitoredSubscriptionsCreateorUpdateMockTests {
    @Test
    public void testCreateorUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"name\":\"ljxywsu\",\"id\":\"yrs\",\"type\":\"sytgadgvraea\",\"properties\":{\"operation\":\"DeleteBegin\",\"monitoredSubscriptionList\":[{\"subscriptionId\":\"rrwlquuijfqkace\",\"status\":\"Active\",\"error\":\"fpubjibwwi\",\"tagRules\":{\"provisioningState\":\"Failed\",\"logRules\":{},\"metricRules\":{},\"automuting\":false}}]}}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MicrosoftDatadogManager manager =
            MicrosoftDatadogManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        MonitoredSubscriptionProperties response =
            manager
                .monitoredSubscriptions()
                .define("tddckcb")
                .withExistingMonitor("qvmkcxo", "apvhelxprgly")
                .withProperties(
                    new SubscriptionList()
                        .withOperation(Operation.DELETE_BEGIN)
                        .withMonitoredSubscriptionList(
                            Arrays
                                .asList(
                                    new MonitoredSubscription()
                                        .withSubscriptionId("rkwofyyvoqa")
                                        .withStatus(Status.FAILED)
                                        .withError("xpbtgiwbwo")
                                        .withTagRules(
                                            new MonitoringTagRulesProperties()
                                                .withLogRules(new LogRules())
                                                .withMetricRules(new MetricRules())
                                                .withAutomuting(false)),
                                    new MonitoredSubscription()
                                        .withSubscriptionId("tkcnqxwb")
                                        .withStatus(Status.FAILED)
                                        .withError("lpiujwaa")
                                        .withTagRules(
                                            new MonitoringTagRulesProperties()
                                                .withLogRules(new LogRules())
                                                .withMetricRules(new MetricRules())
                                                .withAutomuting(true)),
                                    new MonitoredSubscription()
                                        .withSubscriptionId("uqerpqlpqwc")
                                        .withStatus(Status.DELETING)
                                        .withError("gbdbutauv")
                                        .withTagRules(
                                            new MonitoringTagRulesProperties()
                                                .withLogRules(new LogRules())
                                                .withMetricRules(new MetricRules())
                                                .withAutomuting(false)),
                                    new MonitoredSubscription()
                                        .withSubscriptionId("hykojoxafnndlpic")
                                        .withStatus(Status.IN_PROGRESS)
                                        .withError("mkcdyhbpkkpwdre")
                                        .withTagRules(
                                            new MonitoringTagRulesProperties()
                                                .withLogRules(new LogRules())
                                                .withMetricRules(new MetricRules())
                                                .withAutomuting(true)))))
                .create();

        Assertions.assertEquals(Operation.DELETE_BEGIN, response.properties().operation());
        Assertions
            .assertEquals("rrwlquuijfqkace", response.properties().monitoredSubscriptionList().get(0).subscriptionId());
        Assertions.assertEquals(Status.ACTIVE, response.properties().monitoredSubscriptionList().get(0).status());
        Assertions.assertEquals("fpubjibwwi", response.properties().monitoredSubscriptionList().get(0).error());
        Assertions
            .assertEquals(false, response.properties().monitoredSubscriptionList().get(0).tagRules().automuting());
    }
}
