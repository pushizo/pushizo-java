// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignsCreateBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsCreateBody {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "one_time", "scheduled", "recurring".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("audience")
    private CampaignsCreateBodyAudience audience;

    /**
     * messages.content ile aynı şema (headings, contents, url, buttons…)
     */
    @JsonProperty("content")
    private java.util.Map<String, Object> content;

    @JsonProperty("template_id")
    private String templateId;

    @JsonProperty("template_version")
    private Long templateVersion;

    @JsonProperty("delivery")
    private CampaignsCreateBodyDelivery delivery;

    @JsonProperty("recurrence")
    private CampaignsCreateBodyRecurrence recurrence;

    @JsonProperty("send_at")
    private String sendAt;

    public String getName() {
        return name;
    }

    public CampaignsCreateBody name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public CampaignsCreateBody type(String type) {
        this.type = type;
        return this;
    }

    public CampaignsCreateBodyAudience getAudience() {
        return audience;
    }

    public CampaignsCreateBody audience(CampaignsCreateBodyAudience audience) {
        this.audience = audience;
        return this;
    }

    public java.util.Map<String, Object> getContent() {
        return content;
    }

    public CampaignsCreateBody content(java.util.Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public CampaignsCreateBody templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public Long getTemplateVersion() {
        return templateVersion;
    }

    public CampaignsCreateBody templateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    public CampaignsCreateBodyDelivery getDelivery() {
        return delivery;
    }

    public CampaignsCreateBody delivery(CampaignsCreateBodyDelivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public CampaignsCreateBodyRecurrence getRecurrence() {
        return recurrence;
    }

    public CampaignsCreateBody recurrence(CampaignsCreateBodyRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public String getSendAt() {
        return sendAt;
    }

    public CampaignsCreateBody sendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
