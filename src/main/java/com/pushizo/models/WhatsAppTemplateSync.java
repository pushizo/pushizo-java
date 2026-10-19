// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WhatsAppTemplateSync şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WhatsAppTemplateSync {
    /**
     * Zorunlu.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Zorunlu.
     */
    @JsonProperty("removed")
    private Long removed;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<WhatsAppTemplateSyncDataItem> data;

    public Long getTotal() {
        return total;
    }

    public WhatsAppTemplateSync total(Long total) {
        this.total = total;
        return this;
    }

    public Long getRemoved() {
        return removed;
    }

    public WhatsAppTemplateSync removed(Long removed) {
        this.removed = removed;
        return this;
    }

    public java.util.List<WhatsAppTemplateSyncDataItem> getData() {
        return data;
    }

    public WhatsAppTemplateSync data(java.util.List<WhatsAppTemplateSyncDataItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
