// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookPreviewResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WebhookPreviewResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("payload")
    private java.util.Map<String, Object> payload;

    /**
     * Zorunlu. Olay filtreden geçer mi (geçmezse gönderilmez).
     */
    @JsonProperty("matched")
    private Boolean matched;

    /**
     * Zorunlu.
     */
    @JsonProperty("failed_conditions")
    private java.util.List<WebhookPreviewResultFailedConditionsItem> failedConditions;

    /**
     * Zorunlu.
     */
    @JsonProperty("body")
    private String body;

    /**
     * Zorunlu.
     */
    @JsonProperty("content_type")
    private String contentType;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private WebhookPreviewResultError error;

    public java.util.Map<String, Object> getPayload() {
        return payload;
    }

    public WebhookPreviewResult payload(java.util.Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }

    public Boolean getMatched() {
        return matched;
    }

    public WebhookPreviewResult matched(Boolean matched) {
        this.matched = matched;
        return this;
    }

    public java.util.List<WebhookPreviewResultFailedConditionsItem> getFailedConditions() {
        return failedConditions;
    }

    public WebhookPreviewResult failedConditions(java.util.List<WebhookPreviewResultFailedConditionsItem> failedConditions) {
        this.failedConditions = failedConditions;
        return this;
    }

    public String getBody() {
        return body;
    }

    public WebhookPreviewResult body(String body) {
        this.body = body;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public WebhookPreviewResult contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public WebhookPreviewResultError getError() {
        return error;
    }

    public WebhookPreviewResult error(WebhookPreviewResultError error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
