// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLiveActivityTypeDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLiveActivityTypeDto {
    @JsonProperty("description")
    private String description;

    @JsonProperty("content_state_schema")
    private UpdateLiveActivityTypeDtoContentStateSchema contentStateSchema;

    @JsonProperty("attributes_schema")
    private UpdateLiveActivityTypeDtoAttributesSchema attributesSchema;

    public String getDescription() {
        return description;
    }

    public UpdateLiveActivityTypeDto description(String description) {
        this.description = description;
        return this;
    }

    public UpdateLiveActivityTypeDtoContentStateSchema getContentStateSchema() {
        return contentStateSchema;
    }

    public UpdateLiveActivityTypeDto contentStateSchema(UpdateLiveActivityTypeDtoContentStateSchema contentStateSchema) {
        this.contentStateSchema = contentStateSchema;
        return this;
    }

    public UpdateLiveActivityTypeDtoAttributesSchema getAttributesSchema() {
        return attributesSchema;
    }

    public UpdateLiveActivityTypeDto attributesSchema(UpdateLiveActivityTypeDtoAttributesSchema attributesSchema) {
        this.attributesSchema = attributesSchema;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
