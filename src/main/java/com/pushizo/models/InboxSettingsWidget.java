// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxSettingsWidget şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxSettingsWidget {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("color")
    private String color;

    @JsonProperty("text_color")
    private String textColor;

    /**
     * Değerler: "right", "left".
     */
    @JsonProperty("position")
    private String position;

    /**
     * Değerler: "light", "dark", "auto".
     */
    @JsonProperty("theme")
    private String theme;

    @JsonProperty("title")
    private java.util.Map<String, String> title;

    @JsonProperty("greeting")
    private java.util.Map<String, String> greeting;

    @JsonProperty("offline_message")
    private java.util.Map<String, String> offlineMessage;

    @JsonProperty("collect_email_offline")
    private Boolean collectEmailOffline;

    @JsonProperty("attachments")
    private Boolean attachments;

    @JsonProperty("require_email")
    private Boolean requireEmail;

    public Boolean getEnabled() {
        return enabled;
    }

    public InboxSettingsWidget enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getColor() {
        return color;
    }

    public InboxSettingsWidget color(String color) {
        this.color = color;
        return this;
    }

    public String getTextColor() {
        return textColor;
    }

    public InboxSettingsWidget textColor(String textColor) {
        this.textColor = textColor;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public InboxSettingsWidget position(String position) {
        this.position = position;
        return this;
    }

    public String getTheme() {
        return theme;
    }

    public InboxSettingsWidget theme(String theme) {
        this.theme = theme;
        return this;
    }

    public java.util.Map<String, String> getTitle() {
        return title;
    }

    public InboxSettingsWidget title(java.util.Map<String, String> title) {
        this.title = title;
        return this;
    }

    public java.util.Map<String, String> getGreeting() {
        return greeting;
    }

    public InboxSettingsWidget greeting(java.util.Map<String, String> greeting) {
        this.greeting = greeting;
        return this;
    }

    public java.util.Map<String, String> getOfflineMessage() {
        return offlineMessage;
    }

    public InboxSettingsWidget offlineMessage(java.util.Map<String, String> offlineMessage) {
        this.offlineMessage = offlineMessage;
        return this;
    }

    public Boolean getCollectEmailOffline() {
        return collectEmailOffline;
    }

    public InboxSettingsWidget collectEmailOffline(Boolean collectEmailOffline) {
        this.collectEmailOffline = collectEmailOffline;
        return this;
    }

    public Boolean getAttachments() {
        return attachments;
    }

    public InboxSettingsWidget attachments(Boolean attachments) {
        this.attachments = attachments;
        return this;
    }

    public Boolean getRequireEmail() {
        return requireEmail;
    }

    public InboxSettingsWidget requireEmail(Boolean requireEmail) {
        this.requireEmail = requireEmail;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
