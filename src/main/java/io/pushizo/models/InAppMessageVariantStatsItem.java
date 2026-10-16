// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InAppMessageVariantStatsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InAppMessageVariantStatsItem {
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
    @JsonProperty("ctr")
    private Double ctr;

    public String getVariantId() {
        return variantId;
    }

    public InAppMessageVariantStatsItem variantId(String variantId) {
        this.variantId = variantId;
        return this;
    }

    public Long getImpressions() {
        return impressions;
    }

    public InAppMessageVariantStatsItem impressions(Long impressions) {
        this.impressions = impressions;
        return this;
    }

    public Long getClicks() {
        return clicks;
    }

    public InAppMessageVariantStatsItem clicks(Long clicks) {
        this.clicks = clicks;
        return this;
    }

    public Double getCtr() {
        return ctr;
    }

    public InAppMessageVariantStatsItem ctr(Double ctr) {
        this.ctr = ctr;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
