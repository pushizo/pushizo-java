// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsUpdateDtoRouting şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsUpdateDtoRouting {
    @JsonProperty("auto_assign")
    private Boolean autoAssign;

    /**
     * Değerler: "all", "team", "assigned".
     */
    @JsonProperty("visibility")
    private String visibility;

    @JsonProperty("show_unassigned")
    private Boolean showUnassigned;

    @JsonProperty("first_response_sla_seconds")
    private Long firstResponseSlaSeconds;

    @JsonProperty("max_concurrent_default")
    private Long maxConcurrentDefault;

    public Boolean getAutoAssign() {
        return autoAssign;
    }

    public InboxSettingsUpdateDtoRouting autoAssign(Boolean autoAssign) {
        this.autoAssign = autoAssign;
        return this;
    }

    public String getVisibility() {
        return visibility;
    }

    public InboxSettingsUpdateDtoRouting visibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public Boolean getShowUnassigned() {
        return showUnassigned;
    }

    public InboxSettingsUpdateDtoRouting showUnassigned(Boolean showUnassigned) {
        this.showUnassigned = showUnassigned;
        return this;
    }

    public Long getFirstResponseSlaSeconds() {
        return firstResponseSlaSeconds;
    }

    public InboxSettingsUpdateDtoRouting firstResponseSlaSeconds(Long firstResponseSlaSeconds) {
        this.firstResponseSlaSeconds = firstResponseSlaSeconds;
        return this;
    }

    public Long getMaxConcurrentDefault() {
        return maxConcurrentDefault;
    }

    public InboxSettingsUpdateDtoRouting maxConcurrentDefault(Long maxConcurrentDefault) {
        this.maxConcurrentDefault = maxConcurrentDefault;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
