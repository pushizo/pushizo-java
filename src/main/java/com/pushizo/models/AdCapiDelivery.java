// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdCapiDelivery şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdCapiDelivery {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("config_id")
    private String configId;

    /**
     * Zorunlu. Değerler: "meta", "google", "tiktok".
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_id")
    private String eventId;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_name")
    private String eventName;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform_event")
    private String platformEvent;

    /**
     * Zorunlu.
     */
    @JsonProperty("dedup_id")
    private String dedupId;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private Double value;

    /**
     * Zorunlu.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Zorunlu. Değerler: "pending", "sent", "failed", "skipped".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("skip_reason")
    private String skipReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("attempts")
    private Long attempts;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_attempt_at")
    private String nextAttemptAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("test")
    private Boolean test;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_occurred_at")
    private String eventOccurredAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent_at")
    private String sentAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public AdCapiDelivery id(String id) {
        this.id = id;
        return this;
    }

    public String getConfigId() {
        return configId;
    }

    public AdCapiDelivery configId(String configId) {
        this.configId = configId;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public AdCapiDelivery platform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getEventId() {
        return eventId;
    }

    public AdCapiDelivery eventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public AdCapiDelivery eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getPlatformEvent() {
        return platformEvent;
    }

    public AdCapiDelivery platformEvent(String platformEvent) {
        this.platformEvent = platformEvent;
        return this;
    }

    public String getDedupId() {
        return dedupId;
    }

    public AdCapiDelivery dedupId(String dedupId) {
        this.dedupId = dedupId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public AdCapiDelivery userId(String userId) {
        this.userId = userId;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public AdCapiDelivery value(Double value) {
        this.value = value;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public AdCapiDelivery currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AdCapiDelivery status(String status) {
        this.status = status;
        return this;
    }

    public String getSkipReason() {
        return skipReason;
    }

    public AdCapiDelivery skipReason(String skipReason) {
        this.skipReason = skipReason;
        return this;
    }

    public Long getAttempts() {
        return attempts;
    }

    public AdCapiDelivery attempts(Long attempts) {
        this.attempts = attempts;
        return this;
    }

    public String getNextAttemptAt() {
        return nextAttemptAt;
    }

    public AdCapiDelivery nextAttemptAt(String nextAttemptAt) {
        this.nextAttemptAt = nextAttemptAt;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public AdCapiDelivery lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public Boolean getTest() {
        return test;
    }

    public AdCapiDelivery test(Boolean test) {
        this.test = test;
        return this;
    }

    public String getEventOccurredAt() {
        return eventOccurredAt;
    }

    public AdCapiDelivery eventOccurredAt(String eventOccurredAt) {
        this.eventOccurredAt = eventOccurredAt;
        return this;
    }

    public String getSentAt() {
        return sentAt;
    }

    public AdCapiDelivery sentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AdCapiDelivery createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
