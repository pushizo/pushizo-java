// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** MessageCounts şeması (api/openapi.yaml). */
public final class MessageCounts {

    /** "targeted" alanı. */
    @JsonProperty("targeted")
    private Long targeted;

    /** "suppressed" alanı. */
    @JsonProperty("suppressed")
    private Long suppressed;

    /** "sent" alanı. */
    @JsonProperty("sent")
    private Long sent;

    /** "delivered" alanı. */
    @JsonProperty("delivered")
    private Long delivered;

    /** "failed" alanı. */
    @JsonProperty("failed")
    private Long failed;

    /** "errored" alanı. */
    @JsonProperty("errored")
    private Long errored;

    /** "expired" alanı. */
    @JsonProperty("expired")
    private Long expired;

    /** "opened" alanı. */
    @JsonProperty("opened")
    private Long opened;

    /** "clicked" alanı. */
    @JsonProperty("clicked")
    private Long clicked;

    /** "converted" alanı. */
    @JsonProperty("converted")
    private Long converted;

    /** "bounced" alanı. */
    @JsonProperty("bounced")
    private Long bounced;

    /** "complained" alanı. */
    @JsonProperty("complained")
    private Long complained;

    /** "unsubscribed" alanı. */
    @JsonProperty("unsubscribed")
    private Long unsubscribed;

    /** "sms_segments" alanı. */
    @JsonProperty("sms_segments")
    private Long smsSegments;

    /** @return "targeted" alanı */
    public Long getTargeted() {
        return targeted;
    }

    /**
     * "targeted" alanını ayarlar.
     *
     * @param targeted yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessageCounts setTargeted(Long targeted) {
        this.targeted = targeted;
        return this;
    }

    /** @return "suppressed" alanı */
    public Long getSuppressed() {
        return suppressed;
    }

    /**
     * "suppressed" alanını ayarlar.
     *
     * @param suppressed yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessageCounts setSuppressed(Long suppressed) {
        this.suppressed = suppressed;
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
    public MessageCounts setSent(Long sent) {
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
    public MessageCounts setDelivered(Long delivered) {
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
    public MessageCounts setFailed(Long failed) {
        this.failed = failed;
        return this;
    }

    /** @return "errored" alanı */
    public Long getErrored() {
        return errored;
    }

    /**
     * "errored" alanını ayarlar.
     *
     * @param errored yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessageCounts setErrored(Long errored) {
        this.errored = errored;
        return this;
    }

    /** @return "expired" alanı */
    public Long getExpired() {
        return expired;
    }

    /**
     * "expired" alanını ayarlar.
     *
     * @param expired yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessageCounts setExpired(Long expired) {
        this.expired = expired;
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
    public MessageCounts setOpened(Long opened) {
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
    public MessageCounts setClicked(Long clicked) {
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
    public MessageCounts setConverted(Long converted) {
        this.converted = converted;
        return this;
    }

    /** @return "bounced" alanı */
    public Long getBounced() {
        return bounced;
    }

    /**
     * "bounced" alanını ayarlar.
     *
     * @param bounced yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessageCounts setBounced(Long bounced) {
        this.bounced = bounced;
        return this;
    }

    /** @return "complained" alanı */
    public Long getComplained() {
        return complained;
    }

    /**
     * "complained" alanını ayarlar.
     *
     * @param complained yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessageCounts setComplained(Long complained) {
        this.complained = complained;
        return this;
    }

    /** @return "unsubscribed" alanı */
    public Long getUnsubscribed() {
        return unsubscribed;
    }

    /**
     * "unsubscribed" alanını ayarlar.
     *
     * @param unsubscribed yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessageCounts setUnsubscribed(Long unsubscribed) {
        this.unsubscribed = unsubscribed;
        return this;
    }

    /** @return "sms_segments" alanı */
    public Long getSmsSegments() {
        return smsSegments;
    }

    /**
     * "sms_segments" alanını ayarlar.
     *
     * @param smsSegments yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MessageCounts setSmsSegments(Long smsSegments) {
        this.smsSegments = smsSegments;
        return this;
    }
}
