// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** CreatedApiKey şeması (api/openapi.yaml). */
public final class CreatedApiKey {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "org_id" alanı. Zorunlu. */
    @JsonProperty("org_id")
    private String orgId;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "prefix" alanı. Zorunlu. */
    @JsonProperty("prefix")
    private String prefix;

    /** "scopes" alanı. Zorunlu. */
    @JsonProperty("scopes")
    private List<String> scopes;

    /** "last_used_at" alanı. Zorunlu. */
    @JsonProperty("last_used_at")
    private String lastUsedAt;

    /** "expires_at" alanı. Zorunlu. */
    @JsonProperty("expires_at")
    private String expiresAt;

    /** "revoked_at" alanı. Zorunlu. */
    @JsonProperty("revoked_at")
    private String revokedAt;

    /** "ip_allowlist" alanı. Zorunlu. */
    @JsonProperty("ip_allowlist")
    private List<String> ipAllowlist;

    /** "rotated_at" alanı. Zorunlu. */
    @JsonProperty("rotated_at")
    private String rotatedAt;

    /** "created_by" alanı. Zorunlu. */
    @JsonProperty("created_by")
    private String createdBy;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "key" alanı. Zorunlu. */
    @JsonProperty("key")
    private String key;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "org_id" alanı */
    public String getOrgId() {
        return orgId;
    }

    /**
     * "org_id" alanını ayarlar.
     *
     * @param orgId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    /** @return "app_id" alanı */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" alanını ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setAppId(String appId) {
        this.appId = appId;
        return this;
    }

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
    public CreatedApiKey setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "prefix" alanı */
    public String getPrefix() {
        return prefix;
    }

    /**
     * "prefix" alanını ayarlar.
     *
     * @param prefix yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setPrefix(String prefix) {
        this.prefix = prefix;
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
    public CreatedApiKey setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /** @return "last_used_at" alanı */
    public String getLastUsedAt() {
        return lastUsedAt;
    }

    /**
     * "last_used_at" alanını ayarlar.
     *
     * @param lastUsedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setLastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
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
    public CreatedApiKey setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /** @return "revoked_at" alanı */
    public String getRevokedAt() {
        return revokedAt;
    }

    /**
     * "revoked_at" alanını ayarlar.
     *
     * @param revokedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setRevokedAt(String revokedAt) {
        this.revokedAt = revokedAt;
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
    public CreatedApiKey setIpAllowlist(List<String> ipAllowlist) {
        this.ipAllowlist = ipAllowlist;
        return this;
    }

    /** @return "rotated_at" alanı */
    public String getRotatedAt() {
        return rotatedAt;
    }

    /**
     * "rotated_at" alanını ayarlar.
     *
     * @param rotatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setRotatedAt(String rotatedAt) {
        this.rotatedAt = rotatedAt;
        return this;
    }

    /** @return "created_by" alanı */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * "created_by" alanını ayarlar.
     *
     * @param createdBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /** @return "created_at" alanı */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * "created_at" alanını ayarlar.
     *
     * @param createdAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** @return "key" alanı */
    public String getKey() {
        return key;
    }

    /**
     * "key" alanını ayarlar.
     *
     * @param key yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreatedApiKey setKey(String key) {
        this.key = key;
        return this;
    }
}
