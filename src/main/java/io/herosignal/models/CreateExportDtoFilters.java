// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** CreateExportDtoFilters şeması (api/openapi.yaml). */
public final class CreateExportDtoFilters {

    /** "from" alanı. */
    @JsonProperty("from")
    private String from;

    /** "to" alanı. */
    @JsonProperty("to")
    private String to;

    /** "name" alanı. */
    @JsonProperty("name")
    private String name;

    /** "message_id" alanı. */
    @JsonProperty("message_id")
    private String messageId;

    /** "campaign_id" alanı. */
    @JsonProperty("campaign_id")
    private String campaignId;

    /** "status" alanı. */
    @JsonProperty("status")
    private String status;

    /** "channel" alanı. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "segment_id" alanı. */
    @JsonProperty("segment_id")
    private String segmentId;

    /** @return "from" alanı */
    public String getFrom() {
        return from;
    }

    /**
     * "from" alanını ayarlar.
     *
     * @param from yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateExportDtoFilters setFrom(String from) {
        this.from = from;
        return this;
    }

    /** @return "to" alanı */
    public String getTo() {
        return to;
    }

    /**
     * "to" alanını ayarlar.
     *
     * @param to yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateExportDtoFilters setTo(String to) {
        this.to = to;
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
    public CreateExportDtoFilters setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "message_id" alanı */
    public String getMessageId() {
        return messageId;
    }

    /**
     * "message_id" alanını ayarlar.
     *
     * @param messageId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateExportDtoFilters setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /** @return "campaign_id" alanı */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * "campaign_id" alanını ayarlar.
     *
     * @param campaignId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateExportDtoFilters setCampaignId(String campaignId) {
        this.campaignId = campaignId;
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
    public CreateExportDtoFilters setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "channel" alanı */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" alanını ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateExportDtoFilters setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "segment_id" alanı */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * "segment_id" alanını ayarlar.
     *
     * @param segmentId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateExportDtoFilters setSegmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }
}
