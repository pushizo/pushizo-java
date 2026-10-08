// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** UpdateInAppDto şeması (api/openapi.yaml). */
public final class UpdateInAppDto {

    /** "name" alanı. */
    @JsonProperty("name")
    private String name;

    /** "triggers" alanı. */
    @JsonProperty("triggers")
    private List<Object> triggers;

    /** "display" alanı. */
    @JsonProperty("display")
    private UpdateInAppDtoDisplay display;

    /** "audience" alanı. */
    @JsonProperty("audience")
    private UpdateInAppDtoAudience audience;

    /** "frequency" alanı. */
    @JsonProperty("frequency")
    private UpdateInAppDtoFrequency frequency;

    /** "priority" alanı. */
    @JsonProperty("priority")
    private Long priority;

    /** "start_at" alanı. */
    @JsonProperty("start_at")
    private String startAt;

    /** "end_at" alanı. */
    @JsonProperty("end_at")
    private String endAt;

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDto setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "triggers" alanı */
    public List<Object> getTriggers() {
        return triggers;
    }

    /**
     * "triggers" alanını ayarlar.
     *
     * @param triggers yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDto setTriggers(List<Object> triggers) {
        this.triggers = triggers;
        return this;
    }

    /** @return "display" alanı */
    public UpdateInAppDtoDisplay getDisplay() {
        return display;
    }

    /**
     * "display" alanını ayarlar.
     *
     * @param display yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDto setDisplay(UpdateInAppDtoDisplay display) {
        this.display = display;
        return this;
    }

    /** @return "audience" alanı */
    public UpdateInAppDtoAudience getAudience() {
        return audience;
    }

    /**
     * "audience" alanını ayarlar.
     *
     * @param audience yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDto setAudience(UpdateInAppDtoAudience audience) {
        this.audience = audience;
        return this;
    }

    /** @return "frequency" alanı */
    public UpdateInAppDtoFrequency getFrequency() {
        return frequency;
    }

    /**
     * "frequency" alanını ayarlar.
     *
     * @param frequency yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDto setFrequency(UpdateInAppDtoFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /** @return "priority" alanı */
    public Long getPriority() {
        return priority;
    }

    /**
     * "priority" alanını ayarlar.
     *
     * @param priority yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDto setPriority(Long priority) {
        this.priority = priority;
        return this;
    }

    /** @return "start_at" alanı */
    public String getStartAt() {
        return startAt;
    }

    /**
     * "start_at" alanını ayarlar.
     *
     * @param startAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDto setStartAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    /** @return "end_at" alanı */
    public String getEndAt() {
        return endAt;
    }

    /**
     * "end_at" alanını ayarlar.
     *
     * @param endAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDto setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }
}
