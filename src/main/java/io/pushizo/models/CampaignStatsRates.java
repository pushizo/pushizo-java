// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignStatsRates şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignStatsRates {
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
    @JsonProperty("failure_rate")
    private Double failureRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    public Double getDeliveryRate() {
        return deliveryRate;
    }

    public CampaignStatsRates deliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
        return this;
    }

    public Double getOpenRate() {
        return openRate;
    }

    public CampaignStatsRates openRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    public Double getClickRate() {
        return clickRate;
    }

    public CampaignStatsRates clickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }

    public Double getFailureRate() {
        return failureRate;
    }

    public CampaignStatsRates failureRate(Double failureRate) {
        this.failureRate = failureRate;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public CampaignStatsRates conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
