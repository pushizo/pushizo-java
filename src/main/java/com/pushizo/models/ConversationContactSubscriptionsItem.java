// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationContactSubscriptionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationContactSubscriptionsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("token_masked")
    private String tokenMasked;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public ConversationContactSubscriptionsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public ConversationContactSubscriptionsItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ConversationContactSubscriptionsItem status(String status) {
        this.status = status;
        return this;
    }

    public String getTokenMasked() {
        return tokenMasked;
    }

    public ConversationContactSubscriptionsItem tokenMasked(String tokenMasked) {
        this.tokenMasked = tokenMasked;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ConversationContactSubscriptionsItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
