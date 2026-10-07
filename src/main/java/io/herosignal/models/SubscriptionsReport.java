// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubscriptionsReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SubscriptionsReport {
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
    private SubscriptionsReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous")
    private SubscriptionsReportPrevious previous;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<SubscriptionsReportRowsItem> rows;

    /**
     * Zorunlu.
     */
    @JsonProperty("by_channel")
    private java.util.List<SubscriptionsReportByChannelItem> byChannel;

    public String getFrom() {
        return from;
    }

    public SubscriptionsReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public SubscriptionsReport to(String to) {
        this.to = to;
        return this;
    }

    public SubscriptionsReportTotals getTotals() {
        return totals;
    }

    public SubscriptionsReport totals(SubscriptionsReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public SubscriptionsReportPrevious getPrevious() {
        return previous;
    }

    public SubscriptionsReport previous(SubscriptionsReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    public java.util.List<SubscriptionsReportRowsItem> getRows() {
        return rows;
    }

    public SubscriptionsReport rows(java.util.List<SubscriptionsReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    public java.util.List<SubscriptionsReportByChannelItem> getByChannel() {
        return byChannel;
    }

    public SubscriptionsReport byChannel(java.util.List<SubscriptionsReportByChannelItem> byChannel) {
        this.byChannel = byChannel;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
