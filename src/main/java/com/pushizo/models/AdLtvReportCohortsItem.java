// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdLtvReportCohortsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdLtvReportCohortsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("cohort")
    private String cohort;

    /**
     * Zorunlu.
     */
    @JsonProperty("size")
    private Long size;

    /**
     * Zorunlu.
     */
    @JsonProperty("revenue")
    private java.util.List<Double> revenue;

    /**
     * Zorunlu.
     */
    @JsonProperty("ltv")
    private java.util.List<Double> ltv;

    public String getCohort() {
        return cohort;
    }

    public AdLtvReportCohortsItem cohort(String cohort) {
        this.cohort = cohort;
        return this;
    }

    public Long getSize() {
        return size;
    }

    public AdLtvReportCohortsItem size(Long size) {
        this.size = size;
        return this;
    }

    public java.util.List<Double> getRevenue() {
        return revenue;
    }

    public AdLtvReportCohortsItem revenue(java.util.List<Double> revenue) {
        this.revenue = revenue;
        return this;
    }

    public java.util.List<Double> getLtv() {
        return ltv;
    }

    public AdLtvReportCohortsItem ltv(java.util.List<Double> ltv) {
        this.ltv = ltv;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
