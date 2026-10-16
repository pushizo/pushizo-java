// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAppApiKeyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateAppApiKeyDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "admin", "notifications:write", "users:read", "users:write", "events:write", "segments:read", "analytics:read", "mcp:write".
     */
    @JsonProperty("scopes")
    private java.util.List<String> scopes;

    /**
     * Değerler: "live", "test".
     */
    @JsonProperty("environment")
    private String environment;

    @JsonProperty("expires_at")
    private String expiresAt;

    @JsonProperty("ip_allowlist")
    private java.util.List<String> ipAllowlist;

    public String getName() {
        return name;
    }

    public CreateAppApiKeyDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<String> getScopes() {
        return scopes;
    }

    public CreateAppApiKeyDto scopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public String getEnvironment() {
        return environment;
    }

    public CreateAppApiKeyDto environment(String environment) {
        this.environment = environment;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public CreateAppApiKeyDto expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public java.util.List<String> getIpAllowlist() {
        return ipAllowlist;
    }

    public CreateAppApiKeyDto ipAllowlist(java.util.List<String> ipAllowlist) {
        this.ipAllowlist = ipAllowlist;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
