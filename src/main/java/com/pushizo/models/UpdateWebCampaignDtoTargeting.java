// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWebCampaignDtoTargeting şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWebCampaignDtoTargeting {
    @JsonProperty("included_segments")
    private java.util.List<String> includedSegments;

    @JsonProperty("excluded_segments")
    private java.util.List<String> excludedSegments;

    /**
     * Değerler: "all", "new", "returning".
     */
    @JsonProperty("visitor")
    private String visitor;

    /**
     * Değerler: "desktop", "mobile", "tablet".
     */
    @JsonProperty("devices")
    private java.util.List<String> devices;

    public java.util.List<String> getIncludedSegments() {
        return includedSegments;
    }

    public UpdateWebCampaignDtoTargeting includedSegments(java.util.List<String> includedSegments) {
        this.includedSegments = includedSegments;
        return this;
    }

    public java.util.List<String> getExcludedSegments() {
        return excludedSegments;
    }

    public UpdateWebCampaignDtoTargeting excludedSegments(java.util.List<String> excludedSegments) {
        this.excludedSegments = excludedSegments;
        return this;
    }

    public String getVisitor() {
        return visitor;
    }

    public UpdateWebCampaignDtoTargeting visitor(String visitor) {
        this.visitor = visitor;
        return this;
    }

    public java.util.List<String> getDevices() {
        return devices;
    }

    public UpdateWebCampaignDtoTargeting devices(java.util.List<String> devices) {
        this.devices = devices;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
