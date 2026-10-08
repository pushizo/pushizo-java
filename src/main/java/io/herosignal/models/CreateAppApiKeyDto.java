// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** CreateAppApiKeyDto şeması (api/openapi.yaml). */
public final class CreateAppApiKeyDto {

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "scopes" alanı. Zorunlu. Değerler: "admin", "notifications:write", "users:read", "users:write", "events:write", "segments:read", "analytics:read". */
    @JsonProperty("scopes")
    private List<String> scopes;

    /** "environment" alanı. Değerler: "live", "test". */
    @JsonProperty("environment")
    private String environment;

    /** "expires_at" alanı. */
    @JsonProperty("expires_at")
    private String expiresAt;

    /** "ip_allowlist" alanı. */
    @JsonProperty("ip_allowlist")
    private List<String> ipAllowlist;

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
    public CreateAppApiKeyDto setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "scopes" alanı */
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * "scopes" alanını ayarlar.
     *
     * @param scopes yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateAppApiKeyDto setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /** @return "environment" alanı */
    public String getEnvironment() {
        return environment;
    }

    /**
     * "environment" alanını ayarlar.
     *
     * @param environment yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateAppApiKeyDto setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /** @return "expires_at" alanı */
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * "expires_at" alanını ayarlar.
     *
     * @param expiresAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateAppApiKeyDto setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /** @return "ip_allowlist" alanı */
    public List<String> getIpAllowlist() {
        return ipAllowlist;
    }

    /**
     * "ip_allowlist" alanını ayarlar.
     *
     * @param ipAllowlist yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateAppApiKeyDto setIpAllowlist(List<String> ipAllowlist) {
        this.ipAllowlist = ipAllowlist;
        return this;
    }
}
