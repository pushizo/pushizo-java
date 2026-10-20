// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationActivityDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationActivityDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("actor_type")
    private String actorType;

    /**
     * Zorunlu.
     */
    @JsonProperty("actor_id")
    private String actorId;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.Map<String, Object> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public ConversationActivityDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public ConversationActivityDataItem type(String type) {
        this.type = type;
        return this;
    }

    public String getActorType() {
        return actorType;
    }

    public ConversationActivityDataItem actorType(String actorType) {
        this.actorType = actorType;
        return this;
    }

    public String getActorId() {
        return actorId;
    }

    public ConversationActivityDataItem actorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    public java.util.Map<String, Object> getData() {
        return data;
    }

    public ConversationActivityDataItem data(java.util.Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ConversationActivityDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
