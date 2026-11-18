// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AndroidDeliveryReportVendorsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AndroidDeliveryReportVendorsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("vendor")
    private String vendor;

    /**
     * Zorunlu.
     */
    @JsonProperty("aggressive")
    private Boolean aggressive;

    /**
     * Zorunlu.
     */
    @JsonProperty("devices")
    private Long devices;

    /**
     * Zorunlu.
     */
    @JsonProperty("reporting")
    private Long reporting;

    /**
     * Zorunlu.
     */
    @JsonProperty("restricted")
    private Long restricted;

    /**
     * Zorunlu.
     */
    @JsonProperty("battery_optimized")
    private Long batteryOptimized;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

    /**
     * Zorunlu.
     */
    @JsonProperty("delivered")
    private Long delivered;

    /**
     * Zorunlu.
     */
    @JsonProperty("opened")
    private Long opened;

    /**
     * Zorunlu.
     */
    @JsonProperty("delivery_rate")
    private Double deliveryRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("open_rate")
    private Double openRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("median_delay_seconds")
    private Long medianDelaySeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("p90_delay_seconds")
    private Long p90DelaySeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("deprioritized")
    private Long deprioritized;

    public String getVendor() {
        return vendor;
    }

    public AndroidDeliveryReportVendorsItem vendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public Boolean getAggressive() {
        return aggressive;
    }

    public AndroidDeliveryReportVendorsItem aggressive(Boolean aggressive) {
        this.aggressive = aggressive;
        return this;
    }

    public Long getDevices() {
        return devices;
    }

    public AndroidDeliveryReportVendorsItem devices(Long devices) {
        this.devices = devices;
        return this;
    }

    public Long getReporting() {
        return reporting;
    }

    public AndroidDeliveryReportVendorsItem reporting(Long reporting) {
        this.reporting = reporting;
        return this;
    }

    public Long getRestricted() {
        return restricted;
    }

    public AndroidDeliveryReportVendorsItem restricted(Long restricted) {
        this.restricted = restricted;
        return this;
    }

    public Long getBatteryOptimized() {
        return batteryOptimized;
    }

    public AndroidDeliveryReportVendorsItem batteryOptimized(Long batteryOptimized) {
        this.batteryOptimized = batteryOptimized;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public AndroidDeliveryReportVendorsItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public AndroidDeliveryReportVendorsItem delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public AndroidDeliveryReportVendorsItem opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Double getDeliveryRate() {
        return deliveryRate;
    }

    public AndroidDeliveryReportVendorsItem deliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
        return this;
    }

    public Double getOpenRate() {
        return openRate;
    }

    public AndroidDeliveryReportVendorsItem openRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    public Long getMedianDelaySeconds() {
        return medianDelaySeconds;
    }

    public AndroidDeliveryReportVendorsItem medianDelaySeconds(Long medianDelaySeconds) {
        this.medianDelaySeconds = medianDelaySeconds;
        return this;
    }

    public Long getP90DelaySeconds() {
        return p90DelaySeconds;
    }

    public AndroidDeliveryReportVendorsItem p90DelaySeconds(Long p90DelaySeconds) {
        this.p90DelaySeconds = p90DelaySeconds;
        return this;
    }

    public Long getDeprioritized() {
        return deprioritized;
    }

    public AndroidDeliveryReportVendorsItem deprioritized(Long deprioritized) {
        this.deprioritized = deprioritized;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
