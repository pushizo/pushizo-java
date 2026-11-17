// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateDataSourceDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateDataSourceDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Değerler: "signature", "token".
     */
    @JsonProperty("auth_mode")
    private String authMode;

    @JsonProperty("mapping")
    private UpdateDataSourceDtoMapping mapping;

    @JsonProperty("config")
    private UpdateDataSourceDtoConfig config;

    @JsonProperty("auth_value")
    private String authValue;

    public String getName() {
        return name;
    }

    public UpdateDataSourceDto name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateDataSourceDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getAuthMode() {
        return authMode;
    }

    public UpdateDataSourceDto authMode(String authMode) {
        this.authMode = authMode;
        return this;
    }

    public UpdateDataSourceDtoMapping getMapping() {
        return mapping;
    }

    public UpdateDataSourceDto mapping(UpdateDataSourceDtoMapping mapping) {
        this.mapping = mapping;
        return this;
    }

    public UpdateDataSourceDtoConfig getConfig() {
        return config;
    }

    public UpdateDataSourceDto config(UpdateDataSourceDtoConfig config) {
        this.config = config;
        return this;
    }

    public String getAuthValue() {
        return authValue;
    }

    public UpdateDataSourceDto authValue(String authValue) {
        this.authValue = authValue;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
