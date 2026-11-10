// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebPersonalizationStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebPersonalizationStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("visitors")
    private Long visitors;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversions")
    private Long conversions;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_rate")
    private Double conversionRate;

    public Long getVisitors() {
        return visitors;
    }

    public WebPersonalizationStats visitors(Long visitors) {
        this.visitors = visitors;
        return this;
    }

    public Long getConversions() {
        return conversions;
    }

    public WebPersonalizationStats conversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public WebPersonalizationStats conversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
