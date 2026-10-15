// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTemplateDtoContentWhatsappTemplate şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateTemplateDtoContentWhatsappTemplate {
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
    private java.util.List<UpdateTemplateDtoContentWhatsappTemplateButtonParamsItem> buttonParams;

    public String getName() {
        return name;
    }

    public UpdateTemplateDtoContentWhatsappTemplate name(String name) {
        this.name = name;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public UpdateTemplateDtoContentWhatsappTemplate language(String language) {
        this.language = language;
        return this;
    }

    public Object getHeader() {
        return header;
    }

    public UpdateTemplateDtoContentWhatsappTemplate header(Object header) {
        this.header = header;
        return this;
    }

    public java.util.List<String> getBodyParams() {
        return bodyParams;
    }

    public UpdateTemplateDtoContentWhatsappTemplate bodyParams(java.util.List<String> bodyParams) {
        this.bodyParams = bodyParams;
        return this;
    }

    public java.util.List<UpdateTemplateDtoContentWhatsappTemplateButtonParamsItem> getButtonParams() {
        return buttonParams;
    }

    public UpdateTemplateDtoContentWhatsappTemplate buttonParams(java.util.List<UpdateTemplateDtoContentWhatsappTemplateButtonParamsItem> buttonParams) {
        this.buttonParams = buttonParams;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
