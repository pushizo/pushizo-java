// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataFeedTestResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DataFeedTestResult {
    /**
     * Zorunlu. Değerler: "ok", "cached", "timeout", "error", "circuit_open", "blocked", "invalid_json", "too_large", "http_error".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("http_status")
    private Long httpStatus;

    /**
     * Zorunlu.
     */
    @JsonProperty("duration_ms")
    private Long durationMs;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("preview")
    private Object preview;

    /**
     * Zorunlu.
     */
    @JsonProperty("truncated")
    private Boolean truncated;

    /**
     * Zorunlu.
     */
    @JsonProperty("user")
    private DataFeedTestResultUser user;

    public String getStatus() {
        return status;
    }

    public DataFeedTestResult status(String status) {
        this.status = status;
        return this;
    }

    public Long getHttpStatus() {
        return httpStatus;
    }

    public DataFeedTestResult httpStatus(Long httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    public Long getDurationMs() {
        return durationMs;
    }

    public DataFeedTestResult durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    public String getError() {
        return error;
    }

    public DataFeedTestResult error(String error) {
        this.error = error;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DataFeedTestResult url(String url) {
        this.url = url;
        return this;
    }

    public Object getPreview() {
        return preview;
    }

    public DataFeedTestResult preview(Object preview) {
        this.preview = preview;
        return this;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public DataFeedTestResult truncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    public DataFeedTestResultUser getUser() {
        return user;
    }

    public DataFeedTestResult user(DataFeedTestResultUser user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
