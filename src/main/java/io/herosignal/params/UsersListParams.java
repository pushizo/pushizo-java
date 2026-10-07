// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * UsersResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class UsersListParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "last_active_at", "-last_active_at".
     */
    private String sort;

    private String q;

    private String tag;

    private String lastActiveAfter;

    private String lastActiveBefore;

    public Long getLimit() {
        return limit;
    }

    public UsersListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public UsersListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getSort() {
        return sort;
    }

    public UsersListParams sort(String sort) {
        this.sort = sort;
        return this;
    }

    public String getQ() {
        return q;
    }

    public UsersListParams q(String q) {
        this.q = q;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public UsersListParams tag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getLastActiveAfter() {
        return lastActiveAfter;
    }

    public UsersListParams lastActiveAfter(String lastActiveAfter) {
        this.lastActiveAfter = lastActiveAfter;
        return this;
    }

    public String getLastActiveBefore() {
        return lastActiveBefore;
    }

    public UsersListParams lastActiveBefore(String lastActiveBefore) {
        this.lastActiveBefore = lastActiveBefore;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public UsersListParams copy() {
        UsersListParams c = new UsersListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.sort = sort;
        c.q = q;
        c.tag = tag;
        c.lastActiveAfter = lastActiveAfter;
        c.lastActiveBefore = lastActiveBefore;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("sort", sort);
        op.query("q", q);
        op.query("tag", tag);
        op.query("last_active_after", lastActiveAfter);
        op.query("last_active_before", lastActiveBefore);
    }
}
