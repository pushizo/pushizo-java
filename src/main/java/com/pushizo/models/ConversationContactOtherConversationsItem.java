// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationContactOtherConversationsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationContactOtherConversationsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "sms", "whatsapp", "rcs", "telegram", "viber", "email", "chat".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu. Değerler: "open", "pending", "resolved", "closed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_message_at")
    private String lastMessageAt;

    public String getId() {
        return id;
    }

    public ConversationContactOtherConversationsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public ConversationContactOtherConversationsItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ConversationContactOtherConversationsItem status(String status) {
        this.status = status;
        return this;
    }

    public String getLastMessageAt() {
        return lastMessageAt;
    }

    public ConversationContactOtherConversationsItem lastMessageAt(String lastMessageAt) {
        this.lastMessageAt = lastMessageAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
