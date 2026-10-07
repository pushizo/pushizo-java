// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Member şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Member {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("account_id")
    private String accountId;

    /**
     * Zorunlu.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "owner", "admin", "developer", "marketer", "analyst", "billing", "viewer".
     */
    @JsonProperty("role")
    private String role;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_scopes")
    private java.util.List<String> appScopes;

    /**
     * Zorunlu.
     */
    @JsonProperty("accepted_at")
    private String acceptedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_login_at")
    private String lastLoginAt;

    public String getId() {
        return id;
    }

    public Member id(String id) {
        this.id = id;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public Member accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Member email(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public Member name(String name) {
        this.name = name;
        return this;
    }

    public String getRole() {
        return role;
    }

    public Member role(String role) {
        this.role = role;
        return this;
    }

    public java.util.List<String> getAppScopes() {
        return appScopes;
    }

    public Member appScopes(java.util.List<String> appScopes) {
        this.appScopes = appScopes;
        return this;
    }

    public String getAcceptedAt() {
        return acceptedAt;
    }

    public Member acceptedAt(String acceptedAt) {
        this.acceptedAt = acceptedAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Member createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getLastLoginAt() {
        return lastLoginAt;
    }

    public Member lastLoginAt(String lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
