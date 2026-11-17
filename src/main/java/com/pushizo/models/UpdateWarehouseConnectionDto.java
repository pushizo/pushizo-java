// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWarehouseConnectionDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWarehouseConnectionDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("config")
    private java.util.Map<String, Object> config;

    @JsonProperty("credentials")
    private java.util.Map<String, Object> credentials;

    public String getName() {
        return name;
    }

    public UpdateWarehouseConnectionDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.Map<String, Object> getConfig() {
        return config;
    }

    public UpdateWarehouseConnectionDto config(java.util.Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public java.util.Map<String, Object> getCredentials() {
        return credentials;
    }

    public UpdateWarehouseConnectionDto credentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
