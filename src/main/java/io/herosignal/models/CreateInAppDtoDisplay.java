// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** CreateInAppDtoDisplay şeması (api/openapi.yaml). */
public final class CreateInAppDtoDisplay {

    /** "layout" alanı. Zorunlu. Değerler: "modal", "banner_top", "banner_bottom", "fullscreen". */
    @JsonProperty("layout")
    private String layout;

    /** "background_color" alanı. */
    @JsonProperty("background_color")
    private String backgroundColor;

    /** "text_color" alanı. */
    @JsonProperty("text_color")
    private String textColor;

    /** "dismissible" alanı. */
    @JsonProperty("dismissible")
    private Boolean dismissible;

    /** "auto_dismiss_seconds" alanı. */
    @JsonProperty("auto_dismiss_seconds")
    private Long autoDismissSeconds;

    /** "blocks" alanı. Zorunlu. */
    @JsonProperty("blocks")
    private List<Object> blocks;

    /** @return "layout" alanı */
    public String getLayout() {
        return layout;
    }

    /**
     * "layout" alanını ayarlar.
     *
     * @param layout yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateInAppDtoDisplay setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    /** @return "background_color" alanı */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * "background_color" alanını ayarlar.
     *
     * @param backgroundColor yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateInAppDtoDisplay setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /** @return "text_color" alanı */
    public String getTextColor() {
        return textColor;
    }

    /**
     * "text_color" alanını ayarlar.
     *
     * @param textColor yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateInAppDtoDisplay setTextColor(String textColor) {
        this.textColor = textColor;
        return this;
    }

    /** @return "dismissible" alanı */
    public Boolean getDismissible() {
        return dismissible;
    }

    /**
     * "dismissible" alanını ayarlar.
     *
     * @param dismissible yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateInAppDtoDisplay setDismissible(Boolean dismissible) {
        this.dismissible = dismissible;
        return this;
    }

    /** @return "auto_dismiss_seconds" alanı */
    public Long getAutoDismissSeconds() {
        return autoDismissSeconds;
    }

    /**
     * "auto_dismiss_seconds" alanını ayarlar.
     *
     * @param autoDismissSeconds yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateInAppDtoDisplay setAutoDismissSeconds(Long autoDismissSeconds) {
        this.autoDismissSeconds = autoDismissSeconds;
        return this;
    }

    /** @return "blocks" alanı */
    public List<Object> getBlocks() {
        return blocks;
    }

    /**
     * "blocks" alanını ayarlar.
     *
     * @param blocks yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateInAppDtoDisplay setBlocks(List<Object> blocks) {
        this.blocks = blocks;
        return this;
    }
}
