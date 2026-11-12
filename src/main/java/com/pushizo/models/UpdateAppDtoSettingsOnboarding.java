// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsOnboarding şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsOnboarding {
    /**
     * Zorunlu.
     */
    @JsonProperty("step")
    private Long step;

    @JsonProperty("simulation")
    private Boolean simulation;

    @JsonProperty("completed_at")
    private String completedAt;

    @JsonProperty("version")
    private Long version;

    /**
     * Değerler: "ios", "android", "huawei", "web", "amazon", "windows", "email", "sms".
     */
    @JsonProperty("platforms")
    private java.util.List<String> platforms;

    /**
     * Değerler: "native", "flutter", "react-native", "expo", "kmp", "unity", "capacitor", "cordova", "maui".
     */
    @JsonProperty("framework")
    private String framework;

    /**
     * Değerler: "code", "wordpress".
     */
    @JsonProperty("web_integration")
    private String webIntegration;

    public Long getStep() {
        return step;
    }

    public UpdateAppDtoSettingsOnboarding step(Long step) {
        this.step = step;
        return this;
    }

    public Boolean getSimulation() {
        return simulation;
    }

    public UpdateAppDtoSettingsOnboarding simulation(Boolean simulation) {
        this.simulation = simulation;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public UpdateAppDtoSettingsOnboarding completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public UpdateAppDtoSettingsOnboarding version(Long version) {
        this.version = version;
        return this;
    }

    public java.util.List<String> getPlatforms() {
        return platforms;
    }

    public UpdateAppDtoSettingsOnboarding platforms(java.util.List<String> platforms) {
        this.platforms = platforms;
        return this;
    }

    public String getFramework() {
        return framework;
    }

    public UpdateAppDtoSettingsOnboarding framework(String framework) {
        this.framework = framework;
        return this;
    }

    public String getWebIntegration() {
        return webIntegration;
    }

    public UpdateAppDtoSettingsOnboarding webIntegration(String webIntegration) {
        this.webIntegration = webIntegration;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
