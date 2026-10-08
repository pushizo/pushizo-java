// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** FunnelBodyDtoStepsItemWhere şeması (api/openapi.yaml). */
public final class FunnelBodyDtoStepsItemWhere {

    /** "key" alanı. Zorunlu. */
    @JsonProperty("key")
    private String key;

    /** "value" alanı. Zorunlu. */
    @JsonProperty("value")
    private String value;

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
    public FunnelBodyDtoStepsItemWhere setKey(String key) {
        this.key = key;
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
    public FunnelBodyDtoStepsItemWhere setValue(String value) {
        this.value = value;
        return this;
    }
}
