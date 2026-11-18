// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Catalog şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Catalog {
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
    @JsonProperty("currency")
    private String currency;

    /**
     * Zorunlu.
     */
    @JsonProperty("item_count")
    private Long itemCount;

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

    public Catalog id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Catalog appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Catalog name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Catalog description(String description) {
        this.description = description;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public Catalog currency(String currency) {
        this.currency = currency;
        return this;
    }

    public Long getItemCount() {
        return itemCount;
    }

    public Catalog itemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    public String getLiquid() {
        return liquid;
    }

    public Catalog liquid(String liquid) {
        this.liquid = liquid;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Catalog createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Catalog updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
