// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateCatalogDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateCatalogDto {
    @JsonProperty("description")
    private String description;

    @JsonProperty("currency")
    private String currency;

    public String getDescription() {
        return description;
    }

    public UpdateCatalogDto description(String description) {
        this.description = description;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public UpdateCatalogDto currency(String currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
