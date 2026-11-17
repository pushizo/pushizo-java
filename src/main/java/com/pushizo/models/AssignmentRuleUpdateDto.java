// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AssignmentRuleUpdateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AssignmentRuleUpdateDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("position")
    private Long position;

    @JsonProperty("conditions")
    private AssignmentRuleUpdateDtoConditions conditions;

    /**
     * Değerler: "round_robin", "least_busy", "team_only".
     */
    @JsonProperty("strategy")
    private String strategy;

    @JsonProperty("team_id")
    private String teamId;

    @JsonProperty("agent_ids")
    private java.util.List<String> agentIds;

    public String getName() {
        return name;
    }

    public AssignmentRuleUpdateDto name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AssignmentRuleUpdateDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getPosition() {
        return position;
    }

    public AssignmentRuleUpdateDto position(Long position) {
        this.position = position;
        return this;
    }

    public AssignmentRuleUpdateDtoConditions getConditions() {
        return conditions;
    }

    public AssignmentRuleUpdateDto conditions(AssignmentRuleUpdateDtoConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public String getStrategy() {
        return strategy;
    }

    public AssignmentRuleUpdateDto strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public AssignmentRuleUpdateDto teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public java.util.List<String> getAgentIds() {
        return agentIds;
    }

    public AssignmentRuleUpdateDto agentIds(java.util.List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
