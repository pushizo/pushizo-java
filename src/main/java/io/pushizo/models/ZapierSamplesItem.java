// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ZapierSamplesItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ZapierSamplesItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.Map<String, Object> data;

    public String getId() {
        return id;
    }

    public ZapierSamplesItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public ZapierSamplesItem type(String type) {
        this.type = type;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public ZapierSamplesItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public ZapierSamplesItem appId(String appId) {
        this.appId = appId;
        return this;
    }

    public java.util.Map<String, Object> getData() {
        return data;
    }

    public ZapierSamplesItem data(java.util.Map<String, Object> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
