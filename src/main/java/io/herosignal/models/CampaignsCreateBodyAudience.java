// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignsCreateBodyAudience şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsCreateBodyAudience {
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
    private CampaignsCreateBodyAudienceFilters filters;

    /**
     * Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    @JsonProperty("test_devices_only")
    private Boolean testDevicesOnly;

    public Boolean getAll() {
        return all;
    }

    public CampaignsCreateBodyAudience all(Boolean all) {
        this.all = all;
        return this;
    }

    public java.util.List<String> getSegments() {
        return segments;
    }

    public CampaignsCreateBodyAudience segments(java.util.List<String> segments) {
        this.segments = segments;
        return this;
    }

    public java.util.List<String> getExcludeSegments() {
        return excludeSegments;
    }

    public CampaignsCreateBodyAudience excludeSegments(java.util.List<String> excludeSegments) {
        this.excludeSegments = excludeSegments;
        return this;
    }

    public CampaignsCreateBodyAudienceFilters getFilters() {
        return filters;
    }

    public CampaignsCreateBodyAudience filters(CampaignsCreateBodyAudienceFilters filters) {
        this.filters = filters;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public CampaignsCreateBodyAudience channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public Boolean getTestDevicesOnly() {
        return testDevicesOnly;
    }

    public CampaignsCreateBodyAudience testDevicesOnly(Boolean testDevicesOnly) {
        this.testDevicesOnly = testDevicesOnly;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
