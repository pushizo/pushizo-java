// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsageReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UsageReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("org_id")
    private String orgId;

    /**
     * Zorunlu.
     */
    @JsonProperty("plan_code")
    private String planCode;

    /**
     * Zorunlu.
     */
    @JsonProperty("period")
    private UsageReportPeriod period;

    /**
     * Zorunlu.
     */
    @JsonProperty("metrics")
    private java.util.List<UsageReportMetricsItem> metrics;

    /**
     * Zorunlu.
     */
    @JsonProperty("apps")
    private java.util.List<UsageReportAppsItem> apps;

    /**
     * Zorunlu.
     */
    @JsonProperty("daily")
    private java.util.List<UsageReportDailyItem> daily;

    /**
     * Zorunlu.
     */
    @JsonProperty("trialing")
    private Boolean trialing;

    /**
     * Zorunlu.
     */
    @JsonProperty("trial_ends_at")
    private String trialEndsAt;

    public String getOrgId() {
        return orgId;
    }

    public UsageReport orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    public String getPlanCode() {
        return planCode;
    }

    public UsageReport planCode(String planCode) {
        this.planCode = planCode;
        return this;
    }

    public UsageReportPeriod getPeriod() {
        return period;
    }

    public UsageReport period(UsageReportPeriod period) {
        this.period = period;
        return this;
    }

    public java.util.List<UsageReportMetricsItem> getMetrics() {
        return metrics;
    }

    public UsageReport metrics(java.util.List<UsageReportMetricsItem> metrics) {
        this.metrics = metrics;
        return this;
    }

    public java.util.List<UsageReportAppsItem> getApps() {
        return apps;
    }

    public UsageReport apps(java.util.List<UsageReportAppsItem> apps) {
        this.apps = apps;
        return this;
    }

    public java.util.List<UsageReportDailyItem> getDaily() {
        return daily;
    }

    public UsageReport daily(java.util.List<UsageReportDailyItem> daily) {
        this.daily = daily;
        return this;
    }

    public Boolean getTrialing() {
        return trialing;
    }

    public UsageReport trialing(Boolean trialing) {
        this.trialing = trialing;
        return this;
    }

    public String getTrialEndsAt() {
        return trialEndsAt;
    }

    public UsageReport trialEndsAt(String trialEndsAt) {
        this.trialEndsAt = trialEndsAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
