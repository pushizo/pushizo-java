// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationTagsResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationTagsResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("tags")
    private java.util.Map<String, Object> tags;

    public String getUserId() {
        return userId;
    }

    public ConversationTagsResult userId(String userId) {
        this.userId = userId;
        return this;
    }

    public java.util.Map<String, Object> getTags() {
        return tags;
    }

    public ConversationTagsResult tags(java.util.Map<String, Object> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
