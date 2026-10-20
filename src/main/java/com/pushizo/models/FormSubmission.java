// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FormSubmission şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FormSubmission {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("form_id")
    private String formId;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("subscription_ids")
    private java.util.List<String> subscriptionIds;

    /**
     * Zorunlu. Değerler: "web_campaign", "landing_page", "sdk", "api".
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("source_id")
    private String sourceId;

    /**
     * Zorunlu. Değerler: "accepted", "pending_confirmation", "confirmed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.Map<String, Object> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("consent")
    private java.util.List<FormSubmissionConsentItem> consent;

    /**
     * Zorunlu.
     */
    @JsonProperty("page_url")
    private String pageUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    /**
     * Zorunlu.
     */
    @JsonProperty("confirmed_at")
    private String confirmedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public FormSubmission id(String id) {
        this.id = id;
        return this;
    }

    public String getFormId() {
        return formId;
    }

    public FormSubmission formId(String formId) {
        this.formId = formId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public FormSubmission userId(String userId) {
        this.userId = userId;
        return this;
    }

    public java.util.List<String> getSubscriptionIds() {
        return subscriptionIds;
    }

    public FormSubmission subscriptionIds(java.util.List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }

    public String getSource() {
        return source;
    }

    public FormSubmission source(String source) {
        this.source = source;
        return this;
    }

    public String getSourceId() {
        return sourceId;
    }

    public FormSubmission sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public FormSubmission status(String status) {
        this.status = status;
        return this;
    }

    public java.util.Map<String, Object> getData() {
        return data;
    }

    public FormSubmission data(java.util.Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public java.util.List<FormSubmissionConsentItem> getConsent() {
        return consent;
    }

    public FormSubmission consent(java.util.List<FormSubmissionConsentItem> consent) {
        this.consent = consent;
        return this;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public FormSubmission pageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public FormSubmission language(String language) {
        this.language = language;
        return this;
    }

    public String getConfirmedAt() {
        return confirmedAt;
    }

    public FormSubmission confirmedAt(String confirmedAt) {
        this.confirmedAt = confirmedAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public FormSubmission createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
