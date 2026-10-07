// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventsReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventsReport {
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
     * Zorunlu. Değerler: "day", "name".
     */
    @JsonProperty("group_by")
    private String groupBy;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("totals")
    private EventsReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous")
    private EventsReportPrevious previous;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<EventsReportRowsItem> rows;

    public String getFrom() {
        return from;
    }

    public EventsReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public EventsReport to(String to) {
        this.to = to;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public EventsReport groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public String getName() {
        return name;
    }

    public EventsReport name(String name) {
        this.name = name;
        return this;
    }

    public EventsReportTotals getTotals() {
        return totals;
    }

    public EventsReport totals(EventsReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public EventsReportPrevious getPrevious() {
        return previous;
    }

    public EventsReport previous(EventsReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    public java.util.List<EventsReportRowsItem> getRows() {
        return rows;
    }

    public EventsReport rows(java.util.List<EventsReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
