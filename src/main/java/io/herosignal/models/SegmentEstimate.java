// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentEstimate şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentEstimate {
    /**
     * Zorunlu.
     */
    @JsonProperty("segment_id")
    private String segmentId;

    /**
     * Zorunlu.
     */
    @JsonProperty("subscriptions")
    private Long subscriptions;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    /**
     * Zorunlu.
     */
    @JsonProperty("estimated_at")
    private String estimatedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("cached")
    private Boolean cached;

    /**
     * Zorunlu.
     */
    @JsonProperty("sampled")
    private Boolean sampled;

    public String getSegmentId() {
        return segmentId;
    }

    public SegmentEstimate segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public Long getSubscriptions() {
        return subscriptions;
    }

    public SegmentEstimate subscriptions(Long subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public SegmentEstimate users(Long users) {
        this.users = users;
        return this;
    }

    public String getEstimatedAt() {
        return estimatedAt;
    }

    public SegmentEstimate estimatedAt(String estimatedAt) {
        this.estimatedAt = estimatedAt;
        return this;
    }

    public Boolean getCached() {
        return cached;
    }

    public SegmentEstimate cached(Boolean cached) {
        this.cached = cached;
        return this;
    }

    public Boolean getSampled() {
        return sampled;
    }

    public SegmentEstimate sampled(Boolean sampled) {
        this.sampled = sampled;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
