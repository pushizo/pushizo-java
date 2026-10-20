// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdAccount şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdAccount {
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
     * Zorunlu. Değerler: "meta", "google", "tiktok", "linkedin".
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Zorunlu.
     */
    @JsonProperty("timezone")
    private String timezone;

    /**
     * Zorunlu. Değerler: "active", "error", "revoked".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("scopes")
    private java.util.List<String> scopes;

    /**
     * Zorunlu.
     */
    @JsonProperty("login_customer_id")
    private String loginCustomerId;

    /**
     * Zorunlu.
     */
    @JsonProperty("token_expires_at")
    private String tokenExpiresAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_refreshed_at")
    private String lastRefreshedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_error_at")
    private String lastErrorAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("audiences")
    private Long audiences;

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

    public AdAccount id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public AdAccount appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public AdAccount platform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public AdAccount externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getName() {
        return name;
    }

    public AdAccount name(String name) {
        this.name = name;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public AdAccount currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public AdAccount timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AdAccount status(String status) {
        this.status = status;
        return this;
    }

    public java.util.List<String> getScopes() {
        return scopes;
    }

    public AdAccount scopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public String getLoginCustomerId() {
        return loginCustomerId;
    }

    public AdAccount loginCustomerId(String loginCustomerId) {
        this.loginCustomerId = loginCustomerId;
        return this;
    }

    public String getTokenExpiresAt() {
        return tokenExpiresAt;
    }

    public AdAccount tokenExpiresAt(String tokenExpiresAt) {
        this.tokenExpiresAt = tokenExpiresAt;
        return this;
    }

    public String getLastRefreshedAt() {
        return lastRefreshedAt;
    }

    public AdAccount lastRefreshedAt(String lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
        return this;
    }

    public String getLastError() {
        return lastError;
    }

    public AdAccount lastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    public String getLastErrorAt() {
        return lastErrorAt;
    }

    public AdAccount lastErrorAt(String lastErrorAt) {
        this.lastErrorAt = lastErrorAt;
        return this;
    }

    public Long getAudiences() {
        return audiences;
    }

    public AdAccount audiences(Long audiences) {
        this.audiences = audiences;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AdAccount createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AdAccount updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
