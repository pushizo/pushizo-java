// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * WarehouseExportsResource.runs için isteğe bağlı sorgu parametreleri.
 */
public final class WarehouseExportsRunsParams {
    private Long limit;

    private String cursor;

    public Long getLimit() {
        return limit;
    }

    public WarehouseExportsRunsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public WarehouseExportsRunsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public WarehouseExportsRunsParams copy() {
        WarehouseExportsRunsParams c = new WarehouseExportsRunsParams();
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
