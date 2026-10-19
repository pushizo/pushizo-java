// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Segment şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Segment {
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
     * Zorunlu.
     */
    @JsonProperty("definition")
    private java.util.Map<String, Object> definition;

    /**
     * Zorunlu.
     */
    @JsonProperty("is_dynamic")
    private Boolean isDynamic;

    /**
     * Zorunlu.
     */
    @JsonProperty("estimated_count")
    private Long estimatedCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("estimated_at")
    private String estimatedAt;

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

    public String getId() {
        return id;
    }

    public Segment id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Segment appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Segment name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Segment description(String description) {
        this.description = description;
        return this;
    }

    public java.util.Map<String, Object> getDefinition() {
        return definition;
    }

    public Segment definition(java.util.Map<String, Object> definition) {
        this.definition = definition;
        return this;
    }

    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public Segment isDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    public Long getEstimatedCount() {
        return estimatedCount;
    }

    public Segment estimatedCount(Long estimatedCount) {
        this.estimatedCount = estimatedCount;
        return this;
    }

    public String getEstimatedAt() {
        return estimatedAt;
    }

    public Segment estimatedAt(String estimatedAt) {
        this.estimatedAt = estimatedAt;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Segment createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Segment createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Segment updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
