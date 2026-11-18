// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseSegmentPreview şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseSegmentPreview {
    /**
     * Zorunlu.
     */
    @JsonProperty("run_id")
    private String runId;

    /**
     * Zorunlu. Değerler: "dry_run", "sample".
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * Zorunlu.
     */
    @JsonProperty("estimated_bytes")
    private Double estimatedBytes;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_bytes_billed")
    private Double maxBytesBilled;

    /**
     * Zorunlu.
     */
    @JsonProperty("within_limit")
    private Boolean withinLimit;

    /**
     * Zorunlu.
     */
    @JsonProperty("sample")
    private java.util.List<String> sample;

    /**
     * Zorunlu.
     */
    @JsonProperty("sample_truncated")
    private Boolean sampleTruncated;

    /**
     * Zorunlu.
     */
    @JsonProperty("sample_matched")
    private Long sampleMatched;

    /**
     * Zorunlu.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    public String getRunId() {
        return runId;
    }

    public WarehouseSegmentPreview runId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getMode() {
        return mode;
    }

    public WarehouseSegmentPreview mode(String mode) {
        this.mode = mode;
        return this;
    }

    public Double getEstimatedBytes() {
        return estimatedBytes;
    }

    public WarehouseSegmentPreview estimatedBytes(Double estimatedBytes) {
        this.estimatedBytes = estimatedBytes;
        return this;
    }

    public Double getMaxBytesBilled() {
        return maxBytesBilled;
    }

    public WarehouseSegmentPreview maxBytesBilled(Double maxBytesBilled) {
        this.maxBytesBilled = maxBytesBilled;
        return this;
    }

    public Boolean getWithinLimit() {
        return withinLimit;
    }

    public WarehouseSegmentPreview withinLimit(Boolean withinLimit) {
        this.withinLimit = withinLimit;
        return this;
    }

    public java.util.List<String> getSample() {
        return sample;
    }

    public WarehouseSegmentPreview sample(java.util.List<String> sample) {
        this.sample = sample;
        return this;
    }

    public Boolean getSampleTruncated() {
        return sampleTruncated;
    }

    public WarehouseSegmentPreview sampleTruncated(Boolean sampleTruncated) {
        this.sampleTruncated = sampleTruncated;
        return this;
    }

    public Long getSampleMatched() {
        return sampleMatched;
    }

    public WarehouseSegmentPreview sampleMatched(Long sampleMatched) {
        this.sampleMatched = sampleMatched;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public WarehouseSegmentPreview durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
