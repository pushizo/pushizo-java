// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Message şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Message {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu. Değerler: "campaign", "api", "journey", "test".
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu. Değerler: "queued", "processing", "completed", "cancelled", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("idempotency_key")
    private String idempotencyKey;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("content")
    private java.util.Map<String, Object> content;

    /**
     * Zorunlu.
     */
    @JsonProperty("target")
    private java.util.Map<String, Object> target;

    /**
     * Zorunlu.
     */
    @JsonProperty("options")
    private java.util.Map<String, Object> options;

    /**
     * Zorunlu.
     */
    @JsonProperty("labels")
    private java.util.List<String> labels;

    /**
     * Zorunlu.
     */
    @JsonProperty("category")
    private String category;

    /**
     * Zorunlu.
     */
    @JsonProperty("template_id")
    private String templateId;

    /**
     * Zorunlu.
     */
    @JsonProperty("campaign_id")
    private String campaignId;

    /**
     * Zorunlu.
     */
    @JsonProperty("variants")
    private java.util.List<MessageVariantsItem> variants;

    /**
     * Zorunlu.
     */
    @JsonProperty("counts")
    private MessageCounts counts;

    /**
     * Zorunlu.
     */
    @JsonProperty("requested_by")
    private MessageRequestedBy requestedBy;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("scheduled_for")
    private String scheduledFor;

    /**
     * Zorunlu.
     */
    @JsonProperty("started_at")
    private String startedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("completed_at")
    private String completedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public Message id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Message appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getSource() {
        return source;
    }

    public Message source(String source) {
        this.source = source;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Message status(String status) {
        this.status = status;
        return this;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public Message idempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    public String getName() {
        return name;
    }

    public Message name(String name) {
        this.name = name;
        return this;
    }

    public java.util.Map<String, Object> getContent() {
        return content;
    }

    public Message content(java.util.Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public java.util.Map<String, Object> getTarget() {
        return target;
    }

    public Message target(java.util.Map<String, Object> target) {
        this.target = target;
        return this;
    }

    public java.util.Map<String, Object> getOptions() {
        return options;
    }

    public Message options(java.util.Map<String, Object> options) {
        this.options = options;
        return this;
    }

    public java.util.List<String> getLabels() {
        return labels;
    }

    public Message labels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Message category(String category) {
        this.category = category;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public Message templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public Message campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public java.util.List<MessageVariantsItem> getVariants() {
        return variants;
    }

    public Message variants(java.util.List<MessageVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public MessageCounts getCounts() {
        return counts;
    }

    public Message counts(MessageCounts counts) {
        this.counts = counts;
        return this;
    }

    public MessageRequestedBy getRequestedBy() {
        return requestedBy;
    }

    public Message requestedBy(MessageRequestedBy requestedBy) {
        this.requestedBy = requestedBy;
        return this;
    }

    public String getError() {
        return error;
    }

    public Message error(String error) {
        this.error = error;
        return this;
    }

    public String getScheduledFor() {
        return scheduledFor;
    }

    public Message scheduledFor(String scheduledFor) {
        this.scheduledFor = scheduledFor;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public Message startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public Message completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Message createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Message updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
