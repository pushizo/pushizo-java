// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BulkReplayDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class BulkReplayDto {
    /**
     * Değerler: "failed", "dead", "failed_or_dead".
     */
    @JsonProperty("status")
    private String status;

    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    public String getStatus() {
        return status;
    }

    public BulkReplayDto status(String status) {
        this.status = status;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public BulkReplayDto from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public BulkReplayDto to(String to) {
        this.to = to;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
