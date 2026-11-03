// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CatalogItemsPage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CatalogItemsPage {
    /**
     * Zorunlu.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<CatalogItem> data;

    public Long getTotal() {
        return total;
    }

    public CatalogItemsPage total(Long total) {
        this.total = total;
        return this;
    }

    public java.util.List<CatalogItem> getData() {
        return data;
    }

    public CatalogItemsPage data(java.util.List<CatalogItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
