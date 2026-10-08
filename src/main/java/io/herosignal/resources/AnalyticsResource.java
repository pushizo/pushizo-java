// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.ConversionsReport;
import io.herosignal.models.EngagementReport;
import io.herosignal.models.EventsReport;
import io.herosignal.models.FunnelBodyDto;
import io.herosignal.models.FunnelReport;
import io.herosignal.models.MessagesReport;
import io.herosignal.models.OverviewStats;
import io.herosignal.models.ProvidersReport;
import io.herosignal.models.SubscriptionsReport;
/** Analitik raporları. */
public final class AnalyticsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public AnalyticsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Genel bakış KPI
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/overview}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public OverviewStats overview(AnalyticsOverviewParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/analytics/overview");
        request.appIdInPath();
        if (params != null) {
            request.query("range", params.getRange());
            request.query("from", params.getFrom());
            request.query("to", params.getTo());
        }
        return executor.execute(request, options, new TypeReference<OverviewStats>() {});
    }

    /**
     * Genel bakış KPI
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/overview}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public OverviewStats overview(AnalyticsOverviewParams params) {
        return overview(params, null);
    }

    /**
     * Genel bakış KPI
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/overview}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public OverviewStats overview() {
        return overview(null, null);
    }

    /**
     * Teslimat raporu
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MessagesReport messages(AnalyticsMessagesParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/analytics/messages");
        request.appIdInPath();
        if (params != null) {
            request.query("from", params.getFrom());
            request.query("to", params.getTo());
            request.query("compare", params.getCompare());
            request.query("format", params.getFormat());
            request.query("group_by", params.getGroupBy());
        }
        return executor.execute(request, options, new TypeReference<MessagesReport>() {});
    }

    /**
     * Teslimat raporu
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MessagesReport messages(AnalyticsMessagesParams params) {
        return messages(params, null);
    }

    /**
     * Teslimat raporu
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/messages}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public MessagesReport messages() {
        return messages(null, null);
    }

    /**
     * Abonelik büyümesi
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/subscriptions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SubscriptionsReport subscriptions(AnalyticsSubscriptionsParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/analytics/subscriptions");
        request.appIdInPath();
        if (params != null) {
            request.query("from", params.getFrom());
            request.query("to", params.getTo());
            request.query("compare", params.getCompare());
            request.query("format", params.getFormat());
        }
        return executor.execute(request, options, new TypeReference<SubscriptionsReport>() {});
    }

    /**
     * Abonelik büyümesi
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/subscriptions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SubscriptionsReport subscriptions(AnalyticsSubscriptionsParams params) {
        return subscriptions(params, null);
    }

    /**
     * Abonelik büyümesi
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/subscriptions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public SubscriptionsReport subscriptions() {
        return subscriptions(null, null);
    }

    /**
     * Olay hacmi
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/events}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventsReport events(AnalyticsEventsParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/analytics/events");
        request.appIdInPath();
        if (params != null) {
            request.query("from", params.getFrom());
            request.query("to", params.getTo());
            request.query("compare", params.getCompare());
            request.query("format", params.getFormat());
            request.query("name", params.getName());
            request.query("group_by", params.getGroupBy());
        }
        return executor.execute(request, options, new TypeReference<EventsReport>() {});
    }

    /**
     * Olay hacmi
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/events}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventsReport events(AnalyticsEventsParams params) {
        return events(params, null);
    }

    /**
     * Olay hacmi
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/events}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventsReport events() {
        return events(null, null);
    }

    /**
     * Dönüşüm/atribüsyon
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/conversions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ConversionsReport conversions(AnalyticsConversionsParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/analytics/conversions");
        request.appIdInPath();
        if (params != null) {
            request.query("from", params.getFrom());
            request.query("to", params.getTo());
            request.query("compare", params.getCompare());
            request.query("format", params.getFormat());
            request.query("campaign_id", params.getCampaignId());
        }
        return executor.execute(request, options, new TypeReference<ConversionsReport>() {});
    }

    /**
     * Dönüşüm/atribüsyon
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/conversions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ConversionsReport conversions(AnalyticsConversionsParams params) {
        return conversions(params, null);
    }

    /**
     * Dönüşüm/atribüsyon
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/conversions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ConversionsReport conversions() {
        return conversions(null, null);
    }

    /**
     * Funnel
     *
     * <p>{@code POST /v1/apps/{appId}/analytics/funnels}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public FunnelReport funnel(FunnelBodyDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/analytics/funnels");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<FunnelReport>() {});
    }

    /**
     * Funnel
     *
     * <p>{@code POST /v1/apps/{appId}/analytics/funnels}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public FunnelReport funnel(FunnelBodyDto body) {
        return funnel(body, null);
    }

    /**
     * Sağlayıcı sağlığı
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/providers}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ProvidersReport providers(AnalyticsProvidersParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/analytics/providers");
        request.appIdInPath();
        if (params != null) {
            request.query("from", params.getFrom());
            request.query("to", params.getTo());
            request.query("compare", params.getCompare());
            request.query("format", params.getFormat());
        }
        return executor.execute(request, options, new TypeReference<ProvidersReport>() {});
    }

    /**
     * Sağlayıcı sağlığı
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/providers}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ProvidersReport providers(AnalyticsProvidersParams params) {
        return providers(params, null);
    }

    /**
     * Sağlayıcı sağlığı
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/providers}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ProvidersReport providers() {
        return providers(null, null);
    }

    /**
     * Etkileşim ısı haritası
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/engagement}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EngagementReport engagement(AnalyticsEngagementParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/analytics/engagement");
        request.appIdInPath();
        if (params != null) {
            request.query("from", params.getFrom());
            request.query("to", params.getTo());
            request.query("compare", params.getCompare());
            request.query("format", params.getFormat());
        }
        return executor.execute(request, options, new TypeReference<EngagementReport>() {});
    }

    /**
     * Etkileşim ısı haritası
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/engagement}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EngagementReport engagement(AnalyticsEngagementParams params) {
        return engagement(params, null);
    }

    /**
     * Etkileşim ısı haritası
     *
     * <p>{@code GET /v1/apps/{appId}/analytics/engagement}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EngagementReport engagement() {
        return engagement(null, null);
    }
}
