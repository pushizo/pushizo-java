// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AndroidDeliveryReportDevices şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AndroidDeliveryReportDevices {
    /**
     * Zorunlu.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Zorunlu.
     */
    @JsonProperty("reporting")
    private Long reporting;

    /**
     * Zorunlu.
     */
    @JsonProperty("reporting_rate")
    private Double reportingRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("restricted")
    private Long restricted;

    /**
     * Zorunlu.
     */
    @JsonProperty("restricted_rate")
    private Double restrictedRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("background_restricted")
    private Long backgroundRestricted;

    /**
     * Zorunlu.
     */
    @JsonProperty("battery_optimized")
    private Long batteryOptimized;

    /**
     * Zorunlu.
     */
    @JsonProperty("low_standby_bucket")
    private Long lowStandbyBucket;

    /**
     * Zorunlu.
     */
    @JsonProperty("power_save")
    private Long powerSave;

    /**
     * Zorunlu.
     */
    @JsonProperty("data_saver")
    private Long dataSaver;

    /**
     * Zorunlu.
     */
    @JsonProperty("channel_blocked")
    private Long channelBlocked;

    /**
     * Zorunlu.
     */
    @JsonProperty("notifications_blocked")
    private Long notificationsBlocked;

    /**
     * Zorunlu.
     */
    @JsonProperty("aggressive_vendor")
    private Long aggressiveVendor;

    /**
     * Zorunlu.
     */
    @JsonProperty("aggressive_vendor_rate")
    private Double aggressiveVendorRate;

    public Long getTotal() {
        return total;
    }

    public AndroidDeliveryReportDevices total(Long total) {
        this.total = total;
        return this;
    }

    public Long getReporting() {
        return reporting;
    }

    public AndroidDeliveryReportDevices reporting(Long reporting) {
        this.reporting = reporting;
        return this;
    }

    public Double getReportingRate() {
        return reportingRate;
    }

    public AndroidDeliveryReportDevices reportingRate(Double reportingRate) {
        this.reportingRate = reportingRate;
        return this;
    }

    public Long getRestricted() {
        return restricted;
    }

    public AndroidDeliveryReportDevices restricted(Long restricted) {
        this.restricted = restricted;
        return this;
    }

    public Double getRestrictedRate() {
        return restrictedRate;
    }

    public AndroidDeliveryReportDevices restrictedRate(Double restrictedRate) {
        this.restrictedRate = restrictedRate;
        return this;
    }

    public Long getBackgroundRestricted() {
        return backgroundRestricted;
    }

    public AndroidDeliveryReportDevices backgroundRestricted(Long backgroundRestricted) {
        this.backgroundRestricted = backgroundRestricted;
        return this;
    }

    public Long getBatteryOptimized() {
        return batteryOptimized;
    }

    public AndroidDeliveryReportDevices batteryOptimized(Long batteryOptimized) {
        this.batteryOptimized = batteryOptimized;
        return this;
    }

    public Long getLowStandbyBucket() {
        return lowStandbyBucket;
    }

    public AndroidDeliveryReportDevices lowStandbyBucket(Long lowStandbyBucket) {
        this.lowStandbyBucket = lowStandbyBucket;
        return this;
    }

    public Long getPowerSave() {
        return powerSave;
    }

    public AndroidDeliveryReportDevices powerSave(Long powerSave) {
        this.powerSave = powerSave;
        return this;
    }

    public Long getDataSaver() {
        return dataSaver;
    }

    public AndroidDeliveryReportDevices dataSaver(Long dataSaver) {
        this.dataSaver = dataSaver;
        return this;
    }

    public Long getChannelBlocked() {
        return channelBlocked;
    }

    public AndroidDeliveryReportDevices channelBlocked(Long channelBlocked) {
        this.channelBlocked = channelBlocked;
        return this;
    }

    public Long getNotificationsBlocked() {
        return notificationsBlocked;
    }

    public AndroidDeliveryReportDevices notificationsBlocked(Long notificationsBlocked) {
        this.notificationsBlocked = notificationsBlocked;
        return this;
    }

    public Long getAggressiveVendor() {
        return aggressiveVendor;
    }

    public AndroidDeliveryReportDevices aggressiveVendor(Long aggressiveVendor) {
        this.aggressiveVendor = aggressiveVendor;
        return this;
    }

    public Double getAggressiveVendorRate() {
        return aggressiveVendorRate;
    }

    public AndroidDeliveryReportDevices aggressiveVendorRate(Double aggressiveVendorRate) {
        this.aggressiveVendorRate = aggressiveVendorRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
