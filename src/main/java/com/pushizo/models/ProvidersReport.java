// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProvidersReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ProvidersReport {
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
    @JsonProperty("totals")
    private ProvidersReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous")
    private ProvidersReportPrevious previous;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<ProvidersReportRowsItem> rows;

    public String getFrom() {
        return from;
    }

    public ProvidersReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public ProvidersReport to(String to) {
        this.to = to;
        return this;
    }

    public ProvidersReportTotals getTotals() {
        return totals;
    }

    public ProvidersReport totals(ProvidersReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public ProvidersReportPrevious getPrevious() {
        return previous;
    }

    public ProvidersReport previous(ProvidersReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    public java.util.List<ProvidersReportRowsItem> getRows() {
        return rows;
    }

    public ProvidersReport rows(java.util.List<ProvidersReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
