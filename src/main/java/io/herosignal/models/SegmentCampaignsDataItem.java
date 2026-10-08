// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** SegmentCampaignsDataItem şeması (api/openapi.yaml). */
public final class SegmentCampaignsDataItem {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "status" alanı. Zorunlu. */
    @JsonProperty("status")
    private String status;

    /** "type" alanı. Zorunlu. */
    @JsonProperty("type")
    private String type;

    /** "usage" alanı. Zorunlu. Değerler: "include", "exclude". */
    @JsonProperty("usage")
    private String usage;

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
    public SegmentCampaignsDataItem setId(String id) {
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
    public SegmentCampaignsDataItem setName(String name) {
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
    public SegmentCampaignsDataItem setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "type" alanı */
    public String getType() {
        return type;
    }

    /**
     * "type" alanını ayarlar.
     *
     * @param type yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentCampaignsDataItem setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "usage" alanı */
    public String getUsage() {
        return usage;
    }

    /**
     * "usage" alanını ayarlar.
     *
     * @param usage yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentCampaignsDataItem setUsage(String usage) {
        this.usage = usage;
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
    public SegmentCampaignsDataItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
