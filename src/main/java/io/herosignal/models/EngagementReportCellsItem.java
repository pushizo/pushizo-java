// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EngagementReportCellsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EngagementReportCellsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("weekday")
    private Long weekday;

    /**
     * Zorunlu.
     */
    @JsonProperty("hour")
    private Long hour;

    /**
     * Zorunlu.
     */
    @JsonProperty("opened")
    private Long opened;

    /**
     * Zorunlu.
     */
    @JsonProperty("clicked")
    private Long clicked;

    public Long getWeekday() {
        return weekday;
    }

    public EngagementReportCellsItem weekday(Long weekday) {
        this.weekday = weekday;
        return this;
    }

    public Long getHour() {
        return hour;
    }

    public EngagementReportCellsItem hour(Long hour) {
        this.hour = hour;
        return this;
    }

    public Long getOpened() {
        return opened;
    }

    public EngagementReportCellsItem opened(Long opened) {
        this.opened = opened;
        return this;
    }

    public Long getClicked() {
        return clicked;
    }

    public EngagementReportCellsItem clicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
