// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsWebPushPromptCategoriesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsWebPushPromptCategoriesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("tag")
    private String tag;

    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private java.util.Map<String, String> label;

    public String getTag() {
        return tag;
    }

    public AppSettingsWebPushPromptCategoriesItem tag(String tag) {
        this.tag = tag;
        return this;
    }

    public java.util.Map<String, String> getLabel() {
        return label;
    }

    public AppSettingsWebPushPromptCategoriesItem label(java.util.Map<String, String> label) {
        this.label = label;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
