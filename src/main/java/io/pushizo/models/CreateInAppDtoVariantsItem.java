// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateInAppDtoVariantsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateInAppDtoVariantsItem {
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
    private CreateInAppDtoVariantsItemDisplay display;

    public String getId() {
        return id;
    }

    public CreateInAppDtoVariantsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateInAppDtoVariantsItem name(String name) {
        this.name = name;
        return this;
    }

    public Long getWeightPercent() {
        return weightPercent;
    }

    public CreateInAppDtoVariantsItem weightPercent(Long weightPercent) {
        this.weightPercent = weightPercent;
        return this;
    }

    public CreateInAppDtoVariantsItemDisplay getDisplay() {
        return display;
    }

    public CreateInAppDtoVariantsItem display(CreateInAppDtoVariantsItemDisplay display) {
        this.display = display;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
