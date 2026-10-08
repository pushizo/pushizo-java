// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** ProvidersReportPrevious şeması (api/openapi.yaml). */
public final class ProvidersReportPrevious {

    /** "sent" alanı. Zorunlu. */
    @JsonProperty("sent")
    private Long sent;

    /** "failed" alanı. Zorunlu. */
    @JsonProperty("failed")
    private Long failed;

    /** "failure_rate" alanı. Zorunlu. */
    @JsonProperty("failure_rate")
    private Double failureRate;

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
    public ProvidersReportPrevious setSent(Long sent) {
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
    public ProvidersReportPrevious setFailed(Long failed) {
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
    public ProvidersReportPrevious setFailureRate(Double failureRate) {
        this.failureRate = failureRate;
        return this;
    }
}
