// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdSpendReportTotals şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdSpendReportTotals {
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
    @JsonProperty("cpa")
    private Double cpa;

    /**
     * Zorunlu.
     */
    @JsonProperty("roas")
    private Double roas;

    public Double getImpressions() {
        return impressions;
    }

    public AdSpendReportTotals impressions(Double impressions) {
        this.impressions = impressions;
        return this;
    }

    public Double getClicks() {
        return clicks;
    }

    public AdSpendReportTotals clicks(Double clicks) {
        this.clicks = clicks;
        return this;
    }

    public Double getSpend() {
        return spend;
    }

    public AdSpendReportTotals spend(Double spend) {
        this.spend = spend;
        return this;
    }

    public Double getConversions() {
        return conversions;
    }

    public AdSpendReportTotals conversions(Double conversions) {
        this.conversions = conversions;
        return this;
    }

    public Double getConversionValue() {
        return conversionValue;
    }

    public AdSpendReportTotals conversionValue(Double conversionValue) {
        this.conversionValue = conversionValue;
        return this;
    }

    public Double getCtr() {
        return ctr;
    }

    public AdSpendReportTotals ctr(Double ctr) {
        this.ctr = ctr;
        return this;
    }

    public Double getCpc() {
        return cpc;
    }

    public AdSpendReportTotals cpc(Double cpc) {
        this.cpc = cpc;
        return this;
    }

    public Double getCpa() {
        return cpa;
    }

    public AdSpendReportTotals cpa(Double cpa) {
        this.cpa = cpa;
        return this;
    }

    public Double getRoas() {
        return roas;
    }

    public AdSpendReportTotals roas(Double roas) {
        this.roas = roas;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
