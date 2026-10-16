// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddSubscriptionDtoOptIn şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AddSubscriptionDtoOptIn {
    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private String source;

    @JsonProperty("at")
    private String at;

    public String getSource() {
        return source;
    }

    public AddSubscriptionDtoOptIn source(String source) {
        this.source = source;
        return this;
    }

    public String getAt() {
        return at;
    }

    public AddSubscriptionDtoOptIn at(String at) {
        this.at = at;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
