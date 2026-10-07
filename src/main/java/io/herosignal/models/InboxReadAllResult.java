// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxReadAllResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxReadAllResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("updated")
    private Long updated;

    /**
     * Zorunlu.
     */
    @JsonProperty("unread_count")
    private Long unreadCount;

    public Long getUpdated() {
        return updated;
    }

    public InboxReadAllResult updated(Long updated) {
        this.updated = updated;
        return this;
    }

    public Long getUnreadCount() {
        return unreadCount;
    }

    public InboxReadAllResult unreadCount(Long unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
