// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** EventDefinitionDetailPropertiesItem şeması (api/openapi.yaml). */
public final class EventDefinitionDetailPropertiesItem {

    /** "key" alanı. Zorunlu. */
    @JsonProperty("key")
    private String key;

    /** "type" alanı. Zorunlu. */
    @JsonProperty("type")
    private String type;

    /** "values" alanı. Zorunlu. */
    @JsonProperty("values")
    private List<EventDefinitionDetailPropertiesItemValuesItem> values;

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
    public EventDefinitionDetailPropertiesItem setKey(String key) {
        this.key = key;
        return this;
    }

    /** @return "type" alanı */
    public String getType() {
        return type;
    }

    /**
     * "type" alanını ayarlar.
     *
     * @param type yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinitionDetailPropertiesItem setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "values" alanı */
    public List<EventDefinitionDetailPropertiesItemValuesItem> getValues() {
        return values;
    }

    /**
     * "values" alanını ayarlar.
     *
     * @param values yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinitionDetailPropertiesItem setValues(List<EventDefinitionDetailPropertiesItemValuesItem> values) {
        this.values = values;
        return this;
    }
}
