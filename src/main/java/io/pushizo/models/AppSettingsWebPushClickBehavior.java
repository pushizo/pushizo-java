// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsWebPushClickBehavior şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsWebPushClickBehavior {
    /**
     * Zorunlu. Değerler: "exact", "origin".
     */
    @JsonProperty("match")
    private String match;

    /**
     * Zorunlu. Değerler: "navigate", "focus".
     */
    @JsonProperty("action")
    private String action;

    public String getMatch() {
        return match;
    }

    public AppSettingsWebPushClickBehavior match(String match) {
        this.match = match;
        return this;
    }

    public String getAction() {
        return action;
    }

    public AppSettingsWebPushClickBehavior action(String action) {
        this.action = action;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
