// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWarehouseSegmentDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWarehouseSegmentDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("connection_id")
    private String connectionId;

    @JsonProperty("query")
    private String query;

    @JsonProperty("id_column")
    private String idColumn;

    /**
     * Değerler: "external_id", "user_id".
     */
    @JsonProperty("id_type")
    private String idType;

    @JsonProperty("refresh_interval_minutes")
    private Long refreshIntervalMinutes;

    @JsonProperty("limits")
    private UpdateWarehouseSegmentDtoLimits limits;

    public String getName() {
        return name;
    }

    public UpdateWarehouseSegmentDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateWarehouseSegmentDto description(String description) {
        this.description = description;
        return this;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public UpdateWarehouseSegmentDto connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public UpdateWarehouseSegmentDto query(String query) {
        this.query = query;
        return this;
    }

    public String getIdColumn() {
        return idColumn;
    }

    public UpdateWarehouseSegmentDto idColumn(String idColumn) {
        this.idColumn = idColumn;
        return this;
    }

    public String getIdType() {
        return idType;
    }

    public UpdateWarehouseSegmentDto idType(String idType) {
        this.idType = idType;
        return this;
    }

    public Long getRefreshIntervalMinutes() {
        return refreshIntervalMinutes;
    }

    public UpdateWarehouseSegmentDto refreshIntervalMinutes(Long refreshIntervalMinutes) {
        this.refreshIntervalMinutes = refreshIntervalMinutes;
        return this;
    }

    public UpdateWarehouseSegmentDtoLimits getLimits() {
        return limits;
    }

    public UpdateWarehouseSegmentDto limits(UpdateWarehouseSegmentDtoLimits limits) {
        this.limits = limits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
