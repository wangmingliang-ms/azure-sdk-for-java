// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The convention used when determining the session cookie's expiration. */
public enum CookieExpirationConvention {
    /** Enum value FixedTime. */
    FIXED_TIME("FixedTime"),

    /** Enum value IdentityProviderDerived. */
    IDENTITY_PROVIDER_DERIVED("IdentityProviderDerived");

    /** The actual serialized value for a CookieExpirationConvention instance. */
    private final String value;

    CookieExpirationConvention(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CookieExpirationConvention instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CookieExpirationConvention object, or null if unable to parse.
     */
    @JsonCreator
    public static CookieExpirationConvention fromString(String value) {
        if (value == null) {
            return null;
        }
        CookieExpirationConvention[] items = CookieExpirationConvention.values();
        for (CookieExpirationConvention item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
