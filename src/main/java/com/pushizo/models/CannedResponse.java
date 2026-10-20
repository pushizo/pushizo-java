// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CannedResponse şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CannedResponse {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public CannedResponse id(String id) {
        this.id = id;
        return this;
    }

    public String getShortcut() {
        return shortcut;
    }

    public CannedResponse shortcut(String shortcut) {
        this.shortcut = shortcut;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CannedResponse title(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public CannedResponse body(String body) {
        this.body = body;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public CannedResponse language(String language) {
        this.language = language;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public CannedResponse createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public CannedResponse updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
