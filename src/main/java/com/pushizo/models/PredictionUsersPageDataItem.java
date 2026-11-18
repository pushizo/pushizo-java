// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PredictionUsersPageDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PredictionUsersPageDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("score")
    private Long score;

    /**
     * Zorunlu. Değerler: "low", "medium", "high".
     */
    @JsonProperty("bucket")
    private String bucket;

    public String getUserId() {
        return userId;
    }

    public PredictionUsersPageDataItem userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public PredictionUsersPageDataItem externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public Long getScore() {
        return score;
    }

    public PredictionUsersPageDataItem score(Long score) {
        this.score = score;
        return this;
    }

    public String getBucket() {
        return bucket;
    }

    public PredictionUsersPageDataItem bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
