// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** AuditEntry şeması (api/openapi.yaml). */
public final class AuditEntry {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "org_id" alanı. Zorunlu. */
    @JsonProperty("org_id")
    private String orgId;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "actor_type" alanı. Zorunlu. Değerler: "account", "api_key", "system". */
    @JsonProperty("actor_type")
    private String actorType;

    /** "actor_id" alanı. Zorunlu. */
    @JsonProperty("actor_id")
    private String actorId;

    /** "action" alanı. Zorunlu. */
    @JsonProperty("action")
    private String action;

    /** "target_type" alanı. Zorunlu. */
    @JsonProperty("target_type")
    private String targetType;

    /** "target_id" alanı. Zorunlu. */
    @JsonProperty("target_id")
    private String targetId;

    /** "metadata" alanı. Zorunlu. */
    @JsonProperty("metadata")
    private Map<String, Object> metadata;

    /** "ip" alanı. Zorunlu. */
    @JsonProperty("ip")
    private String ip;

    /** "request_id" alanı. Zorunlu. */
    @JsonProperty("request_id")
    private String requestId;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "org_id" alanı */
    public String getOrgId() {
        return orgId;
    }

    /**
     * "org_id" alanını ayarlar.
     *
     * @param orgId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    /** @return "app_id" alanı */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" alanını ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "actor_type" alanı */
    public String getActorType() {
        return actorType;
    }

    /**
     * "actor_type" alanını ayarlar.
     *
     * @param actorType yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setActorType(String actorType) {
        this.actorType = actorType;
        return this;
    }

    /** @return "actor_id" alanı */
    public String getActorId() {
        return actorId;
    }

    /**
     * "actor_id" alanını ayarlar.
     *
     * @param actorId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    /** @return "action" alanı */
    public String getAction() {
        return action;
    }

    /**
     * "action" alanını ayarlar.
     *
     * @param action yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setAction(String action) {
        this.action = action;
        return this;
    }

    /** @return "target_type" alanı */
    public String getTargetType() {
        return targetType;
    }

    /**
     * "target_type" alanını ayarlar.
     *
     * @param targetType yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /** @return "target_id" alanı */
    public String getTargetId() {
        return targetId;
    }

    /**
     * "target_id" alanını ayarlar.
     *
     * @param targetId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /** @return "metadata" alanı */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    /**
     * "metadata" alanını ayarlar.
     *
     * @param metadata yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    /** @return "ip" alanı */
    public String getIp() {
        return ip;
    }

    /**
     * "ip" alanını ayarlar.
     *
     * @param ip yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setIp(String ip) {
        this.ip = ip;
        return this;
    }

    /** @return "request_id" alanı */
    public String getRequestId() {
        return requestId;
    }

    /**
     * "request_id" alanını ayarlar.
     *
     * @param requestId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** @return "created_at" alanı */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * "created_at" alanını ayarlar.
     *
     * @param createdAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AuditEntry setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
