// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateDataTransformDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateDataTransformDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "event", "person".
     */
    @JsonProperty("target")
    private String target;

    /**
     * Zorunlu. Değerler: "rules", "javascript".
     */
    @JsonProperty("kind")
    private String kind;

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

    public CreateDataTransformDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateDataTransformDto description(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateDataTransformDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public CreateDataTransformDto target(String target) {
        this.target = target;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public CreateDataTransformDto kind(String kind) {
        this.kind = kind;
        return this;
    }

    public Long getPosition() {
        return position;
    }

    public CreateDataTransformDto position(Long position) {
        this.position = position;
        return this;
    }

    public java.util.List<Object> getRules() {
        return rules;
    }

    public CreateDataTransformDto rules(java.util.List<Object> rules) {
        this.rules = rules;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CreateDataTransformDto code(String code) {
        this.code = code;
        return this;
    }

    public java.util.List<String> getSources() {
        return sources;
    }

    public CreateDataTransformDto sources(java.util.List<String> sources) {
        this.sources = sources;
        return this;
    }

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public CreateDataTransformDto eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
