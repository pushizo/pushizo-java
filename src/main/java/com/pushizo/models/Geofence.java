// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Geofence şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Geofence {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("cooldown_minutes")
    private Long cooldownMinutes;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("enter_count")
    private Long enterCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("exit_count")
    private Long exitCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("inside_count")
    private Long insideCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public Geofence id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Geofence appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Geofence name(String name) {
        this.name = name;
        return this;
    }

    public Double getLat() {
        return lat;
    }

    public Geofence lat(Double lat) {
        this.lat = lat;
        return this;
    }

    public Double getLng() {
        return lng;
    }

    public Geofence lng(Double lng) {
        this.lng = lng;
        return this;
    }

    public Long getRadiusM() {
        return radiusM;
    }

    public Geofence radiusM(Long radiusM) {
        this.radiusM = radiusM;
        return this;
    }

    public Long getCooldownMinutes() {
        return cooldownMinutes;
    }

    public Geofence cooldownMinutes(Long cooldownMinutes) {
        this.cooldownMinutes = cooldownMinutes;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public Geofence enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getEnterCount() {
        return enterCount;
    }

    public Geofence enterCount(Long enterCount) {
        this.enterCount = enterCount;
        return this;
    }

    public Long getExitCount() {
        return exitCount;
    }

    public Geofence exitCount(Long exitCount) {
        this.exitCount = exitCount;
        return this;
    }

    public Long getInsideCount() {
        return insideCount;
    }

    public Geofence insideCount(Long insideCount) {
        this.insideCount = insideCount;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Geofence createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Geofence updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
