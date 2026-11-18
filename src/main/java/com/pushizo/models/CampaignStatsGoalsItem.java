// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignStatsGoalsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignStatsGoalsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("event")
    private String event;

    /**
     * Zorunlu.
     */
    @JsonProperty("primary")
    private Boolean primary;

    /**
     * Zorunlu.
     */
    @JsonProperty("converted")
    private Long converted;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    public String getEvent() {
        return event;
    }

    public CampaignStatsGoalsItem event(String event) {
        this.event = event;
        return this;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public CampaignStatsGoalsItem primary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    public Long getConverted() {
        return converted;
    }

    public CampaignStatsGoalsItem converted(Long converted) {
        this.converted = converted;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public CampaignStatsGoalsItem conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
