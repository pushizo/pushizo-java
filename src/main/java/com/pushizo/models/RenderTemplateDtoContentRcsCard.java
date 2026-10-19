// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderTemplateDtoContentRcsCard şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderTemplateDtoContentRcsCard {
    @JsonProperty("title")
    private java.util.Map<String, String> title;

    @JsonProperty("description")
    private java.util.Map<String, String> description;

    @JsonProperty("media_url")
    private String mediaUrl;

    /**
     * Değerler: "SHORT", "MEDIUM", "TALL".
     */
    @JsonProperty("media_height")
    private String mediaHeight;

    /**
     * Değerler: "VERTICAL", "HORIZONTAL".
     */
    @JsonProperty("orientation")
    private String orientation;

    public java.util.Map<String, String> getTitle() {
        return title;
    }

    public RenderTemplateDtoContentRcsCard title(java.util.Map<String, String> title) {
        this.title = title;
        return this;
    }

    public java.util.Map<String, String> getDescription() {
        return description;
    }

    public RenderTemplateDtoContentRcsCard description(java.util.Map<String, String> description) {
        this.description = description;
        return this;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public RenderTemplateDtoContentRcsCard mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    public String getMediaHeight() {
        return mediaHeight;
    }

    public RenderTemplateDtoContentRcsCard mediaHeight(String mediaHeight) {
        this.mediaHeight = mediaHeight;
        return this;
    }

    public String getOrientation() {
        return orientation;
    }

    public RenderTemplateDtoContentRcsCard orientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
