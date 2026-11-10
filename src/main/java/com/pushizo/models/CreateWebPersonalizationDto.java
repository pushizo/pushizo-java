// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebPersonalizationDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWebPersonalizationDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("changes")
    private java.util.List<Object> changes;

    @JsonProperty("variants")
    private java.util.List<CreateWebPersonalizationDtoVariantsItem> variants;

    @JsonProperty("conditions")
    private CreateWebPersonalizationDtoConditions conditions;

    @JsonProperty("targeting")
    private CreateWebPersonalizationDtoTargeting targeting;

    @JsonProperty("goal")
    private Object goal;

    @JsonProperty("priority")
    private Long priority;

    @JsonProperty("start_at")
    private String startAt;

    @JsonProperty("end_at")
    private String endAt;

    public String getName() {
        return name;
    }

    public CreateWebPersonalizationDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<Object> getChanges() {
        return changes;
    }

    public CreateWebPersonalizationDto changes(java.util.List<Object> changes) {
        this.changes = changes;
        return this;
    }

    public java.util.List<CreateWebPersonalizationDtoVariantsItem> getVariants() {
        return variants;
    }

    public CreateWebPersonalizationDto variants(java.util.List<CreateWebPersonalizationDtoVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public CreateWebPersonalizationDtoConditions getConditions() {
        return conditions;
    }

    public CreateWebPersonalizationDto conditions(CreateWebPersonalizationDtoConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateWebPersonalizationDtoTargeting getTargeting() {
        return targeting;
    }

    public CreateWebPersonalizationDto targeting(CreateWebPersonalizationDtoTargeting targeting) {
        this.targeting = targeting;
        return this;
    }

    public Object getGoal() {
        return goal;
    }

    public CreateWebPersonalizationDto goal(Object goal) {
        this.goal = goal;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public CreateWebPersonalizationDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public CreateWebPersonalizationDto startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public CreateWebPersonalizationDto endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
