// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CompanyMember şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CompanyMember {
    /**
     * Zorunlu.
     */
    @JsonProperty("company_id")
    private String companyId;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("role")
    private String role;

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

    public String getCompanyId() {
        return companyId;
    }

    public CompanyMember companyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CompanyMember userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public CompanyMember externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getRole() {
        return role;
    }

    public CompanyMember role(String role) {
        this.role = role;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public CompanyMember createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public CompanyMember updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
