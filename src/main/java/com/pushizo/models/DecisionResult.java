// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DecisionResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DecisionResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("arm_id")
    private String armId;

    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Zorunlu. Değerler: "thompson", "holdout".
     */
    @JsonProperty("policy")
    private String policy;

    /**
     * Zorunlu.
     */
    @JsonProperty("context")
    private String context;

    public String getArmId() {
        return armId;
    }

    public DecisionResult armId(String armId) {
        this.armId = armId;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public DecisionResult label(String label) {
        this.label = label;
        return this;
    }

    public String getPolicy() {
        return policy;
    }

    public DecisionResult policy(String policy) {
        this.policy = policy;
        return this;
    }

    public String getContext() {
        return context;
    }

    public DecisionResult context(String context) {
        this.context = context;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
