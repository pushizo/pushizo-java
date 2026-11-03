// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReportResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ReportResult {
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
    @JsonProperty("columns")
    private java.util.List<ReportResultColumnsItem> columns;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<java.util.Map<String, Object>> rows;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private java.util.Map<String, Double> totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("truncated")
    private Boolean truncated;

    public String getFrom() {
        return from;
    }

    public ReportResult from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public ReportResult to(String to) {
        this.to = to;
        return this;
    }

    public java.util.List<ReportResultColumnsItem> getColumns() {
        return columns;
    }

    public ReportResult columns(java.util.List<ReportResultColumnsItem> columns) {
        this.columns = columns;
        return this;
    }

    public java.util.List<java.util.Map<String, Object>> getRows() {
        return rows;
    }

    public ReportResult rows(java.util.List<java.util.Map<String, Object>> rows) {
        this.rows = rows;
        return this;
    }

    public java.util.Map<String, Double> getTotals() {
        return totals;
    }

    public ReportResult totals(java.util.Map<String, Double> totals) {
        this.totals = totals;
        return this;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public ReportResult truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
