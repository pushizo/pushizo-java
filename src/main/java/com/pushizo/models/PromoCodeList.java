// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PromoCodeList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PromoCodeList {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("total_count")
    private Long totalCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("assigned_count")
    private Long assignedCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("available_count")
    private Long availableCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("liquid")
    private String liquid;

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

    public PromoCodeList id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public PromoCodeList appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public PromoCodeList name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public PromoCodeList description(String description) {
        this.description = description;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public PromoCodeList expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public PromoCodeList totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Long getAssignedCount() {
        return assignedCount;
    }

    public PromoCodeList assignedCount(Long assignedCount) {
        this.assignedCount = assignedCount;
        return this;
    }

    public Long getAvailableCount() {
        return availableCount;
    }

    public PromoCodeList availableCount(Long availableCount) {
        this.availableCount = availableCount;
        return this;
    }

    public String getLiquid() {
        return liquid;
    }

    public PromoCodeList liquid(String liquid) {
        this.liquid = liquid;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public PromoCodeList createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public PromoCodeList updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
