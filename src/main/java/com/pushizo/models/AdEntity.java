// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdEntity şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdEntity {
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
     * Zorunlu. Değerler: "meta", "google", "tiktok".
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * Zorunlu. Değerler: "campaign", "ad_set", "ad".
     */
    @JsonProperty("level")
    private String level;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("campaign_external_id")
    private String campaignExternalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("ad_set_external_id")
    private String adSetExternalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "active", "paused", "pending", "rejected", "archived", "deleted", "unknown".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform_status")
    private String platformStatus;

    /**
     * Zorunlu.
     */
    @JsonProperty("objective")
    private String objective;

    /**
     * Zorunlu.
     */
    @JsonProperty("optimization_goal")
    private String optimizationGoal;

    /**
     * Zorunlu.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Zorunlu.
     */
    @JsonProperty("daily_budget")
    private String dailyBudget;

    /**
     * Zorunlu.
     */
    @JsonProperty("lifetime_budget")
    private String lifetimeBudget;

    /**
     * Zorunlu.
     */
    @JsonProperty("start_at")
    private String startAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("end_at")
    private String endAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("audience_external_ids")
    private java.util.List<String> audienceExternalIds;

    /**
     * Zorunlu.
     */
    @JsonProperty("creative")
    private AdEntityCreative creative;

    /**
     * Zorunlu.
     */
    @JsonProperty("budget_editable")
    private Boolean budgetEditable;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_by_pushizo")
    private Boolean createdByPushizo;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_seen_at")
    private String lastSeenAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform_url")
    private String platformUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("metrics")
    private AdEntityMetrics metrics;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public AdEntity id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public AdEntity appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getAdAccountId() {
        return adAccountId;
    }

    public AdEntity adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public AdEntity platform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public AdEntity level(String level) {
        this.level = level;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public AdEntity externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getCampaignExternalId() {
        return campaignExternalId;
    }

    public AdEntity campaignExternalId(String campaignExternalId) {
        this.campaignExternalId = campaignExternalId;
        return this;
    }

    public String getAdSetExternalId() {
        return adSetExternalId;
    }

    public AdEntity adSetExternalId(String adSetExternalId) {
        this.adSetExternalId = adSetExternalId;
        return this;
    }

    public String getName() {
        return name;
    }

    public AdEntity name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AdEntity status(String status) {
        this.status = status;
        return this;
    }

    public String getPlatformStatus() {
        return platformStatus;
    }

    public AdEntity platformStatus(String platformStatus) {
        this.platformStatus = platformStatus;
        return this;
    }

    public String getObjective() {
        return objective;
    }

    public AdEntity objective(String objective) {
        this.objective = objective;
        return this;
    }

    public String getOptimizationGoal() {
        return optimizationGoal;
    }

    public AdEntity optimizationGoal(String optimizationGoal) {
        this.optimizationGoal = optimizationGoal;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public AdEntity currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getDailyBudget() {
        return dailyBudget;
    }

    public AdEntity dailyBudget(String dailyBudget) {
        this.dailyBudget = dailyBudget;
        return this;
    }

    public String getLifetimeBudget() {
        return lifetimeBudget;
    }

    public AdEntity lifetimeBudget(String lifetimeBudget) {
        this.lifetimeBudget = lifetimeBudget;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public AdEntity startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public AdEntity endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    public java.util.List<String> getAudienceExternalIds() {
        return audienceExternalIds;
    }

    public AdEntity audienceExternalIds(java.util.List<String> audienceExternalIds) {
        this.audienceExternalIds = audienceExternalIds;
        return this;
    }

    public AdEntityCreative getCreative() {
        return creative;
    }

    public AdEntity creative(AdEntityCreative creative) {
        this.creative = creative;
        return this;
    }

    public Boolean getBudgetEditable() {
        return budgetEditable;
    }

    public AdEntity budgetEditable(Boolean budgetEditable) {
        this.budgetEditable = budgetEditable;
        return this;
    }

    public Boolean getCreatedByPushizo() {
        return createdByPushizo;
    }

    public AdEntity createdByPushizo(Boolean createdByPushizo) {
        this.createdByPushizo = createdByPushizo;
        return this;
    }

    public String getLastSeenAt() {
        return lastSeenAt;
    }

    public AdEntity lastSeenAt(String lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
        return this;
    }

    public String getPlatformUrl() {
        return platformUrl;
    }

    public AdEntity platformUrl(String platformUrl) {
        this.platformUrl = platformUrl;
        return this;
    }

    public AdEntityMetrics getMetrics() {
        return metrics;
    }

    public AdEntity metrics(AdEntityMetrics metrics) {
        this.metrics = metrics;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AdEntity updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
