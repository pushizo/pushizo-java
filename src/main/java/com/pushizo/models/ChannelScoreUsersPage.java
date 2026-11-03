// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelScoreUsersPage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelScoreUsersPage {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<ChannelScoreUser> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_cursor")
    private String nextCursor;

    public java.util.List<ChannelScoreUser> getData() {
        return data;
    }

    public ChannelScoreUsersPage data(java.util.List<ChannelScoreUser> data) {
        this.data = data;
        return this;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public ChannelScoreUsersPage nextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
