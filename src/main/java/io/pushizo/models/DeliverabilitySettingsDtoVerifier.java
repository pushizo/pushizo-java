// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeliverabilitySettingsDtoVerifier şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DeliverabilitySettingsDtoVerifier {
    /**
     * Zorunlu. Değerler: "zerobounce", "neverbounce", "mock".
     */
    @JsonProperty("provider")
    private String provider;

    @JsonProperty("api_key")
    private String apiKey;

    public String getProvider() {
        return provider;
    }

    public DeliverabilitySettingsDtoVerifier provider(String provider) {
        this.provider = provider;
        return this;
    }

    public String getApiKey() {
        return apiKey;
    }

    public DeliverabilitySettingsDtoVerifier apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
