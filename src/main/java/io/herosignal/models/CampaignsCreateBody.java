// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** CampaignsCreateBody şeması (api/openapi.yaml). */
public final class CampaignsCreateBody {

    /** "name" alanı. */
    @JsonProperty("name")
    private String name;

    /** "type" alanı. Değerler: "one_time", "scheduled", "recurring". */
    @JsonProperty("type")
    private String type;

    /** "audience" alanı. */
    @JsonProperty("audience")
    private CampaignsCreateBodyAudience audience;

    /** "content" alanı. messages.content ile aynı şema (headings, contents, url, buttons…) */
    @JsonProperty("content")
    private Map<String, Object> content;

    /** "template_id" alanı. */
    @JsonProperty("template_id")
    private String templateId;

    /** "template_version" alanı. */
    @JsonProperty("template_version")
    private Long templateVersion;

    /** "delivery" alanı. */
    @JsonProperty("delivery")
    private CampaignsCreateBodyDelivery delivery;

    /** "recurrence" alanı. */
    @JsonProperty("recurrence")
    private CampaignsCreateBodyRecurrence recurrence;

    /** "send_at" alanı. */
    @JsonProperty("send_at")
    private String sendAt;

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
    public CampaignsCreateBody setName(String name) {
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
    public CampaignsCreateBody setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "audience" alanı */
    public CampaignsCreateBodyAudience getAudience() {
        return audience;
    }

    /**
     * "audience" alanını ayarlar.
     *
     * @param audience yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBody setAudience(CampaignsCreateBodyAudience audience) {
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
    public CampaignsCreateBody setContent(Map<String, Object> content) {
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
    public CampaignsCreateBody setTemplateId(String templateId) {
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
    public CampaignsCreateBody setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    /** @return "delivery" alanı */
    public CampaignsCreateBodyDelivery getDelivery() {
        return delivery;
    }

    /**
     * "delivery" alanını ayarlar.
     *
     * @param delivery yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBody setDelivery(CampaignsCreateBodyDelivery delivery) {
        this.delivery = delivery;
        return this;
    }

    /** @return "recurrence" alanı */
    public CampaignsCreateBodyRecurrence getRecurrence() {
        return recurrence;
    }

    /**
     * "recurrence" alanını ayarlar.
     *
     * @param recurrence yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsCreateBody setRecurrence(CampaignsCreateBodyRecurrence recurrence) {
        this.recurrence = recurrence;
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
    public CampaignsCreateBody setSendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }
}
