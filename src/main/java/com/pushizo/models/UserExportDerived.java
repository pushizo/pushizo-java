// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerived şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerived {
    /**
     * Zorunlu.
     */
    @JsonProperty("wallet_passes")
    private java.util.List<UserExportDerivedWalletPassesItem> walletPasses;

    /**
     * Zorunlu.
     */
    @JsonProperty("rfm")
    private UserExportDerivedRfm rfm;

    /**
     * Zorunlu.
     */
    @JsonProperty("predictions")
    private java.util.List<UserExportDerivedPredictionsItem> predictions;

    /**
     * Zorunlu.
     */
    @JsonProperty("channel_scores")
    private java.util.List<UserExportDerivedChannelScoresItem> channelScores;

    /**
     * Zorunlu.
     */
    @JsonProperty("decisions")
    private java.util.List<UserExportDerivedDecisionsItem> decisions;

    /**
     * Zorunlu.
     */
    @JsonProperty("recommendations")
    private java.util.List<UserExportDerivedRecommendationsItem> recommendations;

    /**
     * Zorunlu.
     */
    @JsonProperty("affinities")
    private java.util.List<UserExportDerivedAffinitiesItem> affinities;

    /**
     * Zorunlu.
     */
    @JsonProperty("frequency_cap")
    private UserExportDerivedFrequencyCap frequencyCap;

    public java.util.List<UserExportDerivedWalletPassesItem> getWalletPasses() {
        return walletPasses;
    }

    public UserExportDerived walletPasses(java.util.List<UserExportDerivedWalletPassesItem> walletPasses) {
        this.walletPasses = walletPasses;
        return this;
    }

    public UserExportDerivedRfm getRfm() {
        return rfm;
    }

    public UserExportDerived rfm(UserExportDerivedRfm rfm) {
        this.rfm = rfm;
        return this;
    }

    public java.util.List<UserExportDerivedPredictionsItem> getPredictions() {
        return predictions;
    }

    public UserExportDerived predictions(java.util.List<UserExportDerivedPredictionsItem> predictions) {
        this.predictions = predictions;
        return this;
    }

    public java.util.List<UserExportDerivedChannelScoresItem> getChannelScores() {
        return channelScores;
    }

    public UserExportDerived channelScores(java.util.List<UserExportDerivedChannelScoresItem> channelScores) {
        this.channelScores = channelScores;
        return this;
    }

    public java.util.List<UserExportDerivedDecisionsItem> getDecisions() {
        return decisions;
    }

    public UserExportDerived decisions(java.util.List<UserExportDerivedDecisionsItem> decisions) {
        this.decisions = decisions;
        return this;
    }

    public java.util.List<UserExportDerivedRecommendationsItem> getRecommendations() {
        return recommendations;
    }

    public UserExportDerived recommendations(java.util.List<UserExportDerivedRecommendationsItem> recommendations) {
        this.recommendations = recommendations;
        return this;
    }

    public java.util.List<UserExportDerivedAffinitiesItem> getAffinities() {
        return affinities;
    }

    public UserExportDerived affinities(java.util.List<UserExportDerivedAffinitiesItem> affinities) {
        this.affinities = affinities;
        return this;
    }

    public UserExportDerivedFrequencyCap getFrequencyCap() {
        return frequencyCap;
    }

    public UserExportDerived frequencyCap(UserExportDerivedFrequencyCap frequencyCap) {
        this.frequencyCap = frequencyCap;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
