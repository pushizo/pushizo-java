// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiKey şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ApiKey {
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
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("prefix")
    private String prefix;

    /**
     * Zorunlu.
     */
    @JsonProperty("scopes")
    private java.util.List<String> scopes;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_used_at")
    private String lastUsedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("revoked_at")
    private String revokedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("ip_allowlist")
    private java.util.List<String> ipAllowlist;

    /**
     * Zorunlu.
     */
    @JsonProperty("rotated_at")
    private String rotatedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_by")
    private String createdBy;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public ApiKey id(String id) {
        this.id = id;
        return this;
    }

    public String getOrgId() {
        return orgId;
    }

    public ApiKey orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public ApiKey appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ApiKey name(String name) {
        this.name = name;
        return this;
    }

    public String getPrefix() {
        return prefix;
    }

    public ApiKey prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public java.util.List<String> getScopes() {
        return scopes;
    }

    public ApiKey scopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public String getLastUsedAt() {
        return lastUsedAt;
    }

    public ApiKey lastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public ApiKey expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public String getRevokedAt() {
        return revokedAt;
    }

    public ApiKey revokedAt(String revokedAt) {
        this.revokedAt = revokedAt;
        return this;
    }

    public java.util.List<String> getIpAllowlist() {
        return ipAllowlist;
    }

    public ApiKey ipAllowlist(java.util.List<String> ipAllowlist) {
        this.ipAllowlist = ipAllowlist;
        return this;
    }

    public String getRotatedAt() {
        return rotatedAt;
    }

    public ApiKey rotatedAt(String rotatedAt) {
        this.rotatedAt = rotatedAt;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public ApiKey createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ApiKey createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
