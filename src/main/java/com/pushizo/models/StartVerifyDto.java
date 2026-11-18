// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StartVerifyDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class StartVerifyDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("phone")
    private String phone;

    @JsonProperty("locale")
    private String locale;

    public String getPhone() {
        return phone;
    }

    public StartVerifyDto phone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public StartVerifyDto locale(String locale) {
        this.locale = locale;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
