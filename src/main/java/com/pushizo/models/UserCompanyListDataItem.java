// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserCompanyListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserCompanyListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("company")
    private UserCompanyListDataItemCompany company;

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

    public UserCompanyListDataItemCompany getCompany() {
        return company;
    }

    public UserCompanyListDataItem company(UserCompanyListDataItemCompany company) {
        this.company = company;
        return this;
    }

    public String getRole() {
        return role;
    }

    public UserCompanyListDataItem role(String role) {
        this.role = role;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public UserCompanyListDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UserCompanyListDataItem updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
