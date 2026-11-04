// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PredictionModel şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PredictionModel {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("slug")
    private String slug;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "churn", "event".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("event_names")
    private java.util.List<String> eventNames;

    /**
     * Zorunlu.
     */
    @JsonProperty("horizon_days")
    private Long horizonDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "idle", "queued", "running", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu. Değerler: "ready", "insufficient_data", "low_quality".
     */
    @JsonProperty("outcome")
    private String outcome;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_computed_at")
    private String lastComputedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("scored_users")
    private Long scoredUsers;

    /**
     * Zorunlu.
     */
    @JsonProperty("metrics")
    private PredictionModelMetrics metrics;

    /**
     * Zorunlu.
     */
    @JsonProperty("distribution")
    private java.util.List<PredictionModelDistributionItem> distribution;

    public String getId() {
        return id;
    }

    public PredictionModel id(String id) {
        this.id = id;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public PredictionModel slug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getName() {
        return name;
    }

    public PredictionModel name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public PredictionModel kind(String kind) {
        this.kind = kind;
        return this;
    }

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public PredictionModel eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    public Long getHorizonDays() {
        return horizonDays;
    }

    public PredictionModel horizonDays(Long horizonDays) {
        this.horizonDays = horizonDays;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public PredictionModel enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PredictionModel status(String status) {
        this.status = status;
        return this;
    }

    public String getOutcome() {
        return outcome;
    }

    public PredictionModel outcome(String outcome) {
        this.outcome = outcome;
        return this;
    }

    public String getLastComputedAt() {
        return lastComputedAt;
    }

    public PredictionModel lastComputedAt(String lastComputedAt) {
        this.lastComputedAt = lastComputedAt;
        return this;
    }

    public Long getScoredUsers() {
        return scoredUsers;
    }

    public PredictionModel scoredUsers(Long scoredUsers) {
        this.scoredUsers = scoredUsers;
        return this;
    }

    public PredictionModelMetrics getMetrics() {
        return metrics;
    }

    public PredictionModel metrics(PredictionModelMetrics metrics) {
        this.metrics = metrics;
        return this;
    }

    public java.util.List<PredictionModelDistributionItem> getDistribution() {
        return distribution;
    }

    public PredictionModel distribution(java.util.List<PredictionModelDistributionItem> distribution) {
        this.distribution = distribution;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
