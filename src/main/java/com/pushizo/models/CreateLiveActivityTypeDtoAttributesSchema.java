// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLiveActivityTypeDtoAttributesSchema şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateLiveActivityTypeDtoAttributesSchema {
    /**
     * Zorunlu. Değerler: "object".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("properties")
    private java.util.Map<String, CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue> properties;

    @JsonProperty("required")
    private java.util.List<String> required;

    public String getType() {
        return type;
    }

    public CreateLiveActivityTypeDtoAttributesSchema type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue> getProperties() {
        return properties;
    }

    public CreateLiveActivityTypeDtoAttributesSchema properties(java.util.Map<String, CreateLiveActivityTypeDtoAttributesSchemaPropertiesValue> properties) {
        this.properties = properties;
        return this;
    }

    public java.util.List<String> getRequired() {
        return required;
    }

    public CreateLiveActivityTypeDtoAttributesSchema required(java.util.List<String> required) {
        this.required = required;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
