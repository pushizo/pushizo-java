// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("version")
    private Long version;

    /**
     * Zorunlu.
     */
    @JsonProperty("summary")
    private JourneyStatsSummary summary;

    /**
     * Zorunlu.
     */
    @JsonProperty("nodes")
    private java.util.List<JourneyStatsNodesItem> nodes;

    /**
     * Zorunlu.
     */
    @JsonProperty("goals")
    private java.util.List<JourneyStatsGoalsItem> goals;

    /**
     * Zorunlu.
     */
    @JsonProperty("exit_reasons")
    private java.util.Map<String, Long> exitReasons;

    public Long getVersion() {
        return version;
    }

    public JourneyStats version(Long version) {
        this.version = version;
        return this;
    }

    public JourneyStatsSummary getSummary() {
        return summary;
    }

    public JourneyStats summary(JourneyStatsSummary summary) {
        this.summary = summary;
        return this;
    }

    public java.util.List<JourneyStatsNodesItem> getNodes() {
        return nodes;
    }

    public JourneyStats nodes(java.util.List<JourneyStatsNodesItem> nodes) {
        this.nodes = nodes;
        return this;
    }

    public java.util.List<JourneyStatsGoalsItem> getGoals() {
        return goals;
    }

    public JourneyStats goals(java.util.List<JourneyStatsGoalsItem> goals) {
        this.goals = goals;
        return this;
    }

    public java.util.Map<String, Long> getExitReasons() {
        return exitReasons;
    }

    public JourneyStats exitReasons(java.util.Map<String, Long> exitReasons) {
        this.exitReasons = exitReasons;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
