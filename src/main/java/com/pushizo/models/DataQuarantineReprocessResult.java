// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataQuarantineReprocessResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataQuarantineReprocessResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("reprocessed")
    private Long reprocessed;

    /**
     * Zorunlu.
     */
    @JsonProperty("dropped")
    private Long dropped;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

    public Long getReprocessed() {
        return reprocessed;
    }

    public DataQuarantineReprocessResult reprocessed(Long reprocessed) {
        this.reprocessed = reprocessed;
        return this;
    }

    public Long getDropped() {
        return dropped;
    }

    public DataQuarantineReprocessResult dropped(Long dropped) {
        this.dropped = dropped;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public DataQuarantineReprocessResult failed(Long failed) {
        this.failed = failed;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
