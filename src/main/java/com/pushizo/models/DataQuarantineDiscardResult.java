// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataQuarantineDiscardResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataQuarantineDiscardResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("discarded")
    private Long discarded;

    public Long getDiscarded() {
        return discarded;
    }

    public DataQuarantineDiscardResult discarded(Long discarded) {
        this.discarded = discarded;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
