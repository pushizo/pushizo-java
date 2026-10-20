// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsRouting şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsRouting {
    /**
     * Zorunlu.
     */
    @JsonProperty("auto_assign")
    private Boolean autoAssign;

    /**
     * Zorunlu. Değerler: "all", "team", "assigned".
     */
    @JsonProperty("visibility")
    private String visibility;

    /**
     * Zorunlu.
     */
    @JsonProperty("show_unassigned")
    private Boolean showUnassigned;

    /**
     * Zorunlu.
     */
    @JsonProperty("first_response_sla_seconds")
    private Long firstResponseSlaSeconds;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_concurrent_default")
    private Long maxConcurrentDefault;

    public Boolean getAutoAssign() {
        return autoAssign;
    }

    public InboxSettingsRouting autoAssign(Boolean autoAssign) {
        this.autoAssign = autoAssign;
        return this;
    }

    public String getVisibility() {
        return visibility;
    }

    public InboxSettingsRouting visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public Boolean getShowUnassigned() {
        return showUnassigned;
    }

    public InboxSettingsRouting showUnassigned(Boolean showUnassigned) {
        this.showUnassigned = showUnassigned;
        return this;
    }

    public Long getFirstResponseSlaSeconds() {
        return firstResponseSlaSeconds;
    }

    public InboxSettingsRouting firstResponseSlaSeconds(Long firstResponseSlaSeconds) {
        this.firstResponseSlaSeconds = firstResponseSlaSeconds;
        return this;
    }

    public Long getMaxConcurrentDefault() {
        return maxConcurrentDefault;
    }

    public InboxSettingsRouting maxConcurrentDefault(Long maxConcurrentDefault) {
        this.maxConcurrentDefault = maxConcurrentDefault;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
