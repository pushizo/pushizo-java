// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebCampaign şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebCampaign {
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
    @JsonProperty("display")
    private WebCampaignDisplay display;

    /**
     * Zorunlu.
     */
    @JsonProperty("variants")
    private java.util.List<WebCampaignVariantsItem> variants;

    /**
     * Zorunlu.
     */
    @JsonProperty("ab_test")
    private WebCampaignAbTest abTest;

    /**
     * Zorunlu.
     */
    @JsonProperty("trigger")
    private Object trigger;

    /**
     * Zorunlu.
     */
    @JsonProperty("conditions")
    private WebCampaignConditions conditions;

    /**
     * Zorunlu.
     */
    @JsonProperty("targeting")
    private WebCampaignTargeting targeting;

    /**
     * Zorunlu.
     */
    @JsonProperty("frequency")
    private WebCampaignFrequency frequency;

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
    private WebCampaignStats stats;

    /**
     * Zorunlu.
     */
    @JsonProperty("variant_stats")
    private java.util.List<WebCampaignVariantStatsItem> variantStats;

    /**
     * Zorunlu.
     */
    @JsonProperty("variant_significance")
    private WebCampaignVariantSignificance variantSignificance;

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

    public WebCampaign id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public WebCampaign appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public WebCampaign name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WebCampaign status(String status) {
        this.status = status;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public WebCampaign priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public WebCampaignDisplay getDisplay() {
        return display;
    }

    public WebCampaign display(WebCampaignDisplay display) {
        this.display = display;
        return this;
    }

    public java.util.List<WebCampaignVariantsItem> getVariants() {
        return variants;
    }

    public WebCampaign variants(java.util.List<WebCampaignVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public WebCampaignAbTest getAbTest() {
        return abTest;
    }

    public WebCampaign abTest(WebCampaignAbTest abTest) {
        this.abTest = abTest;
        return this;
    }

    public Object getTrigger() {
        return trigger;
    }

    public WebCampaign trigger(Object trigger) {
        this.trigger = trigger;
        return this;
    }

    public WebCampaignConditions getConditions() {
        return conditions;
    }

    public WebCampaign conditions(WebCampaignConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public WebCampaignTargeting getTargeting() {
        return targeting;
    }

    public WebCampaign targeting(WebCampaignTargeting targeting) {
        this.targeting = targeting;
        return this;
    }

    public WebCampaignFrequency getFrequency() {
        return frequency;
    }

    public WebCampaign frequency(WebCampaignFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public WebCampaign startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public WebCampaign endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    public WebCampaignStats getStats() {
        return stats;
    }

    public WebCampaign stats(WebCampaignStats stats) {
        this.stats = stats;
        return this;
    }

    public java.util.List<WebCampaignVariantStatsItem> getVariantStats() {
        return variantStats;
    }

    public WebCampaign variantStats(java.util.List<WebCampaignVariantStatsItem> variantStats) {
        this.variantStats = variantStats;
        return this;
    }

    public WebCampaignVariantSignificance getVariantSignificance() {
        return variantSignificance;
    }

    public WebCampaign variantSignificance(WebCampaignVariantSignificance variantSignificance) {
        this.variantSignificance = variantSignificance;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WebCampaign createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public WebCampaign updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
