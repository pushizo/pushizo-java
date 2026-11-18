// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdCreative şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdCreative {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * Zorunlu.
     */
    @JsonProperty("content_type")
    private String contentType;

    /**
     * Zorunlu.
     */
    @JsonProperty("bytes")
    private Long bytes;

    /**
     * Zorunlu.
     */
    @JsonProperty("width")
    private Long width;

    /**
     * Zorunlu.
     */
    @JsonProperty("height")
    private Long height;

    /**
     * Zorunlu.
     */
    @JsonProperty("preview_url")
    private String previewUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public AdCreative id(String id) {
        this.id = id;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public AdCreative fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public AdCreative contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public Long getBytes() {
        return bytes;
    }

    public AdCreative bytes(Long bytes) {
        this.bytes = bytes;
        return this;
    }

    public Long getWidth() {
        return width;
    }

    public AdCreative width(Long width) {
        this.width = width;
        return this;
    }

    public Long getHeight() {
        return height;
    }

    public AdCreative height(Long height) {
        this.height = height;
        return this;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public AdCreative previewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AdCreative createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
