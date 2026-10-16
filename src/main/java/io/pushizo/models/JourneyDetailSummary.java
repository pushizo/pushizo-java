// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyDetailSummary şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyDetailSummary {
    /**
     * Zorunlu.
     */
    @JsonProperty("runs_total")
    private Long runsTotal;

    /**
     * Zorunlu.
     */
    @JsonProperty("active")
    private Long active;

    /**
     * Zorunlu.
     */
    @JsonProperty("completed")
    private Long completed;

    /**
     * Zorunlu.
     */
    @JsonProperty("exited")
    private Long exited;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Zorunlu.
     */
    @JsonProperty("goal_reached")
    private Long goalReached;

    public Long getRunsTotal() {
        return runsTotal;
    }

    public JourneyDetailSummary runsTotal(Long runsTotal) {
        this.runsTotal = runsTotal;
        return this;
    }

    public Long getActive() {
        return active;
    }

    public JourneyDetailSummary active(Long active) {
        this.active = active;
        return this;
    }

    public Long getCompleted() {
        return completed;
    }

    public JourneyDetailSummary completed(Long completed) {
        this.completed = completed;
        return this;
    }

    public Long getExited() {
        return exited;
    }

    public JourneyDetailSummary exited(Long exited) {
        this.exited = exited;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public JourneyDetailSummary failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getGoalReached() {
        return goalReached;
    }

    public JourneyDetailSummary goalReached(Long goalReached) {
        this.goalReached = goalReached;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
