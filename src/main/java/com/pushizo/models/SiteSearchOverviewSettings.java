// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchOverviewSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchOverviewSettings {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("ai_answers")
    private Boolean aiAnswers;

    /**
     * Zorunlu.
     */
    @JsonProperty("allowed_origins")
    private java.util.List<String> allowedOrigins;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    /**
     * Zorunlu.
     */
    @JsonProperty("text_search_config")
    private String textSearchConfig;

    /**
     * Zorunlu.
     */
    @JsonProperty("monthly_token_cap")
    private Long monthlyTokenCap;

    /**
     * Zorunlu.
     */
    @JsonProperty("query_retention_days")
    private Long queryRetentionDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public Boolean getEnabled() {
        return enabled;
    }

    public SiteSearchOverviewSettings enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getAiAnswers() {
        return aiAnswers;
    }

    public SiteSearchOverviewSettings aiAnswers(Boolean aiAnswers) {
        this.aiAnswers = aiAnswers;
        return this;
    }

    public java.util.List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    public SiteSearchOverviewSettings allowedOrigins(java.util.List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public SiteSearchOverviewSettings language(String language) {
        this.language = language;
        return this;
    }

    public String getTextSearchConfig() {
        return textSearchConfig;
    }

    public SiteSearchOverviewSettings textSearchConfig(String textSearchConfig) {
        this.textSearchConfig = textSearchConfig;
        return this;
    }

    public Long getMonthlyTokenCap() {
        return monthlyTokenCap;
    }

    public SiteSearchOverviewSettings monthlyTokenCap(Long monthlyTokenCap) {
        this.monthlyTokenCap = monthlyTokenCap;
        return this;
    }

    public Long getQueryRetentionDays() {
        return queryRetentionDays;
    }

    public SiteSearchOverviewSettings queryRetentionDays(Long queryRetentionDays) {
        this.queryRetentionDays = queryRetentionDays;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public SiteSearchOverviewSettings updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
