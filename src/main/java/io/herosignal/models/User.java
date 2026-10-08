// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** User şeması (api/openapi.yaml). */
public final class User {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "external_id" alanı. Zorunlu. */
    @JsonProperty("external_id")
    private String externalId;

    /** "properties" alanı. Zorunlu. */
    @JsonProperty("properties")
    private Map<String, Object> properties;

    /** "tags" alanı. Zorunlu. */
    @JsonProperty("tags")
    private Map<String, String> tags;

    /** "first_seen_at" alanı. Zorunlu. */
    @JsonProperty("first_seen_at")
    private String firstSeenAt;

    /** "last_active_at" alanı. Zorunlu. */
    @JsonProperty("last_active_at")
    private String lastActiveAt;

    /** "session_count" alanı. Zorunlu. */
    @JsonProperty("session_count")
    private Long sessionCount;

    /** "merged_into" alanı. Zorunlu. */
    @JsonProperty("merged_into")
    private String mergedInto;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "updated_at" alanı. Zorunlu. */
    @JsonProperty("updated_at")
    private String updatedAt;

    /** "subscription_count" alanı. Zorunlu. */
    @JsonProperty("subscription_count")
    private Long subscriptionCount;

    /** "channels" alanı. Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channels")
    private List<String> channels;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "app_id" alanı */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" alanını ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "external_id" alanı */
    public String getExternalId() {
        return externalId;
    }

    /**
     * "external_id" alanını ayarlar.
     *
     * @param externalId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /** @return "properties" alanı */
    public Map<String, Object> getProperties() {
        return properties;
    }

    /**
     * "properties" alanını ayarlar.
     *
     * @param properties yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /** @return "tags" alanı */
    public Map<String, String> getTags() {
        return tags;
    }

    /**
     * "tags" alanını ayarlar.
     *
     * @param tags yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /** @return "first_seen_at" alanı */
    public String getFirstSeenAt() {
        return firstSeenAt;
    }

    /**
     * "first_seen_at" alanını ayarlar.
     *
     * @param firstSeenAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setFirstSeenAt(String firstSeenAt) {
        this.firstSeenAt = firstSeenAt;
        return this;
    }

    /** @return "last_active_at" alanı */
    public String getLastActiveAt() {
        return lastActiveAt;
    }

    /**
     * "last_active_at" alanını ayarlar.
     *
     * @param lastActiveAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setLastActiveAt(String lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
        return this;
    }

    /** @return "session_count" alanı */
    public Long getSessionCount() {
        return sessionCount;
    }

    /**
     * "session_count" alanını ayarlar.
     *
     * @param sessionCount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    /** @return "merged_into" alanı */
    public String getMergedInto() {
        return mergedInto;
    }

    /**
     * "merged_into" alanını ayarlar.
     *
     * @param mergedInto yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setMergedInto(String mergedInto) {
        this.mergedInto = mergedInto;
        return this;
    }

    /** @return "created_at" alanı */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * "created_at" alanını ayarlar.
     *
     * @param createdAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** @return "updated_at" alanı */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * "updated_at" alanını ayarlar.
     *
     * @param updatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** @return "subscription_count" alanı */
    public Long getSubscriptionCount() {
        return subscriptionCount;
    }

    /**
     * "subscription_count" alanını ayarlar.
     *
     * @param subscriptionCount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setSubscriptionCount(Long subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
        return this;
    }

    /** @return "channels" alanı */
    public List<String> getChannels() {
        return channels;
    }

    /**
     * "channels" alanını ayarlar.
     *
     * @param channels yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public User setChannels(List<String> channels) {
        this.channels = channels;
        return this;
    }
}
