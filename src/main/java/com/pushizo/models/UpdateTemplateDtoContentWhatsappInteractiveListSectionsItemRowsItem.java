// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    public String getId() {
        return id;
    }

    public UpdateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public UpdateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem title(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UpdateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
