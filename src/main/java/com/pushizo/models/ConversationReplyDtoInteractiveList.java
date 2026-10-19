// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationReplyDtoInteractiveList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationReplyDtoInteractiveList {
    /**
     * Zorunlu.
     */
    @JsonProperty("button")
    private String button;

    /**
     * Zorunlu.
     */
    @JsonProperty("sections")
    private java.util.List<ConversationReplyDtoInteractiveListSectionsItem> sections;

    public String getButton() {
        return button;
    }

    public ConversationReplyDtoInteractiveList button(String button) {
        this.button = button;
        return this;
    }

    public java.util.List<ConversationReplyDtoInteractiveListSectionsItem> getSections() {
        return sections;
    }

    public ConversationReplyDtoInteractiveList sections(java.util.List<ConversationReplyDtoInteractiveListSectionsItem> sections) {
        this.sections = sections;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
