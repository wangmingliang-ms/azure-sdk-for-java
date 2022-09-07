// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StaticMapLayer. */
public final class StaticMapLayer extends ExpandableStringEnum<StaticMapLayer> {
    /** Static value basic for StaticMapLayer. */
    public static final StaticMapLayer BASIC = fromString("basic");

    /** Static value hybrid for StaticMapLayer. */
    public static final StaticMapLayer HYBRID = fromString("hybrid");

    /** Static value labels for StaticMapLayer. */
    public static final StaticMapLayer LABELS = fromString("labels");

    /**
     * Creates or finds a StaticMapLayer from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StaticMapLayer.
     */
    @JsonCreator
    public static StaticMapLayer fromString(String name) {
        return fromString(name, StaticMapLayer.class);
    }

    /**
     * Gets known StaticMapLayer values.
     *
     * @return known StaticMapLayer values.
     */
    public static Collection<StaticMapLayer> values() {
        return values(StaticMapLayer.class);
    }
}