// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CatalogItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CatalogItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("image_url")
    private String imageUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("price")
    private Double price;

    /**
     * Zorunlu.
     */
    @JsonProperty("sale_price")
    private Double salePrice;

    /**
     * Zorunlu.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Zorunlu.
     */
    @JsonProperty("category")
    private String category;

    /**
     * Zorunlu.
     */
    @JsonProperty("brand")
    private String brand;

    /**
     * Zorunlu.
     */
    @JsonProperty("in_stock")
    private Boolean inStock;

    /**
     * Zorunlu.
     */
    @JsonProperty("attributes")
    private java.util.Map<String, String> attributes;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public CatalogItem id(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CatalogItem title(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CatalogItem description(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public CatalogItem imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CatalogItem url(String url) {
        this.url = url;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public CatalogItem price(Double price) {
        this.price = price;
        return this;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public CatalogItem salePrice(Double salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CatalogItem currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CatalogItem category(String category) {
        this.category = category;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CatalogItem brand(String brand) {
        this.brand = brand;
        return this;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public CatalogItem inStock(Boolean inStock) {
        this.inStock = inStock;
        return this;
    }

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    public CatalogItem attributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public CatalogItem updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
