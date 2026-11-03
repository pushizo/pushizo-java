// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PromoCodeUploadResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PromoCodeUploadResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("list")
    private PromoCodeList list;

    /**
     * Zorunlu.
     */
    @JsonProperty("added")
    private Long added;

    /**
     * Zorunlu.
     */
    @JsonProperty("skipped")
    private Long skipped;

    public PromoCodeList getList() {
        return list;
    }

    public PromoCodeUploadResult list(PromoCodeList list) {
        this.list = list;
        return this;
    }

    public Long getAdded() {
        return added;
    }

    public PromoCodeUploadResult added(Long added) {
        this.added = added;
        return this;
    }

    public Long getSkipped() {
        return skipped;
    }

    public PromoCodeUploadResult skipped(Long skipped) {
        this.skipped = skipped;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
