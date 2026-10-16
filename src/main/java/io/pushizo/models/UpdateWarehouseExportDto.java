// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWarehouseExportDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWarehouseExportDto {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "deliveries", "delivery_events", "events", "conversions", "users", "subscriptions".
     */
    @JsonProperty("tables")
    private java.util.List<String> tables;

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

    public UpdateWarehouseExportDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<String> getTables() {
        return tables;
    }

    public UpdateWarehouseExportDto tables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
    }

    public String getSchedule() {
        return schedule;
    }

    public UpdateWarehouseExportDto schedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateWarehouseExportDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.Map<String, Object> getConfig() {
        return config;
    }

    public UpdateWarehouseExportDto config(java.util.Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public java.util.Map<String, Object> getCredentials() {
        return credentials;
    }

    public UpdateWarehouseExportDto credentials(java.util.Map<String, Object> credentials) {
        this.credentials = credentials;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
