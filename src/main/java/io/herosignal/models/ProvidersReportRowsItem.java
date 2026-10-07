// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProvidersReportRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ProvidersReportRowsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("provider")
    private String provider;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("latency_p50_ms")
    private Double latencyP50Ms;

    /**
     * Zorunlu.
     */
    @JsonProperty("latency_p95_ms")
    private Double latencyP95Ms;

    /**
     * Zorunlu.
     */
    @JsonProperty("errors")
    private java.util.List<ProvidersReportRowsItemErrorsItem> errors;

    public String getChannel() {
        return channel;
    }

    public ProvidersReportRowsItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getProvider() {
        return provider;
    }

    public ProvidersReportRowsItem provider(String provider) {
        this.provider = provider;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public ProvidersReportRowsItem sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public ProvidersReportRowsItem failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Double getFailureRate() {
        return failureRate;
    }

    public ProvidersReportRowsItem failureRate(Double failureRate) {
        this.failureRate = failureRate;
        return this;
    }

    public Double getLatencyP50Ms() {
        return latencyP50Ms;
    }

    public ProvidersReportRowsItem latencyP50Ms(Double latencyP50Ms) {
        this.latencyP50Ms = latencyP50Ms;
        return this;
    }

    public Double getLatencyP95Ms() {
        return latencyP95Ms;
    }

    public ProvidersReportRowsItem latencyP95Ms(Double latencyP95Ms) {
        this.latencyP95Ms = latencyP95Ms;
        return this;
    }

    public java.util.List<ProvidersReportRowsItemErrorsItem> getErrors() {
        return errors;
    }

    public ProvidersReportRowsItem errors(java.util.List<ProvidersReportRowsItemErrorsItem> errors) {
        this.errors = errors;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
