// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLandingPageDtoDocumentSectionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLandingPageDtoDocumentSectionsItem {
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
    private UpdateLandingPageDtoDocumentSectionsItemPadding padding;

    @JsonProperty("stack_on_mobile")
    private Boolean stackOnMobile;

    /**
     * Zorunlu.
     */
    @JsonProperty("columns")
    private java.util.List<UpdateLandingPageDtoDocumentSectionsItemColumnsItem> columns;

    public String getId() {
        return id;
    }

    public UpdateLandingPageDtoDocumentSectionsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public UpdateLandingPageDtoDocumentSectionsItem type(String type) {
        this.type = type;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public UpdateLandingPageDtoDocumentSectionsItem backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public UpdateLandingPageDtoDocumentSectionsItem backgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    public UpdateLandingPageDtoDocumentSectionsItemPadding getPadding() {
        return padding;
    }

    public UpdateLandingPageDtoDocumentSectionsItem padding(UpdateLandingPageDtoDocumentSectionsItemPadding padding) {
        this.padding = padding;
        return this;
    }

    public Boolean getStackOnMobile() {
        return stackOnMobile;
    }

    public UpdateLandingPageDtoDocumentSectionsItem stackOnMobile(Boolean stackOnMobile) {
        this.stackOnMobile = stackOnMobile;
        return this;
    }

    public java.util.List<UpdateLandingPageDtoDocumentSectionsItemColumnsItem> getColumns() {
        return columns;
    }

    public UpdateLandingPageDtoDocumentSectionsItem columns(java.util.List<UpdateLandingPageDtoDocumentSectionsItemColumnsItem> columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
