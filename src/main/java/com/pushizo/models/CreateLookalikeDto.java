// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLookalikeDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateLookalikeDto {
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("country")
    private String country;

    /**
     * Zorunlu.
     */
    @JsonProperty("ratio")
    private Double ratio;

    public String getName() {
        return name;
    }

    public CreateLookalikeDto name(String name) {
        this.name = name;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public CreateLookalikeDto country(String country) {
        this.country = country;
        return this;
    }

    public Double getRatio() {
        return ratio;
    }

    public CreateLookalikeDto ratio(Double ratio) {
        this.ratio = ratio;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
