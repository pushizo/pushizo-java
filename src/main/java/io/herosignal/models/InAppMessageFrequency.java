// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InAppMessageFrequency şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InAppMessageFrequency {
    @JsonProperty("max_impressions")
    private Long maxImpressions;

    @JsonProperty("min_interval_seconds")
    private Long minIntervalSeconds;

    @JsonProperty("stop_after_interaction")
    private Boolean stopAfterInteraction;

    public Long getMaxImpressions() {
        return maxImpressions;
    }

    public InAppMessageFrequency maxImpressions(Long maxImpressions) {
        this.maxImpressions = maxImpressions;
        return this;
    }

    public Long getMinIntervalSeconds() {
        return minIntervalSeconds;
    }

    public InAppMessageFrequency minIntervalSeconds(Long minIntervalSeconds) {
        this.minIntervalSeconds = minIntervalSeconds;
        return this;
    }

    public Boolean getStopAfterInteraction() {
        return stopAfterInteraction;
    }

    public InAppMessageFrequency stopAfterInteraction(Boolean stopAfterInteraction) {
        this.stopAfterInteraction = stopAfterInteraction;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
