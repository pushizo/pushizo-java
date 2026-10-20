// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxMetricsSla şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxMetricsSla {
    /**
     * Zorunlu.
     */
    @JsonProperty("target_seconds")
    private Long targetSeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("met")
    private Long met;

    /**
     * Zorunlu.
     */
    @JsonProperty("breached")
    private Long breached;

    /**
     * Zorunlu.
     */
    @JsonProperty("rate")
    private Double rate;

    public Long getTargetSeconds() {
        return targetSeconds;
    }

    public InboxMetricsSla targetSeconds(Long targetSeconds) {
        this.targetSeconds = targetSeconds;
        return this;
    }

    public Long getMet() {
        return met;
    }

    public InboxMetricsSla met(Long met) {
        this.met = met;
        return this;
    }

    public Long getBreached() {
        return breached;
    }

    public InboxMetricsSla breached(Long breached) {
        this.breached = breached;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public InboxMetricsSla rate(Double rate) {
        this.rate = rate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
