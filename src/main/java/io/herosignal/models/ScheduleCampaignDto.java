// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** ScheduleCampaignDto şeması (api/openapi.yaml). */
public final class ScheduleCampaignDto {

    /** "send_at" alanı. */
    @JsonProperty("send_at")
    private String sendAt;

    /** "recurrence" alanı. */
    @JsonProperty("recurrence")
    private ScheduleCampaignDtoRecurrence recurrence;

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
    public ScheduleCampaignDto setSendAt(String sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /** @return "recurrence" alanı */
    public ScheduleCampaignDtoRecurrence getRecurrence() {
        return recurrence;
    }

    /**
     * "recurrence" alanını ayarlar.
     *
     * @param recurrence yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ScheduleCampaignDto setRecurrence(ScheduleCampaignDtoRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }
}
