// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BatchUpsertCompaniesDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class BatchUpsertCompaniesDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("companies")
    private java.util.List<UpsertCompanyDto> companies;

    public java.util.List<UpsertCompanyDto> getCompanies() {
        return companies;
    }

    public BatchUpsertCompaniesDto companies(java.util.List<UpsertCompanyDto> companies) {
        this.companies = companies;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
