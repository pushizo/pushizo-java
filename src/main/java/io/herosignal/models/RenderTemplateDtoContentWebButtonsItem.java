// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderTemplateDtoContentWebButtonsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderTemplateDtoContentWebButtonsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("text")
    private String text;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("url")
    private String url;

    public String getId() {
        return id;
    }

    public RenderTemplateDtoContentWebButtonsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public RenderTemplateDtoContentWebButtonsItem text(String text) {
        this.text = text;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public RenderTemplateDtoContentWebButtonsItem icon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RenderTemplateDtoContentWebButtonsItem url(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
