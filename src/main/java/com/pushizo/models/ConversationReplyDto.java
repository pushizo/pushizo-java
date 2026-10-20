// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationReplyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationReplyDto {
    @JsonProperty("text")
    private String text;

    @JsonProperty("template")
    private ConversationReplyDtoTemplate template;

    @JsonProperty("media")
    private ConversationReplyDtoMedia media;

    @JsonProperty("interactive")
    private ConversationReplyDtoInteractive interactive;

    @JsonProperty("client_message_id")
    private String clientMessageId;

    /**
     * Değerler: "manual", "canned", "ai_suggestion".
     */
    @JsonProperty("source")
    private String source;

    public String getText() {
        return text;
    }

    public ConversationReplyDto text(String text) {
        this.text = text;
        return this;
    }

    public ConversationReplyDtoTemplate getTemplate() {
        return template;
    }

    public ConversationReplyDto template(ConversationReplyDtoTemplate template) {
        this.template = template;
        return this;
    }

    public ConversationReplyDtoMedia getMedia() {
        return media;
    }

    public ConversationReplyDto media(ConversationReplyDtoMedia media) {
        this.media = media;
        return this;
    }

    public ConversationReplyDtoInteractive getInteractive() {
        return interactive;
    }

    public ConversationReplyDto interactive(ConversationReplyDtoInteractive interactive) {
        this.interactive = interactive;
        return this;
    }

    public String getClientMessageId() {
        return clientMessageId;
    }

    public ConversationReplyDto clientMessageId(String clientMessageId) {
        this.clientMessageId = clientMessageId;
        return this;
    }

    public String getSource() {
        return source;
    }

    public ConversationReplyDto source(String source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
