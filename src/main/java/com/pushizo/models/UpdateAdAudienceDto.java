// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAdAudienceDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAdAudienceDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("segment_id")
    private String segmentId;

    /**
     * Değerler: "email", "phone", "maid".
     */
    @JsonProperty("identifiers")
    private java.util.List<String> identifiers;

    @JsonProperty("sync_interval_minutes")
    private Long syncIntervalMinutes;

    /**
     * Değerler: "active", "paused".
     */
    @JsonProperty("status")
    private String status;

    public String getName() {
        return name;
    }

    public UpdateAdAudienceDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAdAudienceDto description(String description) {
        this.description = description;
        return this;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public UpdateAdAudienceDto segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public java.util.List<String> getIdentifiers() {
        return identifiers;
    }

    public UpdateAdAudienceDto identifiers(java.util.List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public Long getSyncIntervalMinutes() {
        return syncIntervalMinutes;
    }

    public UpdateAdAudienceDto syncIntervalMinutes(Long syncIntervalMinutes) {
        this.syncIntervalMinutes = syncIntervalMinutes;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UpdateAdAudienceDto status(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
