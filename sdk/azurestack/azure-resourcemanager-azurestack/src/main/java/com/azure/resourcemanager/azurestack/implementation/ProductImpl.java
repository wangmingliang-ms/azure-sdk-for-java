// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.implementation;

import com.azure.resourcemanager.azurestack.fluent.models.ProductInner;
import com.azure.resourcemanager.azurestack.models.Compatibility;
import com.azure.resourcemanager.azurestack.models.IconUris;
import com.azure.resourcemanager.azurestack.models.Product;
import com.azure.resourcemanager.azurestack.models.ProductLink;
import com.azure.resourcemanager.azurestack.models.ProductProperties;
import java.util.Collections;
import java.util.List;

public final class ProductImpl implements Product {
    private ProductInner innerObject;

    private final com.azure.resourcemanager.azurestack.AzureStackManager serviceManager;

    ProductImpl(ProductInner innerObject, com.azure.resourcemanager.azurestack.AzureStackManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
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

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String publisherDisplayName() {
        return this.innerModel().publisherDisplayName();
    }

    public String publisherIdentifier() {
        return this.innerModel().publisherIdentifier();
    }

    public String offer() {
        return this.innerModel().offer();
    }

    public String offerVersion() {
        return this.innerModel().offerVersion();
    }

    public String sku() {
        return this.innerModel().sku();
    }

    public String billingPartNumber() {
        return this.innerModel().billingPartNumber();
    }

    public String vmExtensionType() {
        return this.innerModel().vmExtensionType();
    }

    public String galleryItemIdentity() {
        return this.innerModel().galleryItemIdentity();
    }

    public IconUris iconUris() {
        return this.innerModel().iconUris();
    }

    public List<ProductLink> links() {
        List<ProductLink> inner = this.innerModel().links();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String legalTerms() {
        return this.innerModel().legalTerms();
    }

    public String privacyPolicy() {
        return this.innerModel().privacyPolicy();
    }

    public Long payloadLength() {
        return this.innerModel().payloadLength();
    }

    public String productKind() {
        return this.innerModel().productKind();
    }

    public ProductProperties productProperties() {
        return this.innerModel().productProperties();
    }

    public Compatibility compatibility() {
        return this.innerModel().compatibility();
    }

    public ProductInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestack.AzureStackManager manager() {
        return this.serviceManager;
    }
}
