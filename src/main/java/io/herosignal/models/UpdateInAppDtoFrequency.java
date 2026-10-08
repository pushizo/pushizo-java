// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** UpdateInAppDtoFrequency şeması (api/openapi.yaml). */
public final class UpdateInAppDtoFrequency {

    /** "max_impressions" alanı. */
    @JsonProperty("max_impressions")
    private Long maxImpressions;

    /** "min_interval_seconds" alanı. */
    @JsonProperty("min_interval_seconds")
    private Long minIntervalSeconds;

    /** "stop_after_interaction" alanı. */
    @JsonProperty("stop_after_interaction")
    private Boolean stopAfterInteraction;

    /** @return "max_impressions" alanı */
    public Long getMaxImpressions() {
        return maxImpressions;
    }

    /**
     * "max_impressions" alanını ayarlar.
     *
     * @param maxImpressions yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDtoFrequency setMaxImpressions(Long maxImpressions) {
        this.maxImpressions = maxImpressions;
        return this;
    }

    /** @return "min_interval_seconds" alanı */
    public Long getMinIntervalSeconds() {
        return minIntervalSeconds;
    }

    /**
     * "min_interval_seconds" alanını ayarlar.
     *
     * @param minIntervalSeconds yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDtoFrequency setMinIntervalSeconds(Long minIntervalSeconds) {
        this.minIntervalSeconds = minIntervalSeconds;
        return this;
    }

    /** @return "stop_after_interaction" alanı */
    public Boolean getStopAfterInteraction() {
        return stopAfterInteraction;
    }

    /**
     * "stop_after_interaction" alanını ayarlar.
     *
     * @param stopAfterInteraction yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDtoFrequency setStopAfterInteraction(Boolean stopAfterInteraction) {
        this.stopAfterInteraction = stopAfterInteraction;
        return this;
    }
}
