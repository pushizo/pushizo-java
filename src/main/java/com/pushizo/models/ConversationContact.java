// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationContact şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationContact {
    /**
     * Zorunlu.
     */
    @JsonProperty("user")
    private ConversationContactUser user;

    /**
     * Zorunlu.
     */
    @JsonProperty("subscriptions")
    private java.util.List<ConversationContactSubscriptionsItem> subscriptions;

    /**
     * Zorunlu.
     */
    @JsonProperty("recent_events")
    private java.util.List<ConversationContactRecentEventsItem> recentEvents;

    /**
     * Zorunlu.
     */
    @JsonProperty("other_conversations")
    private java.util.List<ConversationContactOtherConversationsItem> otherConversations;

    public ConversationContactUser getUser() {
        return user;
    }

    public ConversationContact user(ConversationContactUser user) {
        this.user = user;
        return this;
    }

    public java.util.List<ConversationContactSubscriptionsItem> getSubscriptions() {
        return subscriptions;
    }

    public ConversationContact subscriptions(java.util.List<ConversationContactSubscriptionsItem> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public java.util.List<ConversationContactRecentEventsItem> getRecentEvents() {
        return recentEvents;
    }

    public ConversationContact recentEvents(java.util.List<ConversationContactRecentEventsItem> recentEvents) {
        this.recentEvents = recentEvents;
        return this;
    }

    public java.util.List<ConversationContactOtherConversationsItem> getOtherConversations() {
        return otherConversations;
    }

    public ConversationContact otherConversations(java.util.List<ConversationContactOtherConversationsItem> otherConversations) {
        this.otherConversations = otherConversations;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
