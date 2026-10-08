// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** EventsAccepted şeması (api/openapi.yaml). */
public final class EventsAccepted {

    /** "accepted" alanı. Zorunlu. */
    @JsonProperty("accepted")
    private Long accepted;

    /** @return "accepted" alanı */
    public Long getAccepted() {
        return accepted;
    }

    /**
     * "accepted" alanını ayarlar.
     *
     * @param accepted yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventsAccepted setAccepted(Long accepted) {
        this.accepted = accepted;
        return this;
    }
}
