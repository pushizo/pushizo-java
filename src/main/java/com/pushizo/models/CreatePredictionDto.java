// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreatePredictionDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreatePredictionDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("slug")
    private String slug;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "churn", "event".
     */
    @JsonProperty("kind")
    private String kind;

    @JsonProperty("event_names")
    private java.util.List<String> eventNames;

    @JsonProperty("horizon_days")
    private Long horizonDays;

    public String getSlug() {
        return slug;
    }

    public CreatePredictionDto slug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreatePredictionDto name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public CreatePredictionDto kind(String kind) {
        this.kind = kind;
        return this;
    }

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public CreatePredictionDto eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    public Long getHorizonDays() {
        return horizonDays;
    }

    public CreatePredictionDto horizonDays(Long horizonDays) {
        this.horizonDays = horizonDays;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
