// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseSegmentOptions şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseSegmentOptions {
    /**
     * Zorunlu. Değerler: "bigquery", "snowflake", "databricks".
     */
    @JsonProperty("types")
    private java.util.List<String> types;

    /**
     * Zorunlu. Değerler: "external_id", "user_id".
     */
    @JsonProperty("id_types")
    private java.util.List<String> idTypes;

    /**
     * Zorunlu. Değerler: "X-Small", "Small", "Medium", "Large", "X-Large", "2X-Large", "3X-Large", "4X-Large", "5X-Large", "6X-Large".
     */
    @JsonProperty("snowflake_warehouse_sizes")
    private java.util.List<String> snowflakeWarehouseSizes;

    /**
     * Zorunlu.
     */
    @JsonProperty("refresh_intervals")
    private java.util.List<Long> refreshIntervals;

    /**
     * Zorunlu.
     */
    @JsonProperty("limits")
    private WarehouseSegmentOptionsLimits limits;

    public java.util.List<String> getTypes() {
        return types;
    }

    public WarehouseSegmentOptions types(java.util.List<String> types) {
        this.types = types;
        return this;
    }

    public java.util.List<String> getIdTypes() {
        return idTypes;
    }

    public WarehouseSegmentOptions idTypes(java.util.List<String> idTypes) {
        this.idTypes = idTypes;
        return this;
    }

    public java.util.List<String> getSnowflakeWarehouseSizes() {
        return snowflakeWarehouseSizes;
    }

    public WarehouseSegmentOptions snowflakeWarehouseSizes(java.util.List<String> snowflakeWarehouseSizes) {
        this.snowflakeWarehouseSizes = snowflakeWarehouseSizes;
        return this;
    }

    public java.util.List<Long> getRefreshIntervals() {
        return refreshIntervals;
    }

    public WarehouseSegmentOptions refreshIntervals(java.util.List<Long> refreshIntervals) {
        this.refreshIntervals = refreshIntervals;
        return this;
    }

    public WarehouseSegmentOptionsLimits getLimits() {
        return limits;
    }

    public WarehouseSegmentOptions limits(WarehouseSegmentOptionsLimits limits) {
        this.limits = limits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
