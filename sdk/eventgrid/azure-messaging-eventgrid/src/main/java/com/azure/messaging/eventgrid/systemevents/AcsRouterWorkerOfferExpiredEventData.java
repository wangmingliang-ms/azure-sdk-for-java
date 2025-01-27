// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterWorkerOfferExpired event. */
@Fluent
public final class AcsRouterWorkerOfferExpiredEventData extends AcsRouterWorkerEventData {
    /*
     * Router Worker Offer Expired Queue Id
     */
    @JsonProperty(value = "queueId")
    private String queueId;

    /*
     * Router Worker Offer Expired Offer Id
     */
    @JsonProperty(value = "offerId")
    private String offerId;

    /** Creates an instance of AcsRouterWorkerOfferExpiredEventData class. */
    public AcsRouterWorkerOfferExpiredEventData() {}

    /**
     * Get the queueId property: Router Worker Offer Expired Queue Id.
     *
     * @return the queueId value.
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Set the queueId property: Router Worker Offer Expired Queue Id.
     *
     * @param queueId the queueId value to set.
     * @return the AcsRouterWorkerOfferExpiredEventData object itself.
     */
    public AcsRouterWorkerOfferExpiredEventData setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Get the offerId property: Router Worker Offer Expired Offer Id.
     *
     * @return the offerId value.
     */
    public String getOfferId() {
        return this.offerId;
    }

    /**
     * Set the offerId property: Router Worker Offer Expired Offer Id.
     *
     * @param offerId the offerId value to set.
     * @return the AcsRouterWorkerOfferExpiredEventData object itself.
     */
    public AcsRouterWorkerOfferExpiredEventData setOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterWorkerOfferExpiredEventData setWorkerId(String workerId) {
        super.setWorkerId(workerId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterWorkerOfferExpiredEventData setJobId(String jobId) {
        super.setJobId(jobId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterWorkerOfferExpiredEventData setChannelReference(String channelReference) {
        super.setChannelReference(channelReference);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterWorkerOfferExpiredEventData setChannelId(String channelId) {
        super.setChannelId(channelId);
        return this;
    }
}
