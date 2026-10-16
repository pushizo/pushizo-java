// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScheduleCampaignDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ScheduleCampaignDto {
    @JsonProperty("send_at")
    private String sendAt;

    @JsonProperty("recurrence")
    private ScheduleCampaignDtoRecurrence recurrence;

    public String getSendAt() {
        return sendAt;
    }

    public ScheduleCampaignDto sendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    public ScheduleCampaignDtoRecurrence getRecurrence() {
        return recurrence;
    }

    public ScheduleCampaignDto recurrence(ScheduleCampaignDtoRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
