// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** SetOwnerDto şeması (api/openapi.yaml). */
public final class SetOwnerDto {

    /** "external_id" alanı. Zorunlu. */
    @JsonProperty("external_id")
    private String externalId;

    /** @return "external_id" alanı */
    public String getExternalId() {
        return externalId;
    }

    /**
     * "external_id" alanını ayarlar.
     *
     * @param externalId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SetOwnerDto setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
}
