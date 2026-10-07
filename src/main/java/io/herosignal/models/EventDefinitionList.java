// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventDefinitionList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventDefinitionList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<EventDefinition> data;

    public java.util.List<EventDefinition> getData() {
        return data;
    }

    public EventDefinitionList data(java.util.List<EventDefinition> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
