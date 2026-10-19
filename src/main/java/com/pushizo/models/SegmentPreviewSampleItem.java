// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentPreviewSampleItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentPreviewSampleItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("tags")
    private java.util.Map<String, String> tags;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_active_at")
    private String lastActiveAt;

    public String getId() {
        return id;
    }

    public SegmentPreviewSampleItem id(String id) {
        this.id = id;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public SegmentPreviewSampleItem externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    public SegmentPreviewSampleItem tags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public String getLastActiveAt() {
        return lastActiveAt;
    }

    public SegmentPreviewSampleItem lastActiveAt(String lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
