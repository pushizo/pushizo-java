// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** MessagesReportPrevious şeması (api/openapi.yaml). */
public final class MessagesReportPrevious {

    /** "sent" alanı. Zorunlu. */
    @JsonProperty("sent")
    private Long sent;

    /** "delivered" alanı. Zorunlu. */
    @JsonProperty("delivered")
    private Long delivered;

    /** "failed" alanı. Zorunlu. */
    @JsonProperty("failed")
    private Long failed;

    /** "opened" alanı. Zorunlu. */
    @JsonProperty("opened")
    private Long opened;

    /** "clicked" alanı. Zorunlu. */
    @JsonProperty("clicked")
    private Long clicked;

    /** "converted" alanı. Zorunlu. */
    @JsonProperty("converted")
    private Long converted;

    /** "delivery_rate" alanı. Zorunlu. */
    @JsonProperty("delivery_rate")
    private Double deliveryRate;

    /** "open_rate" alanı. Zorunlu. */
    @JsonProperty("open_rate")
    private Double openRate;

    /** "click_rate" alanı. Zorunlu. */
    @JsonProperty("click_rate")
    private Double clickRate;

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
    public MessagesReportPrevious setSent(Long sent) {
        this.sent = sent;
        return this;
    }

    /** @return "delivered" alanı */
    public Long getDelivered() {
        return delivered;
    }

    /**
     * "delivered" alanını ayarlar.
     *
     * @param delivered yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReportPrevious setDelivered(Long delivered) {
        this.delivered = delivered;
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
    public MessagesReportPrevious setFailed(Long failed) {
        this.failed = failed;
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
    public MessagesReportPrevious setOpened(Long opened) {
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
    public MessagesReportPrevious setClicked(Long clicked) {
        this.clicked = clicked;
        return this;
    }

    /** @return "converted" alanı */
    public Long getConverted() {
        return converted;
    }

    /**
     * "converted" alanını ayarlar.
     *
     * @param converted yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReportPrevious setConverted(Long converted) {
        this.converted = converted;
        return this;
    }

    /** @return "delivery_rate" alanı */
    public Double getDeliveryRate() {
        return deliveryRate;
    }

    /**
     * "delivery_rate" alanını ayarlar.
     *
     * @param deliveryRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReportPrevious setDeliveryRate(Double deliveryRate) {
        this.deliveryRate = deliveryRate;
        return this;
    }

    /** @return "open_rate" alanı */
    public Double getOpenRate() {
        return openRate;
    }

    /**
     * "open_rate" alanını ayarlar.
     *
     * @param openRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReportPrevious setOpenRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    /** @return "click_rate" alanı */
    public Double getClickRate() {
        return clickRate;
    }

    /**
     * "click_rate" alanını ayarlar.
     *
     * @param clickRate yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReportPrevious setClickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }
}
