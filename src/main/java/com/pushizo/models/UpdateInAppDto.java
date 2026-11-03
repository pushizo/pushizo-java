// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInAppDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateInAppDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("triggers")
    private java.util.List<Object> triggers;

    @JsonProperty("trigger_groups")
    private java.util.List<java.util.List<Object>> triggerGroups;

    @JsonProperty("variants")
    private java.util.List<UpdateInAppDtoVariantsItem> variants;

    @JsonProperty("ab_test")
    private UpdateInAppDtoAbTest abTest;

    @JsonProperty("display")
    private UpdateInAppDtoDisplay display;

    @JsonProperty("audience")
    private UpdateInAppDtoAudience audience;

    @JsonProperty("frequency")
    private UpdateInAppDtoFrequency frequency;

    @JsonProperty("journey_only")
    private Boolean journeyOnly;

    @JsonProperty("placement")
    private String placement;

    @JsonProperty("priority")
    private Long priority;

    @JsonProperty("start_at")
    private String startAt;

    @JsonProperty("end_at")
    private String endAt;

    public String getName() {
        return name;
    }

    public UpdateInAppDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<Object> getTriggers() {
        return triggers;
    }

    public UpdateInAppDto triggers(java.util.List<Object> triggers) {
        this.triggers = triggers;
        return this;
    }

    public java.util.List<java.util.List<Object>> getTriggerGroups() {
        return triggerGroups;
    }

    public UpdateInAppDto triggerGroups(java.util.List<java.util.List<Object>> triggerGroups) {
        this.triggerGroups = triggerGroups;
        return this;
    }

    public java.util.List<UpdateInAppDtoVariantsItem> getVariants() {
        return variants;
    }

    public UpdateInAppDto variants(java.util.List<UpdateInAppDtoVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public UpdateInAppDtoAbTest getAbTest() {
        return abTest;
    }

    public UpdateInAppDto abTest(UpdateInAppDtoAbTest abTest) {
        this.abTest = abTest;
        return this;
    }

    public UpdateInAppDtoDisplay getDisplay() {
        return display;
    }

    public UpdateInAppDto display(UpdateInAppDtoDisplay display) {
        this.display = display;
        return this;
    }

    public UpdateInAppDtoAudience getAudience() {
        return audience;
    }

    public UpdateInAppDto audience(UpdateInAppDtoAudience audience) {
        this.audience = audience;
        return this;
    }

    public UpdateInAppDtoFrequency getFrequency() {
        return frequency;
    }

    public UpdateInAppDto frequency(UpdateInAppDtoFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Boolean getJourneyOnly() {
        return journeyOnly;
    }

    public UpdateInAppDto journeyOnly(Boolean journeyOnly) {
        this.journeyOnly = journeyOnly;
        return this;
    }

    public String getPlacement() {
        return placement;
    }

    public UpdateInAppDto placement(String placement) {
        this.placement = placement;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public UpdateInAppDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public UpdateInAppDto startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public UpdateInAppDto endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
