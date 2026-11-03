// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateGeofenceDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateGeofenceDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("lat")
    private Double lat;

    /**
     * Zorunlu.
     */
    @JsonProperty("lng")
    private Double lng;

    /**
     * Zorunlu.
     */
    @JsonProperty("radius_m")
    private Long radiusM;

    @JsonProperty("cooldown_minutes")
    private Long cooldownMinutes;

    @JsonProperty("enabled")
    private Boolean enabled;

    public String getName() {
        return name;
    }

    public CreateGeofenceDto name(String name) {
        this.name = name;
        return this;
    }

    public Double getLat() {
        return lat;
    }

    public CreateGeofenceDto lat(Double lat) {
        this.lat = lat;
        return this;
    }

    public Double getLng() {
        return lng;
    }

    public CreateGeofenceDto lng(Double lng) {
        this.lng = lng;
        return this;
    }

    public Long getRadiusM() {
        return radiusM;
    }

    public CreateGeofenceDto radiusM(Long radiusM) {
        this.radiusM = radiusM;
        return this;
    }

    public Long getCooldownMinutes() {
        return cooldownMinutes;
    }

    public CreateGeofenceDto cooldownMinutes(Long cooldownMinutes) {
        this.cooldownMinutes = cooldownMinutes;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateGeofenceDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
