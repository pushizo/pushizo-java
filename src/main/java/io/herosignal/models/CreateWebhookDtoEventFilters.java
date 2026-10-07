// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebhookDtoEventFilters şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWebhookDtoEventFilters {
    @JsonProperty("event_names")
    private java.util.List<String> eventNames;

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public CreateWebhookDtoEventFilters eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
