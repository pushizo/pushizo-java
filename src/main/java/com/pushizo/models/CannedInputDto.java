// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CannedInputDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CannedInputDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("shortcut")
    private String shortcut;

    /**
     * Zorunlu.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Zorunlu.
     */
    @JsonProperty("body")
    private String body;

    @JsonProperty("language")
    private String language;

    public String getShortcut() {
        return shortcut;
    }

    public CannedInputDto shortcut(String shortcut) {
        this.shortcut = shortcut;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CannedInputDto title(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public CannedInputDto body(String body) {
        this.body = body;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public CannedInputDto language(String language) {
        this.language = language;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
