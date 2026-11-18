// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PredictionModelDistributionItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PredictionModelDistributionItem {
    /**
     * Zorunlu. Değerler: "low", "medium", "high".
     */
    @JsonProperty("bucket")
    private String bucket;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    public String getBucket() {
        return bucket;
    }

    public PredictionModelDistributionItem bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public PredictionModelDistributionItem users(Long users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
