// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GlobalControl şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class GlobalControl {
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

    /**
     * Zorunlu.
     */
    @JsonProperty("started_at")
    private String startedAt;

    public Boolean getEnabled() {
        return enabled;
    }

    public GlobalControl enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getPercent() {
        return percent;
    }

    public GlobalControl percent(Long percent) {
        this.percent = percent;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public GlobalControl startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
