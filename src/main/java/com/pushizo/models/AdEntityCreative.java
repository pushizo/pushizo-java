// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdEntityCreative şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdEntityCreative {
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
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("link_url")
    private String linkUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("image_url")
    private String imageUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("call_to_action")
    private String callToAction;

    public String getTitle() {
        return title;
    }

    public AdEntityCreative title(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public AdEntityCreative body(String body) {
        this.body = body;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AdEntityCreative description(String description) {
        this.description = description;
        return this;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public AdEntityCreative linkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AdEntityCreative imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public AdEntityCreative callToAction(String callToAction) {
        this.callToAction = callToAction;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
