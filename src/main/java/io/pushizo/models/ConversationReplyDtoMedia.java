// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationReplyDtoMedia şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationReplyDtoMedia {
    /**
     * Zorunlu. Değerler: "image", "video", "document", "audio".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    @JsonProperty("filename")
    private String filename;

    public String getType() {
        return type;
    }

    public ConversationReplyDtoMedia type(String type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ConversationReplyDtoMedia url(String url) {
        this.url = url;
        return this;
    }

    public String getFilename() {
        return filename;
    }

    public ConversationReplyDtoMedia filename(String filename) {
        this.filename = filename;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
