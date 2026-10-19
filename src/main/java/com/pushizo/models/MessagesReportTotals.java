// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessagesReportTotals şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessagesReportTotals {
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
    @JsonProperty("failed")
    private Long failed;

    /**
     * Zorunlu.
     */
    @JsonProperty("opened")
    private Long opened;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicked")
    private Long clicked;

    /**
     * Zorunlu.
     */
    @JsonProperty("converted")
    private Long converted;

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
    @JsonProperty("click_rate")
    private Double clickRate;

    public Long getSent() {
        return sent;
    }

    public MessagesReportTotals sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public MessagesReportTotals delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public MessagesReportTotals failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public MessagesReportTotals opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public MessagesReportTotals clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Long getConverted() {
        return converted;
    }

    public MessagesReportTotals converted(Long converted) {
        this.converted = converted;
        return this;
    }

    public Double getDeliveryRate() {
        return deliveryRate;
    }

    public MessagesReportTotals deliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
        return this;
    }

    public Double getOpenRate() {
        return openRate;
    }

    public MessagesReportTotals openRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    public Double getClickRate() {
        return clickRate;
    }

    public MessagesReportTotals clickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
