// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** SegmentPreviewSampleItem şeması (api/openapi.yaml). */
public final class SegmentPreviewSampleItem {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "external_id" alanı. Zorunlu. */
    @JsonProperty("external_id")
    private String externalId;

    /** "tags" alanı. Zorunlu. */
    @JsonProperty("tags")
    private Map<String, String> tags;

    /** "last_active_at" alanı. Zorunlu. */
    @JsonProperty("last_active_at")
    private String lastActiveAt;

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
    public SegmentPreviewSampleItem setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "external_id" alanı */
    public String getExternalId() {
        return externalId;
    }

    /**
     * "external_id" alanını ayarlar.
     *
     * @param externalId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentPreviewSampleItem setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /** @return "tags" alanı */
    public Map<String, String> getTags() {
        return tags;
    }

    /**
     * "tags" alanını ayarlar.
     *
     * @param tags yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentPreviewSampleItem setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /** @return "last_active_at" alanı */
    public String getLastActiveAt() {
        return lastActiveAt;
    }

    /**
     * "last_active_at" alanını ayarlar.
     *
     * @param lastActiveAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentPreviewSampleItem setLastActiveAt(String lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
        return this;
    }
}
