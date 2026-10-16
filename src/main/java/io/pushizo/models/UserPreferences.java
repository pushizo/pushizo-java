// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserPreferences şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserPreferences {
    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<UserPreferencesDataItem> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("categories")
    private java.util.List<MessageCategory> categories;

    public String getUserId() {
        return userId;
    }

    public UserPreferences userId(String userId) {
        this.userId = userId;
        return this;
    }

    public java.util.List<UserPreferencesDataItem> getData() {
        return data;
    }

    public UserPreferences data(java.util.List<UserPreferencesDataItem> data) {
        this.data = data;
        return this;
    }

    public java.util.List<MessageCategory> getCategories() {
        return categories;
    }

    public UserPreferences categories(java.util.List<MessageCategory> categories) {
        this.categories = categories;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
