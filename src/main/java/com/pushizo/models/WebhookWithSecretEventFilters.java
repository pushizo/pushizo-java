// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookWithSecretEventFilters şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookWithSecretEventFilters {
    @JsonProperty("event_names")
    private java.util.List<String> eventNames;

    public java.util.List<String> getEventNames() {
        return eventNames;
    }

    public WebhookWithSecretEventFilters eventNames(java.util.List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
