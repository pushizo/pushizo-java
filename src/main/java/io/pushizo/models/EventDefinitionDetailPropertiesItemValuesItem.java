// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventDefinitionDetailPropertiesItemValuesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventDefinitionDetailPropertiesItemValuesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    /**
     * Zorunlu.
     */
    @JsonProperty("count")
    private Long count;

    public String getValue() {
        return value;
    }

    public EventDefinitionDetailPropertiesItemValuesItem value(String value) {
        this.value = value;
        return this;
    }

    public Long getCount() {
        return count;
    }

    public EventDefinitionDetailPropertiesItemValuesItem count(Long count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
