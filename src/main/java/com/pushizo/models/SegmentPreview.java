// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SegmentPreview şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SegmentPreview {
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
    @JsonProperty("sampled")
    private Boolean sampled;

    /**
     * Zorunlu.
     */
    @JsonProperty("sample")
    private java.util.List<SegmentPreviewSampleItem> sample;

    public Long getSubscriptions() {
        return subscriptions;
    }

    public SegmentPreview subscriptions(Long subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public SegmentPreview users(Long users) {
        this.users = users;
        return this;
    }

    public Boolean getSampled() {
        return sampled;
    }

    public SegmentPreview sampled(Boolean sampled) {
        this.sampled = sampled;
        return this;
    }

    public java.util.List<SegmentPreviewSampleItem> getSample() {
        return sample;
    }

    public SegmentPreview sample(java.util.List<SegmentPreviewSampleItem> sample) {
        this.sample = sample;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
