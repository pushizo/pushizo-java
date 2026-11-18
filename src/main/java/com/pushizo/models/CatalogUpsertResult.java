// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CatalogUpsertResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CatalogUpsertResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("catalog")
    private Catalog catalog;

    /**
     * Zorunlu.
     */
    @JsonProperty("upserted")
    private Long upserted;

    public Catalog getCatalog() {
        return catalog;
    }

    public CatalogUpsertResult catalog(Catalog catalog) {
        this.catalog = catalog;
        return this;
    }

    public Long getUpserted() {
        return upserted;
    }

    public CatalogUpsertResult upserted(Long upserted) {
        this.upserted = upserted;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
