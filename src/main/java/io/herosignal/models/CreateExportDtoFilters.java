// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateExportDtoFilters şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateExportDtoFilters {
    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    @JsonProperty("name")
    private String name;

    @JsonProperty("message_id")
    private String messageId;

    @JsonProperty("campaign_id")
    private String campaignId;

    @JsonProperty("status")
    private String status;

    /**
     * Değerler: "ios_push", "android_push", "web_push", "email", "sms".
     */
    @JsonProperty("channel")
    private String channel;

    @JsonProperty("segment_id")
    private String segmentId;

    public String getFrom() {
        return from;
    }

    public CreateExportDtoFilters from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public CreateExportDtoFilters to(String to) {
        this.to = to;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateExportDtoFilters name(String name) {
        this.name = name;
        return this;
    }

    public String getMessageId() {
        return messageId;
    }

    public CreateExportDtoFilters messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public CreateExportDtoFilters campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CreateExportDtoFilters status(String status) {
        this.status = status;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public CreateExportDtoFilters channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public CreateExportDtoFilters segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
