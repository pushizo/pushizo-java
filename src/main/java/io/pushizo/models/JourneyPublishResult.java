// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyPublishResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyPublishResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("journey")
    private Journey journey;

    /**
     * Zorunlu.
     */
    @JsonProperty("version")
    private Long version;

    /**
     * Zorunlu.
     */
    @JsonProperty("issues")
    private java.util.List<JourneyPublishResultIssuesItem> issues;

    public Journey getJourney() {
        return journey;
    }

    public JourneyPublishResult journey(Journey journey) {
        this.journey = journey;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public JourneyPublishResult version(Long version) {
        this.version = version;
        return this;
    }

    public java.util.List<JourneyPublishResultIssuesItem> getIssues() {
        return issues;
    }

    public JourneyPublishResult issues(java.util.List<JourneyPublishResultIssuesItem> issues) {
        this.issues = issues;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
