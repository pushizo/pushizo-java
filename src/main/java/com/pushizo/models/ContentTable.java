// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentTable şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ContentTable {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("key_column")
    private String keyColumn;

    /**
     * Zorunlu.
     */
    @JsonProperty("columns")
    private java.util.List<String> columns;

    /**
     * Zorunlu.
     */
    @JsonProperty("row_count")
    private Long rowCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("version")
    private Long version;

    /**
     * Zorunlu.
     */
    @JsonProperty("source_file_name")
    private String sourceFileName;

    /**
     * Zorunlu.
     */
    @JsonProperty("liquid")
    private String liquid;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public ContentTable id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public ContentTable appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ContentTable name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ContentTable description(String description) {
        this.description = description;
        return this;
    }

    public String getKeyColumn() {
        return keyColumn;
    }

    public ContentTable keyColumn(String keyColumn) {
        this.keyColumn = keyColumn;
        return this;
    }

    public java.util.List<String> getColumns() {
        return columns;
    }

    public ContentTable columns(java.util.List<String> columns) {
        this.columns = columns;
        return this;
    }

    public Long getRowCount() {
        return rowCount;
    }

    public ContentTable rowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public ContentTable version(Long version) {
        this.version = version;
        return this;
    }

    public String getSourceFileName() {
        return sourceFileName;
    }

    public ContentTable sourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
        return this;
    }

    public String getLiquid() {
        return liquid;
    }

    public ContentTable liquid(String liquid) {
        this.liquid = liquid;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ContentTable createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public ContentTable updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
