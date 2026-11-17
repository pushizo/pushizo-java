// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * UsersResource.userEvents için isteğe bağlı sorgu parametreleri.
 */
public final class UsersUserEventsParams {
    private Long limit;

    public Long getLimit() {
        return limit;
    }

    public UsersUserEventsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public UsersUserEventsParams copy() {
        UsersUserEventsParams c = new UsersUserEventsParams();
        c.limit = limit;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
    }
}
