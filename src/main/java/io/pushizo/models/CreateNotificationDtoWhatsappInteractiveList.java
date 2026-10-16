// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNotificationDtoWhatsappInteractiveList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateNotificationDtoWhatsappInteractiveList {
    /**
     * Zorunlu.
     */
    @JsonProperty("button")
    private String button;

    /**
     * Zorunlu.
     */
    @JsonProperty("sections")
    private java.util.List<CreateNotificationDtoWhatsappInteractiveListSectionsItem> sections;

    public String getButton() {
        return button;
    }

    public CreateNotificationDtoWhatsappInteractiveList button(String button) {
        this.button = button;
        return this;
    }

    public java.util.List<CreateNotificationDtoWhatsappInteractiveListSectionsItem> getSections() {
        return sections;
    }

    public CreateNotificationDtoWhatsappInteractiveList sections(java.util.List<CreateNotificationDtoWhatsappInteractiveListSectionsItem> sections) {
        this.sections = sections;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
