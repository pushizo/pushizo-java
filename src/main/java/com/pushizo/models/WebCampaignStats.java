// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebCampaignStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebCampaignStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("impressions")
    private Long impressions;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicks")
    private Long clicks;

    /**
     * Zorunlu.
     */
    @JsonProperty("closes")
    private Long closes;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversions")
    private Long conversions;

    /**
     * Zorunlu.
     */
    @JsonProperty("unique_visitors")
    private Long uniqueVisitors;

    /**
     * Zorunlu.
     */
    @JsonProperty("ctr")
    private Double ctr;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    public Long getImpressions() {
        return impressions;
    }

    public WebCampaignStats impressions(Long impressions) {
        this.impressions = impressions;
        return this;
    }

    public Long getClicks() {
        return clicks;
    }

    public WebCampaignStats clicks(Long clicks) {
        this.clicks = clicks;
        return this;
    }

    public Long getCloses() {
        return closes;
    }

    public WebCampaignStats closes(Long closes) {
        this.closes = closes;
        return this;
    }

    public Long getConversions() {
        return conversions;
    }

    public WebCampaignStats conversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    public Long getUniqueVisitors() {
        return uniqueVisitors;
    }

    public WebCampaignStats uniqueVisitors(Long uniqueVisitors) {
        this.uniqueVisitors = uniqueVisitors;
        return this;
    }

    public Double getCtr() {
        return ctr;
    }

    public WebCampaignStats ctr(Double ctr) {
        this.ctr = ctr;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public WebCampaignStats conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
