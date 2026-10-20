// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWebCampaignDtoFrequency şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWebCampaignDtoFrequency {
    @JsonProperty("max_per_session")
    private Long maxPerSession;

    @JsonProperty("max_per_day")
    private Long maxPerDay;

    @JsonProperty("max_total")
    private Long maxTotal;

    @JsonProperty("hide_after_close_days")
    private Long hideAfterCloseDays;

    @JsonProperty("stop_after_conversion")
    private Boolean stopAfterConversion;

    public Long getMaxPerSession() {
        return maxPerSession;
    }

    public CreateWebCampaignDtoFrequency maxPerSession(Long maxPerSession) {
        this.maxPerSession = maxPerSession;
        return this;
    }

    public Long getMaxPerDay() {
        return maxPerDay;
    }

    public CreateWebCampaignDtoFrequency maxPerDay(Long maxPerDay) {
        this.maxPerDay = maxPerDay;
        return this;
    }

    public Long getMaxTotal() {
        return maxTotal;
    }

    public CreateWebCampaignDtoFrequency maxTotal(Long maxTotal) {
        this.maxTotal = maxTotal;
        return this;
    }

    public Long getHideAfterCloseDays() {
        return hideAfterCloseDays;
    }

    public CreateWebCampaignDtoFrequency hideAfterCloseDays(Long hideAfterCloseDays) {
        this.hideAfterCloseDays = hideAfterCloseDays;
        return this;
    }

    public Boolean getStopAfterConversion() {
        return stopAfterConversion;
    }

    public CreateWebCampaignDtoFrequency stopAfterConversion(Boolean stopAfterConversion) {
        this.stopAfterConversion = stopAfterConversion;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
