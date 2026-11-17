// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PreviewDataTransformDtoTransform şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PreviewDataTransformDtoTransform {
    /**
     * Zorunlu. Değerler: "rules", "javascript".
     */
    @JsonProperty("kind")
    private String kind;

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

    public String getKind() {
        return kind;
    }

    public PreviewDataTransformDtoTransform kind(String kind) {
        this.kind = kind;
        return this;
    }

    public java.util.List<Object> getRules() {
        return rules;
    }

    public PreviewDataTransformDtoTransform rules(java.util.List<Object> rules) {
        this.rules = rules;
        return this;
    }

    public String getCode() {
        return code;
    }

    public PreviewDataTransformDtoTransform code(String code) {
        this.code = code;
        return this;
    }

    public java.util.List<String> getSources() {
        return sources;
    }

    public PreviewDataTransformDtoTransform sources(java.util.List<String> sources) {
        this.sources = sources;
        return this;
    }

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public PreviewDataTransformDtoTransform eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
