// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsAppTemplateListDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WhatsAppTemplateListDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    /**
     * Zorunlu.
     */
    @JsonProperty("category")
    private String category;

    /**
     * Zorunlu.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("components")
    private java.util.List<java.util.Map<String, Object>> components;

    /**
     * Zorunlu.
     */
    @JsonProperty("body_params")
    private Long bodyParams;

    /**
     * Zorunlu.
     */
    @JsonProperty("rejected_reason")
    private String rejectedReason;

    /**
     * Zorunlu.
     */
    @JsonProperty("quality_score")
    private String qualityScore;

    /**
     * Zorunlu.
     */
    @JsonProperty("synced_at")
    private String syncedAt;

    public String getId() {
        return id;
    }

    public WhatsAppTemplateListDataItem id(String id) {
        this.id = id;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public WhatsAppTemplateListDataItem externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getName() {
        return name;
    }

    public WhatsAppTemplateListDataItem name(String name) {
        this.name = name;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public WhatsAppTemplateListDataItem language(String language) {
        this.language = language;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public WhatsAppTemplateListDataItem category(String category) {
        this.category = category;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WhatsAppTemplateListDataItem status(String status) {
        this.status = status;
        return this;
    }

    public java.util.List<java.util.Map<String, Object>> getComponents() {
        return components;
    }

    public WhatsAppTemplateListDataItem components(java.util.List<java.util.Map<String, Object>> components) {
        this.components = components;
        return this;
    }

    public Long getBodyParams() {
        return bodyParams;
    }

    public WhatsAppTemplateListDataItem bodyParams(Long bodyParams) {
        this.bodyParams = bodyParams;
        return this;
    }

    public String getRejectedReason() {
        return rejectedReason;
    }

    public WhatsAppTemplateListDataItem rejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
        return this;
    }

    public String getQualityScore() {
        return qualityScore;
    }

    public WhatsAppTemplateListDataItem qualityScore(String qualityScore) {
        this.qualityScore = qualityScore;
        return this;
    }

    public String getSyncedAt() {
        return syncedAt;
    }

    public WhatsAppTemplateListDataItem syncedAt(String syncedAt) {
        this.syncedAt = syncedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
