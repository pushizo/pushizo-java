// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailWarmupUsageDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailWarmupUsageDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("day")
    private String day;

    /**
     * Zorunlu.
     */
    @JsonProperty("bucket")
    private String bucket;

    /**
     * Zorunlu.
     */
    @JsonProperty("used")
    private Long used;

    /**
     * Zorunlu.
     */
    @JsonProperty("limit")
    private Long limit;

    public String getDay() {
        return day;
    }

    public EmailWarmupUsageDataItem day(String day) {
        this.day = day;
        return this;
    }

    public String getBucket() {
        return bucket;
    }

    public EmailWarmupUsageDataItem bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public Long getUsed() {
        return used;
    }

    public EmailWarmupUsageDataItem used(Long used) {
        this.used = used;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public EmailWarmupUsageDataItem limit(Long limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
