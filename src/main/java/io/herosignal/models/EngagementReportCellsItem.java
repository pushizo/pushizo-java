// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** EngagementReportCellsItem şeması (api/openapi.yaml). */
public final class EngagementReportCellsItem {

    /** "weekday" alanı. Zorunlu. */
    @JsonProperty("weekday")
    private Long weekday;

    /** "hour" alanı. Zorunlu. */
    @JsonProperty("hour")
    private Long hour;

    /** "opened" alanı. Zorunlu. */
    @JsonProperty("opened")
    private Long opened;

    /** "clicked" alanı. Zorunlu. */
    @JsonProperty("clicked")
    private Long clicked;

    /** @return "weekday" alanı */
    public Long getWeekday() {
        return weekday;
    }

    /**
     * "weekday" alanını ayarlar.
     *
     * @param weekday yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReportCellsItem setWeekday(Long weekday) {
        this.weekday = weekday;
        return this;
    }

    /** @return "hour" alanı */
    public Long getHour() {
        return hour;
    }

    /**
     * "hour" alanını ayarlar.
     *
     * @param hour yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReportCellsItem setHour(Long hour) {
        this.hour = hour;
        return this;
    }

    /** @return "opened" alanı */
    public Long getOpened() {
        return opened;
    }

    /**
     * "opened" alanını ayarlar.
     *
     * @param opened yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReportCellsItem setOpened(Long opened) {
        this.opened = opened;
        return this;
    }

    /** @return "clicked" alanı */
    public Long getClicked() {
        return clicked;
    }

    /**
     * "clicked" alanını ayarlar.
     *
     * @param clicked yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReportCellsItem setClicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }
}
