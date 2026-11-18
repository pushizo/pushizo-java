// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * UsersResource.userMessages için isteğe bağlı sorgu parametreleri.
 */
public final class UsersUserMessagesParams {
    private Long limit;

    public Long getLimit() {
        return limit;
    }

    public UsersUserMessagesParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public UsersUserMessagesParams copy() {
        UsersUserMessagesParams c = new UsersUserMessagesParams();
        c.limit = limit;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
    }
}
