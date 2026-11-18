// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SqlSchemaViewsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SqlSchemaViewsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("columns")
    private java.util.List<SqlSchemaViewsItemColumnsItem> columns;

    public String getName() {
        return name;
    }

    public SqlSchemaViewsItem name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<SqlSchemaViewsItemColumnsItem> getColumns() {
        return columns;
    }

    public SqlSchemaViewsItem columns(java.util.List<SqlSchemaViewsItemColumnsItem> columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
