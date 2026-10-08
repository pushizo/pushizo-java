// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.AuditEntry;
import io.herosignal.models.AuditPage;
import io.herosignal.models.MemberList;
import io.herosignal.models.Org;
/** Organizasyon, üyeler ve denetim kayıtları. */
public final class OrganizationResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public OrganizationResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Anahtarın ait olduğu organizasyon (org geneli admin anahtarı)
     *
     * <p>{@code GET /v1/organization}
     *
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Org get(RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/organization");
        return executor.execute(request, options, new TypeReference<Org>() {});
    }

    /**
     * Anahtarın ait olduğu organizasyon (org geneli admin anahtarı)
     *
     * <p>{@code GET /v1/organization}
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Org get() {
        return get(null);
    }

    /**
     * Organizasyon üyeleri (org geneli admin anahtarı)
     *
     * <p>{@code GET /v1/organization/members}
     *
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MemberList members(RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/organization/members");
        return executor.execute(request, options, new TypeReference<MemberList>() {});
    }

    /**
     * Organizasyon üyeleri (org geneli admin anahtarı)
     *
     * <p>{@code GET /v1/organization/members}
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MemberList members() {
        return members(null);
    }

    /**
     * Audit log (org geneli admin anahtarı; action/actor/app/tarih filtreleri, cursor)
     *
     * <p>{@code GET /v1/organization/audit-logs}
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public AuditPage auditLogs(OrganizationAuditLogsParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/organization/audit-logs");
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("action", params.getAction());
            request.query("actor_id", params.getActorId());
            request.query("app_id", params.getAppId());
            request.query("from", params.getFrom());
            request.query("to", params.getTo());
        }
        return executor.execute(request, options, new TypeReference<AuditPage>() {});
    }

    /**
     * Audit log (org geneli admin anahtarı; action/actor/app/tarih filtreleri, cursor)
     *
     * <p>{@code GET /v1/organization/audit-logs}
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public AuditPage auditLogs(OrganizationAuditLogsParams params) {
        return auditLogs(params, null);
    }

    /**
     * Audit log (org geneli admin anahtarı; action/actor/app/tarih filtreleri, cursor)
     *
     * <p>{@code GET /v1/organization/audit-logs}
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public AuditPage auditLogs() {
        return auditLogs(null, null);
    }

    /**
     * {@link #auditLogs} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<AuditEntry> auditLogsAutoPaging(OrganizationAuditLogsParams params, RequestOptions options) {
        final OrganizationAuditLogsParams base = params == null ? new OrganizationAuditLogsParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            AuditPage page = auditLogs(base.copy().setCursor(cursor), options);
            return new AutoPagingIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    /**
     * {@link #auditLogs} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<AuditEntry> auditLogsAutoPaging(OrganizationAuditLogsParams params) {
        return auditLogsAutoPaging(params, null);
    }
}
