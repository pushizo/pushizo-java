// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxMetricsResolution şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxMetricsResolution {
    /**
     * Zorunlu.
     */
    @JsonProperty("count")
    private Long count;

    /**
     * Zorunlu.
     */
    @JsonProperty("avg_seconds")
    private Double avgSeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("p90_seconds")
    private Double p90Seconds;

    public Long getCount() {
        return count;
    }

    public InboxMetricsResolution count(Long count) {
        this.count = count;
        return this;
    }

    public Double getAvgSeconds() {
        return avgSeconds;
    }

    public InboxMetricsResolution avgSeconds(Double avgSeconds) {
        this.avgSeconds = avgSeconds;
        return this;
    }

    public Double getP90Seconds() {
        return p90Seconds;
    }

    public InboxMetricsResolution p90Seconds(Double p90Seconds) {
        this.p90Seconds = p90Seconds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
