// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TraceResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TraceResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("query")
    private String query;

    /**
     * Zorunlu.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu.
     */
    @JsonProperty("items")
    private java.util.List<TraceResultItemsItem> items;

    public String getQuery() {
        return query;
    }

    public TraceResult query(String query) {
        this.query = query;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public TraceResult kind(String kind) {
        this.kind = kind;
        return this;
    }

    public java.util.List<TraceResultItemsItem> getItems() {
        return items;
    }

    public TraceResult items(java.util.List<TraceResultItemsItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
