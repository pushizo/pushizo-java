// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdAudienceSyncListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdAudienceSyncListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("audience_id")
    private String audienceId;

    /**
     * Zorunlu. Değerler: "schedule", "manual", "journey".
     */
    @JsonProperty("trigger")
    private String trigger;

    /**
     * Zorunlu. Değerler: "incremental", "full".
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * Zorunlu. Değerler: "running", "succeeded", "partial", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("added")
    private Long added;

    /**
     * Zorunlu.
     */
    @JsonProperty("removed")
    private Long removed;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Zorunlu.
     */
    @JsonProperty("skipped_no_consent")
    private Long skippedNoConsent;

    /**
     * Zorunlu.
     */
    @JsonProperty("skipped_no_identifier")
    private Long skippedNoIdentifier;

    /**
     * Zorunlu.
     */
    @JsonProperty("batches")
    private Long batches;

    /**
     * Zorunlu.
     */
    @JsonProperty("retries")
    private Long retries;

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

    public AdAudienceSyncListDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getAudienceId() {
        return audienceId;
    }

    public AdAudienceSyncListDataItem audienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public AdAudienceSyncListDataItem trigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getMode() {
        return mode;
    }

    public AdAudienceSyncListDataItem mode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AdAudienceSyncListDataItem status(String status) {
        this.status = status;
        return this;
    }

    public Long getAdded() {
        return added;
    }

    public AdAudienceSyncListDataItem added(Long added) {
        this.added = added;
        return this;
    }

    public Long getRemoved() {
        return removed;
    }

    public AdAudienceSyncListDataItem removed(Long removed) {
        this.removed = removed;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public AdAudienceSyncListDataItem failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getSkippedNoConsent() {
        return skippedNoConsent;
    }

    public AdAudienceSyncListDataItem skippedNoConsent(Long skippedNoConsent) {
        this.skippedNoConsent = skippedNoConsent;
        return this;
    }

    public Long getSkippedNoIdentifier() {
        return skippedNoIdentifier;
    }

    public AdAudienceSyncListDataItem skippedNoIdentifier(Long skippedNoIdentifier) {
        this.skippedNoIdentifier = skippedNoIdentifier;
        return this;
    }

    public Long getBatches() {
        return batches;
    }

    public AdAudienceSyncListDataItem batches(Long batches) {
        this.batches = batches;
        return this;
    }

    public Long getRetries() {
        return retries;
    }

    public AdAudienceSyncListDataItem retries(Long retries) {
        this.retries = retries;
        return this;
    }

    public String getError() {
        return error;
    }

    public AdAudienceSyncListDataItem error(String error) {
        this.error = error;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public AdAudienceSyncListDataItem startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public AdAudienceSyncListDataItem finishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public AdAudienceSyncListDataItem durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
