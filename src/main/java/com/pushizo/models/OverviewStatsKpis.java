// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OverviewStatsKpis şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class OverviewStatsKpis {
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

    /**
     * Zorunlu.
     */
    @JsonProperty("active_subscriptions")
    private Long activeSubscriptions;

    /**
     * Zorunlu.
     */
    @JsonProperty("new_subscriptions")
    private Long newSubscriptions;

    /**
     * Zorunlu.
     */
    @JsonProperty("opt_outs")
    private Long optOuts;

    public Long getSent() {
        return sent;
    }

    public OverviewStatsKpis sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getDelivered() {
        return delivered;
    }

    public OverviewStatsKpis delivered(Long delivered) {
        this.delivered = delivered;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public OverviewStatsKpis failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public OverviewStatsKpis opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public OverviewStatsKpis clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    public Double getDeliveryRate() {
        return deliveryRate;
    }

    public OverviewStatsKpis deliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
        return this;
    }

    public Double getOpenRate() {
        return openRate;
    }

    public OverviewStatsKpis openRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    public Double getClickRate() {
        return clickRate;
    }

    public OverviewStatsKpis clickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }

    public Long getActiveSubscriptions() {
        return activeSubscriptions;
    }

    public OverviewStatsKpis activeSubscriptions(Long activeSubscriptions) {
        this.activeSubscriptions = activeSubscriptions;
        return this;
    }

    public Long getNewSubscriptions() {
        return newSubscriptions;
    }

    public OverviewStatsKpis newSubscriptions(Long newSubscriptions) {
        this.newSubscriptions = newSubscriptions;
        return this;
    }

    public Long getOptOuts() {
        return optOuts;
    }

    public OverviewStatsKpis optOuts(Long optOuts) {
        this.optOuts = optOuts;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
