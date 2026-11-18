// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SavedReportDefinition şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SavedReportDefinition {
    /**
     * Zorunlu. Değerler: "deliveries", "events", "conversions".
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu. Değerler: "sent", "delivered", "failed", "opened", "clicked", "delivery_rate", "open_rate", "click_rate", "failure_rate", "count", "unique_users", "value_sum", "value_avg", "conversions", "revenue".
     */
    @JsonProperty("metrics")
    private java.util.List<String> metrics;

    /**
     * Zorunlu. Değerler: "day", "week", "month", "channel", "provider", "campaign", "status", "name", "source", "event_name", "kind".
     */
    @JsonProperty("dimensions")
    private java.util.List<String> dimensions;

    /**
     * Zorunlu.
     */
    @JsonProperty("filters")
    private java.util.Map<String, java.util.List<String>> filters;

    @JsonProperty("sort")
    private SavedReportDefinitionSort sort;

    /**
     * Zorunlu.
     */
    @JsonProperty("limit")
    private Long limit;

    @JsonProperty("days")
    private Long days;

    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    public String getSource() {
        return source;
    }

    public SavedReportDefinition source(String source) {
        this.source = source;
        return this;
    }

    public java.util.List<String> getMetrics() {
        return metrics;
    }

    public SavedReportDefinition metrics(java.util.List<String> metrics) {
        this.metrics = metrics;
        return this;
    }

    public java.util.List<String> getDimensions() {
        return dimensions;
    }

    public SavedReportDefinition dimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    public SavedReportDefinition filters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
        return this;
    }

    public SavedReportDefinitionSort getSort() {
        return sort;
    }

    public SavedReportDefinition sort(SavedReportDefinitionSort sort) {
        this.sort = sort;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public SavedReportDefinition limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getDays() {
        return days;
    }

    public SavedReportDefinition days(Long days) {
        this.days = days;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public SavedReportDefinition from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public SavedReportDefinition to(String to) {
        this.to = to;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
