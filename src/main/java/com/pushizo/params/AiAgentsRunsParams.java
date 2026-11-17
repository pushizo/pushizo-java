// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AiAgentsResource.runs için isteğe bağlı sorgu parametreleri.
 */
public final class AiAgentsRunsParams {
    private String agentId;

    private String conversationId;

    /**
     * Değerler: "pending", "replied", "handed_off", "skipped_cap", "failed".
     */
    private String status;

    private Long limit;

    private String cursor;

    public String getAgentId() {
        return agentId;
    }

    public AiAgentsRunsParams agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getConversationId() {
        return conversationId;
    }

    public AiAgentsRunsParams conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AiAgentsRunsParams status(String status) {
        this.status = status;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public AiAgentsRunsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public AiAgentsRunsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AiAgentsRunsParams copy() {
        AiAgentsRunsParams c = new AiAgentsRunsParams();
        c.agentId = agentId;
        c.conversationId = conversationId;
        c.status = status;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("agent_id", agentId);
        op.query("conversation_id", conversationId);
        op.query("status", status);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
