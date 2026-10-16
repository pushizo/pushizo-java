// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateTemplateDtoContentWhatsappInteractive şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateTemplateDtoContentWhatsappInteractive {
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
    private java.util.List<UpdateTemplateDtoContentWhatsappInteractiveButtonsItem> buttons;

    @JsonProperty("list")
    private UpdateTemplateDtoContentWhatsappInteractiveList list;

    public String getType() {
        return type;
    }

    public UpdateTemplateDtoContentWhatsappInteractive type(String type) {
        this.type = type;
        return this;
    }

    public String getHeader() {
        return header;
    }

    public UpdateTemplateDtoContentWhatsappInteractive header(String header) {
        this.header = header;
        return this;
    }

    public String getFooter() {
        return footer;
    }

    public UpdateTemplateDtoContentWhatsappInteractive footer(String footer) {
        this.footer = footer;
        return this;
    }

    public java.util.List<UpdateTemplateDtoContentWhatsappInteractiveButtonsItem> getButtons() {
        return buttons;
    }

    public UpdateTemplateDtoContentWhatsappInteractive buttons(java.util.List<UpdateTemplateDtoContentWhatsappInteractiveButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    public UpdateTemplateDtoContentWhatsappInteractiveList getList() {
        return list;
    }

    public UpdateTemplateDtoContentWhatsappInteractive list(UpdateTemplateDtoContentWhatsappInteractiveList list) {
        this.list = list;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
