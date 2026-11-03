// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RfmTransitions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RfmTransitions {
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
    @JsonProperty("first_computed_at")
    private String firstComputedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("transitions")
    private java.util.List<RfmTransitionsTransitionsItem> transitions;

    public String getFrom() {
        return from;
    }

    public RfmTransitions from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public RfmTransitions to(String to) {
        this.to = to;
        return this;
    }

    public String getFirstComputedAt() {
        return firstComputedAt;
    }

    public RfmTransitions firstComputedAt(String firstComputedAt) {
        this.firstComputedAt = firstComputedAt;
        return this;
    }

    public java.util.List<RfmTransitionsTransitionsItem> getTransitions() {
        return transitions;
    }

    public RfmTransitions transitions(java.util.List<RfmTransitionsTransitionsItem> transitions) {
        this.transitions = transitions;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
