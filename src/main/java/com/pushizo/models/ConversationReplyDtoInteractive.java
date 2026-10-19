// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationReplyDtoInteractive şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationReplyDtoInteractive {
    /**
     * Zorunlu. Değerler: "button", "list".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("header")
    private String header;

    @JsonProperty("footer")
    private String footer;

    @JsonProperty("buttons")
    private java.util.List<ConversationReplyDtoInteractiveButtonsItem> buttons;

    @JsonProperty("list")
    private ConversationReplyDtoInteractiveList list;

    public String getType() {
        return type;
    }

    public ConversationReplyDtoInteractive type(String type) {
        this.type = type;
        return this;
    }

    public String getHeader() {
        return header;
    }

    public ConversationReplyDtoInteractive header(String header) {
        this.header = header;
        return this;
    }

    public String getFooter() {
        return footer;
    }

    public ConversationReplyDtoInteractive footer(String footer) {
        this.footer = footer;
        return this;
    }

    public java.util.List<ConversationReplyDtoInteractiveButtonsItem> getButtons() {
        return buttons;
    }

    public ConversationReplyDtoInteractive buttons(java.util.List<ConversationReplyDtoInteractiveButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    public ConversationReplyDtoInteractiveList getList() {
        return list;
    }

    public ConversationReplyDtoInteractive list(ConversationReplyDtoInteractiveList list) {
        this.list = list;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
