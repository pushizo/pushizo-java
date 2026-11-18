// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AndroidDeliveryReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AndroidDeliveryReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Zorunlu.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Zorunlu.
     */
    @JsonProperty("devices")
    private AndroidDeliveryReportDevices devices;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private AndroidDeliveryReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous")
    private AndroidDeliveryReportPrevious previous;

    /**
     * Zorunlu.
     */
    @JsonProperty("deprioritized")
    private Long deprioritized;

    /**
     * Zorunlu.
     */
    @JsonProperty("aggressive")
    private AndroidDeliveryReportAggressive aggressive;

    /**
     * Zorunlu.
     */
    @JsonProperty("others")
    private AndroidDeliveryReportOthers others;

    /**
     * Zorunlu.
     */
    @JsonProperty("vendors")
    private java.util.List<AndroidDeliveryReportVendorsItem> vendors;

    /**
     * Zorunlu.
     */
    @JsonProperty("roms")
    private java.util.List<AndroidDeliveryReportRomsItem> roms;

    /**
     * Zorunlu. Değerler: "upgrade_sdk", "vendor_guidance", "background_restricted", "battery_exemption", "deprioritized", "notifications_blocked".
     */
    @JsonProperty("recommendations")
    private java.util.List<String> recommendations;

    public String getFrom() {
        return from;
    }

    public AndroidDeliveryReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AndroidDeliveryReport to(String to) {
        this.to = to;
        return this;
    }

    public AndroidDeliveryReportDevices getDevices() {
        return devices;
    }

    public AndroidDeliveryReport devices(AndroidDeliveryReportDevices devices) {
        this.devices = devices;
        return this;
    }

    public AndroidDeliveryReportTotals getTotals() {
        return totals;
    }

    public AndroidDeliveryReport totals(AndroidDeliveryReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public AndroidDeliveryReportPrevious getPrevious() {
        return previous;
    }

    public AndroidDeliveryReport previous(AndroidDeliveryReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    public Long getDeprioritized() {
        return deprioritized;
    }

    public AndroidDeliveryReport deprioritized(Long deprioritized) {
        this.deprioritized = deprioritized;
        return this;
    }

    public AndroidDeliveryReportAggressive getAggressive() {
        return aggressive;
    }

    public AndroidDeliveryReport aggressive(AndroidDeliveryReportAggressive aggressive) {
        this.aggressive = aggressive;
        return this;
    }

    public AndroidDeliveryReportOthers getOthers() {
        return others;
    }

    public AndroidDeliveryReport others(AndroidDeliveryReportOthers others) {
        this.others = others;
        return this;
    }

    public java.util.List<AndroidDeliveryReportVendorsItem> getVendors() {
        return vendors;
    }

    public AndroidDeliveryReport vendors(java.util.List<AndroidDeliveryReportVendorsItem> vendors) {
        this.vendors = vendors;
        return this;
    }

    public java.util.List<AndroidDeliveryReportRomsItem> getRoms() {
        return roms;
    }

    public AndroidDeliveryReport roms(java.util.List<AndroidDeliveryReportRomsItem> roms) {
        this.roms = roms;
        return this;
    }

    public java.util.List<String> getRecommendations() {
        return recommendations;
    }

    public AndroidDeliveryReport recommendations(java.util.List<String> recommendations) {
        this.recommendations = recommendations;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
