// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationReplyDtoInteractiveListSectionsItemRowsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationReplyDtoInteractiveListSectionsItemRowsItem {
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

    public ConversationReplyDtoInteractiveListSectionsItemRowsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ConversationReplyDtoInteractiveListSectionsItemRowsItem title(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ConversationReplyDtoInteractiveListSectionsItemRowsItem description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
