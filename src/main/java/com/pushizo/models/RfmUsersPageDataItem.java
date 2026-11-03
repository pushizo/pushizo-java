// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RfmUsersPageDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RfmUsersPageDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu. Değerler: "champions", "loyal", "potential", "new", "promising", "need_attention", "about_to_sleep", "at_risk", "cant_lose", "hibernating", "lost".
     */
    @JsonProperty("segment")
    private String segment;

    /**
     * Zorunlu.
     */
    @JsonProperty("r")
    private Long r;

    /**
     * Zorunlu.
     */
    @JsonProperty("f")
    private Long f;

    /**
     * Zorunlu.
     */
    @JsonProperty("m")
    private Long m;

    /**
     * Zorunlu.
     */
    @JsonProperty("recency_days")
    private Long recencyDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("frequency")
    private Long frequency;

    /**
     * Zorunlu.
     */
    @JsonProperty("monetary")
    private Double monetary;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_event_at")
    private String lastEventAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("segment_since")
    private String segmentSince;

    public String getUserId() {
        return userId;
    }

    public RfmUsersPageDataItem userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public RfmUsersPageDataItem externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getSegment() {
        return segment;
    }

    public RfmUsersPageDataItem segment(String segment) {
        this.segment = segment;
        return this;
    }

    public Long getR() {
        return r;
    }

    public RfmUsersPageDataItem r(Long r) {
        this.r = r;
        return this;
    }

    public Long getF() {
        return f;
    }

    public RfmUsersPageDataItem f(Long f) {
        this.f = f;
        return this;
    }

    public Long getM() {
        return m;
    }

    public RfmUsersPageDataItem m(Long m) {
        this.m = m;
        return this;
    }

    public Long getRecencyDays() {
        return recencyDays;
    }

    public RfmUsersPageDataItem recencyDays(Long recencyDays) {
        this.recencyDays = recencyDays;
        return this;
    }

    public Long getFrequency() {
        return frequency;
    }

    public RfmUsersPageDataItem frequency(Long frequency) {
        this.frequency = frequency;
        return this;
    }

    public Double getMonetary() {
        return monetary;
    }

    public RfmUsersPageDataItem monetary(Double monetary) {
        this.monetary = monetary;
        return this;
    }

    public String getLastEventAt() {
        return lastEventAt;
    }

    public RfmUsersPageDataItem lastEventAt(String lastEventAt) {
        this.lastEventAt = lastEventAt;
        return this;
    }

    public String getSegmentSince() {
        return segmentSince;
    }

    public RfmUsersPageDataItem segmentSince(String segmentSince) {
        this.segmentSince = segmentSince;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
