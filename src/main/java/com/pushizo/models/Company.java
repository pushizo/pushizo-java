// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Company şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Company {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

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
    @JsonProperty("domain")
    private String domain;

    /**
     * Zorunlu.
     */
    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    /**
     * Zorunlu.
     */
    @JsonProperty("member_count")
    private Long memberCount;

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

    public String getId() {
        return id;
    }

    public Company id(String id) {
        this.id = id;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public Company externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Company name(String name) {
        this.name = name;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public Company domain(String domain) {
        this.domain = domain;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public Company properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public Long getMemberCount() {
        return memberCount;
    }

    public Company memberCount(Long memberCount) {
        this.memberCount = memberCount;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Company createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Company updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
