// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTemplateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateTemplateDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channel")
    private String channel;

    @JsonProperty("tags")
    private java.util.List<String> tags;

    /**
     * Zorunlu.
     */
    @JsonProperty("content")
    private CreateTemplateDtoContent content;

    public String getName() {
        return name;
    }

    public CreateTemplateDto name(String name) {
        this.name = name;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public CreateTemplateDto channel(String channel) {
        this.channel = channel;
        return this;
    }

    public java.util.List<String> getTags() {
        return tags;
    }

    public CreateTemplateDto tags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateTemplateDtoContent getContent() {
        return content;
    }

    public CreateTemplateDto content(CreateTemplateDtoContent content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
