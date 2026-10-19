// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseTablesDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseTablesDataItem {
    /**
     * Zorunlu. Değerler: "deliveries", "delivery_events", "events", "conversions", "users", "subscriptions".
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "incremental", "snapshot".
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * Zorunlu.
     */
    @JsonProperty("schema_version")
    private Long schemaVersion;

    /**
     * Zorunlu.
     */
    @JsonProperty("cursor_column")
    private String cursorColumn;

    /**
     * Zorunlu.
     */
    @JsonProperty("columns")
    private java.util.List<WarehouseTablesDataItemColumnsItem> columns;

    public String getName() {
        return name;
    }

    public WarehouseTablesDataItem name(String name) {
        this.name = name;
        return this;
    }

    public String getMode() {
        return mode;
    }

    public WarehouseTablesDataItem mode(String mode) {
        this.mode = mode;
        return this;
    }

    public Long getSchemaVersion() {
        return schemaVersion;
    }

    public WarehouseTablesDataItem schemaVersion(Long schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    public String getCursorColumn() {
        return cursorColumn;
    }

    public WarehouseTablesDataItem cursorColumn(String cursorColumn) {
        this.cursorColumn = cursorColumn;
        return this;
    }

    public java.util.List<WarehouseTablesDataItemColumnsItem> getColumns() {
        return columns;
    }

    public WarehouseTablesDataItem columns(java.util.List<WarehouseTablesDataItemColumnsItem> columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
