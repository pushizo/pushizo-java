// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * OrganizationResource.auditLogs için isteğe bağlı sorgu parametreleri.
 */
public final class OrganizationAuditLogsParams {
    private Long limit;

    private String cursor;

    private String action;

    private String actorId;

    private String appId;

    private String from;

    private String to;

    public Long getLimit() {
        return limit;
    }

    public OrganizationAuditLogsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public OrganizationAuditLogsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getAction() {
        return action;
    }

    public OrganizationAuditLogsParams action(String action) {
        this.action = action;
        return this;
    }

    public String getActorId() {
        return actorId;
    }

    public OrganizationAuditLogsParams actorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public OrganizationAuditLogsParams appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public OrganizationAuditLogsParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public OrganizationAuditLogsParams to(String to) {
        this.to = to;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public OrganizationAuditLogsParams copy() {
        OrganizationAuditLogsParams c = new OrganizationAuditLogsParams();
        c.limit = limit;
        c.cursor = cursor;
        c.action = action;
        c.actorId = actorId;
        c.appId = appId;
        c.from = from;
        c.to = to;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("action", action);
        op.query("actor_id", actorId);
        op.query("app_id", appId);
        op.query("from", from);
        op.query("to", to);
    }
}
