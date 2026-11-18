// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailHygieneRun şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailHygieneRun {
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
     * Zorunlu. Değerler: "queued", "running", "completed", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Zorunlu.
     */
    @JsonProperty("processed")
    private Long processed;

    /**
     * Zorunlu.
     */
    @JsonProperty("valid")
    private Long valid;

    /**
     * Zorunlu.
     */
    @JsonProperty("invalid")
    private Long invalid;

    /**
     * Zorunlu.
     */
    @JsonProperty("unknown")
    private Long unknown;

    /**
     * Zorunlu.
     */
    @JsonProperty("reasons")
    private java.util.Map<String, Long> reasons;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("suppressed_count")
    private Long suppressedCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("suppressed_at")
    private String suppressedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("started_at")
    private String startedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("completed_at")
    private String completedAt;

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

    public String getId() {
        return id;
    }

    public EmailHygieneRun id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public EmailHygieneRun appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public EmailHygieneRun status(String status) {
        this.status = status;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public EmailHygieneRun total(Long total) {
        this.total = total;
        return this;
    }

    public Long getProcessed() {
        return processed;
    }

    public EmailHygieneRun processed(Long processed) {
        this.processed = processed;
        return this;
    }

    public Long getValid() {
        return valid;
    }

    public EmailHygieneRun valid(Long valid) {
        this.valid = valid;
        return this;
    }

    public Long getInvalid() {
        return invalid;
    }

    public EmailHygieneRun invalid(Long invalid) {
        this.invalid = invalid;
        return this;
    }

    public Long getUnknown() {
        return unknown;
    }

    public EmailHygieneRun unknown(Long unknown) {
        this.unknown = unknown;
        return this;
    }

    public java.util.Map<String, Long> getReasons() {
        return reasons;
    }

    public EmailHygieneRun reasons(java.util.Map<String, Long> reasons) {
        this.reasons = reasons;
        return this;
    }

    public String getError() {
        return error;
    }

    public EmailHygieneRun error(String error) {
        this.error = error;
        return this;
    }

    public Long getSuppressedCount() {
        return suppressedCount;
    }

    public EmailHygieneRun suppressedCount(Long suppressedCount) {
        this.suppressedCount = suppressedCount;
        return this;
    }

    public String getSuppressedAt() {
        return suppressedAt;
    }

    public EmailHygieneRun suppressedAt(String suppressedAt) {
        this.suppressedAt = suppressedAt;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public EmailHygieneRun startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public EmailHygieneRun completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public EmailHygieneRun createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public EmailHygieneRun updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
