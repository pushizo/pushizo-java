// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationRunListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class IntegrationRunListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "cohort_sync", "event_export", "hook_delivery", "inbound", "notification", "test".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu. Değerler: "schedule", "manual", "event", "inbound".
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * Zorunlu. Değerler: "running", "succeeded", "partial", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("stats")
    private java.util.Map<String, Double> stats;

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

    public String getId() {
        return id;
    }

    public IntegrationRunListDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public IntegrationRunListDataItem kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public IntegrationRunListDataItem trigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public IntegrationRunListDataItem status(String status) {
        this.status = status;
        return this;
    }

    public java.util.Map<String, Double> getStats() {
        return stats;
    }

    public IntegrationRunListDataItem stats(java.util.Map<String, Double> stats) {
        this.stats = stats;
        return this;
    }

    public String getError() {
        return error;
    }

    public IntegrationRunListDataItem error(String error) {
        this.error = error;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public IntegrationRunListDataItem startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public IntegrationRunListDataItem finishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public IntegrationRunListDataItem durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
