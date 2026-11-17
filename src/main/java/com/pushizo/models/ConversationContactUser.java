// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationContactUser şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationContactUser {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("tags")
    private java.util.Map<String, Object> tags;

    /**
     * Zorunlu.
     */
    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    /**
     * Zorunlu.
     */
    @JsonProperty("timezone")
    private String timezone;

    /**
     * Zorunlu.
     */
    @JsonProperty("country")
    private String country;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_seen_at")
    private String lastSeenAt;

    public String getId() {
        return id;
    }

    public ConversationContactUser id(String id) {
        this.id = id;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public ConversationContactUser externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public java.util.Map<String, Object> getTags() {
        return tags;
    }

    public ConversationContactUser tags(java.util.Map<String, Object> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public ConversationContactUser properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public ConversationContactUser language(String language) {
        this.language = language;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public ConversationContactUser timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public ConversationContactUser country(String country) {
        this.country = country;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ConversationContactUser createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getLastSeenAt() {
        return lastSeenAt;
    }

    public ConversationContactUser lastSeenAt(String lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
