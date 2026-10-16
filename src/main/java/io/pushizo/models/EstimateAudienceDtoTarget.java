// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EstimateAudienceDtoTarget şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EstimateAudienceDtoTarget {
    @JsonProperty("all")
    private Boolean all;

    @JsonProperty("include_subscription_ids")
    private java.util.List<String> includeSubscriptionIds;

    @JsonProperty("include_external_ids")
    private java.util.List<String> includeExternalIds;

    @JsonProperty("include_aliases")
    private java.util.Map<String, java.util.List<String>> includeAliases;

    @JsonProperty("included_segments")
    private java.util.List<String> includedSegments;

    @JsonProperty("excluded_segments")
    private java.util.List<String> excludedSegments;

    @JsonProperty("filters")
    private Object filters;

    /**
     * Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    @JsonProperty("test_devices_only")
    private Boolean testDevicesOnly;

    @JsonProperty("email_to")
    private java.util.List<String> emailTo;

    @JsonProperty("include_phone_numbers")
    private java.util.List<String> includePhoneNumbers;

    public Boolean getAll() {
        return all;
    }

    public EstimateAudienceDtoTarget all(Boolean all) {
        this.all = all;
        return this;
    }

    public java.util.List<String> getIncludeSubscriptionIds() {
        return includeSubscriptionIds;
    }

    public EstimateAudienceDtoTarget includeSubscriptionIds(java.util.List<String> includeSubscriptionIds) {
        this.includeSubscriptionIds = includeSubscriptionIds;
        return this;
    }

    public java.util.List<String> getIncludeExternalIds() {
        return includeExternalIds;
    }

    public EstimateAudienceDtoTarget includeExternalIds(java.util.List<String> includeExternalIds) {
        this.includeExternalIds = includeExternalIds;
        return this;
    }

    public java.util.Map<String, java.util.List<String>> getIncludeAliases() {
        return includeAliases;
    }

    public EstimateAudienceDtoTarget includeAliases(java.util.Map<String, java.util.List<String>> includeAliases) {
        this.includeAliases = includeAliases;
        return this;
    }

    public java.util.List<String> getIncludedSegments() {
        return includedSegments;
    }

    public EstimateAudienceDtoTarget includedSegments(java.util.List<String> includedSegments) {
        this.includedSegments = includedSegments;
        return this;
    }

    public java.util.List<String> getExcludedSegments() {
        return excludedSegments;
    }

    public EstimateAudienceDtoTarget excludedSegments(java.util.List<String> excludedSegments) {
        this.excludedSegments = excludedSegments;
        return this;
    }

    public Object getFilters() {
        return filters;
    }

    public EstimateAudienceDtoTarget filters(Object filters) {
        this.filters = filters;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public EstimateAudienceDtoTarget channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public Boolean getTestDevicesOnly() {
        return testDevicesOnly;
    }

    public EstimateAudienceDtoTarget testDevicesOnly(Boolean testDevicesOnly) {
        this.testDevicesOnly = testDevicesOnly;
        return this;
    }

    public java.util.List<String> getEmailTo() {
        return emailTo;
    }

    public EstimateAudienceDtoTarget emailTo(java.util.List<String> emailTo) {
        this.emailTo = emailTo;
        return this;
    }

    public java.util.List<String> getIncludePhoneNumbers() {
        return includePhoneNumbers;
    }

    public EstimateAudienceDtoTarget includePhoneNumbers(java.util.List<String> includePhoneNumbers) {
        this.includePhoneNumbers = includePhoneNumbers;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
