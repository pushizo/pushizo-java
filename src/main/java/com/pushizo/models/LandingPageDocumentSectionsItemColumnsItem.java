// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LandingPageDocumentSectionsItemColumnsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LandingPageDocumentSectionsItemColumnsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("width_percent")
    private Long widthPercent;

    @JsonProperty("background_color")
    private String backgroundColor;

    /**
     * Değerler: "top", "middle", "bottom".
     */
    @JsonProperty("vertical_align")
    private String verticalAlign;

    @JsonProperty("padding")
    private LandingPageDocumentSectionsItemColumnsItemPadding padding;

    /**
     * Zorunlu.
     */
    @JsonProperty("blocks")
    private java.util.List<Object> blocks;

    public String getId() {
        return id;
    }

    public LandingPageDocumentSectionsItemColumnsItem id(String id) {
        this.id = id;
        return this;
    }

    public Long getWidthPercent() {
        return widthPercent;
    }

    public LandingPageDocumentSectionsItemColumnsItem widthPercent(Long widthPercent) {
        this.widthPercent = widthPercent;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public LandingPageDocumentSectionsItemColumnsItem backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getVerticalAlign() {
        return verticalAlign;
    }

    public LandingPageDocumentSectionsItemColumnsItem verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public LandingPageDocumentSectionsItemColumnsItemPadding getPadding() {
        return padding;
    }

    public LandingPageDocumentSectionsItemColumnsItem padding(LandingPageDocumentSectionsItemColumnsItemPadding padding) {
        this.padding = padding;
        return this;
    }

    public java.util.List<Object> getBlocks() {
        return blocks;
    }

    public LandingPageDocumentSectionsItemColumnsItem blocks(java.util.List<Object> blocks) {
        this.blocks = blocks;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
