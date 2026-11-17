// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PreviewDataTransformDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PreviewDataTransformDto {
    /**
     * Zorunlu. Değerler: "event", "person".
     */
    @JsonProperty("target")
    private String target;

    /**
     * Değerler: "sdk", "api", "import", "system", "webhook_source", "pull_source".
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("records")
    private java.util.List<java.util.Map<String, Object>> records;

    @JsonProperty("transform")
    private PreviewDataTransformDtoTransform transform;

    @JsonProperty("transform_id")
    private String transformId;

    public String getTarget() {
        return target;
    }

    public PreviewDataTransformDto target(String target) {
        this.target = target;
        return this;
    }

    public String getSource() {
        return source;
    }

    public PreviewDataTransformDto source(String source) {
        this.source = source;
        return this;
    }

    public java.util.List<java.util.Map<String, Object>> getRecords() {
        return records;
    }

    public PreviewDataTransformDto records(java.util.List<java.util.Map<String, Object>> records) {
        this.records = records;
        return this;
    }

    public PreviewDataTransformDtoTransform getTransform() {
        return transform;
    }

    public PreviewDataTransformDto transform(PreviewDataTransformDtoTransform transform) {
        this.transform = transform;
        return this;
    }

    public String getTransformId() {
        return transformId;
    }

    public PreviewDataTransformDto transformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
