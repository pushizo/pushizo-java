// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** TemplateVersionListDataItem şeması (api/openapi.yaml). */
public final class TemplateVersionListDataItem {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "version" alanı. Zorunlu. */
    @JsonProperty("version")
    private Long version;

    /** "content" alanı. Zorunlu. */
    @JsonProperty("content")
    private Map<String, Object> content;

    /** "created_by" alanı. Zorunlu. */
    @JsonProperty("created_by")
    private String createdBy;

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
    public TemplateVersionListDataItem setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "version" alanı */
    public Long getVersion() {
        return version;
    }

    /**
     * "version" alanını ayarlar.
     *
     * @param version yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public TemplateVersionListDataItem setVersion(Long version) {
        this.version = version;
        return this;
    }

    /** @return "content" alanı */
    public Map<String, Object> getContent() {
        return content;
    }

    /**
     * "content" alanını ayarlar.
     *
     * @param content yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public TemplateVersionListDataItem setContent(Map<String, Object> content) {
        this.content = content;
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
    public TemplateVersionListDataItem setCreatedBy(String createdBy) {
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
    public TemplateVersionListDataItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
