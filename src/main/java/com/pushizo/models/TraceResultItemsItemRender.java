// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TraceResultItemsItemRender şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TraceResultItemsItemRender {
    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

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
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("image_url")
    private String imageUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("buttons")
    private java.util.List<String> buttons;

    /**
     * Zorunlu.
     */
    @JsonProperty("hash")
    private String hash;

    /**
     * Zorunlu.
     */
    @JsonProperty("matches_sent")
    private Boolean matchesSent;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    public String getLanguage() {
        return language;
    }

    public TraceResultItemsItemRender language(String language) {
        this.language = language;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public TraceResultItemsItemRender title(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public TraceResultItemsItemRender body(String body) {
        this.body = body;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public TraceResultItemsItemRender url(String url) {
        this.url = url;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public TraceResultItemsItemRender imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public java.util.List<String> getButtons() {
        return buttons;
    }

    public TraceResultItemsItemRender buttons(java.util.List<String> buttons) {
        this.buttons = buttons;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public TraceResultItemsItemRender hash(String hash) {
        this.hash = hash;
        return this;
    }

    public Boolean getMatchesSent() {
        return matchesSent;
    }

    public TraceResultItemsItemRender matchesSent(Boolean matchesSent) {
        this.matchesSent = matchesSent;
        return this;
    }

    public String getError() {
        return error;
    }

    public TraceResultItemsItemRender error(String error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
