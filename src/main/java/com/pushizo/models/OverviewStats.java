// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OverviewStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class OverviewStats {
    /**
     * Zorunlu. Değerler: "7d", "30d", "custom".
     */
    @JsonProperty("range")
    private String range;

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
    @JsonProperty("kpis")
    private OverviewStatsKpis kpis;

    /**
     * Zorunlu.
     */
    @JsonProperty("series")
    private java.util.List<OverviewStatsSeriesItem> series;

    /**
     * Zorunlu.
     */
    @JsonProperty("recent_messages")
    private java.util.List<Message> recentMessages;

    /**
     * Zorunlu.
     */
    @JsonProperty("recent_campaigns")
    private java.util.List<OverviewStatsRecentCampaignsItem> recentCampaigns;

    /**
     * Zorunlu.
     */
    @JsonProperty("top_errors")
    private java.util.List<OverviewStatsTopErrorsItem> topErrors;

    /**
     * Zorunlu.
     */
    @JsonProperty("channels")
    private java.util.List<OverviewStatsChannelsItem> channels;

    public String getRange() {
        return range;
    }

    public OverviewStats range(String range) {
        this.range = range;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public OverviewStats from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public OverviewStats to(String to) {
        this.to = to;
        return this;
    }

    public OverviewStatsKpis getKpis() {
        return kpis;
    }

    public OverviewStats kpis(OverviewStatsKpis kpis) {
        this.kpis = kpis;
        return this;
    }

    public java.util.List<OverviewStatsSeriesItem> getSeries() {
        return series;
    }

    public OverviewStats series(java.util.List<OverviewStatsSeriesItem> series) {
        this.series = series;
        return this;
    }

    public java.util.List<Message> getRecentMessages() {
        return recentMessages;
    }

    public OverviewStats recentMessages(java.util.List<Message> recentMessages) {
        this.recentMessages = recentMessages;
        return this;
    }

    public java.util.List<OverviewStatsRecentCampaignsItem> getRecentCampaigns() {
        return recentCampaigns;
    }

    public OverviewStats recentCampaigns(java.util.List<OverviewStatsRecentCampaignsItem> recentCampaigns) {
        this.recentCampaigns = recentCampaigns;
        return this;
    }

    public java.util.List<OverviewStatsTopErrorsItem> getTopErrors() {
        return topErrors;
    }

    public OverviewStats topErrors(java.util.List<OverviewStatsTopErrorsItem> topErrors) {
        this.topErrors = topErrors;
        return this;
    }

    public java.util.List<OverviewStatsChannelsItem> getChannels() {
        return channels;
    }

    public OverviewStats channels(java.util.List<OverviewStatsChannelsItem> channels) {
        this.channels = channels;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
