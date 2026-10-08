// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** InAppStatusDto şeması (api/openapi.yaml). */
public final class InAppStatusDto {

    /** "status" alanı. Zorunlu. Değerler: "draft", "active", "paused", "archived". */
    @JsonProperty("status")
    private String status;

    /** @return "status" alanı */
    public String getStatus() {
        return status;
    }

    /**
     * "status" alanını ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppStatusDto setStatus(String status) {
        this.status = status;
        return this;
    }
}
