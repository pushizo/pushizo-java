// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationMessagePageDataItemQuickRepliesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationMessagePageDataItemQuickRepliesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private String label;

    public String getId() {
        return id;
    }

    public ConversationMessagePageDataItemQuickRepliesItem id(String id) {
        this.id = id;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public ConversationMessagePageDataItemQuickRepliesItem label(String label) {
        this.label = label;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
