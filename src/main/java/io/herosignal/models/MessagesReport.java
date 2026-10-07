// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessagesReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessagesReport {
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
     * Zorunlu. Değerler: "day", "channel", "campaign".
     */
    @JsonProperty("group_by")
    private String groupBy;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private MessagesReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous")
    private MessagesReportPrevious previous;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<MessagesReportRowsItem> rows;

    public String getFrom() {
        return from;
    }

    public MessagesReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public MessagesReport to(String to) {
        this.to = to;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public MessagesReport groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public MessagesReportTotals getTotals() {
        return totals;
    }

    public MessagesReport totals(MessagesReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public MessagesReportPrevious getPrevious() {
        return previous;
    }

    public MessagesReport previous(MessagesReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    public java.util.List<MessagesReportRowsItem> getRows() {
        return rows;
    }

    public MessagesReport rows(java.util.List<MessagesReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
