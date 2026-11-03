// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EvaluateAppFlagsDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EvaluateAppFlagsDto {
    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("subject")
    private String subject;

    public String getExternalId() {
        return externalId;
    }

    public EvaluateAppFlagsDto externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public EvaluateAppFlagsDto userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public EvaluateAppFlagsDto subject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
