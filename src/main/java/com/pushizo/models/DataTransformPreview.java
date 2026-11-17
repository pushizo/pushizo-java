// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataTransformPreview şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataTransformPreview {
    /**
     * Zorunlu.
     */
    @JsonProperty("results")
    private java.util.List<DataTransformPreviewResultsItem> results;

    /**
     * Zorunlu.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    public java.util.List<DataTransformPreviewResultsItem> getResults() {
        return results;
    }

    public DataTransformPreview results(java.util.List<DataTransformPreviewResultsItem> results) {
        this.results = results;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public DataTransformPreview durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
