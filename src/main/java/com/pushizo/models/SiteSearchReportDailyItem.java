// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchReportDailyItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchReportDailyItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Zorunlu.
     */
    @JsonProperty("searches")
    private Long searches;

    /**
     * Zorunlu.
     */
    @JsonProperty("zero_results")
    private Long zeroResults;

    /**
     * Zorunlu.
     */
    @JsonProperty("answered")
    private Long answered;

    public String getDate() {
        return date;
    }

    public SiteSearchReportDailyItem date(String date) {
        this.date = date;
        return this;
    }

    public Long getSearches() {
        return searches;
    }

    public SiteSearchReportDailyItem searches(Long searches) {
        this.searches = searches;
        return this;
    }

    public Long getZeroResults() {
        return zeroResults;
    }

    public SiteSearchReportDailyItem zeroResults(Long zeroResults) {
        this.zeroResults = zeroResults;
        return this;
    }

    public Long getAnswered() {
        return answered;
    }

    public SiteSearchReportDailyItem answered(Long answered) {
        this.answered = answered;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
