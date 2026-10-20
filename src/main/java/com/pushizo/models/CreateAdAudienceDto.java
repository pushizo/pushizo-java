// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAdAudienceDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateAdAudienceDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("ad_account_id")
    private String adAccountId;

    /**
     * Zorunlu. Değerler: "segment", "journey".
     */
    @JsonProperty("source")
    private String source;

    @JsonProperty("segment_id")
    private String segmentId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * Değerler: "email", "phone", "maid".
     */
    @JsonProperty("identifiers")
    private java.util.List<String> identifiers;

    @JsonProperty("sync_interval_minutes")
    private Long syncIntervalMinutes;

    public String getAdAccountId() {
        return adAccountId;
    }

    public CreateAdAudienceDto adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    public String getSource() {
        return source;
    }

    public CreateAdAudienceDto source(String source) {
        this.source = source;
        return this;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public CreateAdAudienceDto segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAdAudienceDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAdAudienceDto description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<String> getIdentifiers() {
        return identifiers;
    }

    public CreateAdAudienceDto identifiers(java.util.List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public Long getSyncIntervalMinutes() {
        return syncIntervalMinutes;
    }

    public CreateAdAudienceDto syncIntervalMinutes(Long syncIntervalMinutes) {
        this.syncIntervalMinutes = syncIntervalMinutes;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
