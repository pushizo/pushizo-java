// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UninstallReportLastMessagesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UninstallReportLastMessagesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("campaign_id")
    private String campaignId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("uninstalls")
    private Long uninstalls;

    public String getCampaignId() {
        return campaignId;
    }

    public UninstallReportLastMessagesItem campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UninstallReportLastMessagesItem name(String name) {
        this.name = name;
        return this;
    }

    public String getSource() {
        return source;
    }

    public UninstallReportLastMessagesItem source(String source) {
        this.source = source;
        return this;
    }

    public Long getUninstalls() {
        return uninstalls;
    }

    public UninstallReportLastMessagesItem uninstalls(Long uninstalls) {
        this.uninstalls = uninstalls;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
