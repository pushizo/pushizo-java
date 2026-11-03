// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GlobalControlReport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class GlobalControlReport {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("percent")
    private Long percent;

    /**
     * Zorunlu.
     */
    @JsonProperty("started_at")
    private String startedAt;

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
    @JsonProperty("events")
    private java.util.List<String> events;

    /**
     * Zorunlu.
     */
    @JsonProperty("control")
    private GlobalControlReportControl control;

    /**
     * Zorunlu.
     */
    @JsonProperty("treatment")
    private GlobalControlReportTreatment treatment;

    /**
     * Zorunlu.
     */
    @JsonProperty("lift_percent")
    private Double liftPercent;

    /**
     * Zorunlu.
     */
    @JsonProperty("incremental_conversions")
    private Long incrementalConversions;

    /**
     * Zorunlu.
     */
    @JsonProperty("p_value")
    private Double pValue;

    /**
     * Zorunlu.
     */
    @JsonProperty("significant")
    private Boolean significant;

    /**
     * Zorunlu.
     */
    @JsonProperty("withheld_messages")
    private Long withheldMessages;

    public Boolean getEnabled() {
        return enabled;
    }

    public GlobalControlReport enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getPercent() {
        return percent;
    }

    public GlobalControlReport percent(Long percent) {
        this.percent = percent;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public GlobalControlReport startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public GlobalControlReport from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public GlobalControlReport to(String to) {
        this.to = to;
        return this;
    }

    public java.util.List<String> getEvents() {
        return events;
    }

    public GlobalControlReport events(java.util.List<String> events) {
        this.events = events;
        return this;
    }

    public GlobalControlReportControl getControl() {
        return control;
    }

    public GlobalControlReport control(GlobalControlReportControl control) {
        this.control = control;
        return this;
    }

    public GlobalControlReportTreatment getTreatment() {
        return treatment;
    }

    public GlobalControlReport treatment(GlobalControlReportTreatment treatment) {
        this.treatment = treatment;
        return this;
    }

    public Double getLiftPercent() {
        return liftPercent;
    }

    public GlobalControlReport liftPercent(Double liftPercent) {
        this.liftPercent = liftPercent;
        return this;
    }

    public Long getIncrementalConversions() {
        return incrementalConversions;
    }

    public GlobalControlReport incrementalConversions(Long incrementalConversions) {
        this.incrementalConversions = incrementalConversions;
        return this;
    }

    public Double getPValue() {
        return pValue;
    }

    public GlobalControlReport pValue(Double pValue) {
        this.pValue = pValue;
        return this;
    }

    public Boolean getSignificant() {
        return significant;
    }

    public GlobalControlReport significant(Boolean significant) {
        this.significant = significant;
        return this;
    }

    public Long getWithheldMessages() {
        return withheldMessages;
    }

    public GlobalControlReport withheldMessages(Long withheldMessages) {
        this.withheldMessages = withheldMessages;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
