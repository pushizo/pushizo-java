// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderTemplateDtoContentButtonsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderTemplateDtoContentButtonsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("text")
    private String text;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("url")
    private String url;

    public String getId() {
        return id;
    }

    public RenderTemplateDtoContentButtonsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public RenderTemplateDtoContentButtonsItem text(String text) {
        this.text = text;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public RenderTemplateDtoContentButtonsItem icon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RenderTemplateDtoContentButtonsItem url(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
