// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateCustomAgentDtoSchedule şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateCustomAgentDtoSchedule {
    /**
     * Zorunlu.
     */
    @JsonProperty("cron")
    private String cron;

    @JsonProperty("timezone")
    private String timezone;

    public String getCron() {
        return cron;
    }

    public CreateCustomAgentDtoSchedule cron(String cron) {
        this.cron = cron;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public CreateCustomAgentDtoSchedule timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
