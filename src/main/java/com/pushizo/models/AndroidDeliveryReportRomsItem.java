// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AndroidDeliveryReportRomsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AndroidDeliveryReportRomsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("rom")
    private String rom;

    /**
     * Zorunlu.
     */
    @JsonProperty("devices")
    private Long devices;

    /**
     * Zorunlu.
     */
    @JsonProperty("restricted")
    private Long restricted;

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
    @JsonProperty("delivery_rate")
    private Double deliveryRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("median_delay_seconds")
    private Long medianDelaySeconds;

    public String getRom() {
        return rom;
    }

    public AndroidDeliveryReportRomsItem rom(String rom) {
        this.rom = rom;
        return this;
    }

    public Long getDevices() {
        return devices;
    }

    public AndroidDeliveryReportRomsItem devices(Long devices) {
        this.devices = devices;
        return this;
    }

    public Long getRestricted() {
        return restricted;
    }

    public AndroidDeliveryReportRomsItem restricted(Long restricted) {
        this.restricted = restricted;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public AndroidDeliveryReportRomsItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public AndroidDeliveryReportRomsItem delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Double getDeliveryRate() {
        return deliveryRate;
    }

    public AndroidDeliveryReportRomsItem deliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
        return this;
    }

    public Long getMedianDelaySeconds() {
        return medianDelaySeconds;
    }

    public AndroidDeliveryReportRomsItem medianDelaySeconds(Long medianDelaySeconds) {
        this.medianDelaySeconds = medianDelaySeconds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
