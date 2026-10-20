// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebCampaignDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebCampaignDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("display")
    private UpdateWebCampaignDtoDisplay display;

    @JsonProperty("variants")
    private java.util.List<UpdateWebCampaignDtoVariantsItem> variants;

    @JsonProperty("trigger")
    private Object trigger;

    @JsonProperty("conditions")
    private UpdateWebCampaignDtoConditions conditions;

    @JsonProperty("targeting")
    private UpdateWebCampaignDtoTargeting targeting;

    @JsonProperty("frequency")
    private UpdateWebCampaignDtoFrequency frequency;

    @JsonProperty("priority")
    private Long priority;

    @JsonProperty("start_at")
    private String startAt;

    @JsonProperty("end_at")
    private String endAt;

    public String getName() {
        return name;
    }

    public UpdateWebCampaignDto name(String name) {
        this.name = name;
        return this;
    }

    public UpdateWebCampaignDtoDisplay getDisplay() {
        return display;
    }

    public UpdateWebCampaignDto display(UpdateWebCampaignDtoDisplay display) {
        this.display = display;
        return this;
    }

    public java.util.List<UpdateWebCampaignDtoVariantsItem> getVariants() {
        return variants;
    }

    public UpdateWebCampaignDto variants(java.util.List<UpdateWebCampaignDtoVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public Object getTrigger() {
        return trigger;
    }

    public UpdateWebCampaignDto trigger(Object trigger) {
        this.trigger = trigger;
        return this;
    }

    public UpdateWebCampaignDtoConditions getConditions() {
        return conditions;
    }

    public UpdateWebCampaignDto conditions(UpdateWebCampaignDtoConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public UpdateWebCampaignDtoTargeting getTargeting() {
        return targeting;
    }

    public UpdateWebCampaignDto targeting(UpdateWebCampaignDtoTargeting targeting) {
        this.targeting = targeting;
        return this;
    }

    public UpdateWebCampaignDtoFrequency getFrequency() {
        return frequency;
    }

    public UpdateWebCampaignDto frequency(UpdateWebCampaignDtoFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public UpdateWebCampaignDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public UpdateWebCampaignDto startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public UpdateWebCampaignDto endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
