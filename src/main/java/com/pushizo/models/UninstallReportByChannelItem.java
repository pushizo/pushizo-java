// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UninstallReportByChannelItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UninstallReportByChannelItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("uninstalls")
    private Long uninstalls;

    /**
     * Zorunlu.
     */
    @JsonProperty("active")
    private Long active;

    public String getChannel() {
        return channel;
    }

    public UninstallReportByChannelItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Long getUninstalls() {
        return uninstalls;
    }

    public UninstallReportByChannelItem uninstalls(Long uninstalls) {
        this.uninstalls = uninstalls;
        return this;
    }

    public Long getActive() {
        return active;
    }

    public UninstallReportByChannelItem active(Long active) {
        this.active = active;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
