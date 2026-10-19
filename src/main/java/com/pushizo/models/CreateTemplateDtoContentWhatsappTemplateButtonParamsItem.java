// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTemplateDtoContentWhatsappTemplateButtonParamsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateTemplateDtoContentWhatsappTemplateButtonParamsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("index")
    private Long index;

    /**
     * Zorunlu. Değerler: "url", "quick_reply", "copy_code".
     */
    @JsonProperty("sub_type")
    private String subType;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    public Long getIndex() {
        return index;
    }

    public CreateTemplateDtoContentWhatsappTemplateButtonParamsItem index(Long index) {
        this.index = index;
        return this;
    }

    public String getSubType() {
        return subType;
    }

    public CreateTemplateDtoContentWhatsappTemplateButtonParamsItem subType(String subType) {
        this.subType = subType;
        return this;
    }

    public String getValue() {
        return value;
    }

    public CreateTemplateDtoContentWhatsappTemplateButtonParamsItem value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
