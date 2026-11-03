// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InAppMessage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InAppMessage {
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
    @JsonProperty("triggers")
    private java.util.List<Object> triggers;

    /**
     * Zorunlu.
     */
    @JsonProperty("trigger_groups")
    private java.util.List<java.util.List<Object>> triggerGroups;

    /**
     * Zorunlu.
     */
    @JsonProperty("variants")
    private java.util.List<InAppMessageVariantsItem> variants;

    /**
     * Zorunlu.
     */
    @JsonProperty("display")
    private InAppMessageDisplay display;

    /**
     * Zorunlu.
     */
    @JsonProperty("audience")
    private InAppMessageAudience audience;

    /**
     * Zorunlu.
     */
    @JsonProperty("frequency")
    private InAppMessageFrequency frequency;

    /**
     * Zorunlu.
     */
    @JsonProperty("journey_only")
    private Boolean journeyOnly;

    /**
     * Zorunlu.
     */
    @JsonProperty("placement")
    private String placement;

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
    private InAppMessageStats stats;

    /**
     * Zorunlu.
     */
    @JsonProperty("variant_stats")
    private java.util.List<InAppMessageVariantStatsItem> variantStats;

    /**
     * Zorunlu.
     */
    @JsonProperty("ab_test")
    private InAppMessageAbTest abTest;

    /**
     * Zorunlu.
     */
    @JsonProperty("variant_significance")
    private InAppMessageVariantSignificance variantSignificance;

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

    public InAppMessage id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public InAppMessage appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public InAppMessage name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public InAppMessage status(String status) {
        this.status = status;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public InAppMessage priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public java.util.List<Object> getTriggers() {
        return triggers;
    }

    public InAppMessage triggers(java.util.List<Object> triggers) {
        this.triggers = triggers;
        return this;
    }

    public java.util.List<java.util.List<Object>> getTriggerGroups() {
        return triggerGroups;
    }

    public InAppMessage triggerGroups(java.util.List<java.util.List<Object>> triggerGroups) {
        this.triggerGroups = triggerGroups;
        return this;
    }

    public java.util.List<InAppMessageVariantsItem> getVariants() {
        return variants;
    }

    public InAppMessage variants(java.util.List<InAppMessageVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public InAppMessageDisplay getDisplay() {
        return display;
    }

    public InAppMessage display(InAppMessageDisplay display) {
        this.display = display;
        return this;
    }

    public InAppMessageAudience getAudience() {
        return audience;
    }

    public InAppMessage audience(InAppMessageAudience audience) {
        this.audience = audience;
        return this;
    }

    public InAppMessageFrequency getFrequency() {
        return frequency;
    }

    public InAppMessage frequency(InAppMessageFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Boolean getJourneyOnly() {
        return journeyOnly;
    }

    public InAppMessage journeyOnly(Boolean journeyOnly) {
        this.journeyOnly = journeyOnly;
        return this;
    }

    public String getPlacement() {
        return placement;
    }

    public InAppMessage placement(String placement) {
        this.placement = placement;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public InAppMessage startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public InAppMessage endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    public InAppMessageStats getStats() {
        return stats;
    }

    public InAppMessage stats(InAppMessageStats stats) {
        this.stats = stats;
        return this;
    }

    public java.util.List<InAppMessageVariantStatsItem> getVariantStats() {
        return variantStats;
    }

    public InAppMessage variantStats(java.util.List<InAppMessageVariantStatsItem> variantStats) {
        this.variantStats = variantStats;
        return this;
    }

    public InAppMessageAbTest getAbTest() {
        return abTest;
    }

    public InAppMessage abTest(InAppMessageAbTest abTest) {
        this.abTest = abTest;
        return this;
    }

    public InAppMessageVariantSignificance getVariantSignificance() {
        return variantSignificance;
    }

    public InAppMessage variantSignificance(InAppMessageVariantSignificance variantSignificance) {
        this.variantSignificance = variantSignificance;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public InAppMessage createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public InAppMessage updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
