// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TestPushDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TestPushDto {
    @JsonProperty("subscription_ids")
    private java.util.List<String> subscriptionIds;

    @JsonProperty("headings")
    private java.util.Map<String, String> headings;

    /**
     * Zorunlu.
     */
    @JsonProperty("contents")
    private java.util.Map<String, String> contents;

    @JsonProperty("url")
    private String url;

    @JsonProperty("data")
    private java.util.Map<String, String> data;

    public java.util.List<String> getSubscriptionIds() {
        return subscriptionIds;
    }

    public TestPushDto subscriptionIds(java.util.List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }

    public java.util.Map<String, String> getHeadings() {
        return headings;
    }

    public TestPushDto headings(java.util.Map<String, String> headings) {
        this.headings = headings;
        return this;
    }

    public java.util.Map<String, String> getContents() {
        return contents;
    }

    public TestPushDto contents(java.util.Map<String, String> contents) {
        this.contents = contents;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public TestPushDto url(String url) {
        this.url = url;
        return this;
    }

    public java.util.Map<String, String> getData() {
        return data;
    }

    public TestPushDto data(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
