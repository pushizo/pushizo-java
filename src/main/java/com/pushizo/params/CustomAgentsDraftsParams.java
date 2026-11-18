// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CustomAgentsResource.drafts için isteğe bağlı sorgu parametreleri.
 */
public final class CustomAgentsDraftsParams {
    private String agentId;

    private String runId;

    /**
     * Değerler: "pending", "applied", "dismissed".
     */
    private String status;

    private Long limit;

    private String cursor;

    public String getAgentId() {
        return agentId;
    }

    public CustomAgentsDraftsParams agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getRunId() {
        return runId;
    }

    public CustomAgentsDraftsParams runId(String runId) {
        this.runId = runId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CustomAgentsDraftsParams status(String status) {
        this.status = status;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public CustomAgentsDraftsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public CustomAgentsDraftsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CustomAgentsDraftsParams copy() {
        CustomAgentsDraftsParams c = new CustomAgentsDraftsParams();
        c.agentId = agentId;
        c.runId = runId;
        c.status = status;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("agent_id", agentId);
        op.query("run_id", runId);
        op.query("status", status);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
