// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailWarmupPlanTodayBucketsValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailWarmupPlanTodayBucketsValue {
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

    public Long getLimit() {
        return limit;
    }

    public EmailWarmupPlanTodayBucketsValue limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getUsed() {
        return used;
    }

    public EmailWarmupPlanTodayBucketsValue used(Long used) {
        this.used = used;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
