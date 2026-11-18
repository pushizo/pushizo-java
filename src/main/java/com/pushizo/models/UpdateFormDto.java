// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateFormDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateFormDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("fields")
    private java.util.List<UpdateFormDtoFieldsItem> fields;

    @JsonProperty("settings")
    private UpdateFormDtoSettings settings;

    /**
     * Değerler: "active", "archived".
     */
    @JsonProperty("status")
    private String status;

    public String getName() {
        return name;
    }

    public UpdateFormDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<UpdateFormDtoFieldsItem> getFields() {
        return fields;
    }

    public UpdateFormDto fields(java.util.List<UpdateFormDtoFieldsItem> fields) {
        this.fields = fields;
        return this;
    }

    public UpdateFormDtoSettings getSettings() {
        return settings;
    }

    public UpdateFormDto settings(UpdateFormDtoSettings settings) {
        this.settings = settings;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UpdateFormDto status(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
