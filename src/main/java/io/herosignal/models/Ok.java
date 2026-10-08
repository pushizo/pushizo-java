// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** Ok şeması (api/openapi.yaml). */
public final class Ok {

    /** "ok" alanı. Zorunlu. */
    @JsonProperty("ok")
    private Boolean ok;

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
    public Ok setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
}
