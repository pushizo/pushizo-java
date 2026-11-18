// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * IntegrationsResource.runs için isteğe bağlı sorgu parametreleri.
 */
public final class IntegrationsRunsParams {
    private Long limit;

    public Long getLimit() {
        return limit;
    }

    public IntegrationsRunsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public IntegrationsRunsParams copy() {
        IntegrationsRunsParams c = new IntegrationsRunsParams();
        c.limit = limit;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
    }
}
