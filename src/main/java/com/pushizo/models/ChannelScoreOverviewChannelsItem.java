// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelScoreOverviewChannelsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelScoreOverviewChannelsItem {
    /**
     * Zorunlu. Değerler: "push", "email", "whatsapp", "rcs", "sms".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("best_users")
    private Long bestUsers;

    /**
     * Zorunlu.
     */
    @JsonProperty("share")
    private Double share;

    /**
     * Zorunlu.
     */
    @JsonProperty("sends")
    private Long sends;

    /**
     * Zorunlu.
     */
    @JsonProperty("engaged")
    private Long engaged;

    /**
     * Zorunlu.
     */
    @JsonProperty("engagement_rate")
    private Double engagementRate;

    public String getChannel() {
        return channel;
    }

    public ChannelScoreOverviewChannelsItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Long getBestUsers() {
        return bestUsers;
    }

    public ChannelScoreOverviewChannelsItem bestUsers(Long bestUsers) {
        this.bestUsers = bestUsers;
        return this;
    }

    public Double getShare() {
        return share;
    }

    public ChannelScoreOverviewChannelsItem share(Double share) {
        this.share = share;
        return this;
    }

    public Long getSends() {
        return sends;
    }

    public ChannelScoreOverviewChannelsItem sends(Long sends) {
        this.sends = sends;
        return this;
    }

    public Long getEngaged() {
        return engaged;
    }

    public ChannelScoreOverviewChannelsItem engaged(Long engaged) {
        this.engaged = engaged;
        return this;
    }

    public Double getEngagementRate() {
        return engagementRate;
    }

    public ChannelScoreOverviewChannelsItem engagementRate(Double engagementRate) {
        this.engagementRate = engagementRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
