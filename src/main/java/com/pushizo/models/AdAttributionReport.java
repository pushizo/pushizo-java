// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdAttributionReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdAttributionReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Zorunlu.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Zorunlu. Değerler: "last_click", "first_click", "linear", "time_decay".
     */
    @JsonProperty("model")
    private String model;

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
    @JsonProperty("currency")
    private String currency;

    /**
     * Zorunlu.
     */
    @JsonProperty("group_by")
    private String groupBy;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversion_events")
    private java.util.List<String> conversionEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<AdAttributionReportRowsItem> rows;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private AdAttributionReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("truncated")
    private Boolean truncated;

    /**
     * Zorunlu.
     */
    @JsonProperty("fx_missing")
    private java.util.List<String> fxMissing;

    public String getFrom() {
        return from;
    }

    public AdAttributionReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AdAttributionReport to(String to) {
        this.to = to;
        return this;
    }

    public String getModel() {
        return model;
    }

    public AdAttributionReport model(String model) {
        this.model = model;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public AdAttributionReport windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public Long getHalfLifeDays() {
        return halfLifeDays;
    }

    public AdAttributionReport halfLifeDays(Long halfLifeDays) {
        this.halfLifeDays = halfLifeDays;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public AdAttributionReport currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public AdAttributionReport groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public java.util.List<String> getConversionEvents() {
        return conversionEvents;
    }

    public AdAttributionReport conversionEvents(java.util.List<String> conversionEvents) {
        this.conversionEvents = conversionEvents;
        return this;
    }

    public java.util.List<AdAttributionReportRowsItem> getRows() {
        return rows;
    }

    public AdAttributionReport rows(java.util.List<AdAttributionReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    public AdAttributionReportTotals getTotals() {
        return totals;
    }

    public AdAttributionReport totals(AdAttributionReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public AdAttributionReport truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    public java.util.List<String> getFxMissing() {
        return fxMissing;
    }

    public AdAttributionReport fxMissing(java.util.List<String> fxMissing) {
        this.fxMissing = fxMissing;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
