// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PredictionModelMetricsCalibrationItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PredictionModelMetricsCalibrationItem {
    /**
     * Zorunlu. Değerler: "low", "medium", "high".
     */
    @JsonProperty("bucket")
    private String bucket;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    /**
     * Zorunlu.
     */
    @JsonProperty("predicted")
    private Double predicted;

    /**
     * Zorunlu.
     */
    @JsonProperty("actual")
    private Double actual;

    public String getBucket() {
        return bucket;
    }

    public PredictionModelMetricsCalibrationItem bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public PredictionModelMetricsCalibrationItem users(Long users) {
        this.users = users;
        return this;
    }

    public Double getPredicted() {
        return predicted;
    }

    public PredictionModelMetricsCalibrationItem predicted(Double predicted) {
        this.predicted = predicted;
        return this;
    }

    public Double getActual() {
        return actual;
    }

    public PredictionModelMetricsCalibrationItem actual(Double actual) {
        this.actual = actual;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
