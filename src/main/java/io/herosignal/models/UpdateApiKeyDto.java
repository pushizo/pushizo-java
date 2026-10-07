// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateApiKeyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateApiKeyDto {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "admin", "notifications:write", "users:read", "users:write", "events:write", "segments:read", "analytics:read".
     */
    @JsonProperty("scopes")
    private java.util.List<String> scopes;

    @JsonProperty("ip_allowlist")
    private java.util.List<String> ipAllowlist;

    @JsonProperty("expires_at")
    private String expiresAt;

    public String getName() {
        return name;
    }

    public UpdateApiKeyDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<String> getScopes() {
        return scopes;
    }

    public UpdateApiKeyDto scopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public java.util.List<String> getIpAllowlist() {
        return ipAllowlist;
    }

    public UpdateApiKeyDto ipAllowlist(java.util.List<String> ipAllowlist) {
        this.ipAllowlist = ipAllowlist;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public UpdateApiKeyDto expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
