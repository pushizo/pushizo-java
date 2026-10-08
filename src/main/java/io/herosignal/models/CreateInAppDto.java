// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** CreateInAppDto şeması (api/openapi.yaml). */
public final class CreateInAppDto {

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "triggers" alanı. Zorunlu. */
    @JsonProperty("triggers")
    private List<Object> triggers;

    /** "display" alanı. Zorunlu. */
    @JsonProperty("display")
    private CreateInAppDtoDisplay display;

    /** "audience" alanı. */
    @JsonProperty("audience")
    private CreateInAppDtoAudience audience;

    /** "frequency" alanı. */
    @JsonProperty("frequency")
    private CreateInAppDtoFrequency frequency;

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
    public CreateInAppDto setName(String name) {
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
    public CreateInAppDto setTriggers(List<Object> triggers) {
        this.triggers = triggers;
        return this;
    }

    /** @return "display" alanı */
    public CreateInAppDtoDisplay getDisplay() {
        return display;
    }

    /**
     * "display" alanını ayarlar.
     *
     * @param display yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateInAppDto setDisplay(CreateInAppDtoDisplay display) {
        this.display = display;
        return this;
    }

    /** @return "audience" alanı */
    public CreateInAppDtoAudience getAudience() {
        return audience;
    }

    /**
     * "audience" alanını ayarlar.
     *
     * @param audience yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateInAppDto setAudience(CreateInAppDtoAudience audience) {
        this.audience = audience;
        return this;
    }

    /** @return "frequency" alanı */
    public CreateInAppDtoFrequency getFrequency() {
        return frequency;
    }

    /**
     * "frequency" alanını ayarlar.
     *
     * @param frequency yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateInAppDto setFrequency(CreateInAppDtoFrequency frequency) {
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
    public CreateInAppDto setPriority(Long priority) {
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
    public CreateInAppDto setStartAt(String startAt) {
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
    public CreateInAppDto setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }
}
