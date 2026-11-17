// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSiteSearchSettingsDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateSiteSearchSettingsDto {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("ai_answers")
    private Boolean aiAnswers;

    @JsonProperty("allowed_origins")
    private java.util.List<String> allowedOrigins;

    @JsonProperty("language")
    private String language;

    @JsonProperty("monthly_token_cap")
    private Long monthlyTokenCap;

    @JsonProperty("query_retention_days")
    private Long queryRetentionDays;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateSiteSearchSettingsDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getAiAnswers() {
        return aiAnswers;
    }

    public UpdateSiteSearchSettingsDto aiAnswers(Boolean aiAnswers) {
        this.aiAnswers = aiAnswers;
        return this;
    }

    public java.util.List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    public UpdateSiteSearchSettingsDto allowedOrigins(java.util.List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public UpdateSiteSearchSettingsDto language(String language) {
        this.language = language;
        return this;
    }

    public Long getMonthlyTokenCap() {
        return monthlyTokenCap;
    }

    public UpdateSiteSearchSettingsDto monthlyTokenCap(Long monthlyTokenCap) {
        this.monthlyTokenCap = monthlyTokenCap;
        return this;
    }

    public Long getQueryRetentionDays() {
        return queryRetentionDays;
    }

    public UpdateSiteSearchSettingsDto queryRetentionDays(Long queryRetentionDays) {
        this.queryRetentionDays = queryRetentionDays;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
