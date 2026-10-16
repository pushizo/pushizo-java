// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAppDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateAppDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("platform_flags")
    private CreateAppDtoPlatformFlags platformFlags;

    @JsonProperty("default_language")
    private String defaultLanguage;

    @JsonProperty("timezone")
    private String timezone;

    public String getName() {
        return name;
    }

    public CreateAppDto name(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public CreateAppDto slug(String slug) {
        this.slug = slug;
        return this;
    }

    public CreateAppDtoPlatformFlags getPlatformFlags() {
        return platformFlags;
    }

    public CreateAppDto platformFlags(CreateAppDtoPlatformFlags platformFlags) {
        this.platformFlags = platformFlags;
        return this;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public CreateAppDto defaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public CreateAppDto timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
