// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdCapiConfigStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdCapiConfigStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("pending")
    private Long pending;

    /**
     * Zorunlu.
     */
    @JsonProperty("sent")
    private Long sent;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed")
    private Long failed;

    /**
     * Zorunlu.
     */
    @JsonProperty("skipped")
    private Long skipped;

    public Long getPending() {
        return pending;
    }

    public AdCapiConfigStats pending(Long pending) {
        this.pending = pending;
        return this;
    }

    public Long getSent() {
        return sent;
    }

    public AdCapiConfigStats sent(Long sent) {
        this.sent = sent;
        return this;
    }

    public Long getFailed() {
        return failed;
    }

    public AdCapiConfigStats failed(Long failed) {
        this.failed = failed;
        return this;
    }

    public Long getSkipped() {
        return skipped;
    }

    public AdCapiConfigStats skipped(Long skipped) {
        this.skipped = skipped;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
