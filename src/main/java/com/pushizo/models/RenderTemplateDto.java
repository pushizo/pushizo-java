// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderTemplateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderTemplateDto {
    /**
     * Değerler: "ios_push", "android_push", "hms_push", "adm_push", "wns_push", "web_push", "email", "sms", "whatsapp", "rcs", "telegram", "viber".
     */
    @JsonProperty("channel")
    private String channel;

    @JsonProperty("language")
    private String language;

    @JsonProperty("user")
    private RenderTemplateDtoUser user;

    @JsonProperty("custom_data")
    private java.util.Map<String, Object> customData;

    @JsonProperty("content")
    private RenderTemplateDtoContent content;

    @JsonProperty("version")
    private Long version;

    public String getChannel() {
        return channel;
    }

    public RenderTemplateDto channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public RenderTemplateDto language(String language) {
        this.language = language;
        return this;
    }

    public RenderTemplateDtoUser getUser() {
        return user;
    }

    public RenderTemplateDto user(RenderTemplateDtoUser user) {
        this.user = user;
        return this;
    }

    public java.util.Map<String, Object> getCustomData() {
        return customData;
    }

    public RenderTemplateDto customData(java.util.Map<String, Object> customData) {
        this.customData = customData;
        return this;
    }

    public RenderTemplateDtoContent getContent() {
        return content;
    }

    public RenderTemplateDto content(RenderTemplateDtoContent content) {
        this.content = content;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public RenderTemplateDto version(Long version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
