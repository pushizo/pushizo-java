// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebCampaignReportDailyItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebCampaignReportDailyItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Zorunlu.
     */
    @JsonProperty("impressions")
    private Long impressions;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicks")
    private Long clicks;

    /**
     * Zorunlu.
     */
    @JsonProperty("closes")
    private Long closes;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversions")
    private Long conversions;

    public String getDate() {
        return date;
    }

    public WebCampaignReportDailyItem date(String date) {
        this.date = date;
        return this;
    }

    public Long getImpressions() {
        return impressions;
    }

    public WebCampaignReportDailyItem impressions(Long impressions) {
        this.impressions = impressions;
        return this;
    }

    public Long getClicks() {
        return clicks;
    }

    public WebCampaignReportDailyItem clicks(Long clicks) {
        this.clicks = clicks;
        return this;
    }

    public Long getCloses() {
        return closes;
    }

    public WebCampaignReportDailyItem closes(Long closes) {
        this.closes = closes;
        return this;
    }

    public Long getConversions() {
        return conversions;
    }

    public WebCampaignReportDailyItem conversions(Long conversions) {
        this.conversions = conversions;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
