// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Conversation şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Conversation {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "sms", "whatsapp", "rcs".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu. Değerler: "open", "closed".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("subscription_id")
    private String subscriptionId;

    /**
     * Zorunlu.
     */
    @JsonProperty("subscription_status")
    private String subscriptionStatus;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * Zorunlu.
     */
    @JsonProperty("contact")
    private String contact;

    /**
     * Zorunlu.
     */
    @JsonProperty("opted_in")
    private Boolean optedIn;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_message_at")
    private String lastMessageAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_inbound_at")
    private String lastInboundAt;

    /**
     * Zorunlu. Değerler: "inbound", "outbound".
     */
    @JsonProperty("last_direction")
    private String lastDirection;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_message_preview")
    private String lastMessagePreview;

    /**
     * Zorunlu.
     */
    @JsonProperty("unread_count")
    private Long unreadCount;

    /**
     * Zorunlu.
     */
    @JsonProperty("window")
    private ConversationWindow window;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public Conversation id(String id) {
        this.id = id;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public Conversation channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Conversation status(String status) {
        this.status = status;
        return this;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public Conversation subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public Conversation subscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Conversation userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public Conversation externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getContact() {
        return contact;
    }

    public Conversation contact(String contact) {
        this.contact = contact;
        return this;
    }

    public Boolean getOptedIn() {
        return optedIn;
    }

    public Conversation optedIn(Boolean optedIn) {
        this.optedIn = optedIn;
        return this;
    }

    public String getLastMessageAt() {
        return lastMessageAt;
    }

    public Conversation lastMessageAt(String lastMessageAt) {
        this.lastMessageAt = lastMessageAt;
        return this;
    }

    public String getLastInboundAt() {
        return lastInboundAt;
    }

    public Conversation lastInboundAt(String lastInboundAt) {
        this.lastInboundAt = lastInboundAt;
        return this;
    }

    public String getLastDirection() {
        return lastDirection;
    }

    public Conversation lastDirection(String lastDirection) {
        this.lastDirection = lastDirection;
        return this;
    }

    public String getLastMessagePreview() {
        return lastMessagePreview;
    }

    public Conversation lastMessagePreview(String lastMessagePreview) {
        this.lastMessagePreview = lastMessagePreview;
        return this;
    }

    public Long getUnreadCount() {
        return unreadCount;
    }

    public Conversation unreadCount(Long unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }

    public ConversationWindow getWindow() {
        return window;
    }

    public Conversation window(ConversationWindow window) {
        this.window = window;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Conversation createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
