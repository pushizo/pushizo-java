// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PreviewWarehouseQueryDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PreviewWarehouseQueryDto {
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

    @JsonProperty("limits")
    private PreviewWarehouseQueryDtoLimits limits;

    /**
     * Değerler: "dry_run", "sample".
     */
    @JsonProperty("mode")
    private String mode;

    public String getConnectionId() {
        return connectionId;
    }

    public PreviewWarehouseQueryDto connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    public String getQuery() {
        return query;
    }

    public PreviewWarehouseQueryDto query(String query) {
        this.query = query;
        return this;
    }

    public String getIdColumn() {
        return idColumn;
    }

    public PreviewWarehouseQueryDto idColumn(String idColumn) {
        this.idColumn = idColumn;
        return this;
    }

    public String getIdType() {
        return idType;
    }

    public PreviewWarehouseQueryDto idType(String idType) {
        this.idType = idType;
        return this;
    }

    public PreviewWarehouseQueryDtoLimits getLimits() {
        return limits;
    }

    public PreviewWarehouseQueryDto limits(PreviewWarehouseQueryDtoLimits limits) {
        this.limits = limits;
        return this;
    }

    public String getMode() {
        return mode;
    }

    public PreviewWarehouseQueryDto mode(String mode) {
        this.mode = mode;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
