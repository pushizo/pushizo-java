// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RecommendationConfig şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RecommendationConfig {
    /**
     * Zorunlu.
     */
    @JsonProperty("configured")
    private Boolean configured;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("view_events")
    private java.util.List<String> viewEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("purchase_events")
    private java.util.List<String> purchaseEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("item_property")
    private String itemProperty;

    /**
     * Zorunlu.
     */
    @JsonProperty("window_days")
    private Long windowDays;

    /**
     * Zorunlu. Değerler: "idle", "queued", "running", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_computed_at")
    private String lastComputedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("scored_items")
    private Long scoredItems;

    /**
     * Zorunlu.
     */
    @JsonProperty("scored_users")
    private Long scoredUsers;

    public Boolean getConfigured() {
        return configured;
    }

    public RecommendationConfig configured(Boolean configured) {
        this.configured = configured;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public RecommendationConfig enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.List<String> getViewEvents() {
        return viewEvents;
    }

    public RecommendationConfig viewEvents(java.util.List<String> viewEvents) {
        this.viewEvents = viewEvents;
        return this;
    }

    public java.util.List<String> getPurchaseEvents() {
        return purchaseEvents;
    }

    public RecommendationConfig purchaseEvents(java.util.List<String> purchaseEvents) {
        this.purchaseEvents = purchaseEvents;
        return this;
    }

    public String getItemProperty() {
        return itemProperty;
    }

    public RecommendationConfig itemProperty(String itemProperty) {
        this.itemProperty = itemProperty;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public RecommendationConfig windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public RecommendationConfig status(String status) {
        this.status = status;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public RecommendationConfig lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getLastComputedAt() {
        return lastComputedAt;
    }

    public RecommendationConfig lastComputedAt(String lastComputedAt) {
        this.lastComputedAt = lastComputedAt;
        return this;
    }

    public Long getScoredItems() {
        return scoredItems;
    }

    public RecommendationConfig scoredItems(Long scoredItems) {
        this.scoredItems = scoredItems;
        return this;
    }

    public Long getScoredUsers() {
        return scoredUsers;
    }

    public RecommendationConfig scoredUsers(Long scoredUsers) {
        this.scoredUsers = scoredUsers;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
