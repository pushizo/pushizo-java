// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * McpCreateCampaignDraftBodyAudience şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class McpCreateCampaignDraftBodyAudience {
    @JsonProperty("all")
    private Boolean all;

    @JsonProperty("segments")
    private java.util.List<String> segments;

    @JsonProperty("exclude_segments")
    private java.util.List<String> excludeSegments;

    /**
     * Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7).
     */
    @JsonProperty("filters")
    private McpCreateCampaignDraftBodyAudienceFilters filters;

    /**
     * Değerler: "ios_push", "android_push", "hms_push", "adm_push", "wns_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    @JsonProperty("test_devices_only")
    private Boolean testDevicesOnly;

    public Boolean getAll() {
        return all;
    }

    public McpCreateCampaignDraftBodyAudience all(Boolean all) {
        this.all = all;
        return this;
    }

    public java.util.List<String> getSegments() {
        return segments;
    }

    public McpCreateCampaignDraftBodyAudience segments(java.util.List<String> segments) {
        this.segments = segments;
        return this;
    }

    public java.util.List<String> getExcludeSegments() {
        return excludeSegments;
    }

    public McpCreateCampaignDraftBodyAudience excludeSegments(java.util.List<String> excludeSegments) {
        this.excludeSegments = excludeSegments;
        return this;
    }

    public McpCreateCampaignDraftBodyAudienceFilters getFilters() {
        return filters;
    }

    public McpCreateCampaignDraftBodyAudience filters(McpCreateCampaignDraftBodyAudienceFilters filters) {
        this.filters = filters;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public McpCreateCampaignDraftBodyAudience channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public Boolean getTestDevicesOnly() {
        return testDevicesOnly;
    }

    public McpCreateCampaignDraftBodyAudience testDevicesOnly(Boolean testDevicesOnly) {
        this.testDevicesOnly = testDevicesOnly;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
