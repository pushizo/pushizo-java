// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequestLog şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RequestLog {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("org_id")
    private String orgId;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("api_key_id")
    private String apiKeyId;

    /**
     * Zorunlu.
     */
    @JsonProperty("method")
    private String method;

    /**
     * Zorunlu.
     */
    @JsonProperty("path")
    private String path;

    /**
     * Zorunlu.
     */
    @JsonProperty("route")
    private String route;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private Long status;

    /**
     * Zorunlu.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    /**
     * Zorunlu.
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * Zorunlu.
     */
    @JsonProperty("ip")
    private String ip;

    /**
     * Zorunlu.
     */
    @JsonProperty("error_code")
    private String errorCode;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public RequestLog id(String id) {
        this.id = id;
        return this;
    }

    public String getOrgId() {
        return orgId;
    }

    public RequestLog orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public RequestLog appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getApiKeyId() {
        return apiKeyId;
    }

    public RequestLog apiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public RequestLog method(String method) {
        this.method = method;
        return this;
    }

    public String getPath() {
        return path;
    }

    public RequestLog path(String path) {
        this.path = path;
        return this;
    }

    public String getRoute() {
        return route;
    }

    public RequestLog route(String route) {
        this.route = route;
        return this;
    }

    public Long getStatus() {
        return status;
    }

    public RequestLog status(Long status) {
        this.status = status;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public RequestLog durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public RequestLog requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public RequestLog ip(String ip) {
        this.ip = ip;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public RequestLog errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public RequestLog createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
