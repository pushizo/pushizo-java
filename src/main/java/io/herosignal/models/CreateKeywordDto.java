// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateKeywordDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateKeywordDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("keyword")
    private String keyword;

    /**
     * Değerler: "org", "app".
     */
    @JsonProperty("scope")
    private String scope;

    /**
     * Değerler: "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channels")
    private java.util.List<String> channels;

    /**
     * Zorunlu.
     */
    @JsonProperty("actions")
    private CreateKeywordDtoActions actions;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("description")
    private String description;

    public String getKeyword() {
        return keyword;
    }

    public CreateKeywordDto keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public CreateKeywordDto scope(String scope) {
        this.scope = scope;
        return this;
    }

    public java.util.List<String> getChannels() {
        return channels;
    }

    public CreateKeywordDto channels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }

    public CreateKeywordDtoActions getActions() {
        return actions;
    }

    public CreateKeywordDto actions(CreateKeywordDtoActions actions) {
        this.actions = actions;
        return this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public CreateKeywordDto enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateKeywordDto description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
