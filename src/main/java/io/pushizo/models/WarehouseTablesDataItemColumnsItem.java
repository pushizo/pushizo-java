// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseTablesDataItemColumnsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseTablesDataItemColumnsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("nullable")
    private Boolean nullable;

    public String getName() {
        return name;
    }

    public WarehouseTablesDataItemColumnsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public WarehouseTablesDataItemColumnsItem type(String type) {
        this.type = type;
        return this;
    }

    public Boolean getNullable() {
        return nullable;
    }

    public WarehouseTablesDataItemColumnsItem nullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
