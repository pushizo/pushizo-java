// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdAudience şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdAudience {
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
     * Zorunlu.
     */
    @JsonProperty("ad_account_id")
    private String adAccountId;

    /**
     * Zorunlu. Değerler: "meta", "google", "tiktok", "linkedin".
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * Zorunlu. Değerler: "segment", "journey", "lookalike".
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("segment_id")
    private String segmentId;

    /**
     * Zorunlu.
     */
    @JsonProperty("segment_name")
    private String segmentName;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu. Değerler: "pending", "active", "paused", "error".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu. Değerler: "email", "phone", "maid".
     */
    @JsonProperty("identifiers")
    private java.util.List<String> identifiers;

    /**
     * Zorunlu.
     */
    @JsonProperty("sync_interval_minutes")
    private Long syncIntervalMinutes;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_sync_at")
    private String nextSyncAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_synced_at")
    private String lastSyncedAt;

    /**
     * Zorunlu. Değerler: "succeeded", "partial", "failed".
     */
    @JsonProperty("last_sync_status")
    private String lastSyncStatus;

    /**
     * Zorunlu.
     */
    @JsonProperty("full_reload_requested")
    private Boolean fullReloadRequested;

    /**
     * Zorunlu.
     */
    @JsonProperty("member_count")
    private Long memberCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("estimated_size")
    private Long estimatedSize;

    /**
     * Zorunlu.
     */
    @JsonProperty("match_rate")
    private Double matchRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("size_updated_at")
    private String sizeUpdatedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("lookalike_source_id")
    private String lookalikeSourceId;

    /**
     * Zorunlu.
     */
    @JsonProperty("lookalike_spec")
    private AdAudienceLookalikeSpec lookalikeSpec;

    /**
     * Zorunlu.
     */
    @JsonProperty("consecutive_failures")
    private Long consecutiveFailures;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error_at")
    private String lastErrorAt;

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

    public AdAudience id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public AdAudience appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getAdAccountId() {
        return adAccountId;
    }

    public AdAudience adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public AdAudience platform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getSource() {
        return source;
    }

    public AdAudience source(String source) {
        this.source = source;
        return this;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public AdAudience segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public AdAudience segmentName(String segmentName) {
        this.segmentName = segmentName;
        return this;
    }

    public String getName() {
        return name;
    }

    public AdAudience name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AdAudience description(String description) {
        this.description = description;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public AdAudience externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AdAudience status(String status) {
        this.status = status;
        return this;
    }

    public java.util.List<String> getIdentifiers() {
        return identifiers;
    }

    public AdAudience identifiers(java.util.List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public Long getSyncIntervalMinutes() {
        return syncIntervalMinutes;
    }

    public AdAudience syncIntervalMinutes(Long syncIntervalMinutes) {
        this.syncIntervalMinutes = syncIntervalMinutes;
        return this;
    }

    public String getNextSyncAt() {
        return nextSyncAt;
    }

    public AdAudience nextSyncAt(String nextSyncAt) {
        this.nextSyncAt = nextSyncAt;
        return this;
    }

    public String getLastSyncedAt() {
        return lastSyncedAt;
    }

    public AdAudience lastSyncedAt(String lastSyncedAt) {
        this.lastSyncedAt = lastSyncedAt;
        return this;
    }

    public String getLastSyncStatus() {
        return lastSyncStatus;
    }

    public AdAudience lastSyncStatus(String lastSyncStatus) {
        this.lastSyncStatus = lastSyncStatus;
        return this;
    }

    public Boolean getFullReloadRequested() {
        return fullReloadRequested;
    }

    public AdAudience fullReloadRequested(Boolean fullReloadRequested) {
        this.fullReloadRequested = fullReloadRequested;
        return this;
    }

    public Long getMemberCount() {
        return memberCount;
    }

    public AdAudience memberCount(Long memberCount) {
        this.memberCount = memberCount;
        return this;
    }

    public Long getEstimatedSize() {
        return estimatedSize;
    }

    public AdAudience estimatedSize(Long estimatedSize) {
        this.estimatedSize = estimatedSize;
        return this;
    }

    public Double getMatchRate() {
        return matchRate;
    }

    public AdAudience matchRate(Double matchRate) {
        this.matchRate = matchRate;
        return this;
    }

    public String getSizeUpdatedAt() {
        return sizeUpdatedAt;
    }

    public AdAudience sizeUpdatedAt(String sizeUpdatedAt) {
        this.sizeUpdatedAt = sizeUpdatedAt;
        return this;
    }

    public String getLookalikeSourceId() {
        return lookalikeSourceId;
    }

    public AdAudience lookalikeSourceId(String lookalikeSourceId) {
        this.lookalikeSourceId = lookalikeSourceId;
        return this;
    }

    public AdAudienceLookalikeSpec getLookalikeSpec() {
        return lookalikeSpec;
    }

    public AdAudience lookalikeSpec(AdAudienceLookalikeSpec lookalikeSpec) {
        this.lookalikeSpec = lookalikeSpec;
        return this;
    }

    public Long getConsecutiveFailures() {
        return consecutiveFailures;
    }

    public AdAudience consecutiveFailures(Long consecutiveFailures) {
        this.consecutiveFailures = consecutiveFailures;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public AdAudience lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getLastErrorAt() {
        return lastErrorAt;
    }

    public AdAudience lastErrorAt(String lastErrorAt) {
        this.lastErrorAt = lastErrorAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AdAudience createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AdAudience updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
