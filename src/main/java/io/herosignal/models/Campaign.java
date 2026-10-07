// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Campaign şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Campaign {
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
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu. Değerler: "one_time", "scheduled", "recurring", "automated", "transactional".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu. Değerler: "draft", "scheduled", "running", "paused", "completed", "cancelled", "failed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("audience")
    private java.util.Map<String, Object> audience;

    /**
     * Zorunlu.
     */
    @JsonProperty("content")
    private java.util.Map<String, Object> content;

    /**
     * Zorunlu.
     */
    @JsonProperty("template_id")
    private String templateId;

    /**
     * Zorunlu.
     */
    @JsonProperty("template_version")
    private Long templateVersion;

    /**
     * Zorunlu.
     */
    @JsonProperty("delivery")
    private CampaignDelivery delivery;

    /**
     * Zorunlu.
     */
    @JsonProperty("recurrence")
    private CampaignRecurrence recurrence;

    /**
     * Zorunlu.
     */
    @JsonProperty("approval")
    private CampaignApproval approval;

    /**
     * Zorunlu.
     */
    @JsonProperty("stats")
    private CampaignStats2 stats;

    /**
     * Zorunlu.
     */
    @JsonProperty("send_at")
    private String sendAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_run_at")
    private String nextRunAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_run_at")
    private String lastRunAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("run_count")
    private Long runCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_by")
    private String createdBy;

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

    /**
     * Zorunlu.
     */
    @JsonProperty("estimated_recipients")
    private Long estimatedRecipients;

    public String getId() {
        return id;
    }

    public Campaign id(String id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Campaign appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Campaign name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Campaign type(String type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Campaign status(String status) {
        this.status = status;
        return this;
    }

    public java.util.Map<String, Object> getAudience() {
        return audience;
    }

    public Campaign audience(java.util.Map<String, Object> audience) {
        this.audience = audience;
        return this;
    }

    public java.util.Map<String, Object> getContent() {
        return content;
    }

    public Campaign content(java.util.Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public Campaign templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public Long getTemplateVersion() {
        return templateVersion;
    }

    public Campaign templateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    public CampaignDelivery getDelivery() {
        return delivery;
    }

    public Campaign delivery(CampaignDelivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public CampaignRecurrence getRecurrence() {
        return recurrence;
    }

    public Campaign recurrence(CampaignRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public CampaignApproval getApproval() {
        return approval;
    }

    public Campaign approval(CampaignApproval approval) {
        this.approval = approval;
        return this;
    }

    public CampaignStats2 getStats() {
        return stats;
    }

    public Campaign stats(CampaignStats2 stats) {
        this.stats = stats;
        return this;
    }

    public String getSendAt() {
        return sendAt;
    }

    public Campaign sendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    public String getNextRunAt() {
        return nextRunAt;
    }

    public Campaign nextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }

    public String getLastRunAt() {
        return lastRunAt;
    }

    public Campaign lastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
        return this;
    }

    public Long getRunCount() {
        return runCount;
    }

    public Campaign runCount(Long runCount) {
        this.runCount = runCount;
        return this;
    }

    public String getError() {
        return error;
    }

    public Campaign error(String error) {
        this.error = error;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Campaign createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public Campaign startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public Campaign completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Campaign createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Campaign updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getEstimatedRecipients() {
        return estimatedRecipients;
    }

    public Campaign estimatedRecipients(Long estimatedRecipients) {
        this.estimatedRecipients = estimatedRecipients;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
