// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsageReportMetricsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UsageReportMetricsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("metric")
    private String metric;

    /**
     * Zorunlu.
     */
    @JsonProperty("used")
    private Double used;

    /**
     * Zorunlu.
     */
    @JsonProperty("limit")
    private Double limit;

    /**
     * Zorunlu.
     */
    @JsonProperty("percent")
    private Double percent;

    /**
     * Zorunlu.
     */
    @JsonProperty("hard")
    private Boolean hard;

    public String getMetric() {
        return metric;
    }

    public UsageReportMetricsItem metric(String metric) {
        this.metric = metric;
        return this;
    }

    public Double getUsed() {
        return used;
    }

    public UsageReportMetricsItem used(Double used) {
        this.used = used;
        return this;
    }

    public Double getLimit() {
        return limit;
    }

    public UsageReportMetricsItem limit(Double limit) {
        this.limit = limit;
        return this;
    }

    public Double getPercent() {
        return percent;
    }

    public UsageReportMetricsItem percent(Double percent) {
        this.percent = percent;
        return this;
    }

    public Boolean getHard() {
        return hard;
    }

    public UsageReportMetricsItem hard(Boolean hard) {
        this.hard = hard;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
