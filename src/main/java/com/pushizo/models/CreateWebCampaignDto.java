// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebCampaignDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWebCampaignDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("display")
    private CreateWebCampaignDtoDisplay display;

    @JsonProperty("variants")
    private java.util.List<CreateWebCampaignDtoVariantsItem> variants;

    /**
     * Zorunlu.
     */
    @JsonProperty("trigger")
    private Object trigger;

    @JsonProperty("conditions")
    private CreateWebCampaignDtoConditions conditions;

    @JsonProperty("targeting")
    private CreateWebCampaignDtoTargeting targeting;

    @JsonProperty("frequency")
    private CreateWebCampaignDtoFrequency frequency;

    @JsonProperty("priority")
    private Long priority;

    @JsonProperty("start_at")
    private String startAt;

    @JsonProperty("end_at")
    private String endAt;

    public String getName() {
        return name;
    }

    public CreateWebCampaignDto name(String name) {
        this.name = name;
        return this;
    }

    public CreateWebCampaignDtoDisplay getDisplay() {
        return display;
    }

    public CreateWebCampaignDto display(CreateWebCampaignDtoDisplay display) {
        this.display = display;
        return this;
    }

    public java.util.List<CreateWebCampaignDtoVariantsItem> getVariants() {
        return variants;
    }

    public CreateWebCampaignDto variants(java.util.List<CreateWebCampaignDtoVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public Object getTrigger() {
        return trigger;
    }

    public CreateWebCampaignDto trigger(Object trigger) {
        this.trigger = trigger;
        return this;
    }

    public CreateWebCampaignDtoConditions getConditions() {
        return conditions;
    }

    public CreateWebCampaignDto conditions(CreateWebCampaignDtoConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateWebCampaignDtoTargeting getTargeting() {
        return targeting;
    }

    public CreateWebCampaignDto targeting(CreateWebCampaignDtoTargeting targeting) {
        this.targeting = targeting;
        return this;
    }

    public CreateWebCampaignDtoFrequency getFrequency() {
        return frequency;
    }

    public CreateWebCampaignDto frequency(CreateWebCampaignDtoFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public CreateWebCampaignDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public CreateWebCampaignDto startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public CreateWebCampaignDto endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
