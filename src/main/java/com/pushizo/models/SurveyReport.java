// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("survey_id")
    private String surveyId;

    /**
     * Zorunlu.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Zorunlu.
     */
    @JsonProperty("responses")
    private Long responses;

    /**
     * Zorunlu.
     */
    @JsonProperty("nps")
    private SurveyReportNps nps;

    /**
     * Zorunlu.
     */
    @JsonProperty("csat")
    private SurveyReportCsat csat;

    /**
     * Zorunlu.
     */
    @JsonProperty("trend")
    private java.util.List<SurveyReportTrendItem> trend;

    /**
     * Zorunlu.
     */
    @JsonProperty("channels")
    private java.util.Map<String, Long> channels;

    /**
     * Zorunlu.
     */
    @JsonProperty("questions")
    private java.util.List<SurveyReportQuestionsItem> questions;

    public String getSurveyId() {
        return surveyId;
    }

    public SurveyReport surveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }

    public Long getDays() {
        return days;
    }

    public SurveyReport days(Long days) {
        this.days = days;
        return this;
    }

    public Long getResponses() {
        return responses;
    }

    public SurveyReport responses(Long responses) {
        this.responses = responses;
        return this;
    }

    public SurveyReportNps getNps() {
        return nps;
    }

    public SurveyReport nps(SurveyReportNps nps) {
        this.nps = nps;
        return this;
    }

    public SurveyReportCsat getCsat() {
        return csat;
    }

    public SurveyReport csat(SurveyReportCsat csat) {
        this.csat = csat;
        return this;
    }

    public java.util.List<SurveyReportTrendItem> getTrend() {
        return trend;
    }

    public SurveyReport trend(java.util.List<SurveyReportTrendItem> trend) {
        this.trend = trend;
        return this;
    }

    public java.util.Map<String, Long> getChannels() {
        return channels;
    }

    public SurveyReport channels(java.util.Map<String, Long> channels) {
        this.channels = channels;
        return this;
    }

    public java.util.List<SurveyReportQuestionsItem> getQuestions() {
        return questions;
    }

    public SurveyReport questions(java.util.List<SurveyReportQuestionsItem> questions) {
        this.questions = questions;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
