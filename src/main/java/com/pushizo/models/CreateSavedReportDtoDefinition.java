// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateSavedReportDtoDefinition şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateSavedReportDtoDefinition {
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
     * Değerler: "day", "week", "month", "channel", "provider", "campaign", "status", "name", "source", "event_name", "kind".
     */
    @JsonProperty("dimensions")
    private java.util.List<String> dimensions;

    @JsonProperty("filters")
    private java.util.Map<String, java.util.List<String>> filters;

    @JsonProperty("sort")
    private CreateSavedReportDtoDefinitionSort sort;

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

    public CreateSavedReportDtoDefinition source(String source) {
        this.source = source;
        return this;
    }

    public java.util.List<String> getMetrics() {
        return metrics;
    }

    public CreateSavedReportDtoDefinition metrics(java.util.List<String> metrics) {
        this.metrics = metrics;
        return this;
    }

    public java.util.List<String> getDimensions() {
        return dimensions;
    }

    public CreateSavedReportDtoDefinition dimensions(java.util.List<String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    public CreateSavedReportDtoDefinition filters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
        return this;
    }

    public CreateSavedReportDtoDefinitionSort getSort() {
        return sort;
    }

    public CreateSavedReportDtoDefinition sort(CreateSavedReportDtoDefinitionSort sort) {
        this.sort = sort;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public CreateSavedReportDtoDefinition limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getDays() {
        return days;
    }

    public CreateSavedReportDtoDefinition days(Long days) {
        this.days = days;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public CreateSavedReportDtoDefinition from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public CreateSavedReportDtoDefinition to(String to) {
        this.to = to;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
