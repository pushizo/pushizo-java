// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelValidation şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelValidation {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * Zorunlu. Değerler: "auth", "config", "transient".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Zorunlu.
     */
    @JsonProperty("message")
    private String message;

    /**
     * Zorunlu.
     */
    @JsonProperty("details")
    private java.util.Map<String, Object> details;

    /**
     * Zorunlu.
     */
    @JsonProperty("channel")
    private ChannelConfig channel;

    public Boolean getOk() {
        return ok;
    }

    public ChannelValidation ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public ChannelValidation kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ChannelValidation code(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ChannelValidation message(String message) {
        this.message = message;
        return this;
    }

    public java.util.Map<String, Object> getDetails() {
        return details;
    }

    public ChannelValidation details(java.util.Map<String, Object> details) {
        this.details = details;
        return this;
    }

    public ChannelConfig getChannel() {
        return channel;
    }

    public ChannelValidation channel(ChannelConfig channel) {
        this.channel = channel;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
