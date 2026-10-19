// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EngagementReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EngagementReport {
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
    @JsonProperty("timezone")
    private String timezone;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private EngagementReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous")
    private EngagementReportPrevious previous;

    /**
     * Zorunlu.
     */
    @JsonProperty("cells")
    private java.util.List<EngagementReportCellsItem> cells;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<EngagementReportRowsItem> rows;

    public String getFrom() {
        return from;
    }

    public EngagementReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public EngagementReport to(String to) {
        this.to = to;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public EngagementReport timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public EngagementReportTotals getTotals() {
        return totals;
    }

    public EngagementReport totals(EngagementReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public EngagementReportPrevious getPrevious() {
        return previous;
    }

    public EngagementReport previous(EngagementReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    public java.util.List<EngagementReportCellsItem> getCells() {
        return cells;
    }

    public EngagementReport cells(java.util.List<EngagementReportCellsItem> cells) {
        this.cells = cells;
        return this;
    }

    public java.util.List<EngagementReportRowsItem> getRows() {
        return rows;
    }

    public EngagementReport rows(java.util.List<EngagementReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
