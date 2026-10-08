// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** FunnelBodyDto şeması (api/openapi.yaml). */
public final class FunnelBodyDto {

    /** "steps" alanı. Zorunlu. */
    @JsonProperty("steps")
    private List<FunnelBodyDtoStepsItem> steps;

    /** "from" alanı. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. */
    @JsonProperty("to")
    private String to;

    /** "window_hours" alanı. */
    @JsonProperty("window_hours")
    private Long windowHours;

    /** "compare" alanı. */
    @JsonProperty("compare")
    private Boolean compare;

    /** "format" alanı. Değerler: "json", "csv". */
    @JsonProperty("format")
    private String format;

    /** @return "steps" alanı */
    public List<FunnelBodyDtoStepsItem> getSteps() {
        return steps;
    }

    /**
     * "steps" alanını ayarlar.
     *
     * @param steps yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelBodyDto setSteps(List<FunnelBodyDtoStepsItem> steps) {
        this.steps = steps;
        return this;
    }

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
    public FunnelBodyDto setFrom(String from) {
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
    public FunnelBodyDto setTo(String to) {
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
    public FunnelBodyDto setWindowHours(Long windowHours) {
        this.windowHours = windowHours;
        return this;
    }

    /** @return "compare" alanı */
    public Boolean getCompare() {
        return compare;
    }

    /**
     * "compare" alanını ayarlar.
     *
     * @param compare yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelBodyDto setCompare(Boolean compare) {
        this.compare = compare;
        return this;
    }

    /** @return "format" alanı */
    public String getFormat() {
        return format;
    }

    /**
     * "format" alanını ayarlar.
     *
     * @param format yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelBodyDto setFormat(String format) {
        this.format = format;
        return this;
    }
}
