// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignsUpdateBodyAudience şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsUpdateBodyAudience {
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
    private CampaignsUpdateBodyAudienceFilters filters;

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

    public CampaignsUpdateBodyAudience all(Boolean all) {
        this.all = all;
        return this;
    }

    public java.util.List<String> getSegments() {
        return segments;
    }

    public CampaignsUpdateBodyAudience segments(java.util.List<String> segments) {
        this.segments = segments;
        return this;
    }

    public java.util.List<String> getExcludeSegments() {
        return excludeSegments;
    }

    public CampaignsUpdateBodyAudience excludeSegments(java.util.List<String> excludeSegments) {
        this.excludeSegments = excludeSegments;
        return this;
    }

    public CampaignsUpdateBodyAudienceFilters getFilters() {
        return filters;
    }

    public CampaignsUpdateBodyAudience filters(CampaignsUpdateBodyAudienceFilters filters) {
        this.filters = filters;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public CampaignsUpdateBodyAudience channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public Boolean getTestDevicesOnly() {
        return testDevicesOnly;
    }

    public CampaignsUpdateBodyAudience testDevicesOnly(Boolean testDevicesOnly) {
        this.testDevicesOnly = testDevicesOnly;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
