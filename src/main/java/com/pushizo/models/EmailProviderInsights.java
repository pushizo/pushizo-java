// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailProviderInsights şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailProviderInsights {
    /**
     * Zorunlu.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Zorunlu.
     */
    @JsonProperty("providers")
    private java.util.List<EmailProviderInsightsProvidersItem> providers;

    /**
     * Zorunlu.
     */
    @JsonProperty("trend")
    private java.util.List<EmailProviderInsightsTrendItem> trend;

    public Long getDays() {
        return days;
    }

    public EmailProviderInsights days(Long days) {
        this.days = days;
        return this;
    }

    public java.util.List<EmailProviderInsightsProvidersItem> getProviders() {
        return providers;
    }

    public EmailProviderInsights providers(java.util.List<EmailProviderInsightsProvidersItem> providers) {
        this.providers = providers;
        return this;
    }

    public java.util.List<EmailProviderInsightsTrendItem> getTrend() {
        return trend;
    }

    public EmailProviderInsights trend(java.util.List<EmailProviderInsightsTrendItem> trend) {
        this.trend = trend;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
