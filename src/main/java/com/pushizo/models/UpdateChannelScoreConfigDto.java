// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateChannelScoreConfigDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateChannelScoreConfigDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("window_days")
    private Long windowDays;

    @JsonProperty("min_sends")
    private Long minSends;

    @JsonProperty("count_email_opens")
    private Boolean countEmailOpens;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateChannelScoreConfigDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public UpdateChannelScoreConfigDto windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public Long getMinSends() {
        return minSends;
    }

    public UpdateChannelScoreConfigDto minSends(Long minSends) {
        this.minSends = minSends;
        return this;
    }

    public Boolean getCountEmailOpens() {
        return countEmailOpens;
    }

    public UpdateChannelScoreConfigDto countEmailOpens(Boolean countEmailOpens) {
        this.countEmailOpens = countEmailOpens;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
