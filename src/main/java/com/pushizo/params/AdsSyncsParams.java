// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AdsResource.syncs için isteğe bağlı sorgu parametreleri.
 */
public final class AdsSyncsParams {
    private Long limit;

    public Long getLimit() {
        return limit;
    }

    public AdsSyncsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AdsSyncsParams copy() {
        AdsSyncsParams c = new AdsSyncsParams();
        c.limit = limit;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
    }
}
