// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailBounceStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailBounceStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Zorunlu.
     */
    @JsonProperty("target_rate")
    private Double targetRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("suspend_rate")
    private Double suspendRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("rate_7d")
    private EmailBounceStatsRate7d rate7d;

    /**
     * Zorunlu.
     */
    @JsonProperty("rate_30d")
    private EmailBounceStatsRate30d rate30d;

    /**
     * Zorunlu.
     */
    @JsonProperty("trend")
    private java.util.List<EmailBounceStatsTrendItem> trend;

    /**
     * Zorunlu.
     */
    @JsonProperty("by_type")
    private EmailBounceStatsByType byType;

    /**
     * Zorunlu.
     */
    @JsonProperty("by_reason")
    private java.util.List<EmailBounceStatsByReasonItem> byReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("top_domains")
    private java.util.List<EmailBounceStatsTopDomainsItem> topDomains;

    public Long getDays() {
        return days;
    }

    public EmailBounceStats days(Long days) {
        this.days = days;
        return this;
    }

    public Double getTargetRate() {
        return targetRate;
    }

    public EmailBounceStats targetRate(Double targetRate) {
        this.targetRate = targetRate;
        return this;
    }

    public Double getSuspendRate() {
        return suspendRate;
    }

    public EmailBounceStats suspendRate(Double suspendRate) {
        this.suspendRate = suspendRate;
        return this;
    }

    public EmailBounceStatsRate7d getRate7d() {
        return rate7d;
    }

    public EmailBounceStats rate7d(EmailBounceStatsRate7d rate7d) {
        this.rate7d = rate7d;
        return this;
    }

    public EmailBounceStatsRate30d getRate30d() {
        return rate30d;
    }

    public EmailBounceStats rate30d(EmailBounceStatsRate30d rate30d) {
        this.rate30d = rate30d;
        return this;
    }

    public java.util.List<EmailBounceStatsTrendItem> getTrend() {
        return trend;
    }

    public EmailBounceStats trend(java.util.List<EmailBounceStatsTrendItem> trend) {
        this.trend = trend;
        return this;
    }

    public EmailBounceStatsByType getByType() {
        return byType;
    }

    public EmailBounceStats byType(EmailBounceStatsByType byType) {
        this.byType = byType;
        return this;
    }

    public java.util.List<EmailBounceStatsByReasonItem> getByReason() {
        return byReason;
    }

    public EmailBounceStats byReason(java.util.List<EmailBounceStatsByReasonItem> byReason) {
        this.byReason = byReason;
        return this;
    }

    public java.util.List<EmailBounceStatsTopDomainsItem> getTopDomains() {
        return topDomains;
    }

    public EmailBounceStats topDomains(java.util.List<EmailBounceStatsTopDomainsItem> topDomains) {
        this.topDomains = topDomains;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
