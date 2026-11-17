// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignPreflightSummary şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignPreflightSummary {
    /**
     * Zorunlu.
     */
    @JsonProperty("critical")
    private Long critical;

    /**
     * Zorunlu.
     */
    @JsonProperty("warning")
    private Long warning;

    /**
     * Zorunlu.
     */
    @JsonProperty("info")
    private Long info;

    /**
     * Zorunlu.
     */
    @JsonProperty("blocked")
    private Boolean blocked;

    public Long getCritical() {
        return critical;
    }

    public CampaignPreflightSummary critical(Long critical) {
        this.critical = critical;
        return this;
    }

    public Long getWarning() {
        return warning;
    }

    public CampaignPreflightSummary warning(Long warning) {
        this.warning = warning;
        return this;
    }

    public Long getInfo() {
        return info;
    }

    public CampaignPreflightSummary info(Long info) {
        this.info = info;
        return this;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public CampaignPreflightSummary blocked(Boolean blocked) {
        this.blocked = blocked;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
