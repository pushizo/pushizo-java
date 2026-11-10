// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebPersonalizationDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebPersonalizationDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("changes")
    private java.util.List<Object> changes;

    @JsonProperty("variants")
    private java.util.List<UpdateWebPersonalizationDtoVariantsItem> variants;

    @JsonProperty("conditions")
    private UpdateWebPersonalizationDtoConditions conditions;

    @JsonProperty("targeting")
    private UpdateWebPersonalizationDtoTargeting targeting;

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

    public UpdateWebPersonalizationDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<Object> getChanges() {
        return changes;
    }

    public UpdateWebPersonalizationDto changes(java.util.List<Object> changes) {
        this.changes = changes;
        return this;
    }

    public java.util.List<UpdateWebPersonalizationDtoVariantsItem> getVariants() {
        return variants;
    }

    public UpdateWebPersonalizationDto variants(java.util.List<UpdateWebPersonalizationDtoVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public UpdateWebPersonalizationDtoConditions getConditions() {
        return conditions;
    }

    public UpdateWebPersonalizationDto conditions(UpdateWebPersonalizationDtoConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public UpdateWebPersonalizationDtoTargeting getTargeting() {
        return targeting;
    }

    public UpdateWebPersonalizationDto targeting(UpdateWebPersonalizationDtoTargeting targeting) {
        this.targeting = targeting;
        return this;
    }

    public Object getGoal() {
        return goal;
    }

    public UpdateWebPersonalizationDto goal(Object goal) {
        this.goal = goal;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public UpdateWebPersonalizationDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public String getStartAt() {
        return startAt;
    }

    public UpdateWebPersonalizationDto startAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    public String getEndAt() {
        return endAt;
    }

    public UpdateWebPersonalizationDto endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
