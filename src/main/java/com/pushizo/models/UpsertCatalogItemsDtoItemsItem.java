// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpsertCatalogItemsDtoItemsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpsertCatalogItemsDtoItemsItem {
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

    @JsonProperty("description")
    private String description;

    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("url")
    private String url;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("sale_price")
    private Double salePrice;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("category")
    private String category;

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("in_stock")
    private Boolean inStock;

    @JsonProperty("attributes")
    private java.util.Map<String, String> attributes;

    public String getId() {
        return id;
    }

    public UpsertCatalogItemsDtoItemsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public UpsertCatalogItemsDtoItemsItem title(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpsertCatalogItemsDtoItemsItem description(String description) {
        this.description = description;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public UpsertCatalogItemsDtoItemsItem imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public UpsertCatalogItemsDtoItemsItem url(String url) {
        this.url = url;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public UpsertCatalogItemsDtoItemsItem price(Double price) {
        this.price = price;
        return this;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public UpsertCatalogItemsDtoItemsItem salePrice(Double salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public UpsertCatalogItemsDtoItemsItem currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public UpsertCatalogItemsDtoItemsItem category(String category) {
        this.category = category;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public UpsertCatalogItemsDtoItemsItem brand(String brand) {
        this.brand = brand;
        return this;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public UpsertCatalogItemsDtoItemsItem inStock(Boolean inStock) {
        this.inStock = inStock;
        return this;
    }

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    public UpsertCatalogItemsDtoItemsItem attributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
