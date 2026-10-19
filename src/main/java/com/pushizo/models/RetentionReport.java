// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RetentionReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RetentionReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("weeks")
    private Long weeks;

    /**
     * Zorunlu.
     */
    @JsonProperty("cohorts")
    private java.util.List<RetentionReportCohortsItem> cohorts;

    /**
     * Zorunlu.
     */
    @JsonProperty("average")
    private java.util.List<Double> average;

    public Long getWeeks() {
        return weeks;
    }

    public RetentionReport weeks(Long weeks) {
        this.weeks = weeks;
        return this;
    }

    public java.util.List<RetentionReportCohortsItem> getCohorts() {
        return cohorts;
    }

    public RetentionReport cohorts(java.util.List<RetentionReportCohortsItem> cohorts) {
        this.cohorts = cohorts;
        return this;
    }

    public java.util.List<Double> getAverage() {
        return average;
    }

    public RetentionReport average(java.util.List<Double> average) {
        this.average = average;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
