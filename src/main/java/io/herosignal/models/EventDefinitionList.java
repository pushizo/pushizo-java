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

    /**
     * Zorunlu.
     */
    @JsonProperty("next_cursor")
    private String nextCursor;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_more")
    private Boolean hasMore;

    public java.util.List<EventDefinition> getData() {
        return data;
    }

    public EventDefinitionList data(java.util.List<EventDefinition> data) {
        this.data = data;
        return this;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public EventDefinitionList nextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public EventDefinitionList hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
