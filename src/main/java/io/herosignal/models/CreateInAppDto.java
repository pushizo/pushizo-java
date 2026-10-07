// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("display")
    private CreateInAppDtoDisplay display;

    @JsonProperty("audience")
    private CreateInAppDtoAudience audience;

    @JsonProperty("frequency")
    private CreateInAppDtoFrequency frequency;

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
        return io.herosignal.core.Json.stringify(this);
    }
}
