// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** AddAliasDto şeması (api/openapi.yaml). */
public final class AddAliasDto {

    /** "identity" alanı. Zorunlu. */
    @JsonProperty("identity")
    private Map<String, String> identity;

    /** @return "identity" alanı */
    public Map<String, String> getIdentity() {
        return identity;
    }

    /**
     * "identity" alanını ayarlar.
     *
     * @param identity yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AddAliasDto setIdentity(Map<String, String> identity) {
        this.identity = identity;
        return this;
    }
}
