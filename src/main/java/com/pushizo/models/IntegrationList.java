// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class IntegrationList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<Integration> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("catalog")
    private java.util.List<IntegrationListCatalogItem> catalog;

    public java.util.List<Integration> getData() {
        return data;
    }

    public IntegrationList data(java.util.List<Integration> data) {
        this.data = data;
        return this;
    }

    public java.util.List<IntegrationListCatalogItem> getCatalog() {
        return catalog;
    }

    public IntegrationList catalog(java.util.List<IntegrationListCatalogItem> catalog) {
        this.catalog = catalog;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
