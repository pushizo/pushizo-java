// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateSqlSegmentDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateSqlSegmentDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("query")
    private String query;

    @JsonProperty("refresh_interval_minutes")
    private Long refreshIntervalMinutes;

    public String getName() {
        return name;
    }

    public CreateSqlSegmentDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateSqlSegmentDto description(String description) {
        this.description = description;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public CreateSqlSegmentDto query(String query) {
        this.query = query;
        return this;
    }

    public Long getRefreshIntervalMinutes() {
        return refreshIntervalMinutes;
    }

    public CreateSqlSegmentDto refreshIntervalMinutes(Long refreshIntervalMinutes) {
        this.refreshIntervalMinutes = refreshIntervalMinutes;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
