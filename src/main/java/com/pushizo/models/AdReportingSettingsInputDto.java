// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdReportingSettingsInputDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdReportingSettingsInputDto {
    @JsonProperty("reporting_currency")
    private String reportingCurrency;

    /**
     * Değerler: "last_click", "first_click", "linear", "time_decay".
     */
    @JsonProperty("attribution_model")
    private String attributionModel;

    @JsonProperty("window_days")
    private Long windowDays;

    @JsonProperty("half_life_days")
    private Long halfLifeDays;

    @JsonProperty("conversion_events")
    private java.util.List<String> conversionEvents;

    public String getReportingCurrency() {
        return reportingCurrency;
    }

    public AdReportingSettingsInputDto reportingCurrency(String reportingCurrency) {
        this.reportingCurrency = reportingCurrency;
        return this;
    }

    public String getAttributionModel() {
        return attributionModel;
    }

    public AdReportingSettingsInputDto attributionModel(String attributionModel) {
        this.attributionModel = attributionModel;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public AdReportingSettingsInputDto windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public Long getHalfLifeDays() {
        return halfLifeDays;
    }

    public AdReportingSettingsInputDto halfLifeDays(Long halfLifeDays) {
        this.halfLifeDays = halfLifeDays;
        return this;
    }

    public java.util.List<String> getConversionEvents() {
        return conversionEvents;
    }

    public AdReportingSettingsInputDto conversionEvents(java.util.List<String> conversionEvents) {
        this.conversionEvents = conversionEvents;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
