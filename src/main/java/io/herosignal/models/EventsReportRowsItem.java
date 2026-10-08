// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** EventsReportRowsItem şeması (api/openapi.yaml). */
public final class EventsReportRowsItem {

    /** "key" alanı. Zorunlu. */
    @JsonProperty("key")
    private String key;

    /** "count" alanı. Zorunlu. */
    @JsonProperty("count")
    private Long count;

    /** "users" alanı. Zorunlu. */
    @JsonProperty("users")
    private Long users;

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
    public EventsReportRowsItem setKey(String key) {
        this.key = key;
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
    public EventsReportRowsItem setCount(Long count) {
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
    public EventsReportRowsItem setUsers(Long users) {
        this.users = users;
        return this;
    }
}
