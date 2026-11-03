// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateAppFlagDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateAppFlagDto {
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

    @JsonProperty("description")
    private String description;

    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Değerler: "boolean", "string", "number", "json".
     */
    @JsonProperty("value_type")
    private String valueType;

    @JsonProperty("on_value")
    private Object onValue;

    @JsonProperty("off_value")
    private Object offValue;

    @JsonProperty("rollout_percent")
    private Long rolloutPercent;

    @JsonProperty("segment_id")
    private String segmentId;

    @JsonProperty("rollout_schedule")
    private java.util.List<CreateAppFlagDtoRolloutScheduleItem> rolloutSchedule;

    public String getKey() {
        return key;
    }

    public CreateAppFlagDto key(String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateAppFlagDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateAppFlagDto description(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateAppFlagDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getValueType() {
        return valueType;
    }

    public CreateAppFlagDto valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public Object getOnValue() {
        return onValue;
    }

    public CreateAppFlagDto onValue(Object onValue) {
        this.onValue = onValue;
        return this;
    }

    public Object getOffValue() {
        return offValue;
    }

    public CreateAppFlagDto offValue(Object offValue) {
        this.offValue = offValue;
        return this;
    }

    public Long getRolloutPercent() {
        return rolloutPercent;
    }

    public CreateAppFlagDto rolloutPercent(Long rolloutPercent) {
        this.rolloutPercent = rolloutPercent;
        return this;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public CreateAppFlagDto segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public java.util.List<CreateAppFlagDtoRolloutScheduleItem> getRolloutSchedule() {
        return rolloutSchedule;
    }

    public CreateAppFlagDto rolloutSchedule(java.util.List<CreateAppFlagDtoRolloutScheduleItem> rolloutSchedule) {
        this.rolloutSchedule = rolloutSchedule;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
