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

    private static final TypeReference<FunnelReport> TYPE_5 = new TypeReference<FunnelReport>() {};

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
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<ProvidersReport> TYPE_6 = new TypeReference<ProvidersReport>() {};

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
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<RetentionReport> TYPE_7 = new TypeReference<RetentionReport>() {};

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
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<EngagementReport> TYPE_8 = new TypeReference<EngagementReport>() {};

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
        return client.execute(op, options, TYPE_8);
    }
}
