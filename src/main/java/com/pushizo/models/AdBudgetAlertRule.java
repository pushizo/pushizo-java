// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdBudgetAlertRule şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdBudgetAlertRule {
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
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "daily_spend", "roas_drop", "budget_depletion".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("ad_account_id")
    private String adAccountId;

    /**
     * Zorunlu.
     */
    @JsonProperty("campaign_external_id")
    private String campaignExternalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("threshold")
    private Double threshold;

    /**
     * Zorunlu.
     */
    @JsonProperty("window_days")
    private Long windowDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("recipients")
    private java.util.List<String> recipients;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_value")
    private Double lastValue;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_evaluated_at")
    private String lastEvaluatedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_triggered_on")
    private String lastTriggeredOn;

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

    public AdBudgetAlertRule id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public AdBudgetAlertRule appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public AdBudgetAlertRule name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public AdBudgetAlertRule kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getAdAccountId() {
        return adAccountId;
    }

    public AdBudgetAlertRule adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public String getCampaignExternalId() {
        return campaignExternalId;
    }

    public AdBudgetAlertRule campaignExternalId(String campaignExternalId) {
        this.campaignExternalId = campaignExternalId;
        return this;
    }

    public Double getThreshold() {
        return threshold;
    }

    public AdBudgetAlertRule threshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public AdBudgetAlertRule windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public java.util.List<String> getRecipients() {
        return recipients;
    }

    public AdBudgetAlertRule recipients(java.util.List<String> recipients) {
        this.recipients = recipients;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AdBudgetAlertRule enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Double getLastValue() {
        return lastValue;
    }

    public AdBudgetAlertRule lastValue(Double lastValue) {
        this.lastValue = lastValue;
        return this;
    }

    public String getLastEvaluatedAt() {
        return lastEvaluatedAt;
    }

    public AdBudgetAlertRule lastEvaluatedAt(String lastEvaluatedAt) {
        this.lastEvaluatedAt = lastEvaluatedAt;
        return this;
    }

    public String getLastTriggeredOn() {
        return lastTriggeredOn;
    }

    public AdBudgetAlertRule lastTriggeredOn(String lastTriggeredOn) {
        this.lastTriggeredOn = lastTriggeredOn;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AdBudgetAlertRule createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AdBudgetAlertRule updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
