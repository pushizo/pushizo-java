// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EstimateAudienceDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EstimateAudienceDto {
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("target")
    private EstimateAudienceDtoTarget target;

    @JsonProperty("include_unsubscribed")
    private Boolean includeUnsubscribed;

    public String getAppId() {
        return appId;
    }

    public EstimateAudienceDto appId(String appId) {
        this.appId = appId;
        return this;
    }

    public EstimateAudienceDtoTarget getTarget() {
        return target;
    }

    public EstimateAudienceDto target(EstimateAudienceDtoTarget target) {
        this.target = target;
        return this;
    }

    public Boolean getIncludeUnsubscribed() {
        return includeUnsubscribed;
    }

    public EstimateAudienceDto includeUnsubscribed(Boolean includeUnsubscribed) {
        this.includeUnsubscribed = includeUnsubscribed;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
