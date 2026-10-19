// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateNodeDtoPosition şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateNodeDtoPosition {
    /**
     * Zorunlu.
     */
    @JsonProperty("x")
    private Double x;

    /**
     * Zorunlu.
     */
    @JsonProperty("y")
    private Double y;

    public Double getX() {
        return x;
    }

    public UpdateNodeDtoPosition x(Double x) {
        this.x = x;
        return this;
    }

    public Double getY() {
        return y;
    }

    public UpdateNodeDtoPosition y(Double y) {
        this.y = y;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
