// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateBudgetAlertRuleDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateBudgetAlertRuleDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("ad_account_id")
    private String adAccountId;

    @JsonProperty("campaign_external_id")
    private String campaignExternalId;

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

    public UpdateBudgetAlertRuleDto name(String name) {
        this.name = name;
        return this;
    }

    public String getAdAccountId() {
        return adAccountId;
    }

    public UpdateBudgetAlertRuleDto adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public String getCampaignExternalId() {
        return campaignExternalId;
    }

    public UpdateBudgetAlertRuleDto campaignExternalId(String campaignExternalId) {
        this.campaignExternalId = campaignExternalId;
        return this;
    }

    public Double getThreshold() {
        return threshold;
    }

    public UpdateBudgetAlertRuleDto threshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public UpdateBudgetAlertRuleDto windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public java.util.List<String> getRecipients() {
        return recipients;
    }

    public UpdateBudgetAlertRuleDto recipients(java.util.List<String> recipients) {
        this.recipients = recipients;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateBudgetAlertRuleDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
