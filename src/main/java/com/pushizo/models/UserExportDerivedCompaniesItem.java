// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerivedCompaniesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerivedCompaniesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("company_id")
    private String companyId;

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
    @JsonProperty("role")
    private String role;

    /**
     * Zorunlu.
     */
    @JsonProperty("joined_at")
    private String joinedAt;

    public String getCompanyId() {
        return companyId;
    }

    public UserExportDerivedCompaniesItem companyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public UserExportDerivedCompaniesItem externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserExportDerivedCompaniesItem name(String name) {
        this.name = name;
        return this;
    }

    public String getRole() {
        return role;
    }

    public UserExportDerivedCompaniesItem role(String role) {
        this.role = role;
        return this;
    }

    public String getJoinedAt() {
        return joinedAt;
    }

    public UserExportDerivedCompaniesItem joinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
