// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationMessagePageDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationMessagePageDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "inbound", "outbound".
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("body")
    private String body;

    /**
     * Zorunlu.
     */
    @JsonProperty("content")
    private java.util.Map<String, Object> content;

    /**
     * Zorunlu.
     */
    @JsonProperty("message_id")
    private String messageId;

    /**
     * Zorunlu.
     */
    @JsonProperty("delivery_id")
    private String deliveryId;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent_by")
    private String sentBy;

    /**
     * Zorunlu.
     */
    @JsonProperty("error_code")
    private String errorCode;

    /**
     * Zorunlu.
     */
    @JsonProperty("read_at")
    private String readAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("seq")
    private Long seq;

    /**
     * Zorunlu.
     */
    @JsonProperty("sender_type")
    private String senderType;

    /**
     * Zorunlu.
     */
    @JsonProperty("client_message_id")
    private String clientMessageId;

    /**
     * Zorunlu.
     */
    @JsonProperty("attachments")
    private java.util.List<ConversationMessagePageDataItemAttachmentsItem> attachments;

    /**
     * Zorunlu.
     */
    @JsonProperty("quick_replies")
    private java.util.List<ConversationMessagePageDataItemQuickRepliesItem> quickReplies;

    public String getId() {
        return id;
    }

    public ConversationMessagePageDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public ConversationMessagePageDataItem direction(String direction) {
        this.direction = direction;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ConversationMessagePageDataItem status(String status) {
        this.status = status;
        return this;
    }

    public String getBody() {
        return body;
    }

    public ConversationMessagePageDataItem body(String body) {
        this.body = body;
        return this;
    }

    public java.util.Map<String, Object> getContent() {
        return content;
    }

    public ConversationMessagePageDataItem content(java.util.Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public String getMessageId() {
        return messageId;
    }

    public ConversationMessagePageDataItem messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public ConversationMessagePageDataItem deliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public String getSentBy() {
        return sentBy;
    }

    public ConversationMessagePageDataItem sentBy(String sentBy) {
        this.sentBy = sentBy;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public ConversationMessagePageDataItem errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getReadAt() {
        return readAt;
    }

    public ConversationMessagePageDataItem readAt(String readAt) {
        this.readAt = readAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ConversationMessagePageDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getSeq() {
        return seq;
    }

    public ConversationMessagePageDataItem seq(Long seq) {
        this.seq = seq;
        return this;
    }

    public String getSenderType() {
        return senderType;
    }

    public ConversationMessagePageDataItem senderType(String senderType) {
        this.senderType = senderType;
        return this;
    }

    public String getClientMessageId() {
        return clientMessageId;
    }

    public ConversationMessagePageDataItem clientMessageId(String clientMessageId) {
        this.clientMessageId = clientMessageId;
        return this;
    }

    public java.util.List<ConversationMessagePageDataItemAttachmentsItem> getAttachments() {
        return attachments;
    }

    public ConversationMessagePageDataItem attachments(java.util.List<ConversationMessagePageDataItemAttachmentsItem> attachments) {
        this.attachments = attachments;
        return this;
    }

    public java.util.List<ConversationMessagePageDataItemQuickRepliesItem> getQuickReplies() {
        return quickReplies;
    }

    public ConversationMessagePageDataItem quickReplies(java.util.List<ConversationMessagePageDataItemQuickRepliesItem> quickReplies) {
        this.quickReplies = quickReplies;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
