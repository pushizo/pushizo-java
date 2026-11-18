// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CompaniesResource.members için isteğe bağlı sorgu parametreleri.
 */
public final class CompaniesMembersParams {
    private Long limit;

    private String cursor;

    private String role;

    public Long getLimit() {
        return limit;
    }

    public CompaniesMembersParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public CompaniesMembersParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getRole() {
        return role;
    }

    public CompaniesMembersParams role(String role) {
        this.role = role;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CompaniesMembersParams copy() {
        CompaniesMembersParams c = new CompaniesMembersParams();
        c.limit = limit;
        c.cursor = cursor;
        c.role = role;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("role", role);
    }
}
