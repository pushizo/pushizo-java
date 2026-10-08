// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** Segment şeması (api/openapi.yaml). */
public final class Segment {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "description" alanı. Zorunlu. */
    @JsonProperty("description")
    private String description;

    /** "definition" alanı. Zorunlu. */
    @JsonProperty("definition")
    private Map<String, Object> definition;

    /** "is_dynamic" alanı. Zorunlu. */
    @JsonProperty("is_dynamic")
    private Boolean isDynamic;

    /** "estimated_count" alanı. Zorunlu. */
    @JsonProperty("estimated_count")
    private Long estimatedCount;

    /** "estimated_at" alanı. Zorunlu. */
    @JsonProperty("estimated_at")
    private String estimatedAt;

    /** "created_by" alanı. Zorunlu. */
    @JsonProperty("created_by")
    private String createdBy;

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
    public Segment setId(String id) {
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
    public Segment setAppId(String appId) {
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
    public Segment setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "description" alanı */
    public String getDescription() {
        return description;
    }

    /**
     * "description" alanını ayarlar.
     *
     * @param description yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Segment setDescription(String description) {
        this.description = description;
        return this;
    }

    /** @return "definition" alanı */
    public Map<String, Object> getDefinition() {
        return definition;
    }

    /**
     * "definition" alanını ayarlar.
     *
     * @param definition yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Segment setDefinition(Map<String, Object> definition) {
        this.definition = definition;
        return this;
    }

    /** @return "is_dynamic" alanı */
    public Boolean getIsDynamic() {
        return isDynamic;
    }

    /**
     * "is_dynamic" alanını ayarlar.
     *
     * @param isDynamic yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Segment setIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /** @return "estimated_count" alanı */
    public Long getEstimatedCount() {
        return estimatedCount;
    }

    /**
     * "estimated_count" alanını ayarlar.
     *
     * @param estimatedCount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Segment setEstimatedCount(Long estimatedCount) {
        this.estimatedCount = estimatedCount;
        return this;
    }

    /** @return "estimated_at" alanı */
    public String getEstimatedAt() {
        return estimatedAt;
    }

    /**
     * "estimated_at" alanını ayarlar.
     *
     * @param estimatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Segment setEstimatedAt(String estimatedAt) {
        this.estimatedAt = estimatedAt;
        return this;
    }

    /** @return "created_by" alanı */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * "created_by" alanını ayarlar.
     *
     * @param createdBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Segment setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
    public Segment setCreatedAt(String createdAt) {
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
    public Segment setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
