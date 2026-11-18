// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RunSqlQueryDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RunSqlQueryDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("query")
    private String query;

    @JsonProperty("row_limit")
    private Long rowLimit;

    @JsonProperty("timeout_ms")
    private Long timeoutMs;

    public String getQuery() {
        return query;
    }

    public RunSqlQueryDto query(String query) {
        this.query = query;
        return this;
    }

    public Long getRowLimit() {
        return rowLimit;
    }

    public RunSqlQueryDto rowLimit(Long rowLimit) {
        this.rowLimit = rowLimit;
        return this;
    }

    public Long getTimeoutMs() {
        return timeoutMs;
    }

    public RunSqlQueryDto timeoutMs(Long timeoutMs) {
        this.timeoutMs = timeoutMs;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
