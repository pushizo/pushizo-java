// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdReportingSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdReportingSettings {
    /**
     * Zorunlu.
     */
    @JsonProperty("reporting_currency")
    private String reportingCurrency;

    /**
     * Zorunlu. Değerler: "last_click", "first_click", "linear", "time_decay".
     */
    @JsonProperty("attribution_model")
    private String attributionModel;

    /**
     * Zorunlu.
     */
    @JsonProperty("window_days")
    private Long windowDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("half_life_days")
    private Long halfLifeDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_events")
    private java.util.List<String> conversionEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("effective_conversion_events")
    private java.util.List<String> effectiveConversionEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("fx")
    private AdReportingSettingsFx fx;

    public String getReportingCurrency() {
        return reportingCurrency;
    }

    public AdReportingSettings reportingCurrency(String reportingCurrency) {
        this.reportingCurrency = reportingCurrency;
        return this;
    }

    public String getAttributionModel() {
        return attributionModel;
    }

    public AdReportingSettings attributionModel(String attributionModel) {
        this.attributionModel = attributionModel;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public AdReportingSettings windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public Long getHalfLifeDays() {
        return halfLifeDays;
    }

    public AdReportingSettings halfLifeDays(Long halfLifeDays) {
        this.halfLifeDays = halfLifeDays;
        return this;
    }

    public java.util.List<String> getConversionEvents() {
        return conversionEvents;
    }

    public AdReportingSettings conversionEvents(java.util.List<String> conversionEvents) {
        this.conversionEvents = conversionEvents;
        return this;
    }

    public java.util.List<String> getEffectiveConversionEvents() {
        return effectiveConversionEvents;
    }

    public AdReportingSettings effectiveConversionEvents(java.util.List<String> effectiveConversionEvents) {
        this.effectiveConversionEvents = effectiveConversionEvents;
        return this;
    }

    public AdReportingSettingsFx getFx() {
        return fx;
    }

    public AdReportingSettings fx(AdReportingSettingsFx fx) {
        this.fx = fx;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
