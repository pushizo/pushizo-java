// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateInAppDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateInAppDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("triggers")
    private java.util.List<Object> triggers;

    @JsonProperty("trigger_groups")
    private java.util.List<java.util.List<Object>> triggerGroups;

    @JsonProperty("variants")
    private java.util.List<CreateInAppDtoVariantsItem> variants;

    @JsonProperty("ab_test")
    private CreateInAppDtoAbTest abTest;

    /**
     * Zorunlu.
     */
    @JsonProperty("display")
    private CreateInAppDtoDisplay display;

    @JsonProperty("audience")
    private CreateInAppDtoAudience audience;

    @JsonProperty("frequency")
    private CreateInAppDtoFrequency frequency;

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

    public CreateInAppDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<Object> getTriggers() {
        return triggers;
    }

    public CreateInAppDto triggers(java.util.List<Object> triggers) {
        this.triggers = triggers;
        return this;
    }

    public java.util.List<java.util.List<Object>> getTriggerGroups() {
        return triggerGroups;
    }

    public CreateInAppDto triggerGroups(java.util.List<java.util.List<Object>> triggerGroups) {
        this.triggerGroups = triggerGroups;
        return this;
    }

    public java.util.List<CreateInAppDtoVariantsItem> getVariants() {
        return variants;
    }

    public CreateInAppDto variants(java.util.List<CreateInAppDtoVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public CreateInAppDtoAbTest getAbTest() {
        return abTest;
    }

    public CreateInAppDto abTest(CreateInAppDtoAbTest abTest) {
        this.abTest = abTest;
        return this;
    }

    public CreateInAppDtoDisplay getDisplay() {
        return display;
    }

    public CreateInAppDto display(CreateInAppDtoDisplay display) {
        this.display = display;
        return this;
    }

    public CreateInAppDtoAudience getAudience() {
        return audience;
    }

    public CreateInAppDto audience(CreateInAppDtoAudience audience) {
        this.audience = audience;
        return this;
    }

    public CreateInAppDtoFrequency getFrequency() {
        return frequency;
    }

    public CreateInAppDto frequency(CreateInAppDtoFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Boolean getJourneyOnly() {
        return journeyOnly;
    }

    public CreateInAppDto journeyOnly(Boolean journeyOnly) {
        this.journeyOnly = journeyOnly;
        return this;
    }

    public String getPlacement() {
        return placement;
    }

    public CreateInAppDto placement(String placement) {
        this.placement = placement;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public CreateInAppDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public CreateInAppDto startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public CreateInAppDto endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
