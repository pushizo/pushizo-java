// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTemplateDtoContentWhatsappInteractive şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateTemplateDtoContentWhatsappInteractive {
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
    private java.util.List<CreateTemplateDtoContentWhatsappInteractiveButtonsItem> buttons;

    @JsonProperty("list")
    private CreateTemplateDtoContentWhatsappInteractiveList list;

    public String getType() {
        return type;
    }

    public CreateTemplateDtoContentWhatsappInteractive type(String type) {
        this.type = type;
        return this;
    }

    public String getHeader() {
        return header;
    }

    public CreateTemplateDtoContentWhatsappInteractive header(String header) {
        this.header = header;
        return this;
    }

    public String getFooter() {
        return footer;
    }

    public CreateTemplateDtoContentWhatsappInteractive footer(String footer) {
        this.footer = footer;
        return this;
    }

    public java.util.List<CreateTemplateDtoContentWhatsappInteractiveButtonsItem> getButtons() {
        return buttons;
    }

    public CreateTemplateDtoContentWhatsappInteractive buttons(java.util.List<CreateTemplateDtoContentWhatsappInteractiveButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    public CreateTemplateDtoContentWhatsappInteractiveList getList() {
        return list;
    }

    public CreateTemplateDtoContentWhatsappInteractive list(CreateTemplateDtoContentWhatsappInteractiveList list) {
        this.list = list;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
