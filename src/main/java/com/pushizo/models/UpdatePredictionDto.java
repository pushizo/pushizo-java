// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdatePredictionDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdatePredictionDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("event_names")
    private java.util.List<String> eventNames;

    @JsonProperty("horizon_days")
    private Long horizonDays;

    public String getName() {
        return name;
    }

    public UpdatePredictionDto name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdatePredictionDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public UpdatePredictionDto eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    public Long getHorizonDays() {
        return horizonDays;
    }

    public UpdatePredictionDto horizonDays(Long horizonDays) {
        this.horizonDays = horizonDays;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
