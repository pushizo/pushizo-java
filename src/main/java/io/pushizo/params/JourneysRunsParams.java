// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * JourneysResource.runs için isteğe bağlı sorgu parametreleri.
 */
public final class JourneysRunsParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "active", "waiting", "completed", "exited", "failed".
     */
    private String status;

    private String userId;

    private Long version;

    public Long getLimit() {
        return limit;
    }

    public JourneysRunsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public JourneysRunsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public JourneysRunsParams status(String status) {
        this.status = status;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public JourneysRunsParams userId(String userId) {
        this.userId = userId;
        return this;
    }

    public Long getVersion() {
        return version;
    }

    public JourneysRunsParams version(Long version) {
        this.version = version;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public JourneysRunsParams copy() {
        JourneysRunsParams c = new JourneysRunsParams();
        c.limit = limit;
        c.cursor = cursor;
        c.status = status;
        c.userId = userId;
        c.version = version;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("status", status);
        op.query("user_id", userId);
        op.query("version", version);
    }
}
