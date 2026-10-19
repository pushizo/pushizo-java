// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTemplateDtoContentWhatsappTemplate şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateTemplateDtoContentWhatsappTemplate {
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
    private java.util.List<CreateTemplateDtoContentWhatsappTemplateButtonParamsItem> buttonParams;

    public String getName() {
        return name;
    }

    public CreateTemplateDtoContentWhatsappTemplate name(String name) {
        this.name = name;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public CreateTemplateDtoContentWhatsappTemplate language(String language) {
        this.language = language;
        return this;
    }

    public Object getHeader() {
        return header;
    }

    public CreateTemplateDtoContentWhatsappTemplate header(Object header) {
        this.header = header;
        return this;
    }

    public java.util.List<String> getBodyParams() {
        return bodyParams;
    }

    public CreateTemplateDtoContentWhatsappTemplate bodyParams(java.util.List<String> bodyParams) {
        this.bodyParams = bodyParams;
        return this;
    }

    public java.util.List<CreateTemplateDtoContentWhatsappTemplateButtonParamsItem> getButtonParams() {
        return buttonParams;
    }

    public CreateTemplateDtoContentWhatsappTemplate buttonParams(java.util.List<CreateTemplateDtoContentWhatsappTemplateButtonParamsItem> buttonParams) {
        this.buttonParams = buttonParams;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
