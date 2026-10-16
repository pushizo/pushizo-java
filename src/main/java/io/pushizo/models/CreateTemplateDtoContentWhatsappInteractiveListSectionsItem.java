// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTemplateDtoContentWhatsappInteractiveListSectionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateTemplateDtoContentWhatsappInteractiveListSectionsItem {
    @JsonProperty("title")
    private String title;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<CreateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem> rows;

    public String getTitle() {
        return title;
    }

    public CreateTemplateDtoContentWhatsappInteractiveListSectionsItem title(String title) {
        this.title = title;
        return this;
    }

    public java.util.List<CreateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem> getRows() {
        return rows;
    }

    public CreateTemplateDtoContentWhatsappInteractiveListSectionsItem rows(java.util.List<CreateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
