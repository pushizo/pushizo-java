// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SessionVolumeDaysItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SessionVolumeDaysItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("day")
    private String day;

    /**
     * Zorunlu.
     */
    @JsonProperty("sessions")
    private Long sessions;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    public String getDay() {
        return day;
    }

    public SessionVolumeDaysItem day(String day) {
        this.day = day;
        return this;
    }

    public Long getSessions() {
        return sessions;
    }

    public SessionVolumeDaysItem sessions(Long sessions) {
        this.sessions = sessions;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public SessionVolumeDaysItem users(Long users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
