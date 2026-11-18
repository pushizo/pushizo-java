// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SqlSchemaViewsItemColumnsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SqlSchemaViewsItemColumnsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "text", "integer", "number", "boolean", "timestamp", "json".
     */
    @JsonProperty("type")
    private String type;

    public String getName() {
        return name;
    }

    public SqlSchemaViewsItemColumnsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public SqlSchemaViewsItemColumnsItem type(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
