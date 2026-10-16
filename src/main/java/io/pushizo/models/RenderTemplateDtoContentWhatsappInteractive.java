// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderTemplateDtoContentWhatsappInteractive şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderTemplateDtoContentWhatsappInteractive {
    /**
     * Zorunlu. Değerler: "button", "list".
     */
    @JsonProperty("type")
    private String type;

    @JsonProperty("header")
    private String header;

    @JsonProperty("footer")
    private String footer;

    @JsonProperty("buttons")
    private java.util.List<RenderTemplateDtoContentWhatsappInteractiveButtonsItem> buttons;

    @JsonProperty("list")
    private RenderTemplateDtoContentWhatsappInteractiveList list;

    public String getType() {
        return type;
    }

    public RenderTemplateDtoContentWhatsappInteractive type(String type) {
        this.type = type;
        return this;
    }

    public String getHeader() {
        return header;
    }

    public RenderTemplateDtoContentWhatsappInteractive header(String header) {
        this.header = header;
        return this;
    }

    public String getFooter() {
        return footer;
    }

    public RenderTemplateDtoContentWhatsappInteractive footer(String footer) {
        this.footer = footer;
        return this;
    }

    public java.util.List<RenderTemplateDtoContentWhatsappInteractiveButtonsItem> getButtons() {
        return buttons;
    }

    public RenderTemplateDtoContentWhatsappInteractive buttons(java.util.List<RenderTemplateDtoContentWhatsappInteractiveButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    public RenderTemplateDtoContentWhatsappInteractiveList getList() {
        return list;
    }

    public RenderTemplateDtoContentWhatsappInteractive list(RenderTemplateDtoContentWhatsappInteractiveList list) {
        this.list = list;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
