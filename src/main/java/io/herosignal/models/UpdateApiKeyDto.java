// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** UpdateApiKeyDto şeması (api/openapi.yaml). */
public final class UpdateApiKeyDto {

    /** "name" alanı. */
    @JsonProperty("name")
    private String name;

    /** "scopes" alanı. Değerler: "admin", "notifications:write", "users:read", "users:write", "events:write", "segments:read", "analytics:read". */
    @JsonProperty("scopes")
    private List<String> scopes;

    /** "ip_allowlist" alanı. */
    @JsonProperty("ip_allowlist")
    private List<String> ipAllowlist;

    /** "expires_at" alanı. */
    @JsonProperty("expires_at")
    private String expiresAt;

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
    public UpdateApiKeyDto setName(String name) {
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
    public UpdateApiKeyDto setScopes(List<String> scopes) {
        this.scopes = scopes;
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
    public UpdateApiKeyDto setIpAllowlist(List<String> ipAllowlist) {
        this.ipAllowlist = ipAllowlist;
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
    public UpdateApiKeyDto setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
}
