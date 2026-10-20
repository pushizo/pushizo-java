// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdRefreshQueued şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdRefreshQueued {
    /**
     * Zorunlu.
     */
    @JsonProperty("queued")
    private Boolean queued;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_sync_at")
    private String nextSyncAt;

    public Boolean getQueued() {
        return queued;
    }

    public AdRefreshQueued queued(Boolean queued) {
        this.queued = queued;
        return this;
    }

    public String getNextSyncAt() {
        return nextSyncAt;
    }

    public AdRefreshQueued nextSyncAt(String nextSyncAt) {
        this.nextSyncAt = nextSyncAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
