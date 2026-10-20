// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CannedResponsesResource.canned için isteğe bağlı sorgu parametreleri.
 */
public final class CannedResponsesCannedParams {
    private String q;

    public String getQ() {
        return q;
    }

    public CannedResponsesCannedParams q(String q) {
        this.q = q;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CannedResponsesCannedParams copy() {
        CannedResponsesCannedParams c = new CannedResponsesCannedParams();
        c.q = q;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("q", q);
    }
}
