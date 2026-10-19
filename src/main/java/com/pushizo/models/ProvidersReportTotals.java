// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProvidersReportTotals şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ProvidersReportTotals {
    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Zorunlu.
     */
    @JsonProperty("failure_rate")
    private Double failureRate;

    public Long getSent() {
        return sent;
    }

    public ProvidersReportTotals sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public ProvidersReportTotals failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Double getFailureRate() {
        return failureRate;
    }

    public ProvidersReportTotals failureRate(Double failureRate) {
        this.failureRate = failureRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
