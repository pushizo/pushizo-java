// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

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

    @JsonProperty("display")
    private UpdateInAppDtoDisplay display;

    @JsonProperty("audience")
    private UpdateInAppDtoAudience audience;

    @JsonProperty("frequency")
    private UpdateInAppDtoFrequency frequency;

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
        return io.herosignal.core.Json.stringify(this);
    }
}
