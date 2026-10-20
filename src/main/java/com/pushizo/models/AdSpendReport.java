// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdSpendReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdSpendReport {
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
    @JsonProperty("rows")
    private java.util.List<AdSpendReportRowsItem> rows;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private AdSpendReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("fx_missing")
    private java.util.List<String> fxMissing;

    /**
     * Zorunlu. Değerler: "postgres", "clickhouse".
     */
    @JsonProperty("store")
    private String store;

    public String getFrom() {
        return from;
    }

    public AdSpendReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AdSpendReport to(String to) {
        this.to = to;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public AdSpendReport currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public AdSpendReport groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public java.util.List<AdSpendReportRowsItem> getRows() {
        return rows;
    }

    public AdSpendReport rows(java.util.List<AdSpendReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    public AdSpendReportTotals getTotals() {
        return totals;
    }

    public AdSpendReport totals(AdSpendReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public java.util.List<String> getFxMissing() {
        return fxMissing;
    }

    public AdSpendReport fxMissing(java.util.List<String> fxMissing) {
        this.fxMissing = fxMissing;
        return this;
    }

    public String getStore() {
        return store;
    }

    public AdSpendReport store(String store) {
        this.store = store;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
