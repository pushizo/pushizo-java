// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailWarmupPlanToday şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailWarmupPlanToday {
    /**
     * Zorunlu.
     */
    @JsonProperty("day")
    private String day;

    /**
     * Zorunlu.
     */
    @JsonProperty("index")
    private Long index;

    /**
     * Zorunlu.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * Zorunlu.
     */
    @JsonProperty("used")
    private Long used;

    /**
     * Zorunlu.
     */
    @JsonProperty("buckets")
    private java.util.Map<String, EmailWarmupPlanTodayBucketsValue> buckets;

    public String getDay() {
        return day;
    }

    public EmailWarmupPlanToday day(String day) {
        this.day = day;
        return this;
    }

    public Long getIndex() {
        return index;
    }

    public EmailWarmupPlanToday index(Long index) {
        this.index = index;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public EmailWarmupPlanToday limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getUsed() {
        return used;
    }

    public EmailWarmupPlanToday used(Long used) {
        this.used = used;
        return this;
    }

    public java.util.Map<String, EmailWarmupPlanTodayBucketsValue> getBuckets() {
        return buckets;
    }

    public EmailWarmupPlanToday buckets(java.util.Map<String, EmailWarmupPlanTodayBucketsValue> buckets) {
        this.buckets = buckets;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
