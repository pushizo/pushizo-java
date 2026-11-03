// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppFlagEvaluation şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppFlagEvaluation {
    /**
     * Zorunlu.
     */
    @JsonProperty("flags")
    private java.util.Map<String, AppFlagEvaluationFlagsValue> flags;

    public java.util.Map<String, AppFlagEvaluationFlagsValue> getFlags() {
        return flags;
    }

    public AppFlagEvaluation flags(java.util.Map<String, AppFlagEvaluationFlagsValue> flags) {
        this.flags = flags;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
