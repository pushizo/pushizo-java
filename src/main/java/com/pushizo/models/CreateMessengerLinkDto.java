// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateMessengerLinkDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateMessengerLinkDto {
    /**
     * Zorunlu. Değerler: "telegram", "viber".
     */
    @JsonProperty("channel")
    private String channel;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("ttl_seconds")
    private Long ttlSeconds;

    public String getChannel() {
        return channel;
    }

    public CreateMessengerLinkDto channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CreateMessengerLinkDto userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public CreateMessengerLinkDto externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public Long getTtlSeconds() {
        return ttlSeconds;
    }

    public CreateMessengerLinkDto ttlSeconds(Long ttlSeconds) {
        this.ttlSeconds = ttlSeconds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
