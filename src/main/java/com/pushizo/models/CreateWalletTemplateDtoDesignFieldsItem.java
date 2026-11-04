// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWalletTemplateDtoDesignFieldsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWalletTemplateDtoDesignFieldsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("key")
    private String key;

    @JsonProperty("label")
    private String label;

    @JsonProperty("value")
    private String value;

    /**
     * Değerler: "header", "primary", "secondary", "auxiliary", "back".
     */
    @JsonProperty("section")
    private String section;

    public String getKey() {
        return key;
    }

    public CreateWalletTemplateDtoDesignFieldsItem key(String key) {
        this.key = key;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public CreateWalletTemplateDtoDesignFieldsItem label(String label) {
        this.label = label;
        return this;
    }

    public String getValue() {
        return value;
    }

    public CreateWalletTemplateDtoDesignFieldsItem value(String value) {
        this.value = value;
        return this;
    }

    public String getSection() {
        return section;
    }

    public CreateWalletTemplateDtoDesignFieldsItem section(String section) {
        this.section = section;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
