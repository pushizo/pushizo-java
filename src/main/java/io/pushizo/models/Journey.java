// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Journey şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Journey {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu. Değerler: "draft", "active", "paused", "archived".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("current_version")
    private Long currentVersion;

    /**
     * Zorunlu.
     */
    @JsonProperty("draft_version")
    private Long draftVersion;

    /**
     * Zorunlu.
     */
    @JsonProperty("trigger_kind")
    private String triggerKind;

    /**
     * Zorunlu.
     */
    @JsonProperty("published_at")
    private String publishedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_by")
    private String createdBy;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("summary")
    private JourneySummary summary;

    public String getId() {
        return id;
    }

    public Journey id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Journey appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Journey name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Journey description(String description) {
        this.description = description;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Journey status(String status) {
        this.status = status;
        return this;
    }

    public Long getCurrentVersion() {
        return currentVersion;
    }

    public Journey currentVersion(Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public Long getDraftVersion() {
        return draftVersion;
    }

    public Journey draftVersion(Long draftVersion) {
        this.draftVersion = draftVersion;
        return this;
    }

    public String getTriggerKind() {
        return triggerKind;
    }

    public Journey triggerKind(String triggerKind) {
        this.triggerKind = triggerKind;
        return this;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public Journey publishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Journey createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Journey createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Journey updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public JourneySummary getSummary() {
        return summary;
    }

    public Journey summary(JourneySummary summary) {
        this.summary = summary;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
