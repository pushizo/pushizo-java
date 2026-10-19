// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversionsReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversionsReport {
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
    private ConversionsReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous")
    private ConversionsReportPrevious previous;

    /**
     * Zorunlu.
     */
    @JsonProperty("by_campaign")
    private java.util.List<ConversionsReportByCampaignItem> byCampaign;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<ConversionsReportRowsItem> rows;

    public String getFrom() {
        return from;
    }

    public ConversionsReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public ConversionsReport to(String to) {
        this.to = to;
        return this;
    }

    public ConversionsReportTotals getTotals() {
        return totals;
    }

    public ConversionsReport totals(ConversionsReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public ConversionsReportPrevious getPrevious() {
        return previous;
    }

    public ConversionsReport previous(ConversionsReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    public java.util.List<ConversionsReportByCampaignItem> getByCampaign() {
        return byCampaign;
    }

    public ConversionsReport byCampaign(java.util.List<ConversionsReportByCampaignItem> byCampaign) {
        this.byCampaign = byCampaign;
        return this;
    }

    public java.util.List<ConversionsReportRowsItem> getRows() {
        return rows;
    }

    public ConversionsReport rows(java.util.List<ConversionsReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
