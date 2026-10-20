// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateFormDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateFormDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("fields")
    private java.util.List<CreateFormDtoFieldsItem> fields;

    @JsonProperty("settings")
    private CreateFormDtoSettings settings;

    /**
     * Değerler: "active", "archived".
     */
    @JsonProperty("status")
    private String status;

    public String getName() {
        return name;
    }

    public CreateFormDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<CreateFormDtoFieldsItem> getFields() {
        return fields;
    }

    public CreateFormDto fields(java.util.List<CreateFormDtoFieldsItem> fields) {
        this.fields = fields;
        return this;
    }

    public CreateFormDtoSettings getSettings() {
        return settings;
    }

    public CreateFormDto settings(CreateFormDtoSettings settings) {
        this.settings = settings;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CreateFormDto status(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
