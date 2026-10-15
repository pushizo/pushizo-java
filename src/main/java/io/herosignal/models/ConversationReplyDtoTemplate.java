// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationReplyDtoTemplate şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationReplyDtoTemplate {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    @JsonProperty("header")
    private Object header;

    @JsonProperty("body_params")
    private java.util.List<String> bodyParams;

    @JsonProperty("button_params")
    private java.util.List<ConversationReplyDtoTemplateButtonParamsItem> buttonParams;

    public String getName() {
        return name;
    }

    public ConversationReplyDtoTemplate name(String name) {
        this.name = name;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public ConversationReplyDtoTemplate language(String language) {
        this.language = language;
        return this;
    }

    public Object getHeader() {
        return header;
    }

    public ConversationReplyDtoTemplate header(Object header) {
        this.header = header;
        return this;
    }

    public java.util.List<String> getBodyParams() {
        return bodyParams;
    }

    public ConversationReplyDtoTemplate bodyParams(java.util.List<String> bodyParams) {
        this.bodyParams = bodyParams;
        return this;
    }

    public java.util.List<ConversationReplyDtoTemplateButtonParamsItem> getButtonParams() {
        return buttonParams;
    }

    public ConversationReplyDtoTemplate buttonParams(java.util.List<ConversationReplyDtoTemplateButtonParamsItem> buttonParams) {
        this.buttonParams = buttonParams;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
