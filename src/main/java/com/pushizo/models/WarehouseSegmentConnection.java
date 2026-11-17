// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseSegmentConnection şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseSegmentConnection {
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
     * Zorunlu. Değerler: "bigquery", "snowflake", "databricks".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("config")
    private java.util.Map<String, Object> config;

    /**
     * Zorunlu.
     */
    @JsonProperty("credentials_hint")
    private String credentialsHint;

    /**
     * Zorunlu.
     */
    @JsonProperty("segment_count")
    private Long segmentCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_tested_at")
    private String lastTestedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_test_error")
    private String lastTestError;

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

    public WarehouseSegmentConnection id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public WarehouseSegmentConnection appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public WarehouseSegmentConnection name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public WarehouseSegmentConnection type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, Object> getConfig() {
        return config;
    }

    public WarehouseSegmentConnection config(java.util.Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public String getCredentialsHint() {
        return credentialsHint;
    }

    public WarehouseSegmentConnection credentialsHint(String credentialsHint) {
        this.credentialsHint = credentialsHint;
        return this;
    }

    public Long getSegmentCount() {
        return segmentCount;
    }

    public WarehouseSegmentConnection segmentCount(Long segmentCount) {
        this.segmentCount = segmentCount;
        return this;
    }

    public String getLastTestedAt() {
        return lastTestedAt;
    }

    public WarehouseSegmentConnection lastTestedAt(String lastTestedAt) {
        this.lastTestedAt = lastTestedAt;
        return this;
    }

    public String getLastTestError() {
        return lastTestError;
    }

    public WarehouseSegmentConnection lastTestError(String lastTestError) {
        this.lastTestError = lastTestError;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public WarehouseSegmentConnection createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public WarehouseSegmentConnection updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
