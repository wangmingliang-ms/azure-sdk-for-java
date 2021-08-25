// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.models.VolumePatchProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Volume patch resource. */
@Fluent
public final class VolumePatch extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumePatch.class);

    /*
     * Patchable volume properties
     */
    @JsonProperty(value = "properties")
    private VolumePatchProperties innerProperties;

    /**
     * Get the innerProperties property: Patchable volume properties.
     *
     * @return the innerProperties value.
     */
    private VolumePatchProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public VolumePatch withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumePatch withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the serviceLevel property: serviceLevel The service level of the file system.
     *
     * @return the serviceLevel value.
     */
    public ServiceLevel serviceLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLevel();
    }

    /**
     * Set the serviceLevel property: serviceLevel The service level of the file system.
     *
     * @param serviceLevel the serviceLevel value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withServiceLevel(ServiceLevel serviceLevel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumePatchProperties();
        }
        this.innerProperties().withServiceLevel(serviceLevel);
        return this;
    }

    /**
     * Get the usageThreshold property: usageThreshold Maximum storage quota allowed for a file system in bytes. This is
     * a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @return the usageThreshold value.
     */
    public Long usageThreshold() {
        return this.innerProperties() == null ? null : this.innerProperties().usageThreshold();
    }

    /**
     * Set the usageThreshold property: usageThreshold Maximum storage quota allowed for a file system in bytes. This is
     * a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @param usageThreshold the usageThreshold value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withUsageThreshold(Long usageThreshold) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumePatchProperties();
        }
        this.innerProperties().withUsageThreshold(usageThreshold);
        return this;
    }

    /**
     * Get the exportPolicy property: exportPolicy Set of export policy rules.
     *
     * @return the exportPolicy value.
     */
    public VolumePatchPropertiesExportPolicy exportPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().exportPolicy();
    }

    /**
     * Set the exportPolicy property: exportPolicy Set of export policy rules.
     *
     * @param exportPolicy the exportPolicy value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withExportPolicy(VolumePatchPropertiesExportPolicy exportPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumePatchProperties();
        }
        this.innerProperties().withExportPolicy(exportPolicy);
        return this;
    }

    /**
     * Get the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume.
     *
     * @return the throughputMibps value.
     */
    public Float throughputMibps() {
        return this.innerProperties() == null ? null : this.innerProperties().throughputMibps();
    }

    /**
     * Set the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume.
     *
     * @param throughputMibps the throughputMibps value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withThroughputMibps(Float throughputMibps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumePatchProperties();
        }
        this.innerProperties().withThroughputMibps(throughputMibps);
        return this;
    }

    /**
     * Get the dataProtection property: DataProtection DataProtection type volumes include an object containing details
     * of the replication.
     *
     * @return the dataProtection value.
     */
    public VolumePatchPropertiesDataProtection dataProtection() {
        return this.innerProperties() == null ? null : this.innerProperties().dataProtection();
    }

    /**
     * Set the dataProtection property: DataProtection DataProtection type volumes include an object containing details
     * of the replication.
     *
     * @param dataProtection the dataProtection value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withDataProtection(VolumePatchPropertiesDataProtection dataProtection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumePatchProperties();
        }
        this.innerProperties().withDataProtection(dataProtection);
        return this;
    }

    /**
     * Get the isDefaultQuotaEnabled property: Specifies if default quota is enabled for the volume.
     *
     * @return the isDefaultQuotaEnabled value.
     */
    public Boolean isDefaultQuotaEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isDefaultQuotaEnabled();
    }

    /**
     * Set the isDefaultQuotaEnabled property: Specifies if default quota is enabled for the volume.
     *
     * @param isDefaultQuotaEnabled the isDefaultQuotaEnabled value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withIsDefaultQuotaEnabled(Boolean isDefaultQuotaEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumePatchProperties();
        }
        this.innerProperties().withIsDefaultQuotaEnabled(isDefaultQuotaEnabled);
        return this;
    }

    /**
     * Get the defaultUserQuotaInKiBs property: Default user quota for volume in KiBs. If isDefaultQuotaEnabled is set,
     * the minimum value of 4 KiBs applies .
     *
     * @return the defaultUserQuotaInKiBs value.
     */
    public Long defaultUserQuotaInKiBs() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultUserQuotaInKiBs();
    }

    /**
     * Set the defaultUserQuotaInKiBs property: Default user quota for volume in KiBs. If isDefaultQuotaEnabled is set,
     * the minimum value of 4 KiBs applies .
     *
     * @param defaultUserQuotaInKiBs the defaultUserQuotaInKiBs value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withDefaultUserQuotaInKiBs(Long defaultUserQuotaInKiBs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumePatchProperties();
        }
        this.innerProperties().withDefaultUserQuotaInKiBs(defaultUserQuotaInKiBs);
        return this;
    }

    /**
     * Get the defaultGroupQuotaInKiBs property: Default group quota for volume in KiBs. If isDefaultQuotaEnabled is
     * set, the minimum value of 4 KiBs applies.
     *
     * @return the defaultGroupQuotaInKiBs value.
     */
    public Long defaultGroupQuotaInKiBs() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultGroupQuotaInKiBs();
    }

    /**
     * Set the defaultGroupQuotaInKiBs property: Default group quota for volume in KiBs. If isDefaultQuotaEnabled is
     * set, the minimum value of 4 KiBs applies.
     *
     * @param defaultGroupQuotaInKiBs the defaultGroupQuotaInKiBs value to set.
     * @return the VolumePatch object itself.
     */
    public VolumePatch withDefaultGroupQuotaInKiBs(Long defaultGroupQuotaInKiBs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumePatchProperties();
        }
        this.innerProperties().withDefaultGroupQuotaInKiBs(defaultGroupQuotaInKiBs);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
