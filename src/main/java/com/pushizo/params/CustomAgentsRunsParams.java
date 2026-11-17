// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CustomAgentsResource.runs için isteğe bağlı sorgu parametreleri.
 */
public final class CustomAgentsRunsParams {
    private String agentId;

    /**
     * Değerler: "pending", "running", "succeeded", "failed", "skipped".
     */
    private String status;

    private Long limit;

    private String cursor;

    public String getAgentId() {
        return agentId;
    }

    public CustomAgentsRunsParams agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CustomAgentsRunsParams status(String status) {
        this.status = status;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public CustomAgentsRunsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public CustomAgentsRunsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CustomAgentsRunsParams copy() {
        CustomAgentsRunsParams c = new CustomAgentsRunsParams();
        c.agentId = agentId;
        c.status = status;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("agent_id", agentId);
        op.query("status", status);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
