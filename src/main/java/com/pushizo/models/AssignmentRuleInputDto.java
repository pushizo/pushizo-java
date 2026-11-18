// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AssignmentRuleInputDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AssignmentRuleInputDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("position")
    private Long position;

    @JsonProperty("conditions")
    private AssignmentRuleInputDtoConditions conditions;

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

    public AssignmentRuleInputDto name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AssignmentRuleInputDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getPosition() {
        return position;
    }

    public AssignmentRuleInputDto position(Long position) {
        this.position = position;
        return this;
    }

    public AssignmentRuleInputDtoConditions getConditions() {
        return conditions;
    }

    public AssignmentRuleInputDto conditions(AssignmentRuleInputDtoConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public String getStrategy() {
        return strategy;
    }

    public AssignmentRuleInputDto strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public AssignmentRuleInputDto teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public java.util.List<String> getAgentIds() {
        return agentIds;
    }

    public AssignmentRuleInputDto agentIds(java.util.List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
