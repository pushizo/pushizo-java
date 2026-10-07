// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventsReportRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventsReportRowsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("key")
    private String key;

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

    public String getKey() {
        return key;
    }

    public EventsReportRowsItem key(String key) {
        this.key = key;
        return this;
    }

    public Long getCount() {
        return count;
    }

    public EventsReportRowsItem count(Long count) {
        this.count = count;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public EventsReportRowsItem users(Long users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
