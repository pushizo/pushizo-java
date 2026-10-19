// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTemplateDtoContentWhatsappInteractiveList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateTemplateDtoContentWhatsappInteractiveList {
    /**
     * Zorunlu.
     */
    @JsonProperty("button")
    private String button;

    /**
     * Zorunlu.
     */
    @JsonProperty("sections")
    private java.util.List<CreateTemplateDtoContentWhatsappInteractiveListSectionsItem> sections;

    public String getButton() {
        return button;
    }

    public CreateTemplateDtoContentWhatsappInteractiveList button(String button) {
        this.button = button;
        return this;
    }

    public java.util.List<CreateTemplateDtoContentWhatsappInteractiveListSectionsItem> getSections() {
        return sections;
    }

    public CreateTemplateDtoContentWhatsappInteractiveList sections(java.util.List<CreateTemplateDtoContentWhatsappInteractiveListSectionsItem> sections) {
        this.sections = sections;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
