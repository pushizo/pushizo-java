// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** CreateAppDto şeması (api/openapi.yaml). */
public final class CreateAppDto {

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "slug" alanı. */
    @JsonProperty("slug")
    private String slug;

    /** "platform_flags" alanı. */
    @JsonProperty("platform_flags")
    private CreateAppDtoPlatformFlags platformFlags;

    /** "default_language" alanı. */
    @JsonProperty("default_language")
    private String defaultLanguage;

    /** "timezone" alanı. */
    @JsonProperty("timezone")
    private String timezone;

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
    public CreateAppDto setName(String name) {
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
    public CreateAppDto setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /** @return "platform_flags" alanı */
    public CreateAppDtoPlatformFlags getPlatformFlags() {
        return platformFlags;
    }

    /**
     * "platform_flags" alanını ayarlar.
     *
     * @param platformFlags yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateAppDto setPlatformFlags(CreateAppDtoPlatformFlags platformFlags) {
        this.platformFlags = platformFlags;
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
    public CreateAppDto setDefaultLanguage(String defaultLanguage) {
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
    public CreateAppDto setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
}
