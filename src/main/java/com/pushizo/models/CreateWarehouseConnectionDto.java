// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWarehouseConnectionDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWarehouseConnectionDto {
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
    @JsonProperty("credentials")
    private java.util.Map<String, Object> credentials;

    public String getName() {
        return name;
    }

    public CreateWarehouseConnectionDto name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateWarehouseConnectionDto type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, Object> getConfig() {
        return config;
    }

    public CreateWarehouseConnectionDto config(java.util.Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public java.util.Map<String, Object> getCredentials() {
        return credentials;
    }

    public CreateWarehouseConnectionDto credentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
