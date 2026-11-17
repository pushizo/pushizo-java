// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * OrganizationResource.requestLogs için isteğe bağlı sorgu parametreleri.
 */
public final class OrganizationRequestLogsParams {
    private Long limit;

    private String cursor;

    private String appId;

    /**
     * Değerler: "2xx", "4xx", "5xx".
     */
    private String statusClass;

    /**
     * Değerler: "GET", "POST", "PUT", "PATCH", "DELETE".
     */
    private String method;

    public Long getLimit() {
        return limit;
    }

    public OrganizationRequestLogsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public OrganizationRequestLogsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public OrganizationRequestLogsParams appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getStatusClass() {
        return statusClass;
    }

    public OrganizationRequestLogsParams statusClass(String statusClass) {
        this.statusClass = statusClass;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public OrganizationRequestLogsParams method(String method) {
        this.method = method;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public OrganizationRequestLogsParams copy() {
        OrganizationRequestLogsParams c = new OrganizationRequestLogsParams();
        c.limit = limit;
        c.cursor = cursor;
        c.appId = appId;
        c.statusClass = statusClass;
        c.method = method;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("app_id", appId);
        op.query("status_class", statusClass);
        op.query("method", method);
    }
}
