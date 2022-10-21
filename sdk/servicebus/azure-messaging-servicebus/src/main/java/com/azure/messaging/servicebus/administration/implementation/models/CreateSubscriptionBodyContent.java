// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The CreateSubscriptionBodyContent model. */
@JacksonXmlRootElement(localName = "null", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class CreateSubscriptionBodyContent {
    /*
     * MIME type of content.
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * Subscription information to create.
     */
    @JacksonXmlProperty(
            localName = "SubscriptionDescription",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private SubscriptionDescription subscriptionDescription;

    /**
     * Get the type property: MIME type of content.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: MIME type of content.
     *
     * @param type the type value to set.
     * @return the CreateSubscriptionBodyContent object itself.
     */
    public CreateSubscriptionBodyContent setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the subscriptionDescription property: Subscription information to create.
     *
     * @return the subscriptionDescription value.
     */
    public SubscriptionDescription getSubscriptionDescription() {
        return this.subscriptionDescription;
    }

    /**
     * Set the subscriptionDescription property: Subscription information to create.
     *
     * @param subscriptionDescription the subscriptionDescription value to set.
     * @return the CreateSubscriptionBodyContent object itself.
     */
    public CreateSubscriptionBodyContent setSubscriptionDescription(SubscriptionDescription subscriptionDescription) {
        this.subscriptionDescription = subscriptionDescription;
        return this;
    }
}