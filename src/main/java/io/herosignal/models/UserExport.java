// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** UserExport şeması (api/openapi.yaml). */
public final class UserExport {

    /** "exported_at" alanı. Zorunlu. */
    @JsonProperty("exported_at")
    private String exportedAt;

    /** "user" alanı. Zorunlu. */
    @JsonProperty("user")
    private UserDetail user;

    /** "events" alanı. Zorunlu. */
    @JsonProperty("events")
    private List<UserExportEventsItem> events;

    /** @return "exported_at" alanı */
    public String getExportedAt() {
        return exportedAt;
    }

    /**
     * "exported_at" alanını ayarlar.
     *
     * @param exportedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserExport setExportedAt(String exportedAt) {
        this.exportedAt = exportedAt;
        return this;
    }

    /** @return "user" alanı */
    public UserDetail getUser() {
        return user;
    }

    /**
     * "user" alanını ayarlar.
     *
     * @param user yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserExport setUser(UserDetail user) {
        this.user = user;
        return this;
    }

    /** @return "events" alanı */
    public List<UserExportEventsItem> getEvents() {
        return events;
    }

    /**
     * "events" alanını ayarlar.
     *
     * @param events yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserExport setEvents(List<UserExportEventsItem> events) {
        this.events = events;
        return this;
    }
}
