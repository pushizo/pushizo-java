// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebCampaignDtoVariantsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebCampaignDtoVariantsItem {
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
    @JsonProperty("weight_percent")
    private Long weightPercent;

    /**
     * Zorunlu.
     */
    @JsonProperty("display")
    private UpdateWebCampaignDtoVariantsItemDisplay display;

    public String getId() {
        return id;
    }

    public UpdateWebCampaignDtoVariantsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateWebCampaignDtoVariantsItem name(String name) {
        this.name = name;
        return this;
    }

    public Long getWeightPercent() {
        return weightPercent;
    }

    public UpdateWebCampaignDtoVariantsItem weightPercent(Long weightPercent) {
        this.weightPercent = weightPercent;
        return this;
    }

    public UpdateWebCampaignDtoVariantsItemDisplay getDisplay() {
        return display;
    }

    public UpdateWebCampaignDtoVariantsItem display(UpdateWebCampaignDtoVariantsItemDisplay display) {
        this.display = display;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
