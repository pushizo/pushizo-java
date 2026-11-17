// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataQuarantineListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataQuarantineListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "event", "person".
     */
    @JsonProperty("target")
    private String target;

    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("source_id")
    private String sourceId;

    /**
     * Zorunlu.
     */
    @JsonProperty("transform_id")
    private String transformId;

    /**
     * Zorunlu.
     */
    @JsonProperty("payload")
    private java.util.Map<String, Object> payload;

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
     * Zorunlu. Değerler: "pending", "reprocessed", "discarded".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("attempts")
    private Long attempts;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("resolved_at")
    private String resolvedAt;

    public String getId() {
        return id;
    }

    public DataQuarantineListDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public DataQuarantineListDataItem target(String target) {
        this.target = target;
        return this;
    }

    public String getSource() {
        return source;
    }

    public DataQuarantineListDataItem source(String source) {
        this.source = source;
        return this;
    }

    public String getSourceId() {
        return sourceId;
    }

    public DataQuarantineListDataItem sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getTransformId() {
        return transformId;
    }

    public DataQuarantineListDataItem transformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    public java.util.Map<String, Object> getPayload() {
        return payload;
    }

    public DataQuarantineListDataItem payload(java.util.Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public DataQuarantineListDataItem errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorPath() {
        return errorPath;
    }

    public DataQuarantineListDataItem errorPath(String errorPath) {
        this.errorPath = errorPath;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public DataQuarantineListDataItem errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DataQuarantineListDataItem status(String status) {
        this.status = status;
        return this;
    }

    public Long getAttempts() {
        return attempts;
    }

    public DataQuarantineListDataItem attempts(Long attempts) {
        this.attempts = attempts;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public DataQuarantineListDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public DataQuarantineListDataItem updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getResolvedAt() {
        return resolvedAt;
    }

    public DataQuarantineListDataItem resolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
