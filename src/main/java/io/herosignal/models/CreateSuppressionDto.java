// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** CreateSuppressionDto şeması (api/openapi.yaml). */
public final class CreateSuppressionDto {

    /** "channel" alanı. Zorunlu. Değerler: "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "value" alanı. Zorunlu. */
    @JsonProperty("value")
    private String value;

    /** "reason" alanı. Değerler: "manual", "bounce", "complaint", "unsubscribe_link", "stop". */
    @JsonProperty("reason")
    private String reason;

    /** "expires_at" alanı. */
    @JsonProperty("expires_at")
    private String expiresAt;

    /** "note" alanı. */
    @JsonProperty("note")
    private String note;

    /** @return "channel" alanı */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" alanını ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateSuppressionDto setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "value" alanı */
    public String getValue() {
        return value;
    }

    /**
     * "value" alanını ayarlar.
     *
     * @param value yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateSuppressionDto setValue(String value) {
        this.value = value;
        return this;
    }

    /** @return "reason" alanı */
    public String getReason() {
        return reason;
    }

    /**
     * "reason" alanını ayarlar.
     *
     * @param reason yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateSuppressionDto setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /** @return "expires_at" alanı */
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * "expires_at" alanını ayarlar.
     *
     * @param expiresAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateSuppressionDto setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /** @return "note" alanı */
    public String getNote() {
        return note;
    }

    /**
     * "note" alanını ayarlar.
     *
     * @param note yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateSuppressionDto setNote(String note) {
        this.note = note;
        return this;
    }
}
