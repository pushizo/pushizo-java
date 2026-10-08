// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** CreateWebhookDtoEventFilters şeması (api/openapi.yaml). */
public final class CreateWebhookDtoEventFilters {

    /** "event_names" alanı. */
    @JsonProperty("event_names")
    private List<String> eventNames;

    /** @return "event_names" alanı */
    public List<String> getEventNames() {
        return eventNames;
    }

    /**
     * "event_names" alanını ayarlar.
     *
     * @param eventNames yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateWebhookDtoEventFilters setEventNames(List<String> eventNames) {
        this.eventNames = eventNames;
        return this;
    }
}
