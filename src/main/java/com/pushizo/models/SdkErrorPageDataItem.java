// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SdkErrorPageDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SdkErrorPageDataItem {
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
     * Zorunlu.
     */
    @JsonProperty("subscription_id")
    private String subscriptionId;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * Zorunlu.
     */
    @JsonProperty("sdk_version")
    private String sdkVersion;

    /**
     * Zorunlu.
     */
    @JsonProperty("level")
    private String level;

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
    @JsonProperty("context")
    private java.util.Map<String, Object> context;

    /**
     * Zorunlu.
     */
    @JsonProperty("occurred_at")
    private String occurredAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public SdkErrorPageDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public SdkErrorPageDataItem appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public SdkErrorPageDataItem subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public SdkErrorPageDataItem platform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public SdkErrorPageDataItem sdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public SdkErrorPageDataItem level(String level) {
        this.level = level;
        return this;
    }

    public String getCode() {
        return code;
    }

    public SdkErrorPageDataItem code(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public SdkErrorPageDataItem message(String message) {
        this.message = message;
        return this;
    }

    public java.util.Map<String, Object> getContext() {
        return context;
    }

    public SdkErrorPageDataItem context(java.util.Map<String, Object> context) {
        this.context = context;
        return this;
    }

    public String getOccurredAt() {
        return occurredAt;
    }

    public SdkErrorPageDataItem occurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public SdkErrorPageDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
