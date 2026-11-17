// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchReportTopQueriesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchReportTopQueriesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("query")
    private String query;

    /**
     * Zorunlu.
     */
    @JsonProperty("searches")
    private Long searches;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicks")
    private Long clicks;

    /**
     * Zorunlu.
     */
    @JsonProperty("avg_results")
    private Double avgResults;

    public String getQuery() {
        return query;
    }

    public SiteSearchReportTopQueriesItem query(String query) {
        this.query = query;
        return this;
    }

    public Long getSearches() {
        return searches;
    }

    public SiteSearchReportTopQueriesItem searches(Long searches) {
        this.searches = searches;
        return this;
    }

    public Long getClicks() {
        return clicks;
    }

    public SiteSearchReportTopQueriesItem clicks(Long clicks) {
        this.clicks = clicks;
        return this;
    }

    public Double getAvgResults() {
        return avgResults;
    }

    public SiteSearchReportTopQueriesItem avgResults(Double avgResults) {
        this.avgResults = avgResults;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
