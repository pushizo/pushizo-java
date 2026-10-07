// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * InboxResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class InboxListParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "true", "false".
     */
    private String includeArchived;

    public Long getLimit() {
        return limit;
    }

    public InboxListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public InboxListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getIncludeArchived() {
        return includeArchived;
    }

    public InboxListParams includeArchived(String includeArchived) {
        this.includeArchived = includeArchived;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public InboxListParams copy() {
        InboxListParams c = new InboxListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.includeArchived = includeArchived;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("include_archived", includeArchived);
    }
}
