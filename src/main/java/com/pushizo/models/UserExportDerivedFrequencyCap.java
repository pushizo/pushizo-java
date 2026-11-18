// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerivedFrequencyCap şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerivedFrequencyCap {
    /**
     * Zorunlu.
     */
    @JsonProperty("weekly_cap")
    private Double weeklyCap;

    /**
     * Zorunlu.
     */
    @JsonProperty("engagement")
    private Double engagement;

    /**
     * Zorunlu.
     */
    @JsonProperty("computed_at")
    private String computedAt;

    public Double getWeeklyCap() {
        return weeklyCap;
    }

    public UserExportDerivedFrequencyCap weeklyCap(Double weeklyCap) {
        this.weeklyCap = weeklyCap;
        return this;
    }

    public Double getEngagement() {
        return engagement;
    }

    public UserExportDerivedFrequencyCap engagement(Double engagement) {
        this.engagement = engagement;
        return this;
    }

    public String getComputedAt() {
        return computedAt;
    }

    public UserExportDerivedFrequencyCap computedAt(String computedAt) {
        this.computedAt = computedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
