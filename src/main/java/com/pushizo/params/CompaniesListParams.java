// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CompaniesResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class CompaniesListParams {
    private Long limit;

    private String cursor;

    private String q;

    private String externalId;

    private String domain;

    public Long getLimit() {
        return limit;
    }

    public CompaniesListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public CompaniesListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getQ() {
        return q;
    }

    public CompaniesListParams q(String q) {
        this.q = q;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public CompaniesListParams externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public CompaniesListParams domain(String domain) {
        this.domain = domain;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CompaniesListParams copy() {
        CompaniesListParams c = new CompaniesListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.q = q;
        c.externalId = externalId;
        c.domain = domain;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("q", q);
        op.query("external_id", externalId);
        op.query("domain", domain);
    }
}
