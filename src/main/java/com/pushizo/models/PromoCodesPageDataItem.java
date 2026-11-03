// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PromoCodesPageDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PromoCodesPageDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("code")
    private String code;

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
    @JsonProperty("assigned_at")
    private String assignedAt;

    public String getCode() {
        return code;
    }

    public PromoCodesPageDataItem code(String code) {
        this.code = code;
        return this;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public PromoCodesPageDataItem deliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public String getMessageId() {
        return messageId;
    }

    public PromoCodesPageDataItem messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getAssignedAt() {
        return assignedAt;
    }

    public PromoCodesPageDataItem assignedAt(String assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
