// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AffinityOverviewAttributesItemValuesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AffinityOverviewAttributesItemValuesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    /**
     * Zorunlu.
     */
    @JsonProperty("top_users")
    private Long topUsers;

    public String getValue() {
        return value;
    }

    public AffinityOverviewAttributesItemValuesItem value(String value) {
        this.value = value;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public AffinityOverviewAttributesItemValuesItem users(Long users) {
        this.users = users;
        return this;
    }

    public Long getTopUsers() {
        return topUsers;
    }

    public AffinityOverviewAttributesItemValuesItem topUsers(Long topUsers) {
        this.topUsers = topUsers;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
