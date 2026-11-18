// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateDataSourceDtoConfig şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateDataSourceDtoConfig {
    @JsonProperty("url")
    private String url;

    /**
     * Değerler: "GET", "POST".
     */
    @JsonProperty("method")
    private String method;

    @JsonProperty("headers")
    private java.util.Map<String, String> headers;

    @JsonProperty("body")
    private String body;

    @JsonProperty("interval_minutes")
    private Long intervalMinutes;

    @JsonProperty("auth_header")
    private String authHeader;

    @JsonProperty("next_cursor_path")
    private String nextCursorPath;

    @JsonProperty("cursor_param")
    private String cursorParam;

    @JsonProperty("resume_cursor")
    private Boolean resumeCursor;

    public String getUrl() {
        return url;
    }

    public CreateDataSourceDtoConfig url(String url) {
        this.url = url;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public CreateDataSourceDtoConfig method(String method) {
        this.method = method;
        return this;
    }

    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    public CreateDataSourceDtoConfig headers(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public String getBody() {
        return body;
    }

    public CreateDataSourceDtoConfig body(String body) {
        this.body = body;
        return this;
    }

    public Long getIntervalMinutes() {
        return intervalMinutes;
    }

    public CreateDataSourceDtoConfig intervalMinutes(Long intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
        return this;
    }

    public String getAuthHeader() {
        return authHeader;
    }

    public CreateDataSourceDtoConfig authHeader(String authHeader) {
        this.authHeader = authHeader;
        return this;
    }

    public String getNextCursorPath() {
        return nextCursorPath;
    }

    public CreateDataSourceDtoConfig nextCursorPath(String nextCursorPath) {
        this.nextCursorPath = nextCursorPath;
        return this;
    }

    public String getCursorParam() {
        return cursorParam;
    }

    public CreateDataSourceDtoConfig cursorParam(String cursorParam) {
        this.cursorParam = cursorParam;
        return this;
    }

    public Boolean getResumeCursor() {
        return resumeCursor;
    }

    public CreateDataSourceDtoConfig resumeCursor(Boolean resumeCursor) {
        this.resumeCursor = resumeCursor;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
