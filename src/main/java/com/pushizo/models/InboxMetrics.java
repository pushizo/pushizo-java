// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxMetrics şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxMetrics {
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
    @JsonProperty("first_response")
    private InboxMetricsFirstResponse firstResponse;

    /**
     * Zorunlu.
     */
    @JsonProperty("resolution")
    private InboxMetricsResolution resolution;

    /**
     * Zorunlu.
     */
    @JsonProperty("sla")
    private InboxMetricsSla sla;

    /**
     * Zorunlu.
     */
    @JsonProperty("volume")
    private InboxMetricsVolume volume;

    /**
     * Zorunlu.
     */
    @JsonProperty("agents")
    private java.util.List<InboxMetricsAgentsItem> agents;

    /**
     * Zorunlu.
     */
    @JsonProperty("daily")
    private java.util.List<InboxMetricsDailyItem> daily;

    public String getFrom() {
        return from;
    }

    public InboxMetrics from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public InboxMetrics to(String to) {
        this.to = to;
        return this;
    }

    public InboxMetricsFirstResponse getFirstResponse() {
        return firstResponse;
    }

    public InboxMetrics firstResponse(InboxMetricsFirstResponse firstResponse) {
        this.firstResponse = firstResponse;
        return this;
    }

    public InboxMetricsResolution getResolution() {
        return resolution;
    }

    public InboxMetrics resolution(InboxMetricsResolution resolution) {
        this.resolution = resolution;
        return this;
    }

    public InboxMetricsSla getSla() {
        return sla;
    }

    public InboxMetrics sla(InboxMetricsSla sla) {
        this.sla = sla;
        return this;
    }

    public InboxMetricsVolume getVolume() {
        return volume;
    }

    public InboxMetrics volume(InboxMetricsVolume volume) {
        this.volume = volume;
        return this;
    }

    public java.util.List<InboxMetricsAgentsItem> getAgents() {
        return agents;
    }

    public InboxMetrics agents(java.util.List<InboxMetricsAgentsItem> agents) {
        this.agents = agents;
        return this;
    }

    public java.util.List<InboxMetricsDailyItem> getDaily() {
        return daily;
    }

    public InboxMetrics daily(java.util.List<InboxMetricsDailyItem> daily) {
        this.daily = daily;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
