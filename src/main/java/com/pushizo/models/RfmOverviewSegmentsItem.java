// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RfmOverviewSegmentsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RfmOverviewSegmentsItem {
    /**
     * Zorunlu. Değerler: "champions", "loyal", "potential", "new", "promising", "need_attention", "about_to_sleep", "at_risk", "cant_lose", "hibernating", "lost".
     */
    @JsonProperty("segment")
    private String segment;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    /**
     * Zorunlu.
     */
    @JsonProperty("share")
    private Double share;

    /**
     * Zorunlu.
     */
    @JsonProperty("avg_recency_days")
    private Double avgRecencyDays;

    /**
     * Zorunlu.
     */
    @JsonProperty("avg_frequency")
    private Double avgFrequency;

    /**
     * Zorunlu.
     */
    @JsonProperty("avg_monetary")
    private Double avgMonetary;

    public String getSegment() {
        return segment;
    }

    public RfmOverviewSegmentsItem segment(String segment) {
        this.segment = segment;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public RfmOverviewSegmentsItem users(Long users) {
        this.users = users;
        return this;
    }

    public Double getShare() {
        return share;
    }

    public RfmOverviewSegmentsItem share(Double share) {
        this.share = share;
        return this;
    }

    public Double getAvgRecencyDays() {
        return avgRecencyDays;
    }

    public RfmOverviewSegmentsItem avgRecencyDays(Double avgRecencyDays) {
        this.avgRecencyDays = avgRecencyDays;
        return this;
    }

    public Double getAvgFrequency() {
        return avgFrequency;
    }

    public RfmOverviewSegmentsItem avgFrequency(Double avgFrequency) {
        this.avgFrequency = avgFrequency;
        return this;
    }

    public Double getAvgMonetary() {
        return avgMonetary;
    }

    public RfmOverviewSegmentsItem avgMonetary(Double avgMonetary) {
        this.avgMonetary = avgMonetary;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
