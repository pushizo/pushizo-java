// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateDataTransformDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateDataTransformDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("position")
    private Long position;

    @JsonProperty("rules")
    private java.util.List<Object> rules;

    @JsonProperty("code")
    private String code;

    /**
     * Değerler: "sdk", "api", "import", "system", "webhook_source", "pull_source".
     */
    @JsonProperty("sources")
    private java.util.List<String> sources;

    @JsonProperty("event_names")
    private java.util.List<String> eventNames;

    public String getName() {
        return name;
    }

    public UpdateDataTransformDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateDataTransformDto description(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateDataTransformDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getPosition() {
        return position;
    }

    public UpdateDataTransformDto position(Long position) {
        this.position = position;
        return this;
    }

    public java.util.List<Object> getRules() {
        return rules;
    }

    public UpdateDataTransformDto rules(java.util.List<Object> rules) {
        this.rules = rules;
        return this;
    }

    public String getCode() {
        return code;
    }

    public UpdateDataTransformDto code(String code) {
        this.code = code;
        return this;
    }

    public java.util.List<String> getSources() {
        return sources;
    }

    public UpdateDataTransformDto sources(java.util.List<String> sources) {
        this.sources = sources;
        return this;
    }

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public UpdateDataTransformDto eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
