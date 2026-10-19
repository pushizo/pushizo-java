// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInAppDtoVariantsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateInAppDtoVariantsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("weight_percent")
    private Long weightPercent;

    /**
     * Zorunlu.
     */
    @JsonProperty("display")
    private UpdateInAppDtoVariantsItemDisplay display;

    public String getId() {
        return id;
    }

    public UpdateInAppDtoVariantsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateInAppDtoVariantsItem name(String name) {
        this.name = name;
        return this;
    }

    public Long getWeightPercent() {
        return weightPercent;
    }

    public UpdateInAppDtoVariantsItem weightPercent(Long weightPercent) {
        this.weightPercent = weightPercent;
        return this;
    }

    public UpdateInAppDtoVariantsItemDisplay getDisplay() {
        return display;
    }

    public UpdateInAppDtoVariantsItem display(UpdateInAppDtoVariantsItemDisplay display) {
        this.display = display;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
