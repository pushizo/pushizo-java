// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAffinityConfigDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAffinityConfigDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("attributes")
    private java.util.List<String> attributes;

    /**
     * Zorunlu.
     */
    @JsonProperty("events")
    private java.util.Map<String, Double> events;

    @JsonProperty("window_days")
    private Long windowDays;

    @JsonProperty("half_life_days")
    private Long halfLifeDays;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateAffinityConfigDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getAttributes() {
        return attributes;
    }

    public UpdateAffinityConfigDto attributes(java.util.List<String> attributes) {
        this.attributes = attributes;
        return this;
    }

    public java.util.Map<String, Double> getEvents() {
        return events;
    }

    public UpdateAffinityConfigDto events(java.util.Map<String, Double> events) {
        this.events = events;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public UpdateAffinityConfigDto windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public Long getHalfLifeDays() {
        return halfLifeDays;
    }

    public UpdateAffinityConfigDto halfLifeDays(Long halfLifeDays) {
        this.halfLifeDays = halfLifeDays;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
