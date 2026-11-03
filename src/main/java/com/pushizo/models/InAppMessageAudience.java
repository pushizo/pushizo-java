// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InAppMessageAudience şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InAppMessageAudience {
    @JsonProperty("included_segments")
    private java.util.List<String> includedSegments;

    @JsonProperty("excluded_segments")
    private java.util.List<String> excludedSegments;

    @JsonProperty("global_control_exempt")
    private Boolean globalControlExempt;

    public java.util.List<String> getIncludedSegments() {
        return includedSegments;
    }

    public InAppMessageAudience includedSegments(java.util.List<String> includedSegments) {
        this.includedSegments = includedSegments;
        return this;
    }

    public java.util.List<String> getExcludedSegments() {
        return excludedSegments;
    }

    public InAppMessageAudience excludedSegments(java.util.List<String> excludedSegments) {
        this.excludedSegments = excludedSegments;
        return this;
    }

    public Boolean getGlobalControlExempt() {
        return globalControlExempt;
    }

    public InAppMessageAudience globalControlExempt(Boolean globalControlExempt) {
        this.globalControlExempt = globalControlExempt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
