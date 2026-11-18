// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Import şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Import {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu. Değerler: "legacy_players", "csv_users".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Zorunlu. Değerler: "pending", "running", "completed", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("stats")
    private ImportStats stats;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("error_report_url")
    private String errorReportUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("requested_by")
    private String requestedBy;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("completed_at")
    private String completedAt;

    public String getId() {
        return id;
    }

    public Import id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Import appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getType() {
        return type;
    }

    public Import type(String type) {
        this.type = type;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public Import fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Import status(String status) {
        this.status = status;
        return this;
    }

    public ImportStats getStats() {
        return stats;
    }

    public Import stats(ImportStats stats) {
        this.stats = stats;
        return this;
    }

    public String getError() {
        return error;
    }

    public Import error(String error) {
        this.error = error;
        return this;
    }

    public String getErrorReportUrl() {
        return errorReportUrl;
    }

    public Import errorReportUrl(String errorReportUrl) {
        this.errorReportUrl = errorReportUrl;
        return this;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public Import requestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Import createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public Import completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
