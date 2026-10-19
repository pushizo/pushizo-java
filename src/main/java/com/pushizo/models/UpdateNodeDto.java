// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateNodeDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateNodeDto {
    @JsonProperty("data")
    private java.util.Map<String, Object> data;

    @JsonProperty("position")
    private UpdateNodeDtoPosition position;

    public java.util.Map<String, Object> getData() {
        return data;
    }

    public UpdateNodeDto data(java.util.Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public UpdateNodeDtoPosition getPosition() {
        return position;
    }

    public UpdateNodeDto position(UpdateNodeDtoPosition position) {
        this.position = position;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
