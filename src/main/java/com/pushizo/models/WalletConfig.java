// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WalletConfig şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WalletConfig {
    /**
     * Zorunlu.
     */
    @JsonProperty("apple")
    private WalletConfigApple apple;

    /**
     * Zorunlu.
     */
    @JsonProperty("google")
    private WalletConfigGoogle google;

    public WalletConfigApple getApple() {
        return apple;
    }

    public WalletConfig apple(WalletConfigApple apple) {
        this.apple = apple;
        return this;
    }

    public WalletConfigGoogle getGoogle() {
        return google;
    }

    public WalletConfig google(WalletConfigGoogle google) {
        this.google = google;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
