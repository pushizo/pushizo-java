// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTemplateDtoContentWhatsappInteractiveList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateTemplateDtoContentWhatsappInteractiveList {
    /**
     * Zorunlu.
     */
    @JsonProperty("button")
    private String button;

    /**
     * Zorunlu.
     */
    @JsonProperty("sections")
    private java.util.List<UpdateTemplateDtoContentWhatsappInteractiveListSectionsItem> sections;

    public String getButton() {
        return button;
    }

    public UpdateTemplateDtoContentWhatsappInteractiveList button(String button) {
        this.button = button;
        return this;
    }

    public java.util.List<UpdateTemplateDtoContentWhatsappInteractiveListSectionsItem> getSections() {
        return sections;
    }

    public UpdateTemplateDtoContentWhatsappInteractiveList sections(java.util.List<UpdateTemplateDtoContentWhatsappInteractiveListSectionsItem> sections) {
        this.sections = sections;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
