// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** Member şeması (api/openapi.yaml). */
public final class Member {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "account_id" alanı. Zorunlu. */
    @JsonProperty("account_id")
    private String accountId;

    /** "email" alanı. Zorunlu. */
    @JsonProperty("email")
    private String email;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "role" alanı. Zorunlu. Değerler: "owner", "admin", "developer", "marketer", "analyst", "billing", "viewer". */
    @JsonProperty("role")
    private String role;

    /** "app_scopes" alanı. Zorunlu. */
    @JsonProperty("app_scopes")
    private List<String> appScopes;

    /** "accepted_at" alanı. Zorunlu. */
    @JsonProperty("accepted_at")
    private String acceptedAt;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "last_login_at" alanı. Zorunlu. */
    @JsonProperty("last_login_at")
    private String lastLoginAt;

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
    public Member setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "account_id" alanı */
    public String getAccountId() {
        return accountId;
    }

    /**
     * "account_id" alanını ayarlar.
     *
     * @param accountId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Member setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /** @return "email" alanı */
    public String getEmail() {
        return email;
    }

    /**
     * "email" alanını ayarlar.
     *
     * @param email yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Member setEmail(String email) {
        this.email = email;
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
    public Member setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "role" alanı */
    public String getRole() {
        return role;
    }

    /**
     * "role" alanını ayarlar.
     *
     * @param role yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Member setRole(String role) {
        this.role = role;
        return this;
    }

    /** @return "app_scopes" alanı */
    public List<String> getAppScopes() {
        return appScopes;
    }

    /**
     * "app_scopes" alanını ayarlar.
     *
     * @param appScopes yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Member setAppScopes(List<String> appScopes) {
        this.appScopes = appScopes;
        return this;
    }

    /** @return "accepted_at" alanı */
    public String getAcceptedAt() {
        return acceptedAt;
    }

    /**
     * "accepted_at" alanını ayarlar.
     *
     * @param acceptedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Member setAcceptedAt(String acceptedAt) {
        this.acceptedAt = acceptedAt;
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
    public Member setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** @return "last_login_at" alanı */
    public String getLastLoginAt() {
        return lastLoginAt;
    }

    /**
     * "last_login_at" alanını ayarlar.
     *
     * @param lastLoginAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Member setLastLoginAt(String lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
        return this;
    }
}
