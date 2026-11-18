// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAdCampaignDtoCreative şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateAdCampaignDtoCreative {
    /**
     * Zorunlu.
     */
    @JsonProperty("headline")
    private String headline;

    @JsonProperty("long_headline")
    private String longHeadline;

    /**
     * Zorunlu.
     */
    @JsonProperty("primary_text")
    private String primaryText;

    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("link_url")
    private String linkUrl;

    /**
     * Zorunlu. Değerler: "LEARN_MORE", "SHOP_NOW", "SIGN_UP", "SUBSCRIBE", "DOWNLOAD", "CONTACT_US", "BOOK_NOW", "GET_OFFER".
     */
    @JsonProperty("call_to_action")
    private String callToAction;

    @JsonProperty("image_id")
    private String imageId;

    @JsonProperty("square_image_id")
    private String squareImageId;

    @JsonProperty("page_id")
    private String pageId;

    @JsonProperty("business_name")
    private String businessName;

    public String getHeadline() {
        return headline;
    }

    public CreateAdCampaignDtoCreative headline(String headline) {
        this.headline = headline;
        return this;
    }

    public String getLongHeadline() {
        return longHeadline;
    }

    public CreateAdCampaignDtoCreative longHeadline(String longHeadline) {
        this.longHeadline = longHeadline;
        return this;
    }

    public String getPrimaryText() {
        return primaryText;
    }

    public CreateAdCampaignDtoCreative primaryText(String primaryText) {
        this.primaryText = primaryText;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAdCampaignDtoCreative description(String description) {
        this.description = description;
        return this;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public CreateAdCampaignDtoCreative linkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public CreateAdCampaignDtoCreative callToAction(String callToAction) {
        this.callToAction = callToAction;
        return this;
    }

    public String getImageId() {
        return imageId;
    }

    public CreateAdCampaignDtoCreative imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getSquareImageId() {
        return squareImageId;
    }

    public CreateAdCampaignDtoCreative squareImageId(String squareImageId) {
        this.squareImageId = squareImageId;
        return this;
    }

    public String getPageId() {
        return pageId;
    }

    public CreateAdCampaignDtoCreative pageId(String pageId) {
        this.pageId = pageId;
        return this;
    }

    public String getBusinessName() {
        return businessName;
    }

    public CreateAdCampaignDtoCreative businessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
