// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * McpCreateCampaignDraftBodyVariantsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class McpCreateCampaignDraftBodyVariantsItem {
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
    @JsonProperty("weight_percent")
    private Long weightPercent;

    @JsonProperty("content")
    private java.util.Map<String, Object> content;

    @JsonProperty("is_control")
    private Boolean isControl;

    public String getId() {
        return id;
    }

    public McpCreateCampaignDraftBodyVariantsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public McpCreateCampaignDraftBodyVariantsItem name(String name) {
        this.name = name;
        return this;
    }

    public Long getWeightPercent() {
        return weightPercent;
    }

    public McpCreateCampaignDraftBodyVariantsItem weightPercent(Long weightPercent) {
        this.weightPercent = weightPercent;
        return this;
    }

    public java.util.Map<String, Object> getContent() {
        return content;
    }

    public McpCreateCampaignDraftBodyVariantsItem content(java.util.Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public Boolean getIsControl() {
        return isControl;
    }

    public McpCreateCampaignDraftBodyVariantsItem isControl(Boolean isControl) {
        this.isControl = isControl;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
