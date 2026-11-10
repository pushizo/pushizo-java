// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UninstallReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UninstallReport {
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
    private UninstallReportTotals totals;

    /**
     * Zorunlu.
     */
    @JsonProperty("previous")
    private UninstallReportPrevious previous;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<UninstallReportRowsItem> rows;

    /**
     * Zorunlu.
     */
    @JsonProperty("by_channel")
    private java.util.List<UninstallReportByChannelItem> byChannel;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_messages")
    private java.util.List<UninstallReportLastMessagesItem> lastMessages;

    public String getFrom() {
        return from;
    }

    public UninstallReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public UninstallReport to(String to) {
        this.to = to;
        return this;
    }

    public UninstallReportTotals getTotals() {
        return totals;
    }

    public UninstallReport totals(UninstallReportTotals totals) {
        this.totals = totals;
        return this;
    }

    public UninstallReportPrevious getPrevious() {
        return previous;
    }

    public UninstallReport previous(UninstallReportPrevious previous) {
        this.previous = previous;
        return this;
    }

    public java.util.List<UninstallReportRowsItem> getRows() {
        return rows;
    }

    public UninstallReport rows(java.util.List<UninstallReportRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    public java.util.List<UninstallReportByChannelItem> getByChannel() {
        return byChannel;
    }

    public UninstallReport byChannel(java.util.List<UninstallReportByChannelItem> byChannel) {
        this.byChannel = byChannel;
        return this;
    }

    public java.util.List<UninstallReportLastMessagesItem> getLastMessages() {
        return lastMessages;
    }

    public UninstallReport lastMessages(java.util.List<UninstallReportLastMessagesItem> lastMessages) {
        this.lastMessages = lastMessages;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
