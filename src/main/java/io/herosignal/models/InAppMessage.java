// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** InAppMessage şeması (api/openapi.yaml). */
public final class InAppMessage {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "status" alanı. Zorunlu. Değerler: "draft", "active", "paused", "archived". */
    @JsonProperty("status")
    private String status;

    /** "priority" alanı. Zorunlu. */
    @JsonProperty("priority")
    private Long priority;

    /** "triggers" alanı. Zorunlu. */
    @JsonProperty("triggers")
    private List<Object> triggers;

    /** "display" alanı. Zorunlu. */
    @JsonProperty("display")
    private InAppMessageDisplay display;

    /** "audience" alanı. Zorunlu. */
    @JsonProperty("audience")
    private InAppMessageAudience audience;

    /** "frequency" alanı. Zorunlu. */
    @JsonProperty("frequency")
    private InAppMessageFrequency frequency;

    /** "start_at" alanı. Zorunlu. */
    @JsonProperty("start_at")
    private String startAt;

    /** "end_at" alanı. Zorunlu. */
    @JsonProperty("end_at")
    private String endAt;

    /** "stats" alanı. Zorunlu. */
    @JsonProperty("stats")
    private InAppMessageStats stats;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "updated_at" alanı. Zorunlu. */
    @JsonProperty("updated_at")
    private String updatedAt;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessage setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "app_id" alanı */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" alanını ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessage setAppId(String appId) {
        this.appId = appId;
        return this;
    }

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
    public InAppMessage setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "status" alanı */
    public String getStatus() {
        return status;
    }

    /**
     * "status" alanını ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessage setStatus(String status) {
        this.status = status;
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
    public InAppMessage setPriority(Long priority) {
        this.priority = priority;
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
    public InAppMessage setTriggers(List<Object> triggers) {
        this.triggers = triggers;
        return this;
    }

    /** @return "display" alanı */
    public InAppMessageDisplay getDisplay() {
        return display;
    }

    /**
     * "display" alanını ayarlar.
     *
     * @param display yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessage setDisplay(InAppMessageDisplay display) {
        this.display = display;
        return this;
    }

    /** @return "audience" alanı */
    public InAppMessageAudience getAudience() {
        return audience;
    }

    /**
     * "audience" alanını ayarlar.
     *
     * @param audience yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessage setAudience(InAppMessageAudience audience) {
        this.audience = audience;
        return this;
    }

    /** @return "frequency" alanı */
    public InAppMessageFrequency getFrequency() {
        return frequency;
    }

    /**
     * "frequency" alanını ayarlar.
     *
     * @param frequency yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessage setFrequency(InAppMessageFrequency frequency) {
        this.frequency = frequency;
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
    public InAppMessage setStartAt(String startAt) {
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
    public InAppMessage setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    /** @return "stats" alanı */
    public InAppMessageStats getStats() {
        return stats;
    }

    /**
     * "stats" alanını ayarlar.
     *
     * @param stats yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessage setStats(InAppMessageStats stats) {
        this.stats = stats;
        return this;
    }

    /** @return "created_at" alanı */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * "created_at" alanını ayarlar.
     *
     * @param createdAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessage setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** @return "updated_at" alanı */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * "updated_at" alanını ayarlar.
     *
     * @param updatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InAppMessage setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
