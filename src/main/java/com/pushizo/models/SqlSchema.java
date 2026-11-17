// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SqlSchema şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SqlSchema {
    /**
     * Zorunlu.
     */
    @JsonProperty("views")
    private java.util.List<SqlSchemaViewsItem> views;

    /**
     * Zorunlu.
     */
    @JsonProperty("limits")
    private SqlSchemaLimits limits;

    /**
     * Zorunlu.
     */
    @JsonProperty("refresh_intervals")
    private java.util.List<Long> refreshIntervals;

    public java.util.List<SqlSchemaViewsItem> getViews() {
        return views;
    }

    public SqlSchema views(java.util.List<SqlSchemaViewsItem> views) {
        this.views = views;
        return this;
    }

    public SqlSchemaLimits getLimits() {
        return limits;
    }

    public SqlSchema limits(SqlSchemaLimits limits) {
        this.limits = limits;
        return this;
    }

    public java.util.List<Long> getRefreshIntervals() {
        return refreshIntervals;
    }

    public SqlSchema refreshIntervals(java.util.List<Long> refreshIntervals) {
        this.refreshIntervals = refreshIntervals;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
