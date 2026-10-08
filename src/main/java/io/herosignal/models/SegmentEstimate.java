// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** SegmentEstimate şeması (api/openapi.yaml). */
public final class SegmentEstimate {

    /** "segment_id" alanı. Zorunlu. */
    @JsonProperty("segment_id")
    private String segmentId;

    /** "subscriptions" alanı. Zorunlu. */
    @JsonProperty("subscriptions")
    private Long subscriptions;

    /** "users" alanı. Zorunlu. */
    @JsonProperty("users")
    private Long users;

    /** "estimated_at" alanı. Zorunlu. */
    @JsonProperty("estimated_at")
    private String estimatedAt;

    /** "cached" alanı. Zorunlu. */
    @JsonProperty("cached")
    private Boolean cached;

    /** "sampled" alanı. Zorunlu. */
    @JsonProperty("sampled")
    private Boolean sampled;

    /** @return "segment_id" alanı */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * "segment_id" alanını ayarlar.
     *
     * @param segmentId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentEstimate setSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    /** @return "subscriptions" alanı */
    public Long getSubscriptions() {
        return subscriptions;
    }

    /**
     * "subscriptions" alanını ayarlar.
     *
     * @param subscriptions yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentEstimate setSubscriptions(Long subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    /** @return "users" alanı */
    public Long getUsers() {
        return users;
    }

    /**
     * "users" alanını ayarlar.
     *
     * @param users yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentEstimate setUsers(Long users) {
        this.users = users;
        return this;
    }

    /** @return "estimated_at" alanı */
    public String getEstimatedAt() {
        return estimatedAt;
    }

    /**
     * "estimated_at" alanını ayarlar.
     *
     * @param estimatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentEstimate setEstimatedAt(String estimatedAt) {
        this.estimatedAt = estimatedAt;
        return this;
    }

    /** @return "cached" alanı */
    public Boolean getCached() {
        return cached;
    }

    /**
     * "cached" alanını ayarlar.
     *
     * @param cached yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentEstimate setCached(Boolean cached) {
        this.cached = cached;
        return this;
    }

    /** @return "sampled" alanı */
    public Boolean getSampled() {
        return sampled;
    }

    /**
     * "sampled" alanını ayarlar.
     *
     * @param sampled yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentEstimate setSampled(Boolean sampled) {
        this.sampled = sampled;
        return this;
    }
}
