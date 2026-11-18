// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdPlatformListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdPlatformListDataItem {
    /**
     * Zorunlu. Değerler: "meta", "google", "tiktok", "linkedin".
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("mock")
    private Boolean mock;

    /**
     * Zorunlu. Değerler: "email", "phone", "maid".
     */
    @JsonProperty("identifiers")
    private java.util.List<String> identifiers;

    /**
     * Zorunlu.
     */
    @JsonProperty("lookalike")
    private Boolean lookalike;

    /**
     * Zorunlu.
     */
    @JsonProperty("batch_size")
    private Long batchSize;

    public String getPlatform() {
        return platform;
    }

    public AdPlatformListDataItem platform(String platform) {
        this.platform = platform;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public AdPlatformListDataItem enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getMock() {
        return mock;
    }

    public AdPlatformListDataItem mock(Boolean mock) {
        this.mock = mock;
        return this;
    }

    public java.util.List<String> getIdentifiers() {
        return identifiers;
    }

    public AdPlatformListDataItem identifiers(java.util.List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public Boolean getLookalike() {
        return lookalike;
    }

    public AdPlatformListDataItem lookalike(Boolean lookalike) {
        this.lookalike = lookalike;
        return this;
    }

    public Long getBatchSize() {
        return batchSize;
    }

    public AdPlatformListDataItem batchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
