// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxMetricsVolume şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxMetricsVolume {
    /**
     * Zorunlu.
     */
    @JsonProperty("created")
    private Long created;

    /**
     * Zorunlu.
     */
    @JsonProperty("resolved")
    private Long resolved;

    /**
     * Zorunlu.
     */
    @JsonProperty("open_now")
    private Long openNow;

    /**
     * Zorunlu.
     */
    @JsonProperty("unassigned_now")
    private Long unassignedNow;

    /**
     * Zorunlu.
     */
    @JsonProperty("by_channel")
    private java.util.Map<String, Long> byChannel;

    public Long getCreated() {
        return created;
    }

    public InboxMetricsVolume created(Long created) {
        this.created = created;
        return this;
    }

    public Long getResolved() {
        return resolved;
    }

    public InboxMetricsVolume resolved(Long resolved) {
        this.resolved = resolved;
        return this;
    }

    public Long getOpenNow() {
        return openNow;
    }

    public InboxMetricsVolume openNow(Long openNow) {
        this.openNow = openNow;
        return this;
    }

    public Long getUnassignedNow() {
        return unassignedNow;
    }

    public InboxMetricsVolume unassignedNow(Long unassignedNow) {
        this.unassignedNow = unassignedNow;
        return this;
    }

    public java.util.Map<String, Long> getByChannel() {
        return byChannel;
    }

    public InboxMetricsVolume byChannel(java.util.Map<String, Long> byChannel) {
        this.byChannel = byChannel;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
