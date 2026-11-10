// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebPersonalization şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebPersonalization {
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
     * Zorunlu. Değerler: "draft", "active", "paused", "archived".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("priority")
    private Long priority;

    /**
     * Zorunlu.
     */
    @JsonProperty("changes")
    private java.util.List<Object> changes;

    /**
     * Zorunlu.
     */
    @JsonProperty("variants")
    private java.util.List<WebPersonalizationVariantsItem> variants;

    /**
     * Zorunlu.
     */
    @JsonProperty("ab_test")
    private WebPersonalizationAbTest abTest;

    /**
     * Zorunlu.
     */
    @JsonProperty("conditions")
    private WebPersonalizationConditions conditions;

    /**
     * Zorunlu.
     */
    @JsonProperty("targeting")
    private WebPersonalizationTargeting targeting;

    /**
     * Zorunlu.
     */
    @JsonProperty("goal")
    private Object goal;

    /**
     * Zorunlu.
     */
    @JsonProperty("start_at")
    private String startAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("end_at")
    private String endAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("stats")
    private WebPersonalizationStats stats;

    /**
     * Zorunlu.
     */
    @JsonProperty("variant_stats")
    private java.util.List<WebPersonalizationVariantStatsItem> variantStats;

    /**
     * Zorunlu.
     */
    @JsonProperty("variant_significance")
    private WebPersonalizationVariantSignificance variantSignificance;

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

    public WebPersonalization id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public WebPersonalization appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public WebPersonalization name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WebPersonalization status(String status) {
        this.status = status;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public WebPersonalization priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public java.util.List<Object> getChanges() {
        return changes;
    }

    public WebPersonalization changes(java.util.List<Object> changes) {
        this.changes = changes;
        return this;
    }

    public java.util.List<WebPersonalizationVariantsItem> getVariants() {
        return variants;
    }

    public WebPersonalization variants(java.util.List<WebPersonalizationVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public WebPersonalizationAbTest getAbTest() {
        return abTest;
    }

    public WebPersonalization abTest(WebPersonalizationAbTest abTest) {
        this.abTest = abTest;
        return this;
    }

    public WebPersonalizationConditions getConditions() {
        return conditions;
    }

    public WebPersonalization conditions(WebPersonalizationConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public WebPersonalizationTargeting getTargeting() {
        return targeting;
    }

    public WebPersonalization targeting(WebPersonalizationTargeting targeting) {
        this.targeting = targeting;
        return this;
    }

    public Object getGoal() {
        return goal;
    }

    public WebPersonalization goal(Object goal) {
        this.goal = goal;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public WebPersonalization startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public WebPersonalization endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    public WebPersonalizationStats getStats() {
        return stats;
    }

    public WebPersonalization stats(WebPersonalizationStats stats) {
        this.stats = stats;
        return this;
    }

    public java.util.List<WebPersonalizationVariantStatsItem> getVariantStats() {
        return variantStats;
    }

    public WebPersonalization variantStats(java.util.List<WebPersonalizationVariantStatsItem> variantStats) {
        this.variantStats = variantStats;
        return this;
    }

    public WebPersonalizationVariantSignificance getVariantSignificance() {
        return variantSignificance;
    }

    public WebPersonalization variantSignificance(WebPersonalizationVariantSignificance variantSignificance) {
        this.variantSignificance = variantSignificance;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WebPersonalization createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public WebPersonalization updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
