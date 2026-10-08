// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** EventsReportPrevious şeması (api/openapi.yaml). */
public final class EventsReportPrevious {

    /** "count" alanı. Zorunlu. */
    @JsonProperty("count")
    private Long count;

    /** "users" alanı. Zorunlu. */
    @JsonProperty("users")
    private Long users;

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
    public EventsReportPrevious setCount(Long count) {
        this.count = count;
        return this;
    }

    /** @return "users" alanı */
    public Long getUsers() {
        return users;
    }

    /**
     * "users" alanını ayarlar.
     *
     * @param users yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventsReportPrevious setUsers(Long users) {
        this.users = users;
        return this;
    }
}
