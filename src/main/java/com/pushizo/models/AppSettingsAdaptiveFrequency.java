// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsAdaptiveFrequency şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsAdaptiveFrequency {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("min")
    private Long min;

    /**
     * Zorunlu.
     */
    @JsonProperty("max")
    private Long max;

    public Boolean getEnabled() {
        return enabled;
    }

    public AppSettingsAdaptiveFrequency enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getMin() {
        return min;
    }

    public AppSettingsAdaptiveFrequency min(Long min) {
        this.min = min;
        return this;
    }

    public Long getMax() {
        return max;
    }

    public AppSettingsAdaptiveFrequency max(Long max) {
        this.max = max;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
