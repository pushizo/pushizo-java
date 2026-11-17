// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AndroidDeliveryReportTotals şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AndroidDeliveryReportTotals {
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

    public Long getSent() {
        return sent;
    }

    public AndroidDeliveryReportTotals sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public AndroidDeliveryReportTotals delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public AndroidDeliveryReportTotals opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Double getDeliveryRate() {
        return deliveryRate;
    }

    public AndroidDeliveryReportTotals deliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
        return this;
    }

    public Double getOpenRate() {
        return openRate;
    }

    public AndroidDeliveryReportTotals openRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    public Long getMedianDelaySeconds() {
        return medianDelaySeconds;
    }

    public AndroidDeliveryReportTotals medianDelaySeconds(Long medianDelaySeconds) {
        this.medianDelaySeconds = medianDelaySeconds;
        return this;
    }

    public Long getP90DelaySeconds() {
        return p90DelaySeconds;
    }

    public AndroidDeliveryReportTotals p90DelaySeconds(Long p90DelaySeconds) {
        this.p90DelaySeconds = p90DelaySeconds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
