// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostmasterStatsDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PostmasterStatsDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("day")
    private String day;

    /**
     * Zorunlu.
     */
    @JsonProperty("domain_reputation")
    private String domainReputation;

    /**
     * Zorunlu.
     */
    @JsonProperty("spam_rate")
    private String spamRate;

    public String getDay() {
        return day;
    }

    public PostmasterStatsDataItem day(String day) {
        this.day = day;
        return this;
    }

    public String getDomainReputation() {
        return domainReputation;
    }

    public PostmasterStatsDataItem domainReputation(String domainReputation) {
        this.domainReputation = domainReputation;
        return this;
    }

    public String getSpamRate() {
        return spamRate;
    }

    public PostmasterStatsDataItem spamRate(String spamRate) {
        this.spamRate = spamRate;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
