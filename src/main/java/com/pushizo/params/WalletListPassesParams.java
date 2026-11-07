// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * WalletResource.listPasses için isteğe bağlı sorgu parametreleri.
 */
public final class WalletListPassesParams {
    private String templateId;

    private Long limit;

    private String cursor;

    public String getTemplateId() {
        return templateId;
    }

    public WalletListPassesParams templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public WalletListPassesParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public WalletListPassesParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public WalletListPassesParams copy() {
        WalletListPassesParams c = new WalletListPassesParams();
        c.templateId = templateId;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("template_id", templateId);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
