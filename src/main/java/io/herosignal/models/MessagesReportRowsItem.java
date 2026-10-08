// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** MessagesReportRowsItem şeması (api/openapi.yaml). */
public final class MessagesReportRowsItem {

    /** "key" alanı. Zorunlu. */
    @JsonProperty("key")
    private String key;

    /** "label" alanı. Zorunlu. */
    @JsonProperty("label")
    private String label;

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

    /** @return "key" alanı */
    public String getKey() {
        return key;
    }

    /**
     * "key" alanını ayarlar.
     *
     * @param key yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReportRowsItem setKey(String key) {
        this.key = key;
        return this;
    }

    /** @return "label" alanı */
    public String getLabel() {
        return label;
    }

    /**
     * "label" alanını ayarlar.
     *
     * @param label yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessagesReportRowsItem setLabel(String label) {
        this.label = label;
        return this;
    }

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
    public MessagesReportRowsItem setSent(Long sent) {
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
    public MessagesReportRowsItem setDelivered(Long delivered) {
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
    public MessagesReportRowsItem setFailed(Long failed) {
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
    public MessagesReportRowsItem setOpened(Long opened) {
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
    public MessagesReportRowsItem setClicked(Long clicked) {
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
    public MessagesReportRowsItem setConverted(Long converted) {
        this.converted = converted;
        return this;
    }
}
