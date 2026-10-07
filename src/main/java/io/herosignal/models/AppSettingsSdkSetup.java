// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsSdkSetup şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsSdkSetup {
    /**
     * Zorunlu.
     */
    @JsonProperty("version")
    private Long version;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * Zorunlu.
     */
    @JsonProperty("step")
    private String step;

    /**
     * Zorunlu.
     */
    @JsonProperty("furthest")
    private String furthest;

    @JsonProperty("variant")
    private String variant;

    @JsonProperty("detectedSubscriptionId")
    private String detectedSubscriptionId;

    @JsonProperty("testMessageId")
    private String testMessageId;

    @JsonProperty("completedAt")
    private String completedAt;

    public Long getVersion() {
        return version;
    }

    public AppSettingsSdkSetup version(Long version) {
        this.version = version;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public AppSettingsSdkSetup platform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getStep() {
        return step;
    }

    public AppSettingsSdkSetup step(String step) {
        this.step = step;
        return this;
    }

    public String getFurthest() {
        return furthest;
    }

    public AppSettingsSdkSetup furthest(String furthest) {
        this.furthest = furthest;
        return this;
    }

    public String getVariant() {
        return variant;
    }

    public AppSettingsSdkSetup variant(String variant) {
        this.variant = variant;
        return this;
    }

    public String getDetectedSubscriptionId() {
        return detectedSubscriptionId;
    }

    public AppSettingsSdkSetup detectedSubscriptionId(String detectedSubscriptionId) {
        this.detectedSubscriptionId = detectedSubscriptionId;
        return this;
    }

    public String getTestMessageId() {
        return testMessageId;
    }

    public AppSettingsSdkSetup testMessageId(String testMessageId) {
        this.testMessageId = testMessageId;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public AppSettingsSdkSetup completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
