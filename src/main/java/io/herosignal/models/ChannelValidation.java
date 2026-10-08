// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** ChannelValidation şeması (api/openapi.yaml). */
public final class ChannelValidation {

    /** "ok" alanı. Zorunlu. */
    @JsonProperty("ok")
    private Boolean ok;

    /** "kind" alanı. Zorunlu. Değerler: "auth", "config", "transient". */
    @JsonProperty("kind")
    private String kind;

    /** "code" alanı. Zorunlu. */
    @JsonProperty("code")
    private String code;

    /** "message" alanı. Zorunlu. */
    @JsonProperty("message")
    private String message;

    /** "details" alanı. Zorunlu. */
    @JsonProperty("details")
    private Map<String, Object> details;

    /** "channel" alanı. Zorunlu. */
    @JsonProperty("channel")
    private ChannelConfig channel;

    /** @return "ok" alanı */
    public Boolean getOk() {
        return ok;
    }

    /**
     * "ok" alanını ayarlar.
     *
     * @param ok yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelValidation setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    /** @return "kind" alanı */
    public String getKind() {
        return kind;
    }

    /**
     * "kind" alanını ayarlar.
     *
     * @param kind yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelValidation setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** @return "code" alanı */
    public String getCode() {
        return code;
    }

    /**
     * "code" alanını ayarlar.
     *
     * @param code yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelValidation setCode(String code) {
        this.code = code;
        return this;
    }

    /** @return "message" alanı */
    public String getMessage() {
        return message;
    }

    /**
     * "message" alanını ayarlar.
     *
     * @param message yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelValidation setMessage(String message) {
        this.message = message;
        return this;
    }

    /** @return "details" alanı */
    public Map<String, Object> getDetails() {
        return details;
    }

    /**
     * "details" alanını ayarlar.
     *
     * @param details yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelValidation setDetails(Map<String, Object> details) {
        this.details = details;
        return this;
    }

    /** @return "channel" alanı */
    public ChannelConfig getChannel() {
        return channel;
    }

    /**
     * "channel" alanını ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelValidation setChannel(ChannelConfig channel) {
        this.channel = channel;
        return this;
    }
}
