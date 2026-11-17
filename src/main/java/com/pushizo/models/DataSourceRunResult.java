// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataSourceRunResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataSourceRunResult {
    /**
     * Zorunlu. Değerler: "succeeded", "partial", "failed", "skipped".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("stats")
    private DataSourceRunResultStats stats;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    public String getStatus() {
        return status;
    }

    public DataSourceRunResult status(String status) {
        this.status = status;
        return this;
    }

    public DataSourceRunResultStats getStats() {
        return stats;
    }

    public DataSourceRunResult stats(DataSourceRunResultStats stats) {
        this.stats = stats;
        return this;
    }

    public String getError() {
        return error;
    }

    public DataSourceRunResult error(String error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
