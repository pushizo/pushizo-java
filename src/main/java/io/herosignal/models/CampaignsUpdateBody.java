// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** CampaignsUpdateBody şeması (api/openapi.yaml). */
public final class CampaignsUpdateBody {

    /** "name" alanı. */
    @JsonProperty("name")
    private String name;

    /** "type" alanı. Değerler: "one_time", "scheduled", "recurring". */
    @JsonProperty("type")
    private String type;

    /** "audience" alanı. */
    @JsonProperty("audience")
    private CampaignsUpdateBodyAudience audience;

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
    private CampaignsUpdateBodyDelivery delivery;

    /** "recurrence" alanı. */
    @JsonProperty("recurrence")
    private CampaignsUpdateBodyRecurrence recurrence;

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
    public CampaignsUpdateBody setName(String name) {
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
    public CampaignsUpdateBody setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "audience" alanı */
    public CampaignsUpdateBodyAudience getAudience() {
        return audience;
    }

    /**
     * "audience" alanını ayarlar.
     *
     * @param audience yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsUpdateBody setAudience(CampaignsUpdateBodyAudience audience) {
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
    public CampaignsUpdateBody setContent(Map<String, Object> content) {
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
    public CampaignsUpdateBody setTemplateId(String templateId) {
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
    public CampaignsUpdateBody setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    /** @return "delivery" alanı */
    public CampaignsUpdateBodyDelivery getDelivery() {
        return delivery;
    }

    /**
     * "delivery" alanını ayarlar.
     *
     * @param delivery yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsUpdateBody setDelivery(CampaignsUpdateBodyDelivery delivery) {
        this.delivery = delivery;
        return this;
    }

    /** @return "recurrence" alanı */
    public CampaignsUpdateBodyRecurrence getRecurrence() {
        return recurrence;
    }

    /**
     * "recurrence" alanını ayarlar.
     *
     * @param recurrence yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignsUpdateBody setRecurrence(CampaignsUpdateBodyRecurrence recurrence) {
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
    public CampaignsUpdateBody setSendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }
}
