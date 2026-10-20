// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBudgetAlertRuleDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateBudgetAlertRuleDto {
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

    @JsonProperty("ad_account_id")
    private String adAccountId;

    @JsonProperty("campaign_external_id")
    private String campaignExternalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("threshold")
    private Double threshold;

    @JsonProperty("window_days")
    private Long windowDays;

    @JsonProperty("recipients")
    private java.util.List<String> recipients;

    @JsonProperty("enabled")
    private Boolean enabled;

    public String getName() {
        return name;
    }

    public CreateBudgetAlertRuleDto name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public CreateBudgetAlertRuleDto kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getAdAccountId() {
        return adAccountId;
    }

    public CreateBudgetAlertRuleDto adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public String getCampaignExternalId() {
        return campaignExternalId;
    }

    public CreateBudgetAlertRuleDto campaignExternalId(String campaignExternalId) {
        this.campaignExternalId = campaignExternalId;
        return this;
    }

    public Double getThreshold() {
        return threshold;
    }

    public CreateBudgetAlertRuleDto threshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public CreateBudgetAlertRuleDto windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public java.util.List<String> getRecipients() {
        return recipients;
    }

    public CreateBudgetAlertRuleDto recipients(java.util.List<String> recipients) {
        this.recipients = recipients;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateBudgetAlertRuleDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
