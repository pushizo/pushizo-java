// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** UpdateAppDto şeması (api/openapi.yaml). */
public final class UpdateAppDto {

    /** "name" alanı. */
    @JsonProperty("name")
    private String name;

    /** "platform_flags" alanı. */
    @JsonProperty("platform_flags")
    private UpdateAppDtoPlatformFlags platformFlags;

    /** "icon_url" alanı. */
    @JsonProperty("icon_url")
    private String iconUrl;

    /** "default_language" alanı. */
    @JsonProperty("default_language")
    private String defaultLanguage;

    /** "timezone" alanı. */
    @JsonProperty("timezone")
    private String timezone;

    /** "settings" alanı. */
    @JsonProperty("settings")
    private UpdateAppDtoSettings settings;

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
    public UpdateAppDto setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "platform_flags" alanı */
    public UpdateAppDtoPlatformFlags getPlatformFlags() {
        return platformFlags;
    }

    /**
     * "platform_flags" alanını ayarlar.
     *
     * @param platformFlags yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDto setPlatformFlags(UpdateAppDtoPlatformFlags platformFlags) {
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
    public UpdateAppDto setIconUrl(String iconUrl) {
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
    public UpdateAppDto setDefaultLanguage(String defaultLanguage) {
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
    public UpdateAppDto setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /** @return "settings" alanı */
    public UpdateAppDtoSettings getSettings() {
        return settings;
    }

    /**
     * "settings" alanını ayarlar.
     *
     * @param settings yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDto setSettings(UpdateAppDtoSettings settings) {
        this.settings = settings;
        return this;
    }
}
