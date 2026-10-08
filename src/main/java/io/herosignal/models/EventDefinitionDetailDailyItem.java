// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** EventDefinitionDetailDailyItem şeması (api/openapi.yaml). */
public final class EventDefinitionDetailDailyItem {

    /** "date" alanı. Zorunlu. */
    @JsonProperty("date")
    private String date;

    /** "count" alanı. Zorunlu. */
    @JsonProperty("count")
    private Long count;

    /** "users" alanı. Zorunlu. */
    @JsonProperty("users")
    private Long users;

    /** @return "date" alanı */
    public String getDate() {
        return date;
    }

    /**
     * "date" alanını ayarlar.
     *
     * @param date yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinitionDetailDailyItem setDate(String date) {
        this.date = date;
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
    public EventDefinitionDetailDailyItem setCount(Long count) {
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
    public EventDefinitionDetailDailyItem setUsers(Long users) {
        this.users = users;
        return this;
    }
}
