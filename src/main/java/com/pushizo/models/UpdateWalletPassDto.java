// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateWalletPassDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateWalletPassDto {
    @JsonProperty("barcode_value")
    private String barcodeValue;

    @JsonProperty("values")
    private java.util.Map<String, String> values;

    public String getBarcodeValue() {
        return barcodeValue;
    }

    public UpdateWalletPassDto barcodeValue(String barcodeValue) {
        this.barcodeValue = barcodeValue;
        return this;
    }

    public java.util.Map<String, String> getValues() {
        return values;
    }

    public UpdateWalletPassDto values(java.util.Map<String, String> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
