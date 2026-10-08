// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** Campaign şeması (api/openapi.yaml). */
public final class Campaign {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "type" alanı. Zorunlu. Değerler: "one_time", "scheduled", "recurring", "automated", "transactional". */
    @JsonProperty("type")
    private String type;

    /** "status" alanı. Zorunlu. Değerler: "draft", "scheduled", "running", "paused", "completed", "cancelled", "failed". */
    @JsonProperty("status")
    private String status;

    /** "audience" alanı. Zorunlu. */
    @JsonProperty("audience")
    private Map<String, Object> audience;

    /** "content" alanı. Zorunlu. */
    @JsonProperty("content")
    private Map<String, Object> content;

    /** "template_id" alanı. Zorunlu. */
    @JsonProperty("template_id")
    private String templateId;

    /** "template_version" alanı. Zorunlu. */
    @JsonProperty("template_version")
    private Long templateVersion;

    /** "delivery" alanı. Zorunlu. */
    @JsonProperty("delivery")
    private CampaignDelivery delivery;

    /** "recurrence" alanı. Zorunlu. */
    @JsonProperty("recurrence")
    private CampaignRecurrence recurrence;

    /** "approval" alanı. Zorunlu. */
    @JsonProperty("approval")
    private CampaignApproval approval;

    /** "stats" alanı. Zorunlu. */
    @JsonProperty("stats")
    private CampaignStats2 stats;

    /** "send_at" alanı. Zorunlu. */
    @JsonProperty("send_at")
    private String sendAt;

    /** "next_run_at" alanı. Zorunlu. */
    @JsonProperty("next_run_at")
    private String nextRunAt;

    /** "last_run_at" alanı. Zorunlu. */
    @JsonProperty("last_run_at")
    private String lastRunAt;

    /** "run_count" alanı. Zorunlu. */
    @JsonProperty("run_count")
    private Long runCount;

    /** "error" alanı. Zorunlu. */
    @JsonProperty("error")
    private String error;

    /** "created_by" alanı. Zorunlu. */
    @JsonProperty("created_by")
    private String createdBy;

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

    /** "estimated_recipients" alanı. Zorunlu. */
    @JsonProperty("estimated_recipients")
    private Long estimatedRecipients;

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
    public Campaign setId(String id) {
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
    public Campaign setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "type" alanı */
    public String getType() {
        return type;
    }

    /**
     * "type" alanını ayarlar.
     *
     * @param type yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setType(String type) {
        this.type = type;
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
    public Campaign setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "audience" alanı */
    public Map<String, Object> getAudience() {
        return audience;
    }

    /**
     * "audience" alanını ayarlar.
     *
     * @param audience yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setAudience(Map<String, Object> audience) {
        this.audience = audience;
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
    public Campaign setContent(Map<String, Object> content) {
        this.content = content;
        return this;
    }

    /** @return "template_id" alanı */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * "template_id" alanını ayarlar.
     *
     * @param templateId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /** @return "template_version" alanı */
    public Long getTemplateVersion() {
        return templateVersion;
    }

    /**
     * "template_version" alanını ayarlar.
     *
     * @param templateVersion yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    /** @return "delivery" alanı */
    public CampaignDelivery getDelivery() {
        return delivery;
    }

    /**
     * "delivery" alanını ayarlar.
     *
     * @param delivery yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setDelivery(CampaignDelivery delivery) {
        this.delivery = delivery;
        return this;
    }

    /** @return "recurrence" alanı */
    public CampaignRecurrence getRecurrence() {
        return recurrence;
    }

    /**
     * "recurrence" alanını ayarlar.
     *
     * @param recurrence yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setRecurrence(CampaignRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /** @return "approval" alanı */
    public CampaignApproval getApproval() {
        return approval;
    }

    /**
     * "approval" alanını ayarlar.
     *
     * @param approval yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setApproval(CampaignApproval approval) {
        this.approval = approval;
        return this;
    }

    /** @return "stats" alanı */
    public CampaignStats2 getStats() {
        return stats;
    }

    /**
     * "stats" alanını ayarlar.
     *
     * @param stats yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setStats(CampaignStats2 stats) {
        this.stats = stats;
        return this;
    }

    /** @return "send_at" alanı */
    public String getSendAt() {
        return sendAt;
    }

    /**
     * "send_at" alanını ayarlar.
     *
     * @param sendAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setSendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /** @return "next_run_at" alanı */
    public String getNextRunAt() {
        return nextRunAt;
    }

    /**
     * "next_run_at" alanını ayarlar.
     *
     * @param nextRunAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setNextRunAt(String nextRunAt) {
        this.nextRunAt = nextRunAt;
        return this;
    }

    /** @return "last_run_at" alanı */
    public String getLastRunAt() {
        return lastRunAt;
    }

    /**
     * "last_run_at" alanını ayarlar.
     *
     * @param lastRunAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setLastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
        return this;
    }

    /** @return "run_count" alanı */
    public Long getRunCount() {
        return runCount;
    }

    /**
     * "run_count" alanını ayarlar.
     *
     * @param runCount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setRunCount(Long runCount) {
        this.runCount = runCount;
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
    public Campaign setError(String error) {
        this.error = error;
        return this;
    }

    /** @return "created_by" alanı */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * "created_by" alanını ayarlar.
     *
     * @param createdBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
    public Campaign setStartedAt(String startedAt) {
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
    public Campaign setCompletedAt(String completedAt) {
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
    public Campaign setCreatedAt(String createdAt) {
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
    public Campaign setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** @return "estimated_recipients" alanı */
    public Long getEstimatedRecipients() {
        return estimatedRecipients;
    }

    /**
     * "estimated_recipients" alanını ayarlar.
     *
     * @param estimatedRecipients yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Campaign setEstimatedRecipients(Long estimatedRecipients) {
        this.estimatedRecipients = estimatedRecipients;
        return this;
    }
}
