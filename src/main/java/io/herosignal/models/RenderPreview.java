// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderPreview şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderPreview {
    /**
     * Zorunlu. Değerler: "ios_push", "android_push", "web_push", "email", "sms".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    /**
     * Zorunlu.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Zorunlu.
     */
    @JsonProperty("subtitle")
    private String subtitle;

    /**
     * Zorunlu.
     */
    @JsonProperty("body")
    private String body;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("image_url")
    private String imageUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("icon_url")
    private String iconUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("buttons")
    private java.util.List<RenderPreviewButtonsItem> buttons;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.Map<String, String> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("warnings")
    private java.util.List<String> warnings;

    @JsonProperty("email")
    private RenderPreviewEmail email;

    @JsonProperty("sms")
    private RenderPreviewSms sms;

    public String getChannel() {
        return channel;
    }

    public RenderPreview channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public RenderPreview language(String language) {
        this.language = language;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public RenderPreview title(String title) {
        this.title = title;
        return this;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public RenderPreview subtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public String getBody() {
        return body;
    }

    public RenderPreview body(String body) {
        this.body = body;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RenderPreview url(String url) {
        this.url = url;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public RenderPreview imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public RenderPreview iconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public java.util.List<RenderPreviewButtonsItem> getButtons() {
        return buttons;
    }

    public RenderPreview buttons(java.util.List<RenderPreviewButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    public java.util.Map<String, String> getData() {
        return data;
    }

    public RenderPreview data(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }

    public java.util.List<String> getWarnings() {
        return warnings;
    }

    public RenderPreview warnings(java.util.List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    public RenderPreviewEmail getEmail() {
        return email;
    }

    public RenderPreview email(RenderPreviewEmail email) {
        this.email = email;
        return this;
    }

    public RenderPreviewSms getSms() {
        return sms;
    }

    public RenderPreview sms(RenderPreviewSms sms) {
        this.sms = sms;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
