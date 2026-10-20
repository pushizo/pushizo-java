// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserPreferencesConsentsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserPreferencesConsentsItem {
    /**
     * Zorunlu. Değerler: "ads_personalization".
     */
    @JsonProperty("purpose")
    private String purpose;

    /**
     * Zorunlu.
     */
    @JsonProperty("granted")
    private Boolean granted;

    /**
     * Zorunlu.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getPurpose() {
        return purpose;
    }

    public UserPreferencesConsentsItem purpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    public Boolean getGranted() {
        return granted;
    }

    public UserPreferencesConsentsItem granted(Boolean granted) {
        this.granted = granted;
        return this;
    }

    public String getSource() {
        return source;
    }

    public UserPreferencesConsentsItem source(String source) {
        this.source = source;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UserPreferencesConsentsItem updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
