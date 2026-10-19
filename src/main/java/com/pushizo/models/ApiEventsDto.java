// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ApiEventsDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ApiEventsDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("events")
    private java.util.List<ApiEventsDtoEventsItem> events;

    public java.util.List<ApiEventsDtoEventsItem> getEvents() {
        return events;
    }

    public ApiEventsDto events(java.util.List<ApiEventsDtoEventsItem> events) {
        this.events = events;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
