// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** EngagementReportRowsItem şeması (api/openapi.yaml). */
public final class EngagementReportRowsItem {

    /** "date" alanı. Zorunlu. */
    @JsonProperty("date")
    private String date;

    /** "opened" alanı. Zorunlu. */
    @JsonProperty("opened")
    private Long opened;

    /** "clicked" alanı. Zorunlu. */
    @JsonProperty("clicked")
    private Long clicked;

    /** @return "date" alanı */
    public String getDate() {
        return date;
    }

    /**
     * "date" alanını ayarlar.
     *
     * @param date yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EngagementReportRowsItem setDate(String date) {
        this.date = date;
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
    public EngagementReportRowsItem setOpened(Long opened) {
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
    public EngagementReportRowsItem setClicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }
}
