// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebPersonalizationDtoVariantsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebPersonalizationDtoVariantsItem {
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
    @JsonProperty("changes")
    private java.util.List<Object> changes;

    public String getId() {
        return id;
    }

    public UpdateWebPersonalizationDtoVariantsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateWebPersonalizationDtoVariantsItem name(String name) {
        this.name = name;
        return this;
    }

    public Long getWeightPercent() {
        return weightPercent;
    }

    public UpdateWebPersonalizationDtoVariantsItem weightPercent(Long weightPercent) {
        this.weightPercent = weightPercent;
        return this;
    }

    public java.util.List<Object> getChanges() {
        return changes;
    }

    public UpdateWebPersonalizationDtoVariantsItem changes(java.util.List<Object> changes) {
        this.changes = changes;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
