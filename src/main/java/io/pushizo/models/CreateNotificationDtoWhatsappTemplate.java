// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNotificationDtoWhatsappTemplate şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateNotificationDtoWhatsappTemplate {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    @JsonProperty("header")
    private Object header;

    @JsonProperty("body_params")
    private java.util.List<String> bodyParams;

    @JsonProperty("button_params")
    private java.util.List<CreateNotificationDtoWhatsappTemplateButtonParamsItem> buttonParams;

    public String getName() {
        return name;
    }

    public CreateNotificationDtoWhatsappTemplate name(String name) {
        this.name = name;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public CreateNotificationDtoWhatsappTemplate language(String language) {
        this.language = language;
        return this;
    }

    public Object getHeader() {
        return header;
    }

    public CreateNotificationDtoWhatsappTemplate header(Object header) {
        this.header = header;
        return this;
    }

    public java.util.List<String> getBodyParams() {
        return bodyParams;
    }

    public CreateNotificationDtoWhatsappTemplate bodyParams(java.util.List<String> bodyParams) {
        this.bodyParams = bodyParams;
        return this;
    }

    public java.util.List<CreateNotificationDtoWhatsappTemplateButtonParamsItem> getButtonParams() {
        return buttonParams;
    }

    public CreateNotificationDtoWhatsappTemplate buttonParams(java.util.List<CreateNotificationDtoWhatsappTemplateButtonParamsItem> buttonParams) {
        this.buttonParams = buttonParams;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
