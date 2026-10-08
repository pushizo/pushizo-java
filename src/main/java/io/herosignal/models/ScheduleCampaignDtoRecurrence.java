// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** ScheduleCampaignDtoRecurrence şeması (api/openapi.yaml). */
public final class ScheduleCampaignDtoRecurrence {

    /** "cron" alanı. Zorunlu. */
    @JsonProperty("cron")
    private String cron;

    /** "until" alanı. */
    @JsonProperty("until")
    private String until;

    /** "timezone" alanı. */
    @JsonProperty("timezone")
    private String timezone;

    /** @return "cron" alanı */
    public String getCron() {
        return cron;
    }

    /**
     * "cron" alanını ayarlar.
     *
     * @param cron yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ScheduleCampaignDtoRecurrence setCron(String cron) {
        this.cron = cron;
        return this;
    }

    /** @return "until" alanı */
    public String getUntil() {
        return until;
    }

    /**
     * "until" alanını ayarlar.
     *
     * @param until yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ScheduleCampaignDtoRecurrence setUntil(String until) {
        this.until = until;
        return this;
    }

    /** @return "timezone" alanı */
    public String getTimezone() {
        return timezone;
    }

    /**
     * "timezone" alanını ayarlar.
     *
     * @param timezone yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ScheduleCampaignDtoRecurrence setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
}
