// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdCapiConfig şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdCapiConfig {
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
     * Zorunlu. Değerler: "meta", "google", "tiktok".
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("ad_account_id")
    private String adAccountId;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private AdCapiConfigSettings settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_mappings")
    private java.util.List<AdCapiConfigEventMappingsItem> eventMappings;

    /**
     * Zorunlu.
     */
    @JsonProperty("test_event_code")
    private String testEventCode;

    /**
     * Zorunlu.
     */
    @JsonProperty("test_mode")
    private Boolean testMode;

    /**
     * Zorunlu. Değerler: "website", "app".
     */
    @JsonProperty("action_source")
    private String actionSource;

    /**
     * Zorunlu.
     */
    @JsonProperty("default_currency")
    private String defaultCurrency;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_access_token")
    private Boolean hasAccessToken;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_sent_at")
    private String lastSentAt;

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
    @JsonProperty("stats")
    private AdCapiConfigStats stats;

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

    public AdCapiConfig id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public AdCapiConfig appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public AdCapiConfig platform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getName() {
        return name;
    }

    public AdCapiConfig name(String name) {
        this.name = name;
        return this;
    }

    public String getAdAccountId() {
        return adAccountId;
    }

    public AdCapiConfig adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AdCapiConfig enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AdCapiConfigSettings getSettings() {
        return settings;
    }

    public AdCapiConfig settings(AdCapiConfigSettings settings) {
        this.settings = settings;
        return this;
    }

    public java.util.List<AdCapiConfigEventMappingsItem> getEventMappings() {
        return eventMappings;
    }

    public AdCapiConfig eventMappings(java.util.List<AdCapiConfigEventMappingsItem> eventMappings) {
        this.eventMappings = eventMappings;
        return this;
    }

    public String getTestEventCode() {
        return testEventCode;
    }

    public AdCapiConfig testEventCode(String testEventCode) {
        this.testEventCode = testEventCode;
        return this;
    }

    public Boolean getTestMode() {
        return testMode;
    }

    public AdCapiConfig testMode(Boolean testMode) {
        this.testMode = testMode;
        return this;
    }

    public String getActionSource() {
        return actionSource;
    }

    public AdCapiConfig actionSource(String actionSource) {
        this.actionSource = actionSource;
        return this;
    }

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public AdCapiConfig defaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    public Boolean getHasAccessToken() {
        return hasAccessToken;
    }

    public AdCapiConfig hasAccessToken(Boolean hasAccessToken) {
        this.hasAccessToken = hasAccessToken;
        return this;
    }

    public String getLastSentAt() {
        return lastSentAt;
    }

    public AdCapiConfig lastSentAt(String lastSentAt) {
        this.lastSentAt = lastSentAt;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public AdCapiConfig lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getLastErrorAt() {
        return lastErrorAt;
    }

    public AdCapiConfig lastErrorAt(String lastErrorAt) {
        this.lastErrorAt = lastErrorAt;
        return this;
    }

    public AdCapiConfigStats getStats() {
        return stats;
    }

    public AdCapiConfig stats(AdCapiConfigStats stats) {
        this.stats = stats;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AdCapiConfig createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AdCapiConfig updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
