// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebPersonalizationReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebPersonalizationReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("personalization_id")
    private String personalizationId;

    /**
     * Zorunlu.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Zorunlu.
     */
    @JsonProperty("daily")
    private java.util.List<WebPersonalizationReportDailyItem> daily;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private WebPersonalizationReportTotals totals;

    public String getPersonalizationId() {
        return personalizationId;
    }

    public WebPersonalizationReport personalizationId(String personalizationId) {
        this.personalizationId = personalizationId;
        return this;
    }

    public Long getDays() {
        return days;
    }

    public WebPersonalizationReport days(Long days) {
        this.days = days;
        return this;
    }

    public java.util.List<WebPersonalizationReportDailyItem> getDaily() {
        return daily;
    }

    public WebPersonalizationReport daily(java.util.List<WebPersonalizationReportDailyItem> daily) {
        this.daily = daily;
        return this;
    }

    public WebPersonalizationReportTotals getTotals() {
        return totals;
    }

    public WebPersonalizationReport totals(WebPersonalizationReportTotals totals) {
        this.totals = totals;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
