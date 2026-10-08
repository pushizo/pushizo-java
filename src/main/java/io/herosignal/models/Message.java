// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** Message şeması (api/openapi.yaml). */
public final class Message {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "source" alanı. Zorunlu. Değerler: "campaign", "api", "journey", "test". */
    @JsonProperty("source")
    private String source;

    /** "status" alanı. Zorunlu. Değerler: "queued", "processing", "completed", "cancelled", "failed". */
    @JsonProperty("status")
    private String status;

    /** "idempotency_key" alanı. Zorunlu. */
    @JsonProperty("idempotency_key")
    private String idempotencyKey;

    /** "content" alanı. Zorunlu. */
    @JsonProperty("content")
    private Map<String, Object> content;

    /** "target" alanı. Zorunlu. */
    @JsonProperty("target")
    private Map<String, Object> target;

    /** "options" alanı. Zorunlu. */
    @JsonProperty("options")
    private Map<String, Object> options;

    /** "counts" alanı. Zorunlu. */
    @JsonProperty("counts")
    private MessageCounts counts;

    /** "requested_by" alanı. Zorunlu. */
    @JsonProperty("requested_by")
    private MessageRequestedBy requestedBy;

    /** "error" alanı. Zorunlu. */
    @JsonProperty("error")
    private String error;

    /** "scheduled_for" alanı. Zorunlu. */
    @JsonProperty("scheduled_for")
    private String scheduledFor;

    /** "started_at" alanı. Zorunlu. */
    @JsonProperty("started_at")
    private String startedAt;

    /** "completed_at" alanı. Zorunlu. */
    @JsonProperty("completed_at")
    private String completedAt;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "updated_at" alanı. Zorunlu. */
    @JsonProperty("updated_at")
    private String updatedAt;

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
    public Message setId(String id) {
        this.id = id;
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
    public Message setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "source" alanı */
    public String getSource() {
        return source;
    }

    /**
     * "source" alanını ayarlar.
     *
     * @param source yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setSource(String source) {
        this.source = source;
        return this;
    }

    /** @return "status" alanı */
    public String getStatus() {
        return status;
    }

    /**
     * "status" alanını ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "idempotency_key" alanı */
    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    /**
     * "idempotency_key" alanını ayarlar.
     *
     * @param idempotencyKey yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    /** @return "content" alanı */
    public Map<String, Object> getContent() {
        return content;
    }

    /**
     * "content" alanını ayarlar.
     *
     * @param content yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setContent(Map<String, Object> content) {
        this.content = content;
        return this;
    }

    /** @return "target" alanı */
    public Map<String, Object> getTarget() {
        return target;
    }

    /**
     * "target" alanını ayarlar.
     *
     * @param target yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setTarget(Map<String, Object> target) {
        this.target = target;
        return this;
    }

    /** @return "options" alanı */
    public Map<String, Object> getOptions() {
        return options;
    }

    /**
     * "options" alanını ayarlar.
     *
     * @param options yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setOptions(Map<String, Object> options) {
        this.options = options;
        return this;
    }

    /** @return "counts" alanı */
    public MessageCounts getCounts() {
        return counts;
    }

    /**
     * "counts" alanını ayarlar.
     *
     * @param counts yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setCounts(MessageCounts counts) {
        this.counts = counts;
        return this;
    }

    /** @return "requested_by" alanı */
    public MessageRequestedBy getRequestedBy() {
        return requestedBy;
    }

    /**
     * "requested_by" alanını ayarlar.
     *
     * @param requestedBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setRequestedBy(MessageRequestedBy requestedBy) {
        this.requestedBy = requestedBy;
        return this;
    }

    /** @return "error" alanı */
    public String getError() {
        return error;
    }

    /**
     * "error" alanını ayarlar.
     *
     * @param error yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setError(String error) {
        this.error = error;
        return this;
    }

    /** @return "scheduled_for" alanı */
    public String getScheduledFor() {
        return scheduledFor;
    }

    /**
     * "scheduled_for" alanını ayarlar.
     *
     * @param scheduledFor yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setScheduledFor(String scheduledFor) {
        this.scheduledFor = scheduledFor;
        return this;
    }

    /** @return "started_at" alanı */
    public String getStartedAt() {
        return startedAt;
    }

    /**
     * "started_at" alanını ayarlar.
     *
     * @param startedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /** @return "completed_at" alanı */
    public String getCompletedAt() {
        return completedAt;
    }

    /**
     * "completed_at" alanını ayarlar.
     *
     * @param completedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
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
    public Message setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** @return "updated_at" alanı */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * "updated_at" alanını ayarlar.
     *
     * @param updatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Message setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
