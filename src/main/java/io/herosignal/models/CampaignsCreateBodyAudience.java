// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** CampaignsCreateBodyAudience şeması (api/openapi.yaml). */
public final class CampaignsCreateBodyAudience {

    /** "all" alanı. */
    @JsonProperty("all")
    private Boolean all;

    /** "segments" alanı. */
    @JsonProperty("segments")
    private List<String> segments;

    /** "exclude_segments" alanı. */
    @JsonProperty("exclude_segments")
    private List<String> excludeSegments;

    /** "filters" alanı. Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7). */
    @JsonProperty("filters")
    private CampaignsCreateBodyAudienceFilters filters;

    /** "channels" alanı. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channels")
    private List<String> channels;

    /** "test_devices_only" alanı. */
    @JsonProperty("test_devices_only")
    private Boolean testDevicesOnly;

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
    public CampaignsCreateBodyAudience setAll(Boolean all) {
        this.all = all;
        return this;
    }

    /** @return "segments" alanı */
    public List<String> getSegments() {
        return segments;
    }

    /**
     * "segments" alanını ayarlar.
     *
     * @param segments yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyAudience setSegments(List<String> segments) {
        this.segments = segments;
        return this;
    }

    /** @return "exclude_segments" alanı */
    public List<String> getExcludeSegments() {
        return excludeSegments;
    }

    /**
     * "exclude_segments" alanını ayarlar.
     *
     * @param excludeSegments yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyAudience setExcludeSegments(List<String> excludeSegments) {
        this.excludeSegments = excludeSegments;
        return this;
    }

    /** @return "filters" alanı */
    public CampaignsCreateBodyAudienceFilters getFilters() {
        return filters;
    }

    /**
     * "filters" alanını ayarlar.
     *
     * @param filters yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBodyAudience setFilters(CampaignsCreateBodyAudienceFilters filters) {
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
    public CampaignsCreateBodyAudience setChannels(List<String> channels) {
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
    public CampaignsCreateBodyAudience setTestDevicesOnly(Boolean testDevicesOnly) {
        this.testDevicesOnly = testDevicesOnly;
        return this;
    }
}
