// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppFlag şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppFlag {
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
    @JsonProperty("key")
    private String key;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu. Değerler: "boolean", "string", "number", "json".
     */
    @JsonProperty("value_type")
    private String valueType;

    /**
     * Zorunlu.
     */
    @JsonProperty("on_value")
    private Object onValue;

    /**
     * Zorunlu.
     */
    @JsonProperty("off_value")
    private Object offValue;

    /**
     * Zorunlu.
     */
    @JsonProperty("rollout_percent")
    private Long rolloutPercent;

    /**
     * Zorunlu.
     */
    @JsonProperty("segment_id")
    private String segmentId;

    /**
     * Zorunlu.
     */
    @JsonProperty("rollout_schedule")
    private java.util.List<AppFlagRolloutScheduleItem> rolloutSchedule;

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

    public AppFlag id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public AppFlag appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getKey() {
        return key;
    }

    public AppFlag key(String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return name;
    }

    public AppFlag name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AppFlag description(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AppFlag enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getValueType() {
        return valueType;
    }

    public AppFlag valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public Object getOnValue() {
        return onValue;
    }

    public AppFlag onValue(Object onValue) {
        this.onValue = onValue;
        return this;
    }

    public Object getOffValue() {
        return offValue;
    }

    public AppFlag offValue(Object offValue) {
        this.offValue = offValue;
        return this;
    }

    public Long getRolloutPercent() {
        return rolloutPercent;
    }

    public AppFlag rolloutPercent(Long rolloutPercent) {
        this.rolloutPercent = rolloutPercent;
        return this;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public AppFlag segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public java.util.List<AppFlagRolloutScheduleItem> getRolloutSchedule() {
        return rolloutSchedule;
    }

    public AppFlag rolloutSchedule(java.util.List<AppFlagRolloutScheduleItem> rolloutSchedule) {
        this.rolloutSchedule = rolloutSchedule;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AppFlag createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AppFlag updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
