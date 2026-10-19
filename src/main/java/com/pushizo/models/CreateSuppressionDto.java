// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateSuppressionDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateSuppressionDto {
    /**
     * Zorunlu. Değerler: "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    /**
     * Değerler: "manual", "bounce", "complaint", "unsubscribe_link", "stop".
     */
    @JsonProperty("reason")
    private String reason;

    @JsonProperty("expires_at")
    private String expiresAt;

    @JsonProperty("note")
    private String note;

    public String getChannel() {
        return channel;
    }

    public CreateSuppressionDto channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getValue() {
        return value;
    }

    public CreateSuppressionDto value(String value) {
        this.value = value;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public CreateSuppressionDto reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public CreateSuppressionDto expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public String getNote() {
        return note;
    }

    public CreateSuppressionDto note(String note) {
        this.note = note;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
