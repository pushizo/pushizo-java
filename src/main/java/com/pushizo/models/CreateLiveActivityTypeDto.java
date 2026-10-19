// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLiveActivityTypeDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateLiveActivityTypeDto {
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
    @JsonProperty("content_state_schema")
    private CreateLiveActivityTypeDtoContentStateSchema contentStateSchema;

    @JsonProperty("attributes_schema")
    private CreateLiveActivityTypeDtoAttributesSchema attributesSchema;

    public String getName() {
        return name;
    }

    public CreateLiveActivityTypeDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateLiveActivityTypeDto description(String description) {
        this.description = description;
        return this;
    }

    public CreateLiveActivityTypeDtoContentStateSchema getContentStateSchema() {
        return contentStateSchema;
    }

    public CreateLiveActivityTypeDto contentStateSchema(CreateLiveActivityTypeDtoContentStateSchema contentStateSchema) {
        this.contentStateSchema = contentStateSchema;
        return this;
    }

    public CreateLiveActivityTypeDtoAttributesSchema getAttributesSchema() {
        return attributesSchema;
    }

    public CreateLiveActivityTypeDto attributesSchema(CreateLiveActivityTypeDtoAttributesSchema attributesSchema) {
        this.attributesSchema = attributesSchema;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
