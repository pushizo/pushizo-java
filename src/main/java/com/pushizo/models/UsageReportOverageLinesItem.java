// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsageReportOverageLinesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UsageReportOverageLinesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("metric")
    private String metric;

    /**
     * Zorunlu.
     */
    @JsonProperty("included")
    private Double included;

    /**
     * Zorunlu.
     */
    @JsonProperty("used")
    private Double used;

    /**
     * Zorunlu.
     */
    @JsonProperty("billable")
    private Double billable;

    /**
     * Zorunlu.
     */
    @JsonProperty("amounts")
    private UsageReportOverageLinesItemAmounts amounts;

    public String getMetric() {
        return metric;
    }

    public UsageReportOverageLinesItem metric(String metric) {
        this.metric = metric;
        return this;
    }

    public Double getIncluded() {
        return included;
    }

    public UsageReportOverageLinesItem included(Double included) {
        this.included = included;
        return this;
    }

    public Double getUsed() {
        return used;
    }

    public UsageReportOverageLinesItem used(Double used) {
        this.used = used;
        return this;
    }

    public Double getBillable() {
        return billable;
    }

    public UsageReportOverageLinesItem billable(Double billable) {
        this.billable = billable;
        return this;
    }

    public UsageReportOverageLinesItemAmounts getAmounts() {
        return amounts;
    }

    public UsageReportOverageLinesItem amounts(UsageReportOverageLinesItemAmounts amounts) {
        this.amounts = amounts;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
