// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebCampaignVariantStatsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebCampaignVariantStatsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("variant_id")
    private String variantId;

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
    @JsonProperty("conversions")
    private Long conversions;

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

    public String getVariantId() {
        return variantId;
    }

    public WebCampaignVariantStatsItem variantId(String variantId) {
        this.variantId = variantId;
        return this;
    }

    public Long getImpressions() {
        return impressions;
    }

    public WebCampaignVariantStatsItem impressions(Long impressions) {
        this.impressions = impressions;
        return this;
    }

    public Long getClicks() {
        return clicks;
    }

    public WebCampaignVariantStatsItem clicks(Long clicks) {
        this.clicks = clicks;
        return this;
    }

    public Long getConversions() {
        return conversions;
    }

    public WebCampaignVariantStatsItem conversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    public Double getCtr() {
        return ctr;
    }

    public WebCampaignVariantStatsItem ctr(Double ctr) {
        this.ctr = ctr;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public WebCampaignVariantStatsItem conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
