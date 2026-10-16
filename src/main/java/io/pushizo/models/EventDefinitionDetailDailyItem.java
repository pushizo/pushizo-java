// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventDefinitionDetailDailyItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventDefinitionDetailDailyItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Zorunlu.
     */
    @JsonProperty("count")
    private Long count;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    public String getDate() {
        return date;
    }

    public EventDefinitionDetailDailyItem date(String date) {
        this.date = date;
        return this;
    }

    public Long getCount() {
        return count;
    }

    public EventDefinitionDetailDailyItem count(Long count) {
        this.count = count;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public EventDefinitionDetailDailyItem users(Long users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
