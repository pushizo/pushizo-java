// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTemplateDtoContentWhatsappTemplateButtonParamsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateTemplateDtoContentWhatsappTemplateButtonParamsItem {
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

    public UpdateTemplateDtoContentWhatsappTemplateButtonParamsItem index(Long index) {
        this.index = index;
        return this;
    }

    public String getSubType() {
        return subType;
    }

    public UpdateTemplateDtoContentWhatsappTemplateButtonParamsItem subType(String subType) {
        this.subType = subType;
        return this;
    }

    public String getValue() {
        return value;
    }

    public UpdateTemplateDtoContentWhatsappTemplateButtonParamsItem value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
