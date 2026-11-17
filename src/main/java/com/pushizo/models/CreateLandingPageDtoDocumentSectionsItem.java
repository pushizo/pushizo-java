// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLandingPageDtoDocumentSectionsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateLandingPageDtoDocumentSectionsItem {
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
    private CreateLandingPageDtoDocumentSectionsItemPadding padding;

    @JsonProperty("stack_on_mobile")
    private Boolean stackOnMobile;

    /**
     * Zorunlu.
     */
    @JsonProperty("columns")
    private java.util.List<CreateLandingPageDtoDocumentSectionsItemColumnsItem> columns;

    public String getId() {
        return id;
    }

    public CreateLandingPageDtoDocumentSectionsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateLandingPageDtoDocumentSectionsItem type(String type) {
        this.type = type;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public CreateLandingPageDtoDocumentSectionsItem backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public CreateLandingPageDtoDocumentSectionsItem backgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }

    public CreateLandingPageDtoDocumentSectionsItemPadding getPadding() {
        return padding;
    }

    public CreateLandingPageDtoDocumentSectionsItem padding(CreateLandingPageDtoDocumentSectionsItemPadding padding) {
        this.padding = padding;
        return this;
    }

    public Boolean getStackOnMobile() {
        return stackOnMobile;
    }

    public CreateLandingPageDtoDocumentSectionsItem stackOnMobile(Boolean stackOnMobile) {
        this.stackOnMobile = stackOnMobile;
        return this;
    }

    public java.util.List<CreateLandingPageDtoDocumentSectionsItemColumnsItem> getColumns() {
        return columns;
    }

    public CreateLandingPageDtoDocumentSectionsItem columns(java.util.List<CreateLandingPageDtoDocumentSectionsItemColumnsItem> columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
