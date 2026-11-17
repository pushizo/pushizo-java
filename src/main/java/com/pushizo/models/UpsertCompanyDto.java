// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpsertCompanyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpsertCompanyDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("domain")
    private String domain;

    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    public String getExternalId() {
        return externalId;
    }

    public UpsertCompanyDto externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpsertCompanyDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public UpsertCompanyDto domain(String domain) {
        this.domain = domain;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public UpsertCompanyDto properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
