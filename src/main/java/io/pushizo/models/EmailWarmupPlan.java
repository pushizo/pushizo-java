// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailWarmupPlan şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailWarmupPlan {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "domain", "ip".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("target")
    private String target;

    /**
     * Zorunlu.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Zorunlu.
     */
    @JsonProperty("daily_limits")
    private java.util.List<Long> dailyLimits;

    /**
     * Zorunlu.
     */
    @JsonProperty("provider_shares")
    private java.util.Map<String, Double> providerShares;

    /**
     * Zorunlu.
     */
    @JsonProperty("timezone")
    private String timezone;

    /**
     * Zorunlu. Değerler: "active", "paused", "completed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("today")
    private EmailWarmupPlanToday today;

    /**
     * Zorunlu.
     */
    @JsonProperty("scheduled_ahead")
    private Long scheduledAhead;

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

    public EmailWarmupPlan id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmailWarmupPlan name(String name) {
        this.name = name;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public EmailWarmupPlan kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public EmailWarmupPlan target(String target) {
        this.target = target;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public EmailWarmupPlan startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public java.util.List<Long> getDailyLimits() {
        return dailyLimits;
    }

    public EmailWarmupPlan dailyLimits(java.util.List<Long> dailyLimits) {
        this.dailyLimits = dailyLimits;
        return this;
    }

    public java.util.Map<String, Double> getProviderShares() {
        return providerShares;
    }

    public EmailWarmupPlan providerShares(java.util.Map<String, Double> providerShares) {
        this.providerShares = providerShares;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public EmailWarmupPlan timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public EmailWarmupPlan status(String status) {
        this.status = status;
        return this;
    }

    public EmailWarmupPlanToday getToday() {
        return today;
    }

    public EmailWarmupPlan today(EmailWarmupPlanToday today) {
        this.today = today;
        return this;
    }

    public Long getScheduledAhead() {
        return scheduledAhead;
    }

    public EmailWarmupPlan scheduledAhead(Long scheduledAhead) {
        this.scheduledAhead = scheduledAhead;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public EmailWarmupPlan createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public EmailWarmupPlan updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
