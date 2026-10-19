// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTemplateDtoContentButtonsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateTemplateDtoContentButtonsItem {
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

    public UpdateTemplateDtoContentButtonsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public UpdateTemplateDtoContentButtonsItem text(String text) {
        this.text = text;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public UpdateTemplateDtoContentButtonsItem icon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public UpdateTemplateDtoContentButtonsItem url(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
