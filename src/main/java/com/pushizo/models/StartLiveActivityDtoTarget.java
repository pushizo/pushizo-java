// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StartLiveActivityDtoTarget şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class StartLiveActivityDtoTarget {
    @JsonProperty("include_external_ids")
    private java.util.List<String> includeExternalIds;

    @JsonProperty("include_subscription_ids")
    private java.util.List<String> includeSubscriptionIds;

    @JsonProperty("included_segments")
    private java.util.List<String> includedSegments;

    @JsonProperty("all")
    private Boolean all;

    public java.util.List<String> getIncludeExternalIds() {
        return includeExternalIds;
    }

    public StartLiveActivityDtoTarget includeExternalIds(java.util.List<String> includeExternalIds) {
        this.includeExternalIds = includeExternalIds;
        return this;
    }

    public java.util.List<String> getIncludeSubscriptionIds() {
        return includeSubscriptionIds;
    }

    public StartLiveActivityDtoTarget includeSubscriptionIds(java.util.List<String> includeSubscriptionIds) {
        this.includeSubscriptionIds = includeSubscriptionIds;
        return this;
    }

    public java.util.List<String> getIncludedSegments() {
        return includedSegments;
    }

    public StartLiveActivityDtoTarget includedSegments(java.util.List<String> includedSegments) {
        this.includedSegments = includedSegments;
        return this;
    }

    public Boolean getAll() {
        return all;
    }

    public StartLiveActivityDtoTarget all(Boolean all) {
        this.all = all;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
