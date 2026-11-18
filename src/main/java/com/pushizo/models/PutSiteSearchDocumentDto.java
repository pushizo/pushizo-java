// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutSiteSearchDocumentDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PutSiteSearchDocumentDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    @JsonProperty("title")
    private String title;

    @JsonProperty("content")
    private String content;

    @JsonProperty("html")
    private String html;

    @JsonProperty("language")
    private String language;

    public String getUrl() {
        return url;
    }

    public PutSiteSearchDocumentDto url(String url) {
        this.url = url;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PutSiteSearchDocumentDto title(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public PutSiteSearchDocumentDto content(String content) {
        this.content = content;
        return this;
    }

    public String getHtml() {
        return html;
    }

    public PutSiteSearchDocumentDto html(String html) {
        this.html = html;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public PutSiteSearchDocumentDto language(String language) {
        this.language = language;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
