// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MessageRequestedBy şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class MessageRequestedBy {
    /**
     * Zorunlu. Değerler: "api_key", "account", "system".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("id")
    private String id;

    public String getType() {
        return type;
    }

    public MessageRequestedBy type(String type) {
        this.type = type;
        return this;
    }

    public String getId() {
        return id;
    }

    public MessageRequestedBy id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
