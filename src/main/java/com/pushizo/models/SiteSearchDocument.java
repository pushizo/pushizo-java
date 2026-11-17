// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchDocument şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchDocument {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Zorunlu.
     */
    @JsonProperty("source_id")
    private String sourceId;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    /**
     * Zorunlu.
     */
    @JsonProperty("chunks")
    private Long chunks;

    /**
     * Zorunlu.
     */
    @JsonProperty("chars")
    private Long chars;

    /**
     * Zorunlu.
     */
    @JsonProperty("indexed_at")
    private String indexedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public SiteSearchDocument id(String id) {
        this.id = id;
        return this;
    }

    public String getKey() {
        return key;
    }

    public SiteSearchDocument key(String key) {
        this.key = key;
        return this;
    }

    public String getSourceId() {
        return sourceId;
    }

    public SiteSearchDocument sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SiteSearchDocument url(String url) {
        this.url = url;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SiteSearchDocument title(String title) {
        this.title = title;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public SiteSearchDocument language(String language) {
        this.language = language;
        return this;
    }

    public Long getChunks() {
        return chunks;
    }

    public SiteSearchDocument chunks(Long chunks) {
        this.chunks = chunks;
        return this;
    }

    public Long getChars() {
        return chars;
    }

    public SiteSearchDocument chars(Long chars) {
        this.chars = chars;
        return this;
    }

    public String getIndexedAt() {
        return indexedAt;
    }

    public SiteSearchDocument indexedAt(String indexedAt) {
        this.indexedAt = indexedAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public SiteSearchDocument createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
