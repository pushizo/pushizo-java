// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateDataSourceDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateDataSourceDto {
    /**
     * Zorunlu.
     */
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
    private CreateDataSourceDtoMapping mapping;

    @JsonProperty("config")
    private CreateDataSourceDtoConfig config;

    @JsonProperty("auth_value")
    private String authValue;

    /**
     * Zorunlu. Değerler: "webhook", "http_pull".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu. Değerler: "event", "person".
     */
    @JsonProperty("target")
    private String target;

    public String getName() {
        return name;
    }

    public CreateDataSourceDto name(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateDataSourceDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getAuthMode() {
        return authMode;
    }

    public CreateDataSourceDto authMode(String authMode) {
        this.authMode = authMode;
        return this;
    }

    public CreateDataSourceDtoMapping getMapping() {
        return mapping;
    }

    public CreateDataSourceDto mapping(CreateDataSourceDtoMapping mapping) {
        this.mapping = mapping;
        return this;
    }

    public CreateDataSourceDtoConfig getConfig() {
        return config;
    }

    public CreateDataSourceDto config(CreateDataSourceDtoConfig config) {
        this.config = config;
        return this;
    }

    public String getAuthValue() {
        return authValue;
    }

    public CreateDataSourceDto authValue(String authValue) {
        this.authValue = authValue;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public CreateDataSourceDto kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getTarget() {
        return target;
    }

    public CreateDataSourceDto target(String target) {
        this.target = target;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
