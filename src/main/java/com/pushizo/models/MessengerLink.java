// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessengerLink şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessengerLink {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "telegram", "viber".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("token")
    private String token;

    /**
     * Zorunlu.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    public String getId() {
        return id;
    }

    public MessengerLink id(String id) {
        this.id = id;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public MessengerLink channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public MessengerLink userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MessengerLink url(String url) {
        this.url = url;
        return this;
    }

    public String getToken() {
        return token;
    }

    public MessengerLink token(String token) {
        this.token = token;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public MessengerLink expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
