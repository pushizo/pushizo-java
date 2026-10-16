// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Export şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Export {
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
     * Zorunlu. Değerler: "users", "subscriptions", "events", "deliveries", "message_events".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("filters")
    private ExportFilters filters;

    /**
     * Zorunlu. Değerler: "pending", "running", "completed", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("row_count")
    private Long rowCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("download_url")
    private String downloadUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

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

    public Export id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Export appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getType() {
        return type;
    }

    public Export type(String type) {
        this.type = type;
        return this;
    }

    public ExportFilters getFilters() {
        return filters;
    }

    public Export filters(ExportFilters filters) {
        this.filters = filters;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Export status(String status) {
        this.status = status;
        return this;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public Export rowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    public String getError() {
        return error;
    }

    public Export error(String error) {
        this.error = error;
        return this;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public Export downloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public Export expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public Export requestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Export createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public Export completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
