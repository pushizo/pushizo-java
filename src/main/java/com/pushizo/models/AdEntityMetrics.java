// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdEntityMetrics şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdEntityMetrics {
    /**
     * Zorunlu.
     */
    @JsonProperty("impressions")
    private Double impressions;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicks")
    private Double clicks;

    /**
     * Zorunlu.
     */
    @JsonProperty("spend")
    private Double spend;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversions")
    private Double conversions;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_value")
    private Double conversionValue;

    /**
     * Zorunlu.
     */
    @JsonProperty("ctr")
    private Double ctr;

    /**
     * Zorunlu.
     */
    @JsonProperty("cpc")
    private Double cpc;

    /**
     * Zorunlu.
     */
    @JsonProperty("roas")
    private Double roas;

    public Double getImpressions() {
        return impressions;
    }

    public AdEntityMetrics impressions(Double impressions) {
        this.impressions = impressions;
        return this;
    }

    public Double getClicks() {
        return clicks;
    }

    public AdEntityMetrics clicks(Double clicks) {
        this.clicks = clicks;
        return this;
    }

    public Double getSpend() {
        return spend;
    }

    public AdEntityMetrics spend(Double spend) {
        this.spend = spend;
        return this;
    }

    public Double getConversions() {
        return conversions;
    }

    public AdEntityMetrics conversions(Double conversions) {
        this.conversions = conversions;
        return this;
    }

    public Double getConversionValue() {
        return conversionValue;
    }

    public AdEntityMetrics conversionValue(Double conversionValue) {
        this.conversionValue = conversionValue;
        return this;
    }

    public Double getCtr() {
        return ctr;
    }

    public AdEntityMetrics ctr(Double ctr) {
        this.ctr = ctr;
        return this;
    }

    public Double getCpc() {
        return cpc;
    }

    public AdEntityMetrics cpc(Double cpc) {
        this.cpc = cpc;
        return this;
    }

    public Double getRoas() {
        return roas;
    }

    public AdEntityMetrics roas(Double roas) {
        this.roas = roas;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
