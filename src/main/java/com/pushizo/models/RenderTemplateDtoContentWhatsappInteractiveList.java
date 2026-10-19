// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderTemplateDtoContentWhatsappInteractiveList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderTemplateDtoContentWhatsappInteractiveList {
    /**
     * Zorunlu.
     */
    @JsonProperty("button")
    private String button;

    /**
     * Zorunlu.
     */
    @JsonProperty("sections")
    private java.util.List<RenderTemplateDtoContentWhatsappInteractiveListSectionsItem> sections;

    public String getButton() {
        return button;
    }

    public RenderTemplateDtoContentWhatsappInteractiveList button(String button) {
        this.button = button;
        return this;
    }

    public java.util.List<RenderTemplateDtoContentWhatsappInteractiveListSectionsItem> getSections() {
        return sections;
    }

    public RenderTemplateDtoContentWhatsappInteractiveList sections(java.util.List<RenderTemplateDtoContentWhatsappInteractiveListSectionsItem> sections) {
        this.sections = sections;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
