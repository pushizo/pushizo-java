// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateFormDtoSettingsSubscribe şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateFormDtoSettingsSubscribe {
    @JsonProperty("email")
    private Boolean email;

    @JsonProperty("sms")
    private Boolean sms;

    public Boolean getEmail() {
        return email;
    }

    public UpdateFormDtoSettingsSubscribe email(Boolean email) {
        this.email = email;
        return this;
    }

    public Boolean getSms() {
        return sms;
    }

    public UpdateFormDtoSettingsSubscribe sms(Boolean sms) {
        this.sms = sms;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
