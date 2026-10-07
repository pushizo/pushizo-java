// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentCampaignsDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentCampaignsDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu. Değerler: "include", "exclude".
     */
    @JsonProperty("usage")
    private String usage;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public SegmentCampaignsDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SegmentCampaignsDataItem name(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SegmentCampaignsDataItem status(String status) {
        this.status = status;
        return this;
    }

    public String getType() {
        return type;
    }

    public SegmentCampaignsDataItem type(String type) {
        this.type = type;
        return this;
    }

    public String getUsage() {
        return usage;
    }

    public SegmentCampaignsDataItem usage(String usage) {
        this.usage = usage;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public SegmentCampaignsDataItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
