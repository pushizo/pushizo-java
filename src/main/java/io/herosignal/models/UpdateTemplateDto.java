// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTemplateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateTemplateDto {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "ios_push", "android_push", "web_push", "email", "sms".
     */
    @JsonProperty("channel")
    private String channel;

    @JsonProperty("tags")
    private java.util.List<String> tags;

    @JsonProperty("content")
    private UpdateTemplateDtoContent content;

    public String getName() {
        return name;
    }

    public UpdateTemplateDto name(String name) {
        this.name = name;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public UpdateTemplateDto channel(String channel) {
        this.channel = channel;
        return this;
    }

    public java.util.List<String> getTags() {
        return tags;
    }

    public UpdateTemplateDto tags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateTemplateDtoContent getContent() {
        return content;
    }

    public UpdateTemplateDto content(UpdateTemplateDtoContent content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
