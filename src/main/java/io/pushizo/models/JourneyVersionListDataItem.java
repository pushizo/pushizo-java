// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyVersionListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyVersionListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("version")
    private Long version;

    /**
     * Zorunlu.
     */
    @JsonProperty("graph")
    private java.util.Map<String, Object> graph;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private java.util.Map<String, Object> settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("published_at")
    private String publishedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("published_by")
    private String publishedBy;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public Long getVersion() {
        return version;
    }

    public JourneyVersionListDataItem version(Long version) {
        this.version = version;
        return this;
    }

    public java.util.Map<String, Object> getGraph() {
        return graph;
    }

    public JourneyVersionListDataItem graph(java.util.Map<String, Object> graph) {
        this.graph = graph;
        return this;
    }

    public java.util.Map<String, Object> getSettings() {
        return settings;
    }

    public JourneyVersionListDataItem settings(java.util.Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public JourneyVersionListDataItem publishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public JourneyVersionListDataItem publishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public JourneyVersionListDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public JourneyVersionListDataItem updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
