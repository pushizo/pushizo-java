// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdLtvReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdLtvReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Zorunlu.
     */
    @JsonProperty("months")
    private Long months;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_events")
    private java.util.List<String> conversionEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("cohorts")
    private java.util.List<AdLtvReportCohortsItem> cohorts;

    /**
     * Zorunlu.
     */
    @JsonProperty("average")
    private java.util.List<Double> average;

    /**
     * Zorunlu.
     */
    @JsonProperty("fx_missing")
    private java.util.List<String> fxMissing;

    public String getCurrency() {
        return currency;
    }

    public AdLtvReport currency(String currency) {
        this.currency = currency;
        return this;
    }

    public Long getMonths() {
        return months;
    }

    public AdLtvReport months(Long months) {
        this.months = months;
        return this;
    }

    public java.util.List<String> getConversionEvents() {
        return conversionEvents;
    }

    public AdLtvReport conversionEvents(java.util.List<String> conversionEvents) {
        this.conversionEvents = conversionEvents;
        return this;
    }

    public java.util.List<AdLtvReportCohortsItem> getCohorts() {
        return cohorts;
    }

    public AdLtvReport cohorts(java.util.List<AdLtvReportCohortsItem> cohorts) {
        this.cohorts = cohorts;
        return this;
    }

    public java.util.List<Double> getAverage() {
        return average;
    }

    public AdLtvReport average(java.util.List<Double> average) {
        this.average = average;
        return this;
    }

    public java.util.List<String> getFxMissing() {
        return fxMissing;
    }

    public AdLtvReport fxMissing(java.util.List<String> fxMissing) {
        this.fxMissing = fxMissing;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
