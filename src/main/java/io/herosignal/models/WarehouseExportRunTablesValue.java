// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseExportRunTablesValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseExportRunTablesValue {
    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private Long rows;

    /**
     * Zorunlu.
     */
    @JsonProperty("schema_version")
    private Long schemaVersion;

    /**
     * Zorunlu.
     */
    @JsonProperty("from")
    private WarehouseExportRunTablesValueFrom from;

    /**
     * Zorunlu.
     */
    @JsonProperty("to")
    private WarehouseExportRunTablesValueTo to;

    /**
     * Zorunlu.
     */
    @JsonProperty("objects")
    private Long objects;

    public Long getRows() {
        return rows;
    }

    public WarehouseExportRunTablesValue rows(Long rows) {
        this.rows = rows;
        return this;
    }

    public Long getSchemaVersion() {
        return schemaVersion;
    }

    public WarehouseExportRunTablesValue schemaVersion(Long schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }

    public WarehouseExportRunTablesValueFrom getFrom() {
        return from;
    }

    public WarehouseExportRunTablesValue from(WarehouseExportRunTablesValueFrom from) {
        this.from = from;
        return this;
    }

    public WarehouseExportRunTablesValueTo getTo() {
        return to;
    }

    public WarehouseExportRunTablesValue to(WarehouseExportRunTablesValueTo to) {
        this.to = to;
        return this;
    }

    public Long getObjects() {
        return objects;
    }

    public WarehouseExportRunTablesValue objects(Long objects) {
        this.objects = objects;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
