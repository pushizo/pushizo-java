// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTemplateDtoContentWhatsappInteractiveListSectionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateTemplateDtoContentWhatsappInteractiveListSectionsItem {
    @JsonProperty("title")
    private String title;

    /**
     * Zorunlu.
     */
    @JsonProperty("rows")
    private java.util.List<UpdateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem> rows;

    public String getTitle() {
        return title;
    }

    public UpdateTemplateDtoContentWhatsappInteractiveListSectionsItem title(String title) {
        this.title = title;
        return this;
    }

    public java.util.List<UpdateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem> getRows() {
        return rows;
    }

    public UpdateTemplateDtoContentWhatsappInteractiveListSectionsItem rows(java.util.List<UpdateTemplateDtoContentWhatsappInteractiveListSectionsItemRowsItem> rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
