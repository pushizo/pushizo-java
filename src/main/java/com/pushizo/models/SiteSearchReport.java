// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("period_days")
    private Long periodDays;

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
    @JsonProperty("click_through_rate")
    private Double clickThroughRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("answers_requested")
    private Long answersRequested;

    /**
     * Zorunlu.
     */
    @JsonProperty("answered")
    private Long answered;

    /**
     * Zorunlu.
     */
    @JsonProperty("not_found")
    private Long notFound;

    /**
     * Zorunlu.
     */
    @JsonProperty("answer_fallbacks")
    private Long answerFallbacks;

    /**
     * Zorunlu.
     */
    @JsonProperty("tokens")
    private Long tokens;

    /**
     * Zorunlu.
     */
    @JsonProperty("top_queries")
    private java.util.List<SiteSearchReportTopQueriesItem> topQueries;

    /**
     * Zorunlu.
     */
    @JsonProperty("zero_result_queries")
    private java.util.List<SiteSearchReportZeroResultQueriesItem> zeroResultQueries;

    /**
     * Zorunlu.
     */
    @JsonProperty("daily")
    private java.util.List<SiteSearchReportDailyItem> daily;

    public Long getPeriodDays() {
        return periodDays;
    }

    public SiteSearchReport periodDays(Long periodDays) {
        this.periodDays = periodDays;
        return this;
    }

    public Long getSearches() {
        return searches;
    }

    public SiteSearchReport searches(Long searches) {
        this.searches = searches;
        return this;
    }

    public Long getZeroResults() {
        return zeroResults;
    }

    public SiteSearchReport zeroResults(Long zeroResults) {
        this.zeroResults = zeroResults;
        return this;
    }

    public Double getClickThroughRate() {
        return clickThroughRate;
    }

    public SiteSearchReport clickThroughRate(Double clickThroughRate) {
        this.clickThroughRate = clickThroughRate;
        return this;
    }

    public Long getAnswersRequested() {
        return answersRequested;
    }

    public SiteSearchReport answersRequested(Long answersRequested) {
        this.answersRequested = answersRequested;
        return this;
    }

    public Long getAnswered() {
        return answered;
    }

    public SiteSearchReport answered(Long answered) {
        this.answered = answered;
        return this;
    }

    public Long getNotFound() {
        return notFound;
    }

    public SiteSearchReport notFound(Long notFound) {
        this.notFound = notFound;
        return this;
    }

    public Long getAnswerFallbacks() {
        return answerFallbacks;
    }

    public SiteSearchReport answerFallbacks(Long answerFallbacks) {
        this.answerFallbacks = answerFallbacks;
        return this;
    }

    public Long getTokens() {
        return tokens;
    }

    public SiteSearchReport tokens(Long tokens) {
        this.tokens = tokens;
        return this;
    }

    public java.util.List<SiteSearchReportTopQueriesItem> getTopQueries() {
        return topQueries;
    }

    public SiteSearchReport topQueries(java.util.List<SiteSearchReportTopQueriesItem> topQueries) {
        this.topQueries = topQueries;
        return this;
    }

    public java.util.List<SiteSearchReportZeroResultQueriesItem> getZeroResultQueries() {
        return zeroResultQueries;
    }

    public SiteSearchReport zeroResultQueries(java.util.List<SiteSearchReportZeroResultQueriesItem> zeroResultQueries) {
        this.zeroResultQueries = zeroResultQueries;
        return this;
    }

    public java.util.List<SiteSearchReportDailyItem> getDaily() {
        return daily;
    }

    public SiteSearchReport daily(java.util.List<SiteSearchReportDailyItem> daily) {
        this.daily = daily;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
