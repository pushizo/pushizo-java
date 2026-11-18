// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TraceResultItemsItemEventsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TraceResultItemsItemEventsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("detail")
    private java.util.Map<String, Object> detail;

    /**
     * Zorunlu.
     */
    @JsonProperty("occurred_at")
    private String occurredAt;

    public String getId() {
        return id;
    }

    public TraceResultItemsItemEventsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public TraceResultItemsItemEventsItem type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, Object> getDetail() {
        return detail;
    }

    public TraceResultItemsItemEventsItem detail(java.util.Map<String, Object> detail) {
        this.detail = detail;
        return this;
    }

    public String getOccurredAt() {
        return occurredAt;
    }

    public TraceResultItemsItemEventsItem occurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
