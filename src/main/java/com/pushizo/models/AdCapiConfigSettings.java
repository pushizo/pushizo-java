// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdCapiConfigSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdCapiConfigSettings {
    /**
     * Zorunlu.
     */
    @JsonProperty("pixel_id")
    private String pixelId;

    /**
     * Zorunlu.
     */
    @JsonProperty("customer_id")
    private String customerId;

    /**
     * Zorunlu.
     */
    @JsonProperty("login_customer_id")
    private String loginCustomerId;

    /**
     * Zorunlu.
     */
    @JsonProperty("pixel_code")
    private String pixelCode;

    public String getPixelId() {
        return pixelId;
    }

    public AdCapiConfigSettings pixelId(String pixelId) {
        this.pixelId = pixelId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public AdCapiConfigSettings customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getLoginCustomerId() {
        return loginCustomerId;
    }

    public AdCapiConfigSettings loginCustomerId(String loginCustomerId) {
        this.loginCustomerId = loginCustomerId;
        return this;
    }

    public String getPixelCode() {
        return pixelCode;
    }

    public AdCapiConfigSettings pixelCode(String pixelCode) {
        this.pixelCode = pixelCode;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
