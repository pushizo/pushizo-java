// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxPage şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxPage {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<InboxItem> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("unread_count")
    private Long unreadCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("next_cursor")
    private String nextCursor;

    /**
     * Zorunlu.
     */
    @JsonProperty("has_more")
    private Boolean hasMore;

    public java.util.List<InboxItem> getData() {
        return data;
    }

    public InboxPage data(java.util.List<InboxItem> data) {
        this.data = data;
        return this;
    }

    public Long getUnreadCount() {
        return unreadCount;
    }

    public InboxPage unreadCount(Long unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public InboxPage nextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public InboxPage hasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
