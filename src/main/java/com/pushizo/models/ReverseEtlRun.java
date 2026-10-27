// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReverseEtlRun şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ReverseEtlRun {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("sync_id")
    private String syncId;

    /**
     * Zorunlu. Değerler: "schedule", "manual".
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * Zorunlu. Değerler: "queued", "running", "succeeded", "failed".
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
    @JsonProperty("attempt")
    private Long attempt;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("started_at")
    private String startedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("finished_at")
    private String finishedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public ReverseEtlRun id(String id) {
        this.id = id;
        return this;
    }

    public String getSyncId() {
        return syncId;
    }

    public ReverseEtlRun syncId(String syncId) {
        this.syncId = syncId;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public ReverseEtlRun trigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ReverseEtlRun status(String status) {
        this.status = status;
        return this;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public ReverseEtlRun rowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    public Long getAttempt() {
        return attempt;
    }

    public ReverseEtlRun attempt(Long attempt) {
        this.attempt = attempt;
        return this;
    }

    public String getError() {
        return error;
    }

    public ReverseEtlRun error(String error) {
        this.error = error;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public ReverseEtlRun startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public ReverseEtlRun finishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public ReverseEtlRun durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ReverseEtlRun createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
