// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignsCreateBodyRecurrence şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignsCreateBodyRecurrence {
    @JsonProperty("cron")
    private String cron;

    @JsonProperty("until")
    private String until;

    @JsonProperty("timezone")
    private String timezone;

    public String getCron() {
        return cron;
    }

    public CampaignsCreateBodyRecurrence cron(String cron) {
        this.cron = cron;
        return this;
    }

    public String getUntil() {
        return until;
    }

    public CampaignsCreateBodyRecurrence until(String until) {
        this.until = until;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public CampaignsCreateBodyRecurrence timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
