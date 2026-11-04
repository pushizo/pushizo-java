// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExportDerivedRfm şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExportDerivedRfm {
    /**
     * Zorunlu.
     */
    @JsonProperty("segment")
    private String segment;

    /**
     * Zorunlu.
     */
    @JsonProperty("segment_since")
    private String segmentSince;

    /**
     * Zorunlu.
     */
    @JsonProperty("r")
    private Double r;

    /**
     * Zorunlu.
     */
    @JsonProperty("f")
    private Double f;

    /**
     * Zorunlu.
     */
    @JsonProperty("m")
    private Double m;

    /**
     * Zorunlu.
     */
    @JsonProperty("frequency")
    private Double frequency;

    /**
     * Zorunlu.
     */
    @JsonProperty("monetary")
    private Double monetary;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_event_at")
    private String lastEventAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("computed_at")
    private String computedAt;

    public String getSegment() {
        return segment;
    }

    public UserExportDerivedRfm segment(String segment) {
        this.segment = segment;
        return this;
    }

    public String getSegmentSince() {
        return segmentSince;
    }

    public UserExportDerivedRfm segmentSince(String segmentSince) {
        this.segmentSince = segmentSince;
        return this;
    }

    public Double getR() {
        return r;
    }

    public UserExportDerivedRfm r(Double r) {
        this.r = r;
        return this;
    }

    public Double getF() {
        return f;
    }

    public UserExportDerivedRfm f(Double f) {
        this.f = f;
        return this;
    }

    public Double getM() {
        return m;
    }

    public UserExportDerivedRfm m(Double m) {
        this.m = m;
        return this;
    }

    public Double getFrequency() {
        return frequency;
    }

    public UserExportDerivedRfm frequency(Double frequency) {
        this.frequency = frequency;
        return this;
    }

    public Double getMonetary() {
        return monetary;
    }

    public UserExportDerivedRfm monetary(Double monetary) {
        this.monetary = monetary;
        return this;
    }

    public String getLastEventAt() {
        return lastEventAt;
    }

    public UserExportDerivedRfm lastEventAt(String lastEventAt) {
        this.lastEventAt = lastEventAt;
        return this;
    }

    public String getComputedAt() {
        return computedAt;
    }

    public UserExportDerivedRfm computedAt(String computedAt) {
        this.computedAt = computedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
