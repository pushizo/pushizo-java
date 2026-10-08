// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsAndroidChannelsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsAndroidChannelsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu. Değerler: "low", "default", "high", "urgent".
     */
    @JsonProperty("importance")
    private String importance;

    @JsonProperty("sound")
    private String sound;

    @JsonProperty("vibration")
    private Boolean vibration;

    @JsonProperty("group")
    private String group;

    public String getId() {
        return id;
    }

    public AppSettingsAndroidChannelsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AppSettingsAndroidChannelsItem name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AppSettingsAndroidChannelsItem description(String description) {
        this.description = description;
        return this;
    }

    public String getImportance() {
        return importance;
    }

    public AppSettingsAndroidChannelsItem importance(String importance) {
        this.importance = importance;
        return this;
    }

    public String getSound() {
        return sound;
    }

    public AppSettingsAndroidChannelsItem sound(String sound) {
        this.sound = sound;
        return this;
    }

    public Boolean getVibration() {
        return vibration;
    }

    public AppSettingsAndroidChannelsItem vibration(Boolean vibration) {
        this.vibration = vibration;
        return this;
    }

    public String getGroup() {
        return group;
    }

    public AppSettingsAndroidChannelsItem group(String group) {
        this.group = group;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
