// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventsReportPrevious şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EventsReportPrevious {
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

    public Long getCount() {
        return count;
    }

    public EventsReportPrevious count(Long count) {
        this.count = count;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public EventsReportPrevious users(Long users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
