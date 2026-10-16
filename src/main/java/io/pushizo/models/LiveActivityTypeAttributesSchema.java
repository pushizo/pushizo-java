// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LiveActivityTypeAttributesSchema şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LiveActivityTypeAttributesSchema {
    /**
     * Zorunlu. Değerler: "object".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("properties")
    private java.util.Map<String, LiveActivityTypeAttributesSchemaPropertiesValue> properties;

    @JsonProperty("required")
    private java.util.List<String> required;

    public String getType() {
        return type;
    }

    public LiveActivityTypeAttributesSchema type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, LiveActivityTypeAttributesSchemaPropertiesValue> getProperties() {
        return properties;
    }

    public LiveActivityTypeAttributesSchema properties(java.util.Map<String, LiveActivityTypeAttributesSchemaPropertiesValue> properties) {
        this.properties = properties;
        return this;
    }

    public java.util.List<String> getRequired() {
        return required;
    }

    public LiveActivityTypeAttributesSchema required(java.util.List<String> required) {
        this.required = required;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
