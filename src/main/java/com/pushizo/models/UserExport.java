// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserExport şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserExport {
    /**
     * Zorunlu.
     */
    @JsonProperty("exported_at")
    private String exportedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("user")
    private UserDetail user;

    /**
     * Zorunlu.
     */
    @JsonProperty("events")
    private java.util.List<UserExportEventsItem> events;

    /**
     * Zorunlu.
     */
    @JsonProperty("derived")
    private UserExportDerived derived;

    public String getExportedAt() {
        return exportedAt;
    }

    public UserExport exportedAt(String exportedAt) {
        this.exportedAt = exportedAt;
        return this;
    }

    public UserDetail getUser() {
        return user;
    }

    public UserExport user(UserDetail user) {
        this.user = user;
        return this;
    }

    public java.util.List<UserExportEventsItem> getEvents() {
        return events;
    }

    public UserExport events(java.util.List<UserExportEventsItem> events) {
        this.events = events;
        return this;
    }

    public UserExportDerived getDerived() {
        return derived;
    }

    public UserExport derived(UserExportDerived derived) {
        this.derived = derived;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
