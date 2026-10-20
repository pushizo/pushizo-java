// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxMetricsDailyItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxMetricsDailyItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Zorunlu.
     */
    @JsonProperty("created")
    private Long created;

    /**
     * Zorunlu.
     */
    @JsonProperty("resolved")
    private Long resolved;

    /**
     * Zorunlu.
     */
    @JsonProperty("first_response_avg_seconds")
    private Double firstResponseAvgSeconds;

    public String getDate() {
        return date;
    }

    public InboxMetricsDailyItem date(String date) {
        this.date = date;
        return this;
    }

    public Long getCreated() {
        return created;
    }

    public InboxMetricsDailyItem created(Long created) {
        this.created = created;
        return this;
    }

    public Long getResolved() {
        return resolved;
    }

    public InboxMetricsDailyItem resolved(Long resolved) {
        this.resolved = resolved;
        return this;
    }

    public Double getFirstResponseAvgSeconds() {
        return firstResponseAvgSeconds;
    }

    public InboxMetricsDailyItem firstResponseAvgSeconds(Double firstResponseAvgSeconds) {
        this.firstResponseAvgSeconds = firstResponseAvgSeconds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
