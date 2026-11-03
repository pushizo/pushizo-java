// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpsertCatalogItemsDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpsertCatalogItemsDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("items")
    private java.util.List<UpsertCatalogItemsDtoItemsItem> items;

    public java.util.List<UpsertCatalogItemsDtoItemsItem> getItems() {
        return items;
    }

    public UpsertCatalogItemsDto items(java.util.List<UpsertCatalogItemsDtoItemsItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
