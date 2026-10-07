// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignsUpdateBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsUpdateBody {
    @JsonProperty("name")
    private String name;

    /**
     * Değerler: "one_time", "scheduled", "recurring".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("audience")
    private CampaignsUpdateBodyAudience audience;

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
    private CampaignsUpdateBodyDelivery delivery;

    @JsonProperty("recurrence")
    private CampaignsUpdateBodyRecurrence recurrence;

    @JsonProperty("send_at")
    private String sendAt;

    public String getName() {
        return name;
    }

    public CampaignsUpdateBody name(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public CampaignsUpdateBody type(String type) {
        this.type = type;
        return this;
    }

    public CampaignsUpdateBodyAudience getAudience() {
        return audience;
    }

    public CampaignsUpdateBody audience(CampaignsUpdateBodyAudience audience) {
        this.audience = audience;
        return this;
    }

    public java.util.Map<String, Object> getContent() {
        return content;
    }

    public CampaignsUpdateBody content(java.util.Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public CampaignsUpdateBody templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public Long getTemplateVersion() {
        return templateVersion;
    }

    public CampaignsUpdateBody templateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    public CampaignsUpdateBodyDelivery getDelivery() {
        return delivery;
    }

    public CampaignsUpdateBody delivery(CampaignsUpdateBodyDelivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public CampaignsUpdateBodyRecurrence getRecurrence() {
        return recurrence;
    }

    public CampaignsUpdateBody recurrence(CampaignsUpdateBodyRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    public String getSendAt() {
        return sendAt;
    }

    public CampaignsUpdateBody sendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
