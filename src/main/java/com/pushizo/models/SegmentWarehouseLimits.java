// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentWarehouseLimits şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentWarehouseLimits {
    /**
     * Zorunlu.
     */
    @JsonProperty("timeout_seconds")
    private Long timeoutSeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_rows")
    private Long maxRows;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_bytes_billed")
    private Double maxBytesBilled;

    /**
     * Zorunlu. Değerler: "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large", "5X-Large", "6X-Large".
     */
    @JsonProperty("max_warehouse_size")
    private String maxWarehouseSize;

    public Long getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public SegmentWarehouseLimits timeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    public Long getMaxRows() {
        return maxRows;
    }

    public SegmentWarehouseLimits maxRows(Long maxRows) {
        this.maxRows = maxRows;
        return this;
    }

    public Double getMaxBytesBilled() {
        return maxBytesBilled;
    }

    public SegmentWarehouseLimits maxBytesBilled(Double maxBytesBilled) {
        this.maxBytesBilled = maxBytesBilled;
        return this;
    }

    public String getMaxWarehouseSize() {
        return maxWarehouseSize;
    }

    public SegmentWarehouseLimits maxWarehouseSize(String maxWarehouseSize) {
        this.maxWarehouseSize = maxWarehouseSize;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
