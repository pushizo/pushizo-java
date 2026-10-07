// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyStatsGoalsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyStatsGoalsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("goal_id")
    private String goalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("reached")
    private Long reached;

    public String getGoalId() {
        return goalId;
    }

    public JourneyStatsGoalsItem goalId(String goalId) {
        this.goalId = goalId;
        return this;
    }

    public Long getReached() {
        return reached;
    }

    public JourneyStatsGoalsItem reached(Long reached) {
        this.reached = reached;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
