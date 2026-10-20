// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationAssignDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationAssignDto {
    @JsonProperty("assignee_id")
    private String assigneeId;

    @JsonProperty("team_id")
    private String teamId;

    public String getAssigneeId() {
        return assigneeId;
    }

    public ConversationAssignDto assigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public ConversationAssignDto teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
