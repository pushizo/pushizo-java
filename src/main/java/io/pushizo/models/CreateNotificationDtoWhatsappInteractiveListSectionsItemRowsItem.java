// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNotificationDtoWhatsappInteractiveListSectionsItemRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateNotificationDtoWhatsappInteractiveListSectionsItemRowsItem {
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

    public CreateNotificationDtoWhatsappInteractiveListSectionsItemRowsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CreateNotificationDtoWhatsappInteractiveListSectionsItemRowsItem title(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateNotificationDtoWhatsappInteractiveListSectionsItemRowsItem description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
