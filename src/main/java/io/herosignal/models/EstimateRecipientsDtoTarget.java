// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** EstimateRecipientsDtoTarget şeması (api/openapi.yaml). */
public final class EstimateRecipientsDtoTarget {

    /** "all" alanı. */
    @JsonProperty("all")
    private Boolean all;

    /** "include_subscription_ids" alanı. */
    @JsonProperty("include_subscription_ids")
    private List<String> includeSubscriptionIds;

    /** "include_external_ids" alanı. */
    @JsonProperty("include_external_ids")
    private List<String> includeExternalIds;

    /** "include_aliases" alanı. */
    @JsonProperty("include_aliases")
    private Map<String, List<String>> includeAliases;

    /** "included_segments" alanı. */
    @JsonProperty("included_segments")
    private List<String> includedSegments;

    /** "excluded_segments" alanı. */
    @JsonProperty("excluded_segments")
    private List<String> excludedSegments;

    /** "filters" alanı. */
    @JsonProperty("filters")
    private Object filters;

    /** "channels" alanı. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channels")
    private List<String> channels;

    /** "test_devices_only" alanı. */
    @JsonProperty("test_devices_only")
    private Boolean testDevicesOnly;

    /** "email_to" alanı. */
    @JsonProperty("email_to")
    private List<String> emailTo;

    /** "include_phone_numbers" alanı. */
    @JsonProperty("include_phone_numbers")
    private List<String> includePhoneNumbers;

    /** "include_unsubscribed" alanı. */
    @JsonProperty("include_unsubscribed")
    private Boolean includeUnsubscribed;

    /** @return "all" alanı */
    public Boolean getAll() {
        return all;
    }

    /**
     * "all" alanını ayarlar.
     *
     * @param all yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setAll(Boolean all) {
        this.all = all;
        return this;
    }

    /** @return "include_subscription_ids" alanı */
    public List<String> getIncludeSubscriptionIds() {
        return includeSubscriptionIds;
    }

    /**
     * "include_subscription_ids" alanını ayarlar.
     *
     * @param includeSubscriptionIds yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setIncludeSubscriptionIds(List<String> includeSubscriptionIds) {
        this.includeSubscriptionIds = includeSubscriptionIds;
        return this;
    }

    /** @return "include_external_ids" alanı */
    public List<String> getIncludeExternalIds() {
        return includeExternalIds;
    }

    /**
     * "include_external_ids" alanını ayarlar.
     *
     * @param includeExternalIds yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setIncludeExternalIds(List<String> includeExternalIds) {
        this.includeExternalIds = includeExternalIds;
        return this;
    }

    /** @return "include_aliases" alanı */
    public Map<String, List<String>> getIncludeAliases() {
        return includeAliases;
    }

    /**
     * "include_aliases" alanını ayarlar.
     *
     * @param includeAliases yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setIncludeAliases(Map<String, List<String>> includeAliases) {
        this.includeAliases = includeAliases;
        return this;
    }

    /** @return "included_segments" alanı */
    public List<String> getIncludedSegments() {
        return includedSegments;
    }

    /**
     * "included_segments" alanını ayarlar.
     *
     * @param includedSegments yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setIncludedSegments(List<String> includedSegments) {
        this.includedSegments = includedSegments;
        return this;
    }

    /** @return "excluded_segments" alanı */
    public List<String> getExcludedSegments() {
        return excludedSegments;
    }

    /**
     * "excluded_segments" alanını ayarlar.
     *
     * @param excludedSegments yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setExcludedSegments(List<String> excludedSegments) {
        this.excludedSegments = excludedSegments;
        return this;
    }

    /** @return "filters" alanı */
    public Object getFilters() {
        return filters;
    }

    /**
     * "filters" alanını ayarlar.
     *
     * @param filters yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setFilters(Object filters) {
        this.filters = filters;
        return this;
    }

    /** @return "channels" alanı */
    public List<String> getChannels() {
        return channels;
    }

    /**
     * "channels" alanını ayarlar.
     *
     * @param channels yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setChannels(List<String> channels) {
        this.channels = channels;
        return this;
    }

    /** @return "test_devices_only" alanı */
    public Boolean getTestDevicesOnly() {
        return testDevicesOnly;
    }

    /**
     * "test_devices_only" alanını ayarlar.
     *
     * @param testDevicesOnly yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setTestDevicesOnly(Boolean testDevicesOnly) {
        this.testDevicesOnly = testDevicesOnly;
        return this;
    }

    /** @return "email_to" alanı */
    public List<String> getEmailTo() {
        return emailTo;
    }

    /**
     * "email_to" alanını ayarlar.
     *
     * @param emailTo yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setEmailTo(List<String> emailTo) {
        this.emailTo = emailTo;
        return this;
    }

    /** @return "include_phone_numbers" alanı */
    public List<String> getIncludePhoneNumbers() {
        return includePhoneNumbers;
    }

    /**
     * "include_phone_numbers" alanını ayarlar.
     *
     * @param includePhoneNumbers yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setIncludePhoneNumbers(List<String> includePhoneNumbers) {
        this.includePhoneNumbers = includePhoneNumbers;
        return this;
    }

    /** @return "include_unsubscribed" alanı */
    public Boolean getIncludeUnsubscribed() {
        return includeUnsubscribed;
    }

    /**
     * "include_unsubscribed" alanını ayarlar.
     *
     * @param includeUnsubscribed yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EstimateRecipientsDtoTarget setIncludeUnsubscribed(Boolean includeUnsubscribed) {
        this.includeUnsubscribed = includeUnsubscribed;
        return this;
    }
}
