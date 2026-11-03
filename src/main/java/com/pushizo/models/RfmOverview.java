// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RfmOverview şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RfmOverview {
    /**
     * Zorunlu.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Zorunlu.
     */
    @JsonProperty("low_population")
    private Boolean lowPopulation;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_computed_at")
    private String lastComputedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("segments")
    private java.util.List<RfmOverviewSegmentsItem> segments;

    public Long getTotal() {
        return total;
    }

    public RfmOverview total(Long total) {
        this.total = total;
        return this;
    }

    public Boolean getLowPopulation() {
        return lowPopulation;
    }

    public RfmOverview lowPopulation(Boolean lowPopulation) {
        this.lowPopulation = lowPopulation;
        return this;
    }

    public String getLastComputedAt() {
        return lastComputedAt;
    }

    public RfmOverview lastComputedAt(String lastComputedAt) {
        this.lastComputedAt = lastComputedAt;
        return this;
    }

    public java.util.List<RfmOverviewSegmentsItem> getSegments() {
        return segments;
    }

    public RfmOverview segments(java.util.List<RfmOverviewSegmentsItem> segments) {
        this.segments = segments;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
