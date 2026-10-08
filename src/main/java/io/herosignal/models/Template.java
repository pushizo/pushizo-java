// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** Template şeması (api/openapi.yaml). */
public final class Template {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "channel" alanı. Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "current_version" alanı. Zorunlu. */
    @JsonProperty("current_version")
    private Long currentVersion;

    /** "tags" alanı. Zorunlu. */
    @JsonProperty("tags")
    private List<String> tags;

    /** "content" alanı. Zorunlu. */
    @JsonProperty("content")
    private Map<String, Object> content;

    /** "created_by" alanı. Zorunlu. */
    @JsonProperty("created_by")
    private String createdBy;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "updated_at" alanı. Zorunlu. */
    @JsonProperty("updated_at")
    private String updatedAt;

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
    public Template setId(String id) {
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
    public Template setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Template setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "channel" alanı */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" alanını ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Template setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "current_version" alanı */
    public Long getCurrentVersion() {
        return currentVersion;
    }

    /**
     * "current_version" alanını ayarlar.
     *
     * @param currentVersion yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Template setCurrentVersion(Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /** @return "tags" alanı */
    public List<String> getTags() {
        return tags;
    }

    /**
     * "tags" alanını ayarlar.
     *
     * @param tags yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Template setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /** @return "content" alanı */
    public Map<String, Object> getContent() {
        return content;
    }

    /**
     * "content" alanını ayarlar.
     *
     * @param content yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Template setContent(Map<String, Object> content) {
        this.content = content;
        return this;
    }

    /** @return "created_by" alanı */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * "created_by" alanını ayarlar.
     *
     * @param createdBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Template setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
    public Template setCreatedAt(String createdAt) {
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
    public Template setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
