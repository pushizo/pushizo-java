// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchOverviewUsage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchOverviewUsage {
    /**
     * Zorunlu.
     */
    @JsonProperty("tokens_this_month")
    private Long tokensThisMonth;

    /**
     * Zorunlu.
     */
    @JsonProperty("monthly_token_cap")
    private Long monthlyTokenCap;

    /**
     * Zorunlu.
     */
    @JsonProperty("period_start")
    private String periodStart;

    public Long getTokensThisMonth() {
        return tokensThisMonth;
    }

    public SiteSearchOverviewUsage tokensThisMonth(Long tokensThisMonth) {
        this.tokensThisMonth = tokensThisMonth;
        return this;
    }

    public Long getMonthlyTokenCap() {
        return monthlyTokenCap;
    }

    public SiteSearchOverviewUsage monthlyTokenCap(Long monthlyTokenCap) {
        this.monthlyTokenCap = monthlyTokenCap;
        return this;
    }

    public String getPeriodStart() {
        return periodStart;
    }

    public SiteSearchOverviewUsage periodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
