// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** FunnelReport şeması (api/openapi.yaml). */
public final class FunnelReport {

    /** "from" alanı. Zorunlu. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. Zorunlu. */
    @JsonProperty("to")
    private String to;

    /** "window_hours" alanı. Zorunlu. */
    @JsonProperty("window_hours")
    private Long windowHours;

    /** "steps" alanı. Zorunlu. */
    @JsonProperty("steps")
    private List<FunnelReportStepsItem> steps;

    /** "overall_rate" alanı. Zorunlu. */
    @JsonProperty("overall_rate")
    private Double overallRate;

    /** "previous" alanı. Zorunlu. */
    @JsonProperty("previous")
    private FunnelReportPrevious previous;

    /** @return "from" alanı */
    public String getFrom() {
        return from;
    }

    /**
     * "from" alanını ayarlar.
     *
     * @param from yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReport setFrom(String from) {
        this.from = from;
        return this;
    }

    /** @return "to" alanı */
    public String getTo() {
        return to;
    }

    /**
     * "to" alanını ayarlar.
     *
     * @param to yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReport setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return "window_hours" alanı */
    public Long getWindowHours() {
        return windowHours;
    }

    /**
     * "window_hours" alanını ayarlar.
     *
     * @param windowHours yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReport setWindowHours(Long windowHours) {
        this.windowHours = windowHours;
        return this;
    }

    /** @return "steps" alanı */
    public List<FunnelReportStepsItem> getSteps() {
        return steps;
    }

    /**
     * "steps" alanını ayarlar.
     *
     * @param steps yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReport setSteps(List<FunnelReportStepsItem> steps) {
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
    public FunnelReport setOverallRate(Double overallRate) {
        this.overallRate = overallRate;
        return this;
    }

    /** @return "previous" alanı */
    public FunnelReportPrevious getPrevious() {
        return previous;
    }

    /**
     * "previous" alanını ayarlar.
     *
     * @param previous yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelReport setPrevious(FunnelReportPrevious previous) {
        this.previous = previous;
        return this;
    }
}
