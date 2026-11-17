// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PreviewWarehouseQueryDtoLimits şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PreviewWarehouseQueryDtoLimits {
    @JsonProperty("timeout_seconds")
    private Long timeoutSeconds;

    @JsonProperty("max_rows")
    private Long maxRows;

    @JsonProperty("max_bytes_billed")
    private Long maxBytesBilled;

    /**
     * Değerler: "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large", "5X-Large", "6X-Large".
     */
    @JsonProperty("max_warehouse_size")
    private String maxWarehouseSize;

    public Long getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public PreviewWarehouseQueryDtoLimits timeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    public Long getMaxRows() {
        return maxRows;
    }

    public PreviewWarehouseQueryDtoLimits maxRows(Long maxRows) {
        this.maxRows = maxRows;
        return this;
    }

    public Long getMaxBytesBilled() {
        return maxBytesBilled;
    }

    public PreviewWarehouseQueryDtoLimits maxBytesBilled(Long maxBytesBilled) {
        this.maxBytesBilled = maxBytesBilled;
        return this;
    }

    public String getMaxWarehouseSize() {
        return maxWarehouseSize;
    }

    public PreviewWarehouseQueryDtoLimits maxWarehouseSize(String maxWarehouseSize) {
        this.maxWarehouseSize = maxWarehouseSize;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
