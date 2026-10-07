// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TriggerRunDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TriggerRunDto {
    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("alias")
    private TriggerRunDtoAlias alias;

    @JsonProperty("context")
    private java.util.Map<String, Object> context;

    public String getExternalId() {
        return externalId;
    }

    public TriggerRunDto externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public TriggerRunDto userId(String userId) {
        this.userId = userId;
        return this;
    }

    public TriggerRunDtoAlias getAlias() {
        return alias;
    }

    public TriggerRunDto alias(TriggerRunDtoAlias alias) {
        this.alias = alias;
        return this;
    }

    public java.util.Map<String, Object> getContext() {
        return context;
    }

    public TriggerRunDto context(java.util.Map<String, Object> context) {
        this.context = context;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
