// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseSegmentConnectionList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseSegmentConnectionList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<WarehouseSegmentConnection> data;

    public java.util.List<WarehouseSegmentConnection> getData() {
        return data;
    }

    public WarehouseSegmentConnectionList data(java.util.List<WarehouseSegmentConnection> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
