// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** App şeması (api/openapi.yaml). */
public final class App {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "org_id" alanı. Zorunlu. */
    @JsonProperty("org_id")
    private String orgId;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "slug" alanı. Zorunlu. */
    @JsonProperty("slug")
    private String slug;

    /** "platform_flags" alanı. Zorunlu. */
    @JsonProperty("platform_flags")
    private AppPlatformFlags platformFlags;

    /** "icon_url" alanı. Zorunlu. */
    @JsonProperty("icon_url")
    private String iconUrl;

    /** "default_language" alanı. Zorunlu. */
    @JsonProperty("default_language")
    private String defaultLanguage;

    /** "timezone" alanı. Zorunlu. */
    @JsonProperty("timezone")
    private String timezone;

    /** "settings" alanı. Zorunlu. */
    @JsonProperty("settings")
    private AppSettings settings;

    /** "status" alanı. Zorunlu. Değerler: "active", "suspended", "deleted". */
    @JsonProperty("status")
    private String status;

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
    public App setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "org_id" alanı */
    public String getOrgId() {
        return orgId;
    }

    /**
     * "org_id" alanını ayarlar.
     *
     * @param orgId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public App setOrgId(String orgId) {
        this.orgId = orgId;
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
    public App setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "slug" alanı */
    public String getSlug() {
        return slug;
    }

    /**
     * "slug" alanını ayarlar.
     *
     * @param slug yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public App setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /** @return "platform_flags" alanı */
    public AppPlatformFlags getPlatformFlags() {
        return platformFlags;
    }

    /**
     * "platform_flags" alanını ayarlar.
     *
     * @param platformFlags yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public App setPlatformFlags(AppPlatformFlags platformFlags) {
        this.platformFlags = platformFlags;
        return this;
    }

    /** @return "icon_url" alanı */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * "icon_url" alanını ayarlar.
     *
     * @param iconUrl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public App setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /** @return "default_language" alanı */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * "default_language" alanını ayarlar.
     *
     * @param defaultLanguage yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public App setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    /** @return "timezone" alanı */
    public String getTimezone() {
        return timezone;
    }

    /**
     * "timezone" alanını ayarlar.
     *
     * @param timezone yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public App setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /** @return "settings" alanı */
    public AppSettings getSettings() {
        return settings;
    }

    /**
     * "settings" alanını ayarlar.
     *
     * @param settings yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public App setSettings(AppSettings settings) {
        this.settings = settings;
        return this;
    }

    /** @return "status" alanı */
    public String getStatus() {
        return status;
    }

    /**
     * "status" alanını ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public App setStatus(String status) {
        this.status = status;
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
    public App setCreatedAt(String createdAt) {
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
    public App setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
