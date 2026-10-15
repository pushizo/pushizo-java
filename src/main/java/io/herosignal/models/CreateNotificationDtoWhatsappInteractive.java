// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNotificationDtoWhatsappInteractive şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateNotificationDtoWhatsappInteractive {
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
    private java.util.List<CreateNotificationDtoWhatsappInteractiveButtonsItem> buttons;

    @JsonProperty("list")
    private CreateNotificationDtoWhatsappInteractiveList list;

    public String getType() {
        return type;
    }

    public CreateNotificationDtoWhatsappInteractive type(String type) {
        this.type = type;
        return this;
    }

    public String getHeader() {
        return header;
    }

    public CreateNotificationDtoWhatsappInteractive header(String header) {
        this.header = header;
        return this;
    }

    public String getFooter() {
        return footer;
    }

    public CreateNotificationDtoWhatsappInteractive footer(String footer) {
        this.footer = footer;
        return this;
    }

    public java.util.List<CreateNotificationDtoWhatsappInteractiveButtonsItem> getButtons() {
        return buttons;
    }

    public CreateNotificationDtoWhatsappInteractive buttons(java.util.List<CreateNotificationDtoWhatsappInteractiveButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    public CreateNotificationDtoWhatsappInteractiveList getList() {
        return list;
    }

    public CreateNotificationDtoWhatsappInteractive list(CreateNotificationDtoWhatsappInteractiveList list) {
        this.list = list;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
