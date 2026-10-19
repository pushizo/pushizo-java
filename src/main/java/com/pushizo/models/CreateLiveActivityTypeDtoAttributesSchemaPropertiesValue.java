// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue {
    /**
     * Zorunlu. Değerler: "string", "number", "integer", "boolean".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("enum")
    private java.util.List<Object> enum_;

    @JsonProperty("maxLength")
    private Long maxLength;

    @JsonProperty("minimum")
    private Double minimum;

    @JsonProperty("maximum")
    private Double maximum;

    @JsonProperty("description")
    private String description;

    public String getType() {
        return type;
    }

    public CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue type(String type) {
        this.type = type;
        return this;
    }

    public java.util.List<Object> getEnum_() {
        return enum_;
    }

    public CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue enum_(java.util.List<Object> enum_) {
        this.enum_ = enum_;
        return this;
    }

    public Long getMaxLength() {
        return maxLength;
    }

    public CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue maxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    public Double getMinimum() {
        return minimum;
    }

    public CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue minimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    public Double getMaximum() {
        return maximum;
    }

    public CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue maximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
