// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LandingPageDocumentSectionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LandingPageDocumentSectionsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "section".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("background_color")
    private String backgroundColor;

    @JsonProperty("background_image")
    private String backgroundImage;

    @JsonProperty("padding")
    private LandingPageDocumentSectionsItemPadding padding;

    @JsonProperty("stack_on_mobile")
    private Boolean stackOnMobile;

    /**
     * Zorunlu.
     */
    @JsonProperty("columns")
    private java.util.List<LandingPageDocumentSectionsItemColumnsItem> columns;

    public String getId() {
        return id;
    }

    public LandingPageDocumentSectionsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public LandingPageDocumentSectionsItem type(String type) {
        this.type = type;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public LandingPageDocumentSectionsItem backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public LandingPageDocumentSectionsItem backgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    public LandingPageDocumentSectionsItemPadding getPadding() {
        return padding;
    }

    public LandingPageDocumentSectionsItem padding(LandingPageDocumentSectionsItemPadding padding) {
        this.padding = padding;
        return this;
    }

    public Boolean getStackOnMobile() {
        return stackOnMobile;
    }

    public LandingPageDocumentSectionsItem stackOnMobile(Boolean stackOnMobile) {
        this.stackOnMobile = stackOnMobile;
        return this;
    }

    public java.util.List<LandingPageDocumentSectionsItemColumnsItem> getColumns() {
        return columns;
    }

    public LandingPageDocumentSectionsItem columns(java.util.List<LandingPageDocumentSectionsItemColumnsItem> columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
