// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SqlSchemaLimits şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SqlSchemaLimits {
    /**
     * Zorunlu.
     */
    @JsonProperty("query_max")
    private Long queryMax;

    /**
     * Zorunlu.
     */
    @JsonProperty("row_limit_default")
    private Long rowLimitDefault;

    /**
     * Zorunlu.
     */
    @JsonProperty("row_limit_max")
    private Long rowLimitMax;

    /**
     * Zorunlu.
     */
    @JsonProperty("timeout_default_ms")
    private Long timeoutDefaultMs;

    /**
     * Zorunlu.
     */
    @JsonProperty("timeout_max_ms")
    private Long timeoutMaxMs;

    /**
     * Zorunlu.
     */
    @JsonProperty("segment_max_members")
    private Long segmentMaxMembers;

    public Long getQueryMax() {
        return queryMax;
    }

    public SqlSchemaLimits queryMax(Long queryMax) {
        this.queryMax = queryMax;
        return this;
    }

    public Long getRowLimitDefault() {
        return rowLimitDefault;
    }

    public SqlSchemaLimits rowLimitDefault(Long rowLimitDefault) {
        this.rowLimitDefault = rowLimitDefault;
        return this;
    }

    public Long getRowLimitMax() {
        return rowLimitMax;
    }

    public SqlSchemaLimits rowLimitMax(Long rowLimitMax) {
        this.rowLimitMax = rowLimitMax;
        return this;
    }

    public Long getTimeoutDefaultMs() {
        return timeoutDefaultMs;
    }

    public SqlSchemaLimits timeoutDefaultMs(Long timeoutDefaultMs) {
        this.timeoutDefaultMs = timeoutDefaultMs;
        return this;
    }

    public Long getTimeoutMaxMs() {
        return timeoutMaxMs;
    }

    public SqlSchemaLimits timeoutMaxMs(Long timeoutMaxMs) {
        this.timeoutMaxMs = timeoutMaxMs;
        return this;
    }

    public Long getSegmentMaxMembers() {
        return segmentMaxMembers;
    }

    public SqlSchemaLimits segmentMaxMembers(Long segmentMaxMembers) {
        this.segmentMaxMembers = segmentMaxMembers;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
