// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** RenderPreview şeması (api/openapi.yaml). */
public final class RenderPreview {

    /** "channel" alanı. Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "language" alanı. Zorunlu. */
    @JsonProperty("language")
    private String language;

    /** "title" alanı. Zorunlu. */
    @JsonProperty("title")
    private String title;

    /** "subtitle" alanı. Zorunlu. */
    @JsonProperty("subtitle")
    private String subtitle;

    /** "body" alanı. Zorunlu. */
    @JsonProperty("body")
    private String body;

    /** "url" alanı. Zorunlu. */
    @JsonProperty("url")
    private String url;

    /** "image_url" alanı. Zorunlu. */
    @JsonProperty("image_url")
    private String imageUrl;

    /** "icon_url" alanı. Zorunlu. */
    @JsonProperty("icon_url")
    private String iconUrl;

    /** "buttons" alanı. Zorunlu. */
    @JsonProperty("buttons")
    private List<RenderPreviewButtonsItem> buttons;

    /** "data" alanı. Zorunlu. */
    @JsonProperty("data")
    private Map<String, String> data;

    /** "warnings" alanı. Zorunlu. */
    @JsonProperty("warnings")
    private List<String> warnings;

    /** "email" alanı. */
    @JsonProperty("email")
    private RenderPreviewEmail email;

    /** "sms" alanı. */
    @JsonProperty("sms")
    private RenderPreviewSms sms;

    /** @return "channel" alanı */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" alanını ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "language" alanı */
    public String getLanguage() {
        return language;
    }

    /**
     * "language" alanını ayarlar.
     *
     * @param language yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setLanguage(String language) {
        this.language = language;
        return this;
    }

    /** @return "title" alanı */
    public String getTitle() {
        return title;
    }

    /**
     * "title" alanını ayarlar.
     *
     * @param title yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setTitle(String title) {
        this.title = title;
        return this;
    }

    /** @return "subtitle" alanı */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * "subtitle" alanını ayarlar.
     *
     * @param subtitle yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    /** @return "body" alanı */
    public String getBody() {
        return body;
    }

    /**
     * "body" alanını ayarlar.
     *
     * @param body yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setBody(String body) {
        this.body = body;
        return this;
    }

    /** @return "url" alanı */
    public String getUrl() {
        return url;
    }

    /**
     * "url" alanını ayarlar.
     *
     * @param url yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setUrl(String url) {
        this.url = url;
        return this;
    }

    /** @return "image_url" alanı */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * "image_url" alanını ayarlar.
     *
     * @param imageUrl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /** @return "icon_url" alanı */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * "icon_url" alanını ayarlar.
     *
     * @param iconUrl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /** @return "buttons" alanı */
    public List<RenderPreviewButtonsItem> getButtons() {
        return buttons;
    }

    /**
     * "buttons" alanını ayarlar.
     *
     * @param buttons yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setButtons(List<RenderPreviewButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    /** @return "data" alanı */
    public Map<String, String> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setData(Map<String, String> data) {
        this.data = data;
        return this;
    }

    /** @return "warnings" alanı */
    public List<String> getWarnings() {
        return warnings;
    }

    /**
     * "warnings" alanını ayarlar.
     *
     * @param warnings yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    /** @return "email" alanı */
    public RenderPreviewEmail getEmail() {
        return email;
    }

    /**
     * "email" alanını ayarlar.
     *
     * @param email yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setEmail(RenderPreviewEmail email) {
        this.email = email;
        return this;
    }

    /** @return "sms" alanı */
    public RenderPreviewSms getSms() {
        return sms;
    }

    /**
     * "sms" alanını ayarlar.
     *
     * @param sms yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreview setSms(RenderPreviewSms sms) {
        this.sms = sms;
        return this;
    }
}
