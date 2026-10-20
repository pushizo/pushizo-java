// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdBudgetAlertListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdBudgetAlertListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("rule_id")
    private String ruleId;

    /**
     * Zorunlu.
     */
    @JsonProperty("rule_name")
    private String ruleName;

    /**
     * Zorunlu. Değerler: "daily_spend", "roas_drop", "budget_depletion".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("day")
    private String day;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private Double value;

    /**
     * Zorunlu.
     */
    @JsonProperty("threshold")
    private Double threshold;

    /**
     * Zorunlu.
     */
    @JsonProperty("details")
    private java.util.Map<String, Object> details;

    /**
     * Zorunlu.
     */
    @JsonProperty("emailed")
    private Long emailed;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public AdBudgetAlertListDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getRuleId() {
        return ruleId;
    }

    public AdBudgetAlertListDataItem ruleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    public String getRuleName() {
        return ruleName;
    }

    public AdBudgetAlertListDataItem ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public AdBudgetAlertListDataItem kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getDay() {
        return day;
    }

    public AdBudgetAlertListDataItem day(String day) {
        this.day = day;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public AdBudgetAlertListDataItem value(Double value) {
        this.value = value;
        return this;
    }

    public Double getThreshold() {
        return threshold;
    }

    public AdBudgetAlertListDataItem threshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    public java.util.Map<String, Object> getDetails() {
        return details;
    }

    public AdBudgetAlertListDataItem details(java.util.Map<String, Object> details) {
        this.details = details;
        return this;
    }

    public Long getEmailed() {
        return emailed;
    }

    public AdBudgetAlertListDataItem emailed(Long emailed) {
        this.emailed = emailed;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AdBudgetAlertListDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
