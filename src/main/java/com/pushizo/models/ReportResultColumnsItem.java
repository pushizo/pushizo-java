// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReportResultColumnsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ReportResultColumnsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Zorunlu. Değerler: "dimension", "metric".
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Zorunlu. Değerler: "text", "date", "number", "percent".
     */
    @JsonProperty("format")
    private String format;

    public String getKey() {
        return key;
    }

    public ReportResultColumnsItem key(String key) {
        this.key = key;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public ReportResultColumnsItem kind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public ReportResultColumnsItem format(String format) {
        this.format = format;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
