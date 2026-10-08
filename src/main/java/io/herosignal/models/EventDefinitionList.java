// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** EventDefinitionList şeması (api/openapi.yaml). */
public final class EventDefinitionList {

    /** "data" alanı. Zorunlu. */
    @JsonProperty("data")
    private List<EventDefinition> data;

    /** @return "data" alanı */
    public List<EventDefinition> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinitionList setData(List<EventDefinition> data) {
        this.data = data;
        return this;
    }
}
