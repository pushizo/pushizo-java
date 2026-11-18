// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWarehouseSegmentDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWarehouseSegmentDto {
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
    @JsonProperty("connection_id")
    private String connectionId;

    /**
     * Zorunlu.
     */
    @JsonProperty("query")
    private String query;

    /**
     * Zorunlu.
     */
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
    private CreateWarehouseSegmentDtoLimits limits;

    public String getName() {
        return name;
    }

    public CreateWarehouseSegmentDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateWarehouseSegmentDto description(String description) {
        this.description = description;
        return this;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public CreateWarehouseSegmentDto connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public CreateWarehouseSegmentDto query(String query) {
        this.query = query;
        return this;
    }

    public String getIdColumn() {
        return idColumn;
    }

    public CreateWarehouseSegmentDto idColumn(String idColumn) {
        this.idColumn = idColumn;
        return this;
    }

    public String getIdType() {
        return idType;
    }

    public CreateWarehouseSegmentDto idType(String idType) {
        this.idType = idType;
        return this;
    }

    public Long getRefreshIntervalMinutes() {
        return refreshIntervalMinutes;
    }

    public CreateWarehouseSegmentDto refreshIntervalMinutes(Long refreshIntervalMinutes) {
        this.refreshIntervalMinutes = refreshIntervalMinutes;
        return this;
    }

    public CreateWarehouseSegmentDtoLimits getLimits() {
        return limits;
    }

    public CreateWarehouseSegmentDto limits(CreateWarehouseSegmentDtoLimits limits) {
        this.limits = limits;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
