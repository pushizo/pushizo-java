// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsFrequencyCap şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsFrequencyCap {
    /**
     * Zorunlu.
     */
    @JsonProperty("max")
    private Long max;

    /**
     * Zorunlu.
     */
    @JsonProperty("windowHours")
    private Long windowHours;

    public Long getMax() {
        return max;
    }

    public AppSettingsFrequencyCap max(Long max) {
        this.max = max;
        return this;
    }

    public Long getWindowHours() {
        return windowHours;
    }

    public AppSettingsFrequencyCap windowHours(Long windowHours) {
        this.windowHours = windowHours;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
