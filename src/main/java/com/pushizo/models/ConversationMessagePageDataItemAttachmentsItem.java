// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationMessagePageDataItemAttachmentsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationMessagePageDataItemAttachmentsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("size")
    private Long size;

    public String getId() {
        return id;
    }

    public ConversationMessagePageDataItemAttachmentsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ConversationMessagePageDataItemAttachmentsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public ConversationMessagePageDataItemAttachmentsItem type(String type) {
        this.type = type;
        return this;
    }

    public Long getSize() {
        return size;
    }

    public ConversationMessagePageDataItemAttachmentsItem size(Long size) {
        this.size = size;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
