// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataTransformPreviewResultsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataTransformPreviewResultsItem {
    /**
     * Zorunlu. Değerler: "kept", "dropped", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("record")
    private java.util.Map<String, Object> record_;

    /**
     * Zorunlu.
     */
    @JsonProperty("transform_id")
    private String transformId;

    /**
     * Zorunlu. Değerler: "mapping_failed", "invalid_path", "cast_failed", "rule_failed", "invalid_output", "js_error", "js_timeout", "js_memory", "js_invalid_return", "sandbox_unavailable", "write_failed".
     */
    @JsonProperty("error_code")
    private String errorCode;

    /**
     * Zorunlu.
     */
    @JsonProperty("error_path")
    private String errorPath;

    /**
     * Zorunlu.
     */
    @JsonProperty("error_message")
    private String errorMessage;

    /**
     * Zorunlu.
     */
    @JsonProperty("logs")
    private java.util.List<String> logs;

    public String getStatus() {
        return status;
    }

    public DataTransformPreviewResultsItem status(String status) {
        this.status = status;
        return this;
    }

    public java.util.Map<String, Object> getRecord_() {
        return record_;
    }

    public DataTransformPreviewResultsItem record_(java.util.Map<String, Object> record_) {
        this.record_ = record_;
        return this;
    }

    public String getTransformId() {
        return transformId;
    }

    public DataTransformPreviewResultsItem transformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public DataTransformPreviewResultsItem errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorPath() {
        return errorPath;
    }

    public DataTransformPreviewResultsItem errorPath(String errorPath) {
        this.errorPath = errorPath;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public DataTransformPreviewResultsItem errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public java.util.List<String> getLogs() {
        return logs;
    }

    public DataTransformPreviewResultsItem logs(java.util.List<String> logs) {
        this.logs = logs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
