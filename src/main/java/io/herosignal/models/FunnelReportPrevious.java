// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** FunnelReportPrevious şeması (api/openapi.yaml). */
public final class FunnelReportPrevious {

    /** "steps" alanı. Zorunlu. */
    @JsonProperty("steps")
    private List<Long> steps;

    /** "overall_rate" alanı. Zorunlu. */
    @JsonProperty("overall_rate")
    private Double overallRate;

    /** @return "steps" alanı */
    public List<Long> getSteps() {
        return steps;
    }

    /**
     * "steps" alanını ayarlar.
     *
     * @param steps yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReportPrevious setSteps(List<Long> steps) {
        this.steps = steps;
        return this;
    }

    /** @return "overall_rate" alanı */
    public Double getOverallRate() {
        return overallRate;
    }

    /**
     * "overall_rate" alanını ayarlar.
     *
     * @param overallRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReportPrevious setOverallRate(Double overallRate) {
        this.overallRate = overallRate;
        return this;
    }
}
