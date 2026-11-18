// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateGeofenceDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateGeofenceDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("lat")
    private Double lat;

    @JsonProperty("lng")
    private Double lng;

    @JsonProperty("radius_m")
    private Long radiusM;

    @JsonProperty("cooldown_minutes")
    private Long cooldownMinutes;

    @JsonProperty("enabled")
    private Boolean enabled;

    public String getName() {
        return name;
    }

    public UpdateGeofenceDto name(String name) {
        this.name = name;
        return this;
    }

    public Double getLat() {
        return lat;
    }

    public UpdateGeofenceDto lat(Double lat) {
        this.lat = lat;
        return this;
    }

    public Double getLng() {
        return lng;
    }

    public UpdateGeofenceDto lng(Double lng) {
        this.lng = lng;
        return this;
    }

    public Long getRadiusM() {
        return radiusM;
    }

    public UpdateGeofenceDto radiusM(Long radiusM) {
        this.radiusM = radiusM;
        return this;
    }

    public Long getCooldownMinutes() {
        return cooldownMinutes;
    }

    public UpdateGeofenceDto cooldownMinutes(Long cooldownMinutes) {
        this.cooldownMinutes = cooldownMinutes;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateGeofenceDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
