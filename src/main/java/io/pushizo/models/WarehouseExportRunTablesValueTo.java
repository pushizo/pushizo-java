// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseExportRunTablesValueTo şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseExportRunTablesValueTo {
    /**
     * Zorunlu.
     */
    @JsonProperty("ts")
    private String ts;

    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    public String getTs() {
        return ts;
    }

    public WarehouseExportRunTablesValueTo ts(String ts) {
        this.ts = ts;
        return this;
    }

    public String getId() {
        return id;
    }

    public WarehouseExportRunTablesValueTo id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
