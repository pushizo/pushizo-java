// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recommendations şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Recommendations {
    /**
     * Zorunlu. Değerler: "personalized", "popular", "trending", "similar", "category", "recently_viewed", "new_arrivals".
     */
    @JsonProperty("strategy")
    private String strategy;

    /**
     * Zorunlu. Değerler: "personalized", "popular", "trending", "similar", "category", "recently_viewed", "new_arrivals".
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<CatalogItem> data;

    public String getStrategy() {
        return strategy;
    }

    public Recommendations strategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public String getSource() {
        return source;
    }

    public Recommendations source(String source) {
        this.source = source;
        return this;
    }

    public java.util.List<CatalogItem> getData() {
        return data;
    }

    public Recommendations data(java.util.List<CatalogItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
