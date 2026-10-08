// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** ProvidersReportRowsItem şeması (api/openapi.yaml). */
public final class ProvidersReportRowsItem {

    /** "channel" alanı. Zorunlu. */
    @JsonProperty("channel")
    private String channel;

    /** "provider" alanı. Zorunlu. */
    @JsonProperty("provider")
    private String provider;

    /** "sent" alanı. Zorunlu. */
    @JsonProperty("sent")
    private Long sent;

    /** "failed" alanı. Zorunlu. */
    @JsonProperty("failed")
    private Long failed;

    /** "failure_rate" alanı. Zorunlu. */
    @JsonProperty("failure_rate")
    private Double failureRate;

    /** "latency_p50_ms" alanı. Zorunlu. */
    @JsonProperty("latency_p50_ms")
    private Double latencyP50Ms;

    /** "latency_p95_ms" alanı. Zorunlu. */
    @JsonProperty("latency_p95_ms")
    private Double latencyP95Ms;

    /** "errors" alanı. Zorunlu. */
    @JsonProperty("errors")
    private List<ProvidersReportRowsItemErrorsItem> errors;

    /** @return "channel" alanı */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" alanını ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReportRowsItem setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "provider" alanı */
    public String getProvider() {
        return provider;
    }

    /**
     * "provider" alanını ayarlar.
     *
     * @param provider yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReportRowsItem setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /** @return "sent" alanı */
    public Long getSent() {
        return sent;
    }

    /**
     * "sent" alanını ayarlar.
     *
     * @param sent yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReportRowsItem setSent(Long sent) {
        this.sent = sent;
        return this;
    }

    /** @return "failed" alanı */
    public Long getFailed() {
        return failed;
    }

    /**
     * "failed" alanını ayarlar.
     *
     * @param failed yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReportRowsItem setFailed(Long failed) {
        this.failed = failed;
        return this;
    }

    /** @return "failure_rate" alanı */
    public Double getFailureRate() {
        return failureRate;
    }

    /**
     * "failure_rate" alanını ayarlar.
     *
     * @param failureRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReportRowsItem setFailureRate(Double failureRate) {
        this.failureRate = failureRate;
        return this;
    }

    /** @return "latency_p50_ms" alanı */
    public Double getLatencyP50Ms() {
        return latencyP50Ms;
    }

    /**
     * "latency_p50_ms" alanını ayarlar.
     *
     * @param latencyP50Ms yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReportRowsItem setLatencyP50Ms(Double latencyP50Ms) {
        this.latencyP50Ms = latencyP50Ms;
        return this;
    }

    /** @return "latency_p95_ms" alanı */
    public Double getLatencyP95Ms() {
        return latencyP95Ms;
    }

    /**
     * "latency_p95_ms" alanını ayarlar.
     *
     * @param latencyP95Ms yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReportRowsItem setLatencyP95Ms(Double latencyP95Ms) {
        this.latencyP95Ms = latencyP95Ms;
        return this;
    }

    /** @return "errors" alanı */
    public List<ProvidersReportRowsItemErrorsItem> getErrors() {
        return errors;
    }

    /**
     * "errors" alanını ayarlar.
     *
     * @param errors yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ProvidersReportRowsItem setErrors(List<ProvidersReportRowsItemErrorsItem> errors) {
        this.errors = errors;
        return this;
    }
}
