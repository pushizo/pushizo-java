// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerivedDecisionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerivedDecisionsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("agent")
    private String agent;

    /**
     * Zorunlu.
     */
    @JsonProperty("arm_id")
    private String armId;

    /**
     * Zorunlu.
     */
    @JsonProperty("context")
    private String context;

    /**
     * Zorunlu.
     */
    @JsonProperty("assigned_at")
    private String assignedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("rewarded_at")
    private String rewardedAt;

    public String getAgent() {
        return agent;
    }

    public UserExportDerivedDecisionsItem agent(String agent) {
        this.agent = agent;
        return this;
    }

    public String getArmId() {
        return armId;
    }

    public UserExportDerivedDecisionsItem armId(String armId) {
        this.armId = armId;
        return this;
    }

    public String getContext() {
        return context;
    }

    public UserExportDerivedDecisionsItem context(String context) {
        this.context = context;
        return this;
    }

    public String getAssignedAt() {
        return assignedAt;
    }

    public UserExportDerivedDecisionsItem assignedAt(String assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }

    public String getRewardedAt() {
        return rewardedAt;
    }

    public UserExportDerivedDecisionsItem rewardedAt(String rewardedAt) {
        this.rewardedAt = rewardedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
