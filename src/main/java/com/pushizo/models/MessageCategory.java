// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessageCategory şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessageCategory {
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
    @JsonProperty("key")
    private String key;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private java.util.Map<String, String> name;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private java.util.Map<String, String> description;

    /**
     * Zorunlu.
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    /**
     * Zorunlu.
     */
    @JsonProperty("default_opted_in")
    private Boolean defaultOptedIn;

    /**
     * Zorunlu.
     */
    @JsonProperty("position")
    private Long position;

    /**
     * Zorunlu.
     */
    @JsonProperty("opted_out_users")
    private Long optedOutUsers;

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

    public MessageCategory id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public MessageCategory appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getKey() {
        return key;
    }

    public MessageCategory key(String key) {
        this.key = key;
        return this;
    }

    public java.util.Map<String, String> getName() {
        return name;
    }

    public MessageCategory name(java.util.Map<String, String> name) {
        this.name = name;
        return this;
    }

    public java.util.Map<String, String> getDescription() {
        return description;
    }

    public MessageCategory description(java.util.Map<String, String> description) {
        this.description = description;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public MessageCategory channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public Boolean getDefaultOptedIn() {
        return defaultOptedIn;
    }

    public MessageCategory defaultOptedIn(Boolean defaultOptedIn) {
        this.defaultOptedIn = defaultOptedIn;
        return this;
    }

    public Long getPosition() {
        return position;
    }

    public MessageCategory position(Long position) {
        this.position = position;
        return this;
    }

    public Long getOptedOutUsers() {
        return optedOutUsers;
    }

    public MessageCategory optedOutUsers(Long optedOutUsers) {
        this.optedOutUsers = optedOutUsers;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public MessageCategory createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public MessageCategory updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
