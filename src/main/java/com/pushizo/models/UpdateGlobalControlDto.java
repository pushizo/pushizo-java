// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateGlobalControlDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateGlobalControlDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("percent")
    private Long percent;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateGlobalControlDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getPercent() {
        return percent;
    }

    public UpdateGlobalControlDto percent(Long percent) {
        this.percent = percent;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
