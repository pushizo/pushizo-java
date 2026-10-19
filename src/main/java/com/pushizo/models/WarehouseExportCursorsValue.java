// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseExportCursorsValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseExportCursorsValue {
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

    public WarehouseExportCursorsValue ts(String ts) {
        this.ts = ts;
        return this;
    }

    public String getId() {
        return id;
    }

    public WarehouseExportCursorsValue id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
