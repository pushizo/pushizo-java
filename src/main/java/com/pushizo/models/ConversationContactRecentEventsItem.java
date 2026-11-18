// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationContactRecentEventsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationContactRecentEventsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("occurred_at")
    private String occurredAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    public String getName() {
        return name;
    }

    public ConversationContactRecentEventsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getOccurredAt() {
        return occurredAt;
    }

    public ConversationContactRecentEventsItem occurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public ConversationContactRecentEventsItem properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
