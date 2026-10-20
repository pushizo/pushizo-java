// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Survey şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Survey {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "draft", "active", "closed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("questions")
    private java.util.List<SurveyQuestionsItem> questions;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private SurveySettings settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("in_app_message_id")
    private String inAppMessageId;

    /**
     * Zorunlu.
     */
    @JsonProperty("stats")
    private SurveyStats stats;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public Survey id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Survey appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Survey name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Survey status(String status) {
        this.status = status;
        return this;
    }

    public java.util.List<SurveyQuestionsItem> getQuestions() {
        return questions;
    }

    public Survey questions(java.util.List<SurveyQuestionsItem> questions) {
        this.questions = questions;
        return this;
    }

    public SurveySettings getSettings() {
        return settings;
    }

    public Survey settings(SurveySettings settings) {
        this.settings = settings;
        return this;
    }

    public String getInAppMessageId() {
        return inAppMessageId;
    }

    public Survey inAppMessageId(String inAppMessageId) {
        this.inAppMessageId = inAppMessageId;
        return this;
    }

    public SurveyStats getStats() {
        return stats;
    }

    public Survey stats(SurveyStats stats) {
        this.stats = stats;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Survey createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Survey updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
