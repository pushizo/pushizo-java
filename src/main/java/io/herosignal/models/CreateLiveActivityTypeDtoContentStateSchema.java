// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLiveActivityTypeDtoContentStateSchema şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateLiveActivityTypeDtoContentStateSchema {
    /**
     * Zorunlu. Değerler: "object".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("properties")
    private java.util.Map<String, CreateLiveActivityTypeDtoContentStateSchemaPropertiesValue> properties;

    @JsonProperty("required")
    private java.util.List<String> required;

    public String getType() {
        return type;
    }

    public CreateLiveActivityTypeDtoContentStateSchema type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, CreateLiveActivityTypeDtoContentStateSchemaPropertiesValue> getProperties() {
        return properties;
    }

    public CreateLiveActivityTypeDtoContentStateSchema properties(java.util.Map<String, CreateLiveActivityTypeDtoContentStateSchemaPropertiesValue> properties) {
        this.properties = properties;
        return this;
    }

    public java.util.List<String> getRequired() {
        return required;
    }

    public CreateLiveActivityTypeDtoContentStateSchema required(java.util.List<String> required) {
        this.required = required;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
