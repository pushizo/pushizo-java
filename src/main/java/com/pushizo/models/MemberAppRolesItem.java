// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MemberAppRolesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MemberAppRolesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu. Değerler: "owner", "admin", "developer", "marketer", "analyst", "billing", "viewer", "composer", "agent".
     */
    @JsonProperty("role")
    private String role;

    public String getAppId() {
        return appId;
    }

    public MemberAppRolesItem appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getRole() {
        return role;
    }

    public MemberAppRolesItem role(String role) {
        this.role = role;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
