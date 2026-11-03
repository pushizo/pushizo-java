// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelScoreUserScoresItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelScoreUserScoresItem {
    /**
     * Zorunlu. Değerler: "push", "email", "whatsapp", "rcs", "sms".
     */
    @JsonProperty("channel")
    private String channel;

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
    @JsonProperty("score")
    private Double score;

    public String getChannel() {
        return channel;
    }

    public ChannelScoreUserScoresItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Long getSends() {
        return sends;
    }

    public ChannelScoreUserScoresItem sends(Long sends) {
        this.sends = sends;
        return this;
    }

    public Long getEngaged() {
        return engaged;
    }

    public ChannelScoreUserScoresItem engaged(Long engaged) {
        this.engaged = engaged;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public ChannelScoreUserScoresItem score(Double score) {
        this.score = score;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
