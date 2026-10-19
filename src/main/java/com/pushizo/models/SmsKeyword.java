// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SmsKeyword şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SmsKeyword {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("keyword")
    private String keyword;

    /**
     * Zorunlu. Değerler: "org", "app".
     */
    @JsonProperty("scope")
    private String scope;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu. Değerler: "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    /**
     * Zorunlu.
     */
    @JsonProperty("actions")
    private java.util.Map<String, Object> actions;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

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

    public SmsKeyword id(String id) {
        this.id = id;
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public SmsKeyword keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public SmsKeyword scope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public SmsKeyword appId(String appId) {
        this.appId = appId;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public SmsKeyword channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public java.util.Map<String, Object> getActions() {
        return actions;
    }

    public SmsKeyword actions(java.util.Map<String, Object> actions) {
        this.actions = actions;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public SmsKeyword enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SmsKeyword description(String description) {
        this.description = description;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public SmsKeyword createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public SmsKeyword updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
