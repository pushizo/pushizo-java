// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("platform_flags")
    private UpdateAppDtoPlatformFlags platformFlags;

    @JsonProperty("icon_url")
    private String iconUrl;

    @JsonProperty("default_language")
    private String defaultLanguage;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("settings")
    private UpdateAppDtoSettings settings;

    /**
     * Değerler: "hmac", "jwt", "both".
     */
    @JsonProperty("identity_verification_mode")
    private String identityVerificationMode;

    public String getName() {
        return name;
    }

    public UpdateAppDto name(String name) {
        this.name = name;
        return this;
    }

    public UpdateAppDtoPlatformFlags getPlatformFlags() {
        return platformFlags;
    }

    public UpdateAppDto platformFlags(UpdateAppDtoPlatformFlags platformFlags) {
        this.platformFlags = platformFlags;
        return this;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public UpdateAppDto iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public UpdateAppDto defaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public UpdateAppDto timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public UpdateAppDtoSettings getSettings() {
        return settings;
    }

    public UpdateAppDto settings(UpdateAppDtoSettings settings) {
        this.settings = settings;
        return this;
    }

    public String getIdentityVerificationMode() {
        return identityVerificationMode;
    }

    public UpdateAppDto identityVerificationMode(String identityVerificationMode) {
        this.identityVerificationMode = identityVerificationMode;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
