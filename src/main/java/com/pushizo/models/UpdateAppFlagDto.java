// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppFlagDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppFlagDto {
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
    private java.util.List<UpdateAppFlagDtoRolloutScheduleItem> rolloutSchedule;

    public String getName() {
        return name;
    }

    public UpdateAppFlagDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateAppFlagDto description(String description) {
        this.description = description;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateAppFlagDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getValueType() {
        return valueType;
    }

    public UpdateAppFlagDto valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public Object getOnValue() {
        return onValue;
    }

    public UpdateAppFlagDto onValue(Object onValue) {
        this.onValue = onValue;
        return this;
    }

    public Object getOffValue() {
        return offValue;
    }

    public UpdateAppFlagDto offValue(Object offValue) {
        this.offValue = offValue;
        return this;
    }

    public Long getRolloutPercent() {
        return rolloutPercent;
    }

    public UpdateAppFlagDto rolloutPercent(Long rolloutPercent) {
        this.rolloutPercent = rolloutPercent;
        return this;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public UpdateAppFlagDto segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public java.util.List<UpdateAppFlagDtoRolloutScheduleItem> getRolloutSchedule() {
        return rolloutSchedule;
    }

    public UpdateAppFlagDto rolloutSchedule(java.util.List<UpdateAppFlagDtoRolloutScheduleItem> rolloutSchedule) {
        this.rolloutSchedule = rolloutSchedule;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
