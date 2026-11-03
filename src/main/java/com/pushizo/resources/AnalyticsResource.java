// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import com.pushizo.Pushizo;
import com.pushizo.RequestOptions;
import com.pushizo.core.Operation;
import com.pushizo.core.PageIterable;
import com.pushizo.models.*;
import com.pushizo.params.*;

/**
 * Analitik raporları.
 */
public final class AnalyticsResource {
    private final Pushizo client;

    public AnalyticsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<OverviewStats> TYPE_0 = new TypeReference<OverviewStats>() {};

    /**
     * Genel bakış KPI
     *
     * {@code GET /v1/apps/{appId}/analytics/overview}
     */
    public OverviewStats overview() {
        return overview(null, null);
    }

    /**
     * Genel bakış KPI
     *
     * {@code GET /v1/apps/{appId}/analytics/overview}
     */
    public OverviewStats overview(AnalyticsOverviewParams params) {
        return overview(params, null);
    }

    /**
     * Genel bakış KPI
     *
     * {@code GET /v1/apps/{appId}/analytics/overview}
     *
     * Parametreler: range — Değerler: "7d", "30d".
     */
    public OverviewStats overview(AnalyticsOverviewParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/overview");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<MessagesReport> TYPE_1 = new TypeReference<MessagesReport>() {};

    /**
     * Teslimat raporu
     *
     * {@code GET /v1/apps/{appId}/analytics/messages}
     */
    public MessagesReport messages() {
        return messages(null, null);
    }

    /**
     * Teslimat raporu
     *
     * {@code GET /v1/apps/{appId}/analytics/messages}
     */
    public MessagesReport messages(AnalyticsMessagesParams params) {
        return messages(params, null);
    }

    /**
     * Teslimat raporu
     *
     * {@code GET /v1/apps/{appId}/analytics/messages}
     *
     * Parametreler: compare — Değerler: "true", "false".; format — Değerler: "json", "csv".; group_by — Değerler: "day", "channel", "campaign".
     */
    public MessagesReport messages(AnalyticsMessagesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/messages");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<SubscriptionsReport> TYPE_2 = new TypeReference<SubscriptionsReport>() {};

    /**
     * Abonelik büyümesi
     *
     * {@code GET /v1/apps/{appId}/analytics/subscriptions}
     */
    public SubscriptionsReport subscriptions() {
        return subscriptions(null, null);
    }

    /**
     * Abonelik büyümesi
     *
     * {@code GET /v1/apps/{appId}/analytics/subscriptions}
     */
    public SubscriptionsReport subscriptions(AnalyticsSubscriptionsParams params) {
        return subscriptions(params, null);
    }

    /**
     * Abonelik büyümesi
     *
     * {@code GET /v1/apps/{appId}/analytics/subscriptions}
     *
     * Parametreler: compare — Değerler: "true", "false".; format — Değerler: "json", "csv".
     */
    public SubscriptionsReport subscriptions(AnalyticsSubscriptionsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/subscriptions");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<EventsReport> TYPE_3 = new TypeReference<EventsReport>() {};

    /**
     * Olay hacmi
     *
     * {@code GET /v1/apps/{appId}/analytics/events}
     */
    public EventsReport events() {
        return events(null, null);
    }

    /**
     * Olay hacmi
     *
     * {@code GET /v1/apps/{appId}/analytics/events}
     */
    public EventsReport events(AnalyticsEventsParams params) {
        return events(params, null);
    }

    /**
     * Olay hacmi
     *
     * {@code GET /v1/apps/{appId}/analytics/events}
     *
     * Parametreler: compare — Değerler: "true", "false".; format — Değerler: "json", "csv".; group_by — Değerler: "day", "name".
     */
    public EventsReport events(AnalyticsEventsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/events");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<ConversionsReport> TYPE_4 = new TypeReference<ConversionsReport>() {};

    /**
     * Dönüşüm/atribüsyon
     *
     * {@code GET /v1/apps/{appId}/analytics/conversions}
     */
    public ConversionsReport conversions() {
        return conversions(null, null);
    }

    /**
     * Dönüşüm/atribüsyon
     *
     * {@code GET /v1/apps/{appId}/analytics/conversions}
     */
    public ConversionsReport conversions(AnalyticsConversionsParams params) {
        return conversions(params, null);
    }

    /**
     * Dönüşüm/atribüsyon
     *
     * {@code GET /v1/apps/{appId}/analytics/conversions}
     *
     * Parametreler: compare — Değerler: "true", "false".; format — Değerler: "json", "csv".
     */
    public ConversionsReport conversions(AnalyticsConversionsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/conversions");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<ReportResult> TYPE_5 = new TypeReference<ReportResult>() {};

    /**
     * Rapor çalıştır
     *
     * {@code POST /v1/apps/{appId}/analytics/reports/run}
     *
     * Kaynak, metrik, boyut ve filtre seçilerek rapor üretir; alanlar izinli listeyle sınırlıdır.
     */
    public ReportResult runReport(ReportRunBodyDto body) {
        return runReport(body, null);
    }

    /**
     * Rapor çalıştır
     *
     * {@code POST /v1/apps/{appId}/analytics/reports/run}
     *
     * Kaynak, metrik, boyut ve filtre seçilerek rapor üretir; alanlar izinli listeyle sınırlıdır.
     */
    public ReportResult runReport(ReportRunBodyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/analytics/reports/run");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<PathReport> TYPE_6 = new TypeReference<PathReport>() {};

    /**
     * Yol analizi
     *
     * {@code POST /v1/apps/{appId}/analytics/paths}
     *
     * Başlangıç olayından sonra veya önce kullanıcıların izlediği yollar.
     */
    public PathReport paths(PathBodyDto body) {
        return paths(body, null);
    }

    /**
     * Yol analizi
     *
     * {@code POST /v1/apps/{appId}/analytics/paths}
     *
     * Başlangıç olayından sonra veya önce kullanıcıların izlediği yollar.
     */
    public PathReport paths(PathBodyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/analytics/paths");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<FunnelReport> TYPE_7 = new TypeReference<FunnelReport>() {};

    /**
     * Funnel
     *
     * {@code POST /v1/apps/{appId}/analytics/funnels}
     */
    public FunnelReport funnel(FunnelBodyDto body) {
        return funnel(body, null);
    }

    /**
     * Funnel
     *
     * {@code POST /v1/apps/{appId}/analytics/funnels}
     */
    public FunnelReport funnel(FunnelBodyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/analytics/funnels");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<ProvidersReport> TYPE_8 = new TypeReference<ProvidersReport>() {};

    /**
     * Sağlayıcı sağlığı
     *
     * {@code GET /v1/apps/{appId}/analytics/providers}
     */
    public ProvidersReport providers() {
        return providers(null, null);
    }

    /**
     * Sağlayıcı sağlığı
     *
     * {@code GET /v1/apps/{appId}/analytics/providers}
     */
    public ProvidersReport providers(AnalyticsProvidersParams params) {
        return providers(params, null);
    }

    /**
     * Sağlayıcı sağlığı
     *
     * {@code GET /v1/apps/{appId}/analytics/providers}
     *
     * Parametreler: compare — Değerler: "true", "false".; format — Değerler: "json", "csv".
     */
    public ProvidersReport providers(AnalyticsProvidersParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/providers");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<RetentionReport> TYPE_9 = new TypeReference<RetentionReport>() {};

    /**
     * Retention kohortu
     *
     * {@code GET /v1/apps/{appId}/analytics/retention}
     */
    public RetentionReport retention() {
        return retention(null, null);
    }

    /**
     * Retention kohortu
     *
     * {@code GET /v1/apps/{appId}/analytics/retention}
     */
    public RetentionReport retention(AnalyticsRetentionParams params) {
        return retention(params, null);
    }

    /**
     * Retention kohortu
     *
     * {@code GET /v1/apps/{appId}/analytics/retention}
     *
     * Parametreler: format — Değerler: "json", "csv".
     */
    public RetentionReport retention(AnalyticsRetentionParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/retention");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<EngagementReport> TYPE_10 = new TypeReference<EngagementReport>() {};

    /**
     * Etkileşim ısı haritası
     *
     * {@code GET /v1/apps/{appId}/analytics/engagement}
     */
    public EngagementReport engagement() {
        return engagement(null, null);
    }

    /**
     * Etkileşim ısı haritası
     *
     * {@code GET /v1/apps/{appId}/analytics/engagement}
     */
    public EngagementReport engagement(AnalyticsEngagementParams params) {
        return engagement(params, null);
    }

    /**
     * Etkileşim ısı haritası
     *
     * {@code GET /v1/apps/{appId}/analytics/engagement}
     *
     * Parametreler: compare — Değerler: "true", "false".; format — Değerler: "json", "csv".
     */
    public EngagementReport engagement(AnalyticsEngagementParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/engagement");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_10);
    }

    private static final TypeReference<SavedReportList> TYPE_11 = new TypeReference<SavedReportList>() {};

    /**
     * Kaydedilmiş raporlar
     *
     * {@code GET /v1/apps/{appId}/analytics/reports}
     */
    public SavedReportList list() {
        return list(null);
    }

    /**
     * Kaydedilmiş raporlar
     *
     * {@code GET /v1/apps/{appId}/analytics/reports}
     */
    public SavedReportList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/reports");
        return client.execute(op, options, TYPE_11);
    }

    private static final TypeReference<SavedReport> TYPE_12 = new TypeReference<SavedReport>() {};

    /**
     * Raporu kaydet
     *
     * {@code POST /v1/apps/{appId}/analytics/reports}
     */
    public SavedReport create(CreateSavedReportDto body) {
        return create(body, null);
    }

    /**
     * Raporu kaydet
     *
     * {@code POST /v1/apps/{appId}/analytics/reports}
     */
    public SavedReport create(CreateSavedReportDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/analytics/reports");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_12);
    }

    private static final TypeReference<SavedReport> TYPE_13 = new TypeReference<SavedReport>() {};

    /**
     * Kaydedilmiş rapor
     *
     * {@code GET /v1/apps/{appId}/analytics/reports/{id}}
     */
    public SavedReport get(String id) {
        return get(id, null);
    }

    /**
     * Kaydedilmiş rapor
     *
     * {@code GET /v1/apps/{appId}/analytics/reports/{id}}
     */
    public SavedReport get(String id, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/analytics/reports/{id}");
        op.pathParam("id", id);
        return client.execute(op, options, TYPE_13);
    }

    private static final TypeReference<SavedReport> TYPE_14 = new TypeReference<SavedReport>() {};

    /**
     * Raporu güncelle
     *
     * {@code PATCH /v1/apps/{appId}/analytics/reports/{id}}
     */
    public SavedReport update(String id, UpdateSavedReportDto body) {
        return update(id, body, null);
    }

    /**
     * Raporu güncelle
     *
     * {@code PATCH /v1/apps/{appId}/analytics/reports/{id}}
     */
    public SavedReport update(String id, UpdateSavedReportDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/analytics/reports/{id}");
        op.pathParam("id", id);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_14);
    }

    /**
     * Raporu sil
     *
     * {@code DELETE /v1/apps/{appId}/analytics/reports/{id}}
     */
    public void delete(String id) {
        delete(id, null);
    }

    /**
     * Raporu sil
     *
     * {@code DELETE /v1/apps/{appId}/analytics/reports/{id}}
     */
    public void delete(String id, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/analytics/reports/{id}");
        op.pathParam("id", id);
        client.execute(op, options, null);
    }
}
