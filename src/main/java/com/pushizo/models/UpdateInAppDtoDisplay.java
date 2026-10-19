// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInAppDtoDisplay şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateInAppDtoDisplay {
    /**
     * Zorunlu. Değerler: "modal", "banner_top", "banner_bottom", "fullscreen".
     */
    @JsonProperty("layout")
    private String layout;

    @JsonProperty("background_color")
    private String backgroundColor;

    @JsonProperty("text_color")
    private String textColor;

    @JsonProperty("dismissible")
    private Boolean dismissible;

    @JsonProperty("auto_dismiss_seconds")
    private Long autoDismissSeconds;

    /**
     * Değerler: "blocks", "html".
     */
    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("html")
    private java.util.Map<String, String> html;

    @JsonProperty("html_height")
    private Long htmlHeight;

    /**
     * Zorunlu.
     */
    @JsonProperty("blocks")
    private java.util.List<Object> blocks;

    public String getLayout() {
        return layout;
    }

    public UpdateInAppDtoDisplay layout(String layout) {
        this.layout = layout;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public UpdateInAppDtoDisplay backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getTextColor() {
        return textColor;
    }

    public UpdateInAppDtoDisplay textColor(String textColor) {
        this.textColor = textColor;
        return this;
    }

    public Boolean getDismissible() {
        return dismissible;
    }

    public UpdateInAppDtoDisplay dismissible(Boolean dismissible) {
        this.dismissible = dismissible;
        return this;
    }

    public Long getAutoDismissSeconds() {
        return autoDismissSeconds;
    }

    public UpdateInAppDtoDisplay autoDismissSeconds(Long autoDismissSeconds) {
        this.autoDismissSeconds = autoDismissSeconds;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public UpdateInAppDtoDisplay contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public java.util.Map<String, String> getHtml() {
        return html;
    }

    public UpdateInAppDtoDisplay html(java.util.Map<String, String> html) {
        this.html = html;
        return this;
    }

    public Long getHtmlHeight() {
        return htmlHeight;
    }

    public UpdateInAppDtoDisplay htmlHeight(Long htmlHeight) {
        this.htmlHeight = htmlHeight;
        return this;
    }

    public java.util.List<Object> getBlocks() {
        return blocks;
    }

    public UpdateInAppDtoDisplay blocks(java.util.List<Object> blocks) {
        this.blocks = blocks;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
