// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * McpCreateCampaignDraftBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class McpCreateCampaignDraftBody {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "one_time", "scheduled", "recurring".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("audience")
    private McpCreateCampaignDraftBodyAudience audience;

    /**
     * messages.content ile aynı şema (headings, contents, url, buttons…)
     */
    @JsonProperty("content")
    private java.util.Map<String, Object> content;

    @JsonProperty("labels")
    private java.util.List<String> labels;

    /**
     * Tercih kategorisi anahtarı; kapalı kullanıcılar bastırılır
     */
    @JsonProperty("category")
    private String category;

    @JsonProperty("ab_test")
    private McpCreateCampaignDraftBodyAbTest abTest;

    /**
     * A/B varyantları (ağırlıklar toplamı 100; en fazla bir is_control)
     */
    @JsonProperty("variants")
    private java.util.List<McpCreateCampaignDraftBodyVariantsItem> variants;

    @JsonProperty("template_id")
    private String templateId;

    @JsonProperty("template_version")
    private Long templateVersion;

    @JsonProperty("delivery")
    private McpCreateCampaignDraftBodyDelivery delivery;

    @JsonProperty("recurrence")
    private McpCreateCampaignDraftBodyRecurrence recurrence;

    @JsonProperty("send_at")
    private String sendAt;

    public String getName() {
        return name;
    }

    public McpCreateCampaignDraftBody name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public McpCreateCampaignDraftBody type(String type) {
        this.type = type;
        return this;
    }

    public McpCreateCampaignDraftBodyAudience getAudience() {
        return audience;
    }

    public McpCreateCampaignDraftBody audience(McpCreateCampaignDraftBodyAudience audience) {
        this.audience = audience;
        return this;
    }

    public java.util.Map<String, Object> getContent() {
        return content;
    }

    public McpCreateCampaignDraftBody content(java.util.Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public java.util.List<String> getLabels() {
        return labels;
    }

    public McpCreateCampaignDraftBody labels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public McpCreateCampaignDraftBody category(String category) {
        this.category = category;
        return this;
    }

    public McpCreateCampaignDraftBodyAbTest getAbTest() {
        return abTest;
    }

    public McpCreateCampaignDraftBody abTest(McpCreateCampaignDraftBodyAbTest abTest) {
        this.abTest = abTest;
        return this;
    }

    public java.util.List<McpCreateCampaignDraftBodyVariantsItem> getVariants() {
        return variants;
    }

    public McpCreateCampaignDraftBody variants(java.util.List<McpCreateCampaignDraftBodyVariantsItem> variants) {
        this.variants = variants;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public McpCreateCampaignDraftBody templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public Long getTemplateVersion() {
        return templateVersion;
    }

    public McpCreateCampaignDraftBody templateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    public McpCreateCampaignDraftBodyDelivery getDelivery() {
        return delivery;
    }

    public McpCreateCampaignDraftBody delivery(McpCreateCampaignDraftBodyDelivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public McpCreateCampaignDraftBodyRecurrence getRecurrence() {
        return recurrence;
    }

    public McpCreateCampaignDraftBody recurrence(McpCreateCampaignDraftBodyRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public String getSendAt() {
        return sendAt;
    }

    public McpCreateCampaignDraftBody sendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
