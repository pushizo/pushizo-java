// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * ExportsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class ExportsListParams {
    private Long limit;

    private String cursor;

    public Long getLimit() {
        return limit;
    }

    public ExportsListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public ExportsListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ExportsListParams copy() {
        ExportsListParams c = new ExportsListParams();
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
