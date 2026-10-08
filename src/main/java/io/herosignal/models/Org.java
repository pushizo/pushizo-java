// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** Org şeması (api/openapi.yaml). */
public final class Org {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "slug" alanı. Zorunlu. */
    @JsonProperty("slug")
    private String slug;

    /** "plan_code" alanı. Zorunlu. */
    @JsonProperty("plan_code")
    private String planCode;

    /** "status" alanı. Zorunlu. Değerler: "active", "suspended", "deleted". */
    @JsonProperty("status")
    private String status;

    /** "settings" alanı. Zorunlu. */
    @JsonProperty("settings")
    private OrgSettings settings;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

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
    public Org setId(String id) {
        this.id = id;
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
    public Org setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "slug" alanı */
    public String getSlug() {
        return slug;
    }

    /**
     * "slug" alanını ayarlar.
     *
     * @param slug yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Org setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /** @return "plan_code" alanı */
    public String getPlanCode() {
        return planCode;
    }

    /**
     * "plan_code" alanını ayarlar.
     *
     * @param planCode yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Org setPlanCode(String planCode) {
        this.planCode = planCode;
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
    public Org setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "settings" alanı */
    public OrgSettings getSettings() {
        return settings;
    }

    /**
     * "settings" alanını ayarlar.
     *
     * @param settings yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Org setSettings(OrgSettings settings) {
        this.settings = settings;
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
    public Org setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
