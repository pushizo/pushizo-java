// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailDeliverabilitySettingsVerifier şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailDeliverabilitySettingsVerifier {
    /**
     * Zorunlu. Değerler: "zerobounce", "neverbounce", "mock".
     */
    @JsonProperty("provider")
    private String provider;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_key")
    private Boolean hasKey;

    public String getProvider() {
        return provider;
    }

    public EmailDeliverabilitySettingsVerifier provider(String provider) {
        this.provider = provider;
        return this;
    }

    public Boolean getHasKey() {
        return hasKey;
    }

    public EmailDeliverabilitySettingsVerifier hasKey(Boolean hasKey) {
        this.hasKey = hasKey;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
