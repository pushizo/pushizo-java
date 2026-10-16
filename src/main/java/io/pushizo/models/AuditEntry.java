// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditEntry şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AuditEntry {
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
     * Zorunlu. Değerler: "account", "api_key", "system".
     */
    @JsonProperty("actor_type")
    private String actorType;

    /**
     * Zorunlu.
     */
    @JsonProperty("actor_id")
    private String actorId;

    /**
     * Zorunlu.
     */
    @JsonProperty("action")
    private String action;

    /**
     * Zorunlu.
     */
    @JsonProperty("target_type")
    private String targetType;

    /**
     * Zorunlu.
     */
    @JsonProperty("target_id")
    private String targetId;

    /**
     * Zorunlu.
     */
    @JsonProperty("metadata")
    private java.util.Map<String, Object> metadata;

    /**
     * Zorunlu.
     */
    @JsonProperty("ip")
    private String ip;

    /**
     * Zorunlu.
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public AuditEntry id(String id) {
        this.id = id;
        return this;
    }

    public String getOrgId() {
        return orgId;
    }

    public AuditEntry orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public AuditEntry appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getActorType() {
        return actorType;
    }

    public AuditEntry actorType(String actorType) {
        this.actorType = actorType;
        return this;
    }

    public String getActorId() {
        return actorId;
    }

    public AuditEntry actorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public AuditEntry action(String action) {
        this.action = action;
        return this;
    }

    public String getTargetType() {
        return targetType;
    }

    public AuditEntry targetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    public String getTargetId() {
        return targetId;
    }

    public AuditEntry targetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    public java.util.Map<String, Object> getMetadata() {
        return metadata;
    }

    public AuditEntry metadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public AuditEntry ip(String ip) {
        this.ip = ip;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public AuditEntry requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AuditEntry createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
