// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BatchMembersDtoMembersItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class BatchMembersDtoMembersItem {
    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("role")
    private String role;

    public String getUserId() {
        return userId;
    }

    public BatchMembersDtoMembersItem userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public BatchMembersDtoMembersItem externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getRole() {
        return role;
    }

    public BatchMembersDtoMembersItem role(String role) {
        this.role = role;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
