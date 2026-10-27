// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateReverseEtlDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateReverseEtlDto {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "hourly", "daily".
     */
    @JsonProperty("schedule")
    private String schedule;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("config")
    private java.util.Map<String, Object> config;

    @JsonProperty("credentials")
    private java.util.Map<String, Object> credentials;

    public String getName() {
        return name;
    }

    public UpdateReverseEtlDto name(String name) {
        this.name = name;
        return this;
    }

    public String getSchedule() {
        return schedule;
    }

    public UpdateReverseEtlDto schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateReverseEtlDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.Map<String, Object> getConfig() {
        return config;
    }

    public UpdateReverseEtlDto config(java.util.Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public java.util.Map<String, Object> getCredentials() {
        return credentials;
    }

    public UpdateReverseEtlDto credentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
