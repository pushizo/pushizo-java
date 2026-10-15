// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Suppression şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Suppression {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu. Değerler: "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("value_masked")
    private String valueMasked;

    /**
     * Zorunlu. Değerler: "bounce", "complaint", "manual", "unsubscribe_link", "stop".
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("detail")
    private java.util.Map<String, Object> detail;

    /**
     * Zorunlu.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public Suppression id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Suppression appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public Suppression channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getValueMasked() {
        return valueMasked;
    }

    public Suppression valueMasked(String valueMasked) {
        this.valueMasked = valueMasked;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public Suppression reason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getSource() {
        return source;
    }

    public Suppression source(String source) {
        this.source = source;
        return this;
    }

    public java.util.Map<String, Object> getDetail() {
        return detail;
    }

    public Suppression detail(java.util.Map<String, Object> detail) {
        this.detail = detail;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public Suppression expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Suppression createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Suppression updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
