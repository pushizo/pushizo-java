// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseSegmentOptionsLimits şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseSegmentOptionsLimits {
    /**
     * Zorunlu.
     */
    @JsonProperty("query_max")
    private Long queryMax;

    /**
     * Zorunlu.
     */
    @JsonProperty("timeout_default_seconds")
    private Long timeoutDefaultSeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("timeout_min_seconds")
    private Long timeoutMinSeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("timeout_max_seconds")
    private Long timeoutMaxSeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_rows_default")
    private Long maxRowsDefault;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_rows_max")
    private Long maxRowsMax;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_bytes_billed_default")
    private Long maxBytesBilledDefault;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_bytes_billed_min")
    private Long maxBytesBilledMin;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_bytes_billed_max")
    private Long maxBytesBilledMax;

    /**
     * Zorunlu.
     */
    @JsonProperty("preview_sample")
    private Long previewSample;

    /**
     * Zorunlu.
     */
    @JsonProperty("connections_per_app")
    private Long connectionsPerApp;

    public Long getQueryMax() {
        return queryMax;
    }

    public WarehouseSegmentOptionsLimits queryMax(Long queryMax) {
        this.queryMax = queryMax;
        return this;
    }

    public Long getTimeoutDefaultSeconds() {
        return timeoutDefaultSeconds;
    }

    public WarehouseSegmentOptionsLimits timeoutDefaultSeconds(Long timeoutDefaultSeconds) {
        this.timeoutDefaultSeconds = timeoutDefaultSeconds;
        return this;
    }

    public Long getTimeoutMinSeconds() {
        return timeoutMinSeconds;
    }

    public WarehouseSegmentOptionsLimits timeoutMinSeconds(Long timeoutMinSeconds) {
        this.timeoutMinSeconds = timeoutMinSeconds;
        return this;
    }

    public Long getTimeoutMaxSeconds() {
        return timeoutMaxSeconds;
    }

    public WarehouseSegmentOptionsLimits timeoutMaxSeconds(Long timeoutMaxSeconds) {
        this.timeoutMaxSeconds = timeoutMaxSeconds;
        return this;
    }

    public Long getMaxRowsDefault() {
        return maxRowsDefault;
    }

    public WarehouseSegmentOptionsLimits maxRowsDefault(Long maxRowsDefault) {
        this.maxRowsDefault = maxRowsDefault;
        return this;
    }

    public Long getMaxRowsMax() {
        return maxRowsMax;
    }

    public WarehouseSegmentOptionsLimits maxRowsMax(Long maxRowsMax) {
        this.maxRowsMax = maxRowsMax;
        return this;
    }

    public Long getMaxBytesBilledDefault() {
        return maxBytesBilledDefault;
    }

    public WarehouseSegmentOptionsLimits maxBytesBilledDefault(Long maxBytesBilledDefault) {
        this.maxBytesBilledDefault = maxBytesBilledDefault;
        return this;
    }

    public Long getMaxBytesBilledMin() {
        return maxBytesBilledMin;
    }

    public WarehouseSegmentOptionsLimits maxBytesBilledMin(Long maxBytesBilledMin) {
        this.maxBytesBilledMin = maxBytesBilledMin;
        return this;
    }

    public Long getMaxBytesBilledMax() {
        return maxBytesBilledMax;
    }

    public WarehouseSegmentOptionsLimits maxBytesBilledMax(Long maxBytesBilledMax) {
        this.maxBytesBilledMax = maxBytesBilledMax;
        return this;
    }

    public Long getPreviewSample() {
        return previewSample;
    }

    public WarehouseSegmentOptionsLimits previewSample(Long previewSample) {
        this.previewSample = previewSample;
        return this;
    }

    public Long getConnectionsPerApp() {
        return connectionsPerApp;
    }

    public WarehouseSegmentOptionsLimits connectionsPerApp(Long connectionsPerApp) {
        this.connectionsPerApp = connectionsPerApp;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
