// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class User {
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
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    /**
     * Zorunlu.
     */
    @JsonProperty("tags")
    private java.util.Map<String, String> tags;

    /**
     * Zorunlu.
     */
    @JsonProperty("first_seen_at")
    private String firstSeenAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_active_at")
    private String lastActiveAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("session_count")
    private Long sessionCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("usage_seconds")
    private Long usageSeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("merged_into")
    private String mergedInto;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("subscription_count")
    private Long subscriptionCount;

    /**
     * Zorunlu. Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    public String getId() {
        return id;
    }

    public User id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public User appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public User externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public User properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    public User tags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public String getFirstSeenAt() {
        return firstSeenAt;
    }

    public User firstSeenAt(String firstSeenAt) {
        this.firstSeenAt = firstSeenAt;
        return this;
    }

    public String getLastActiveAt() {
        return lastActiveAt;
    }

    public User lastActiveAt(String lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
        return this;
    }

    public Long getSessionCount() {
        return sessionCount;
    }

    public User sessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    public Long getUsageSeconds() {
        return usageSeconds;
    }

    public User usageSeconds(Long usageSeconds) {
        this.usageSeconds = usageSeconds;
        return this;
    }

    public String getMergedInto() {
        return mergedInto;
    }

    public User mergedInto(String mergedInto) {
        this.mergedInto = mergedInto;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public User createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public User updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getSubscriptionCount() {
        return subscriptionCount;
    }

    public User subscriptionCount(Long subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public User channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
