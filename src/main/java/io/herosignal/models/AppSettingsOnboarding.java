// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsOnboarding şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsOnboarding {
    /**
     * Zorunlu.
     */
    @JsonProperty("step")
    private Long step;

    @JsonProperty("simulation")
    private Boolean simulation;

    @JsonProperty("completed_at")
    private String completedAt;

    public Long getStep() {
        return step;
    }

    public AppSettingsOnboarding step(Long step) {
        this.step = step;
        return this;
    }

    public Boolean getSimulation() {
        return simulation;
    }

    public AppSettingsOnboarding simulation(Boolean simulation) {
        this.simulation = simulation;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public AppSettingsOnboarding completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
