// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateFormDtoSettingsDoubleOptIn şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateFormDtoSettingsDoubleOptIn {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("subject")
    private java.util.Map<String, String> subject;

    @JsonProperty("body")
    private java.util.Map<String, String> body;

    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateFormDtoSettingsDoubleOptIn enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public java.util.Map<String, String> getSubject() {
        return subject;
    }

    public UpdateFormDtoSettingsDoubleOptIn subject(java.util.Map<String, String> subject) {
        this.subject = subject;
        return this;
    }

    public java.util.Map<String, String> getBody() {
        return body;
    }

    public UpdateFormDtoSettingsDoubleOptIn body(java.util.Map<String, String> body) {
        this.body = body;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
