// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsAdaptiveFrequency şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsAdaptiveFrequency {
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

    public UpdateAppDtoSettingsAdaptiveFrequency enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getMin() {
        return min;
    }

    public UpdateAppDtoSettingsAdaptiveFrequency min(Long min) {
        this.min = min;
        return this;
    }

    public Long getMax() {
        return max;
    }

    public UpdateAppDtoSettingsAdaptiveFrequency max(Long max) {
        this.max = max;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
