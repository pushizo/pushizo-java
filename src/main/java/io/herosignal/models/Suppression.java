// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** Suppression şeması (api/openapi.yaml). */
public final class Suppression {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "channel" alanı. Zorunlu. Değerler: "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "value_masked" alanı. Zorunlu. */
    @JsonProperty("value_masked")
    private String valueMasked;

    /** "reason" alanı. Zorunlu. Değerler: "bounce", "complaint", "manual", "unsubscribe_link", "stop". */
    @JsonProperty("reason")
    private String reason;

    /** "source" alanı. Zorunlu. */
    @JsonProperty("source")
    private String source;

    /** "detail" alanı. Zorunlu. */
    @JsonProperty("detail")
    private Map<String, Object> detail;

    /** "expires_at" alanı. Zorunlu. */
    @JsonProperty("expires_at")
    private String expiresAt;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "updated_at" alanı. Zorunlu. */
    @JsonProperty("updated_at")
    private String updatedAt;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Suppression setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "app_id" alanı */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" alanını ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Suppression setAppId(String appId) {
        this.appId = appId;
        return this;
    }

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
    public Suppression setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "value_masked" alanı */
    public String getValueMasked() {
        return valueMasked;
    }

    /**
     * "value_masked" alanını ayarlar.
     *
     * @param valueMasked yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Suppression setValueMasked(String valueMasked) {
        this.valueMasked = valueMasked;
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
    public Suppression setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /** @return "source" alanı */
    public String getSource() {
        return source;
    }

    /**
     * "source" alanını ayarlar.
     *
     * @param source yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Suppression setSource(String source) {
        this.source = source;
        return this;
    }

    /** @return "detail" alanı */
    public Map<String, Object> getDetail() {
        return detail;
    }

    /**
     * "detail" alanını ayarlar.
     *
     * @param detail yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Suppression setDetail(Map<String, Object> detail) {
        this.detail = detail;
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
    public Suppression setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /** @return "created_at" alanı */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * "created_at" alanını ayarlar.
     *
     * @param createdAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Suppression setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** @return "updated_at" alanı */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * "updated_at" alanını ayarlar.
     *
     * @param updatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Suppression setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
