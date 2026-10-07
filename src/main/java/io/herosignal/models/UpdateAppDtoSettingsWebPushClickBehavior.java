// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsWebPushClickBehavior şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsWebPushClickBehavior {
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

    public UpdateAppDtoSettingsWebPushClickBehavior match(String match) {
        this.match = match;
        return this;
    }

    public String getAction() {
        return action;
    }

    public UpdateAppDtoSettingsWebPushClickBehavior action(String action) {
        this.action = action;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
