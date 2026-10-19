// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationWindow şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationWindow {
    /**
     * Zorunlu.
     */
    @JsonProperty("open")
    private Boolean open;

    /**
     * Zorunlu.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    public Boolean getOpen() {
        return open;
    }

    public ConversationWindow open(Boolean open) {
        this.open = open;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public ConversationWindow expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
