// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * ConversationsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class ConversationsListParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "sms", "whatsapp", "rcs", "telegram", "viber", "email", "chat".
     */
    private String channel;

    /**
     * Değerler: "open", "pending", "resolved", "closed".
     */
    private String status;

    /**
     * Değerler: "true", "false".
     */
    private String unread;

    private String q;

    private String assignee;

    private String teamId;

    public Long getLimit() {
        return limit;
    }

    public ConversationsListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public ConversationsListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public ConversationsListParams channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ConversationsListParams status(String status) {
        this.status = status;
        return this;
    }

    public String getUnread() {
        return unread;
    }

    public ConversationsListParams unread(String unread) {
        this.unread = unread;
        return this;
    }

    public String getQ() {
        return q;
    }

    public ConversationsListParams q(String q) {
        this.q = q;
        return this;
    }

    public String getAssignee() {
        return assignee;
    }

    public ConversationsListParams assignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public ConversationsListParams teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ConversationsListParams copy() {
        ConversationsListParams c = new ConversationsListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.channel = channel;
        c.status = status;
        c.unread = unread;
        c.q = q;
        c.assignee = assignee;
        c.teamId = teamId;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("channel", channel);
        op.query("status", status);
        op.query("unread", unread);
        op.query("q", q);
        op.query("assignee", assignee);
        op.query("team_id", teamId);
    }
}
