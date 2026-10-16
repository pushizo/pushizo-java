// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * App şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class App {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("org_id")
    private String orgId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("slug")
    private String slug;

    /**
     * Zorunlu.
     */
    @JsonProperty("platform_flags")
    private AppPlatformFlags platformFlags;

    /**
     * Zorunlu.
     */
    @JsonProperty("icon_url")
    private String iconUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("default_language")
    private String defaultLanguage;

    /**
     * Zorunlu.
     */
    @JsonProperty("timezone")
    private String timezone;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private AppSettings settings;

    /**
     * Zorunlu. Değerler: "hmac", "jwt", "both".
     */
    @JsonProperty("identity_verification_mode")
    private String identityVerificationMode;

    /**
     * Zorunlu. Değerler: "active", "suspended", "deleted".
     */
    @JsonProperty("status")
    private String status;

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

    public String getId() {
        return id;
    }

    public App id(String id) {
        this.id = id;
        return this;
    }

    public String getOrgId() {
        return orgId;
    }

    public App orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    public String getName() {
        return name;
    }

    public App name(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public App slug(String slug) {
        this.slug = slug;
        return this;
    }

    public AppPlatformFlags getPlatformFlags() {
        return platformFlags;
    }

    public App platformFlags(AppPlatformFlags platformFlags) {
        this.platformFlags = platformFlags;
        return this;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public App iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public App defaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public App timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public AppSettings getSettings() {
        return settings;
    }

    public App settings(AppSettings settings) {
        this.settings = settings;
        return this;
    }

    public String getIdentityVerificationMode() {
        return identityVerificationMode;
    }

    public App identityVerificationMode(String identityVerificationMode) {
        this.identityVerificationMode = identityVerificationMode;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public App status(String status) {
        this.status = status;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public App createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public App updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
