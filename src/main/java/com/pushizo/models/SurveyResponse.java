// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SurveyResponse şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SurveyResponse {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("survey_id")
    private String surveyId;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("visitor_id")
    private String visitorId;

    /**
     * Zorunlu. Değerler: "in_app", "web", "email", "api", "sdk".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("answers")
    private java.util.Map<String, Object> answers;

    /**
     * Zorunlu.
     */
    @JsonProperty("nps_score")
    private Long npsScore;

    /**
     * Zorunlu. Değerler: "promoter", "passive", "detractor".
     */
    @JsonProperty("nps_category")
    private String npsCategory;

    /**
     * Zorunlu.
     */
    @JsonProperty("csat_score")
    private Long csatScore;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public SurveyResponse id(String id) {
        this.id = id;
        return this;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public SurveyResponse surveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public SurveyResponse userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public SurveyResponse visitorId(String visitorId) {
        this.visitorId = visitorId;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public SurveyResponse channel(String channel) {
        this.channel = channel;
        return this;
    }

    public java.util.Map<String, Object> getAnswers() {
        return answers;
    }

    public SurveyResponse answers(java.util.Map<String, Object> answers) {
        this.answers = answers;
        return this;
    }

    public Long getNpsScore() {
        return npsScore;
    }

    public SurveyResponse npsScore(Long npsScore) {
        this.npsScore = npsScore;
        return this;
    }

    public String getNpsCategory() {
        return npsCategory;
    }

    public SurveyResponse npsCategory(String npsCategory) {
        this.npsCategory = npsCategory;
        return this;
    }

    public Long getCsatScore() {
        return csatScore;
    }

    public SurveyResponse csatScore(Long csatScore) {
        this.csatScore = csatScore;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public SurveyResponse createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
