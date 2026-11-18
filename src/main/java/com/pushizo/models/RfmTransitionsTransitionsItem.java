// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RfmTransitionsTransitionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RfmTransitionsTransitionsItem {
    /**
     * Zorunlu. Değerler: "champions", "loyal", "potential", "new", "promising", "need_attention", "about_to_sleep", "at_risk", "cant_lose", "hibernating", "lost".
     */
    @JsonProperty("from")
    private String from;

    /**
     * Zorunlu. Değerler: "champions", "loyal", "potential", "new", "promising", "need_attention", "about_to_sleep", "at_risk", "cant_lose", "hibernating", "lost".
     */
    @JsonProperty("to")
    private String to;

    /**
     * Zorunlu.
     */
    @JsonProperty("users")
    private Long users;

    public String getFrom() {
        return from;
    }

    public RfmTransitionsTransitionsItem from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public RfmTransitionsTransitionsItem to(String to) {
        this.to = to;
        return this;
    }

    public Long getUsers() {
        return users;
    }

    public RfmTransitionsTransitionsItem users(Long users) {
        this.users = users;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
