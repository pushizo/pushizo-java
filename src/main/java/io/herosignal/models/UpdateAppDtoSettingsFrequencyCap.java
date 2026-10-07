// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsFrequencyCap şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsFrequencyCap {
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

    public UpdateAppDtoSettingsFrequencyCap max(Long max) {
        this.max = max;
        return this;
    }

    public Long getWindowHours() {
        return windowHours;
    }

    public UpdateAppDtoSettingsFrequencyCap windowHours(Long windowHours) {
        this.windowHours = windowHours;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
