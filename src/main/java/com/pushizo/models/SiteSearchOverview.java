// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SiteSearchOverview şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SiteSearchOverview {
    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private SiteSearchOverviewSettings settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("index")
    private SiteSearchOverviewIndex index;

    /**
     * Zorunlu.
     */
    @JsonProperty("usage")
    private SiteSearchOverviewUsage usage;

    /**
     * Zorunlu.
     */
    @JsonProperty("ai")
    private SiteSearchOverviewAi ai;

    public SiteSearchOverviewSettings getSettings() {
        return settings;
    }

    public SiteSearchOverview settings(SiteSearchOverviewSettings settings) {
        this.settings = settings;
        return this;
    }

    public SiteSearchOverviewIndex getIndex() {
        return index;
    }

    public SiteSearchOverview index(SiteSearchOverviewIndex index) {
        this.index = index;
        return this;
    }

    public SiteSearchOverviewUsage getUsage() {
        return usage;
    }

    public SiteSearchOverview usage(SiteSearchOverviewUsage usage) {
        this.usage = usage;
        return this;
    }

    public SiteSearchOverviewAi getAi() {
        return ai;
    }

    public SiteSearchOverview ai(SiteSearchOverviewAi ai) {
        this.ai = ai;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
