// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FunnelBodyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FunnelBodyDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("steps")
    private java.util.List<FunnelBodyDtoStepsItem> steps;

    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    @JsonProperty("window_hours")
    private Long windowHours;

    @JsonProperty("compare")
    private Boolean compare;

    /**
     * Değerler: "json", "csv".
     */
    @JsonProperty("format")
    private String format;

    public java.util.List<FunnelBodyDtoStepsItem> getSteps() {
        return steps;
    }

    public FunnelBodyDto steps(java.util.List<FunnelBodyDtoStepsItem> steps) {
        this.steps = steps;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public FunnelBodyDto from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public FunnelBodyDto to(String to) {
        this.to = to;
        return this;
    }

    public Long getWindowHours() {
        return windowHours;
    }

    public FunnelBodyDto windowHours(Long windowHours) {
        this.windowHours = windowHours;
        return this;
    }

    public Boolean getCompare() {
        return compare;
    }

    public FunnelBodyDto compare(Boolean compare) {
        this.compare = compare;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public FunnelBodyDto format(String format) {
        this.format = format;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
