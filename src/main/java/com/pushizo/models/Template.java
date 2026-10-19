// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Template şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Template {
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
     * Zorunlu. Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("current_version")
    private Long currentVersion;

    /**
     * Zorunlu.
     */
    @JsonProperty("tags")
    private java.util.List<String> tags;

    /**
     * Zorunlu.
     */
    @JsonProperty("content")
    private java.util.Map<String, Object> content;

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

    public Template id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Template appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Template name(String name) {
        this.name = name;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public Template channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Long getCurrentVersion() {
        return currentVersion;
    }

    public Template currentVersion(Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public java.util.List<String> getTags() {
        return tags;
    }

    public Template tags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.Map<String, Object> getContent() {
        return content;
    }

    public Template content(java.util.Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Template createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Template createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Template updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
