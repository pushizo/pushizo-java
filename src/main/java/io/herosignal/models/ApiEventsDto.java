// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** ApiEventsDto şeması (api/openapi.yaml). */
public final class ApiEventsDto {

    /** "events" alanı. Zorunlu. */
    @JsonProperty("events")
    private List<ApiEventsDtoEventsItem> events;

    /** @return "events" alanı */
    public List<ApiEventsDtoEventsItem> getEvents() {
        return events;
    }

    /**
     * "events" alanını ayarlar.
     *
     * @param events yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ApiEventsDto setEvents(List<ApiEventsDtoEventsItem> events) {
        this.events = events;
        return this;
    }
}
