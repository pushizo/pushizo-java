// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppFlagEvaluationFlagsValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppFlagEvaluationFlagsValue {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private Object value;

    /**
     * Zorunlu. Değerler: "on", "disabled", "segment", "rollout".
     */
    @JsonProperty("reason")
    private String reason;

    public Boolean getEnabled() {
        return enabled;
    }

    public AppFlagEvaluationFlagsValue enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public AppFlagEvaluationFlagsValue value(Object value) {
        this.value = value;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public AppFlagEvaluationFlagsValue reason(String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
