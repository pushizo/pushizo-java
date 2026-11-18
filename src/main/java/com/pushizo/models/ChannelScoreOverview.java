// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelScoreOverview şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelScoreOverview {
    /**
     * Zorunlu.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Zorunlu.
     */
    @JsonProperty("low_population")
    private Boolean lowPopulation;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_computed_at")
    private String lastComputedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("channels")
    private java.util.List<ChannelScoreOverviewChannelsItem> channels;

    public Long getTotal() {
        return total;
    }

    public ChannelScoreOverview total(Long total) {
        this.total = total;
        return this;
    }

    public Boolean getLowPopulation() {
        return lowPopulation;
    }

    public ChannelScoreOverview lowPopulation(Boolean lowPopulation) {
        this.lowPopulation = lowPopulation;
        return this;
    }

    public String getLastComputedAt() {
        return lastComputedAt;
    }

    public ChannelScoreOverview lastComputedAt(String lastComputedAt) {
        this.lastComputedAt = lastComputedAt;
        return this;
    }

    public java.util.List<ChannelScoreOverviewChannelsItem> getChannels() {
        return channels;
    }

    public ChannelScoreOverview channels(java.util.List<ChannelScoreOverviewChannelsItem> channels) {
        this.channels = channels;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
