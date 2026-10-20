// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebCampaignReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebCampaignReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("campaign_id")
    private String campaignId;

    /**
     * Zorunlu.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Zorunlu.
     */
    @JsonProperty("daily")
    private java.util.List<WebCampaignReportDailyItem> daily;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private WebCampaignReportTotals totals;

    public String getCampaignId() {
        return campaignId;
    }

    public WebCampaignReport campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public Long getDays() {
        return days;
    }

    public WebCampaignReport days(Long days) {
        this.days = days;
        return this;
    }

    public java.util.List<WebCampaignReportDailyItem> getDaily() {
        return daily;
    }

    public WebCampaignReport daily(java.util.List<WebCampaignReportDailyItem> daily) {
        this.daily = daily;
        return this;
    }

    public WebCampaignReportTotals getTotals() {
        return totals;
    }

    public WebCampaignReport totals(WebCampaignReportTotals totals) {
        this.totals = totals;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
