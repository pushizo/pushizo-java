// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** EventDefinitionDetailPropertiesItemValuesItem şeması (api/openapi.yaml). */
public final class EventDefinitionDetailPropertiesItemValuesItem {

    /** "value" alanı. Zorunlu. */
    @JsonProperty("value")
    private String value;

    /** "count" alanı. Zorunlu. */
    @JsonProperty("count")
    private Long count;

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
    public EventDefinitionDetailPropertiesItemValuesItem setValue(String value) {
        this.value = value;
        return this;
    }

    /** @return "count" alanı */
    public Long getCount() {
        return count;
    }

    /**
     * "count" alanını ayarlar.
     *
     * @param count yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinitionDetailPropertiesItemValuesItem setCount(Long count) {
        this.count = count;
        return this;
    }
}
