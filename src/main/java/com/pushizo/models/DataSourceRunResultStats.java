// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataSourceRunResultStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataSourceRunResultStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("received")
    private Long received;

    /**
     * Zorunlu.
     */
    @JsonProperty("processed")
    private Long processed;

    /**
     * Zorunlu.
     */
    @JsonProperty("dropped")
    private Long dropped;

    /**
     * Zorunlu.
     */
    @JsonProperty("quarantined")
    private Long quarantined;

    public Long getReceived() {
        return received;
    }

    public DataSourceRunResultStats received(Long received) {
        this.received = received;
        return this;
    }

    public Long getProcessed() {
        return processed;
    }

    public DataSourceRunResultStats processed(Long processed) {
        this.processed = processed;
        return this;
    }

    public Long getDropped() {
        return dropped;
    }

    public DataSourceRunResultStats dropped(Long dropped) {
        this.dropped = dropped;
        return this;
    }

    public Long getQuarantined() {
        return quarantined;
    }

    public DataSourceRunResultStats quarantined(Long quarantined) {
        this.quarantined = quarantined;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
