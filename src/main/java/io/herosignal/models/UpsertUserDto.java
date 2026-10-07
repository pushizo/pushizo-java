// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpsertUserDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpsertUserDto {
    @JsonProperty("identity")
    private Object identity;

    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("properties")
    private java.util.Map<String, Object> properties;

    @JsonProperty("tags")
    private java.util.Map<String, String> tags;

    @JsonProperty("subscriptions")
    private java.util.List<AddSubscriptionDto> subscriptions;

    public Object getIdentity() {
        return identity;
    }

    public UpsertUserDto identity(Object identity) {
        this.identity = identity;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public UpsertUserDto externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    public UpsertUserDto properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    public UpsertUserDto tags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public java.util.List<AddSubscriptionDto> getSubscriptions() {
        return subscriptions;
    }

    public UpsertUserDto subscriptions(java.util.List<AddSubscriptionDto> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
