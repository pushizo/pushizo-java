// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PredictionModelMetrics şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PredictionModelMetrics {
    /**
     * Zorunlu.
     */
    @JsonProperty("auc")
    private Double auc;

    /**
     * Zorunlu.
     */
    @JsonProperty("base_rate")
    private Double baseRate;

    /**
     * Zorunlu.
     */
    @JsonProperty("train_users")
    private Long trainUsers;

    /**
     * Zorunlu.
     */
    @JsonProperty("holdout_users")
    private Long holdoutUsers;

    /**
     * Zorunlu.
     */
    @JsonProperty("positives")
    private Long positives;

    /**
     * Zorunlu.
     */
    @JsonProperty("negatives")
    private Long negatives;

    /**
     * Zorunlu.
     */
    @JsonProperty("calibration")
    private java.util.List<PredictionModelMetricsCalibrationItem> calibration;

    /**
     * Zorunlu.
     */
    @JsonProperty("importance")
    private java.util.List<PredictionModelMetricsImportanceItem> importance;

    public Double getAuc() {
        return auc;
    }

    public PredictionModelMetrics auc(Double auc) {
        this.auc = auc;
        return this;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    public PredictionModelMetrics baseRate(Double baseRate) {
        this.baseRate = baseRate;
        return this;
    }

    public Long getTrainUsers() {
        return trainUsers;
    }

    public PredictionModelMetrics trainUsers(Long trainUsers) {
        this.trainUsers = trainUsers;
        return this;
    }

    public Long getHoldoutUsers() {
        return holdoutUsers;
    }

    public PredictionModelMetrics holdoutUsers(Long holdoutUsers) {
        this.holdoutUsers = holdoutUsers;
        return this;
    }

    public Long getPositives() {
        return positives;
    }

    public PredictionModelMetrics positives(Long positives) {
        this.positives = positives;
        return this;
    }

    public Long getNegatives() {
        return negatives;
    }

    public PredictionModelMetrics negatives(Long negatives) {
        this.negatives = negatives;
        return this;
    }

    public java.util.List<PredictionModelMetricsCalibrationItem> getCalibration() {
        return calibration;
    }

    public PredictionModelMetrics calibration(java.util.List<PredictionModelMetricsCalibrationItem> calibration) {
        this.calibration = calibration;
        return this;
    }

    public java.util.List<PredictionModelMetricsImportanceItem> getImportance() {
        return importance;
    }

    public PredictionModelMetrics importance(java.util.List<PredictionModelMetricsImportanceItem> importance) {
        this.importance = importance;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
