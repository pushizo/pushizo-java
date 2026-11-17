// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AssignmentRule şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AssignmentRule {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("position")
    private Long position;

    /**
     * Zorunlu.
     */
    @JsonProperty("conditions")
    private AssignmentRuleConditions conditions;

    /**
     * Zorunlu. Değerler: "round_robin", "least_busy", "team_only".
     */
    @JsonProperty("strategy")
    private String strategy;

    /**
     * Zorunlu.
     */
    @JsonProperty("team_id")
    private String teamId;

    /**
     * Zorunlu.
     */
    @JsonProperty("agent_ids")
    private java.util.List<String> agentIds;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public AssignmentRule id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AssignmentRule name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AssignmentRule enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getPosition() {
        return position;
    }

    public AssignmentRule position(Long position) {
        this.position = position;
        return this;
    }

    public AssignmentRuleConditions getConditions() {
        return conditions;
    }

    public AssignmentRule conditions(AssignmentRuleConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public String getStrategy() {
        return strategy;
    }

    public AssignmentRule strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public AssignmentRule teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public java.util.List<String> getAgentIds() {
        return agentIds;
    }

    public AssignmentRule agentIds(java.util.List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AssignmentRule createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AssignmentRule updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
