// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelScoreUser şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelScoreUser {
    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu. Değerler: "push", "email", "whatsapp", "rcs", "sms".
     */
    @JsonProperty("best_channel")
    private String bestChannel;

    /**
     * Zorunlu.
     */
    @JsonProperty("scores")
    private java.util.List<ChannelScoreUserScoresItem> scores;

    public String getUserId() {
        return userId;
    }

    public ChannelScoreUser userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public ChannelScoreUser externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getBestChannel() {
        return bestChannel;
    }

    public ChannelScoreUser bestChannel(String bestChannel) {
        this.bestChannel = bestChannel;
        return this;
    }

    public java.util.List<ChannelScoreUserScoresItem> getScores() {
        return scores;
    }

    public ChannelScoreUser scores(java.util.List<ChannelScoreUserScoresItem> scores) {
        this.scores = scores;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
