// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationReplyResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationReplyResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("message_id")
    private String messageId;

    /**
     * Zorunlu.
     */
    @JsonProperty("conversation_message")
    private ConversationReplyResultConversationMessage conversationMessage;

    public String getMessageId() {
        return messageId;
    }

    public ConversationReplyResult messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public ConversationReplyResultConversationMessage getConversationMessage() {
        return conversationMessage;
    }

    public ConversationReplyResult conversationMessage(ConversationReplyResultConversationMessage conversationMessage) {
        this.conversationMessage = conversationMessage;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
