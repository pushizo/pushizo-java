// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationVisitor şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationVisitor {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("email")
    private String email;

    public String getName() {
        return name;
    }

    public ConversationVisitor name(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ConversationVisitor email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
