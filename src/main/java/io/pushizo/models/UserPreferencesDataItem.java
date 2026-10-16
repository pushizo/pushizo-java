// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserPreferencesDataItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserPreferencesDataItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("category")
    private String category;

    /**
     * Zorunlu.
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("opted_in")
    private Boolean optedIn;

    /**
     * Zorunlu.
     */
    @JsonProperty("explicit")
    private Boolean explicit;

    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getCategory() {
        return category;
    }

    public UserPreferencesDataItem category(String category) {
        this.category = category;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public UserPreferencesDataItem channel(String channel) {
        this.channel = channel;
        return this;
    }

    public Boolean getOptedIn() {
        return optedIn;
    }

    public UserPreferencesDataItem optedIn(Boolean optedIn) {
        this.optedIn = optedIn;
        return this;
    }

    public Boolean getExplicit() {
        return explicit;
    }

    public UserPreferencesDataItem explicit(Boolean explicit) {
        this.explicit = explicit;
        return this;
    }

    public String getSource() {
        return source;
    }

    public UserPreferencesDataItem source(String source) {
        this.source = source;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UserPreferencesDataItem updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
