// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWalletConfigDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWalletConfigDto {
    @JsonProperty("apple")
    private UpdateWalletConfigDtoApple apple;

    @JsonProperty("google")
    private UpdateWalletConfigDtoGoogle google;

    public UpdateWalletConfigDtoApple getApple() {
        return apple;
    }

    public UpdateWalletConfigDto apple(UpdateWalletConfigDtoApple apple) {
        this.apple = apple;
        return this;
    }

    public UpdateWalletConfigDtoGoogle getGoogle() {
        return google;
    }

    public UpdateWalletConfigDto google(UpdateWalletConfigDtoGoogle google) {
        this.google = google;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
