// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ZapierMe şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ZapierMe {
    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_name")
    private String appName;

    /**
     * Zorunlu.
     */
    @JsonProperty("org_id")
    private String orgId;

    /**
     * Zorunlu.
     */
    @JsonProperty("scopes")
    private java.util.List<String> scopes;

    public String getAppId() {
        return appId;
    }

    public ZapierMe appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getAppName() {
        return appName;
    }

    public ZapierMe appName(String appName) {
        this.appName = appName;
        return this;
    }

    public String getOrgId() {
        return orgId;
    }

    public ZapierMe orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    public java.util.List<String> getScopes() {
        return scopes;
    }

    public ZapierMe scopes(java.util.List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
