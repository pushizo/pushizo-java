// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

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
     * Zorunlu. Değerler: "sms", "whatsapp", "rcs", "telegram", "viber", "email", "chat".
     */
    @JsonProperty("channel")
    private String channel;

    /**
     * Zorunlu. Değerler: "open", "pending", "resolved", "closed".
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

    /**
     * Zorunlu.
     */
    @JsonProperty("assignee_id")
    private String assigneeId;

    /**
     * Zorunlu.
     */
    @JsonProperty("team_id")
    private String teamId;

    /**
     * Zorunlu.
     */
    @JsonProperty("assigned_at")
    private String assignedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("language")
    private String language;

    /**
     * Zorunlu.
     */
    @JsonProperty("bot_active")
    private Boolean botActive;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_seq")
    private Long lastSeq;

    /**
     * Zorunlu.
     */
    @JsonProperty("visitor_last_read_seq")
    private Long visitorLastReadSeq;

    /**
     * Zorunlu.
     */
    @JsonProperty("visitor_last_delivered_seq")
    private Long visitorLastDeliveredSeq;

    /**
     * Zorunlu.
     */
    @JsonProperty("agent_last_read_seq")
    private Long agentLastReadSeq;

    /**
     * Zorunlu.
     */
    @JsonProperty("waiting_since")
    private String waitingSince;

    /**
     * Zorunlu.
     */
    @JsonProperty("first_response_at")
    private String firstResponseAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("sla_due_at")
    private String slaDueAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("resolved_at")
    private String resolvedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("visitor")
    private ConversationVisitor visitor;

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

    public String getAssigneeId() {
        return assigneeId;
    }

    public Conversation assigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public Conversation teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getAssignedAt() {
        return assignedAt;
    }

    public Conversation assignedAt(String assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Conversation language(String language) {
        this.language = language;
        return this;
    }

    public Boolean getBotActive() {
        return botActive;
    }

    public Conversation botActive(Boolean botActive) {
        this.botActive = botActive;
        return this;
    }

    public Long getLastSeq() {
        return lastSeq;
    }

    public Conversation lastSeq(Long lastSeq) {
        this.lastSeq = lastSeq;
        return this;
    }

    public Long getVisitorLastReadSeq() {
        return visitorLastReadSeq;
    }

    public Conversation visitorLastReadSeq(Long visitorLastReadSeq) {
        this.visitorLastReadSeq = visitorLastReadSeq;
        return this;
    }

    public Long getVisitorLastDeliveredSeq() {
        return visitorLastDeliveredSeq;
    }

    public Conversation visitorLastDeliveredSeq(Long visitorLastDeliveredSeq) {
        this.visitorLastDeliveredSeq = visitorLastDeliveredSeq;
        return this;
    }

    public Long getAgentLastReadSeq() {
        return agentLastReadSeq;
    }

    public Conversation agentLastReadSeq(Long agentLastReadSeq) {
        this.agentLastReadSeq = agentLastReadSeq;
        return this;
    }

    public String getWaitingSince() {
        return waitingSince;
    }

    public Conversation waitingSince(String waitingSince) {
        this.waitingSince = waitingSince;
        return this;
    }

    public String getFirstResponseAt() {
        return firstResponseAt;
    }

    public Conversation firstResponseAt(String firstResponseAt) {
        this.firstResponseAt = firstResponseAt;
        return this;
    }

    public String getSlaDueAt() {
        return slaDueAt;
    }

    public Conversation slaDueAt(String slaDueAt) {
        this.slaDueAt = slaDueAt;
        return this;
    }

    public String getResolvedAt() {
        return resolvedAt;
    }

    public Conversation resolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }

    public ConversationVisitor getVisitor() {
        return visitor;
    }

    public Conversation visitor(ConversationVisitor visitor) {
        this.visitor = visitor;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
