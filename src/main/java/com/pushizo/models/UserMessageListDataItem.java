// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserMessageListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserMessageListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("delivery_id")
    private String deliveryId;

    /**
     * Zorunlu.
     */
    @JsonProperty("message_id")
    private String messageId;

    /**
     * Zorunlu.
     */
    @JsonProperty("campaign_id")
    private String campaignId;

    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private String status;

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
    @JsonProperty("error_code")
    private String errorCode;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent_at")
    private String sentAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("delivered_at")
    private String deliveredAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("opened_at")
    private String openedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicked_at")
    private String clickedAt;

    public String getDeliveryId() {
        return deliveryId;
    }

    public UserMessageListDataItem deliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public String getMessageId() {
        return messageId;
    }

    public UserMessageListDataItem messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public UserMessageListDataItem campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public String getSource() {
        return source;
    }

    public UserMessageListDataItem source(String source) {
        this.source = source;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public UserMessageListDataItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserMessageListDataItem status(String status) {
        this.status = status;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public UserMessageListDataItem title(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public UserMessageListDataItem body(String body) {
        this.body = body;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public UserMessageListDataItem errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public UserMessageListDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getSentAt() {
        return sentAt;
    }

    public UserMessageListDataItem sentAt(String sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    public String getDeliveredAt() {
        return deliveredAt;
    }

    public UserMessageListDataItem deliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
        return this;
    }

    public String getOpenedAt() {
        return openedAt;
    }

    public UserMessageListDataItem openedAt(String openedAt) {
        this.openedAt = openedAt;
        return this;
    }

    public String getClickedAt() {
        return clickedAt;
    }

    public UserMessageListDataItem clickedAt(String clickedAt) {
        this.clickedAt = clickedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
