// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventDefinitionDetailPropertiesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventDefinitionDetailPropertiesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Zorunlu.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("values")
    private java.util.List<EventDefinitionDetailPropertiesItemValuesItem> values;

    public String getKey() {
        return key;
    }

    public EventDefinitionDetailPropertiesItem key(String key) {
        this.key = key;
        return this;
    }

    public String getType() {
        return type;
    }

    public EventDefinitionDetailPropertiesItem type(String type) {
        this.type = type;
        return this;
    }

    public java.util.List<EventDefinitionDetailPropertiesItemValuesItem> getValues() {
        return values;
    }

    public EventDefinitionDetailPropertiesItem values(java.util.List<EventDefinitionDetailPropertiesItemValuesItem> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
