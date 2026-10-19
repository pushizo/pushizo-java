// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * WhatsappResource.templates için isteğe bağlı sorgu parametreleri.
 */
public final class WhatsappTemplatesParams {
    private String status;

    public String getStatus() {
        return status;
    }

    public WhatsappTemplatesParams status(String status) {
        this.status = status;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public WhatsappTemplatesParams copy() {
        WhatsappTemplatesParams c = new WhatsappTemplatesParams();
        c.status = status;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("status", status);
    }
}
