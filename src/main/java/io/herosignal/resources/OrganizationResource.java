// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.HeroSignal;
import io.herosignal.RequestOptions;
import io.herosignal.core.Operation;
import io.herosignal.core.PageIterable;
import io.herosignal.models.*;
import io.herosignal.params.*;

/**
 * Organizasyon, üyeler ve denetim kayıtları.
 */
public final class OrganizationResource {
    private final HeroSignal client;

    public OrganizationResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<Org> TYPE_0 = new TypeReference<Org>() {};

    /**
     * Anahtarın ait olduğu organizasyon (org geneli admin anahtarı)
     *
     * {@code GET /v1/organization}
     */
    public Org get() {
        return get(null);
    }

    /**
     * Anahtarın ait olduğu organizasyon (org geneli admin anahtarı)
     *
     * {@code GET /v1/organization}
     */
    public Org get(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/organization");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<MemberList> TYPE_1 = new TypeReference<MemberList>() {};

    /**
     * Organizasyon üyeleri (org geneli admin anahtarı)
     *
     * {@code GET /v1/organization/members}
     */
    public MemberList members() {
        return members(null);
    }

    /**
     * Organizasyon üyeleri (org geneli admin anahtarı)
     *
     * {@code GET /v1/organization/members}
     */
    public MemberList members(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/organization/members");
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<AuditPage> TYPE_2 = new TypeReference<AuditPage>() {};

    /**
     * Audit log (org geneli admin anahtarı; action/actor/app/tarih filtreleri, cursor)
     *
     * {@code GET /v1/organization/audit-logs}
     */
    public AuditPage auditLogs() {
        return auditLogs(null, null);
    }

    /**
     * Audit log (org geneli admin anahtarı; action/actor/app/tarih filtreleri, cursor)
     *
     * {@code GET /v1/organization/audit-logs}
     */
    public AuditPage auditLogs(OrganizationAuditLogsParams params) {
        return auditLogs(params, null);
    }

    /**
     * Audit log (org geneli admin anahtarı; action/actor/app/tarih filtreleri, cursor)
     *
     * {@code GET /v1/organization/audit-logs}
     */
    public AuditPage auditLogs(OrganizationAuditLogsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/organization/audit-logs");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_2);
    }

    /**
     * auditLogs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<AuditEntry> auditLogsAll() {
        return auditLogsAll(null, null);
    }

    /**
     * auditLogs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<AuditEntry> auditLogsAll(OrganizationAuditLogsParams params) {
        return auditLogsAll(params, null);
    }

    /**
     * auditLogs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<AuditEntry> auditLogsAll(OrganizationAuditLogsParams params, RequestOptions options) {
        OrganizationAuditLogsParams base = params == null ? new OrganizationAuditLogsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            OrganizationAuditLogsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            AuditPage page = auditLogs(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<UsageReport> TYPE_3 = new TypeReference<UsageReport>() {};

    /**
     * Organizasyon kullanımı ve plan kotaları (org geneli anahtar)
     *
     * {@code GET /v1/organization/usage}
     */
    public UsageReport usage() {
        return usage(null, null);
    }

    /**
     * Organizasyon kullanımı ve plan kotaları (org geneli anahtar)
     *
     * {@code GET /v1/organization/usage}
     */
    public UsageReport usage(OrganizationUsageParams params) {
        return usage(params, null);
    }

    /**
     * Organizasyon kullanımı ve plan kotaları (org geneli anahtar)
     *
     * {@code GET /v1/organization/usage}
     */
    public UsageReport usage(OrganizationUsageParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/organization/usage");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_3);
    }
}
