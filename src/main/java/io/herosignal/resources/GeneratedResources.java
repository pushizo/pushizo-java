// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import io.herosignal.core.ApiExecutor;

/** İstemciye OpenAPI'den üretilen kaynak erişimcilerini ekleyen temel sınıf. */
public abstract class GeneratedResources {
    /** SDK'nın üretildiği OpenAPI sözleşmesinin sürümü. */
    public static final String API_VERSION = "0.1.0";
    private final NotificationsResource notifications;
    private final UsersResource users;
    private final AliasesResource aliases;
    private final SubscriptionsResource subscriptions;
    private final EventsResource events;
    private final SegmentsResource segments;
    private final TemplatesResource templates;
    private final CampaignsResource campaigns;
    private final SuppressionsResource suppressions;
    private final ExportsResource exports;
    private final ImportsResource imports;
    private final WebhooksResource webhooks;
    private final ChannelsResource channels;
    private final AnalyticsResource analytics;
    private final AppsResource apps;
    private final OrganizationResource organization;
    private final ApiKeysResource apiKeys;
    private final InAppMessagesResource inAppMessages;

    /**
     * Kaynakları oluşturur.
     *
     * @param executor istekleri gönderen yürütücü
     */
    protected GeneratedResources(ApiExecutor executor) {
        this.notifications = new NotificationsResource(executor);
        this.users = new UsersResource(executor);
        this.aliases = new AliasesResource(executor);
        this.subscriptions = new SubscriptionsResource(executor);
        this.events = new EventsResource(executor);
        this.segments = new SegmentsResource(executor);
        this.templates = new TemplatesResource(executor);
        this.campaigns = new CampaignsResource(executor);
        this.suppressions = new SuppressionsResource(executor);
        this.exports = new ExportsResource(executor);
        this.imports = new ImportsResource(executor);
        this.webhooks = new WebhooksResource(executor);
        this.channels = new ChannelsResource(executor);
        this.analytics = new AnalyticsResource(executor);
        this.apps = new AppsResource(executor);
        this.organization = new OrganizationResource(executor);
        this.apiKeys = new ApiKeysResource(executor);
        this.inAppMessages = new InAppMessagesResource(executor);
    }

    /** @return Bildirim gönderme, durum, iptal, teslimatlar ve geçmiş dışa aktarımı. */
    public NotificationsResource notifications() {
        return notifications;
    }

    /** @return Kullanıcı oluşturma/güncelleme (tag, özellik), arama ve abonelik ekleme. */
    public UsersResource users() {
        return users;
    }

    /** @return Kullanıcı kimlikleri (alias): ekleme ve kaldırma. */
    public AliasesResource aliases() {
        return aliases;
    }

    /** @return Abonelik (cihaz/e-posta/SMS) okuma, güncelleme, silme ve sahip atama. */
    public SubscriptionsResource subscriptions() {
        return subscriptions;
    }

    /** @return Özel olay gönderimi ve olay tanımları. */
    public EventsResource events() {
        return events;
    }

    /** @return Segment yönetimi, önizleme ve kitle tahmini. */
    public SegmentsResource segments() {
        return segments;
    }

    /** @return Şablon yönetimi, sürümler ve önizleme. */
    public TemplatesResource templates() {
        return templates;
    }

    /** @return Kampanya yaşam döngüsü (zamanlama, gönderim, duraklatma, onay) ve istatistikler. */
    public CampaignsResource campaigns() {
        return campaigns;
    }

    /** @return E-posta/SMS gönderim engeli (suppression) listesi. */
    public SuppressionsResource suppressions() {
        return suppressions;
    }

    /** @return Veri dışa aktarma işleri. */
    public ExportsResource exports() {
        return exports;
    }

    /** @return Veri içe aktarma işleri (CSV, multipart). */
    public ImportsResource imports() {
        return imports;
    }

    /** @return Giden webhook uç noktaları, teslimatlar ve yeniden gönderim. */
    public WebhooksResource webhooks() {
        return webhooks;
    }

    /** @return Kanal (APNs, FCM, Web Push, e-posta, SMS) yapılandırması ve doğrulaması. */
    public ChannelsResource channels() {
        return channels;
    }

    /** @return Analitik raporları. */
    public AnalyticsResource analytics() {
        return analytics;
    }

    /** @return App listesi ve ayarları. */
    public AppsResource apps() {
        return apps;
    }

    /** @return Organizasyon, üyeler ve denetim kayıtları. */
    public OrganizationResource organization() {
        return organization;
    }

    /** @return apiKeys kaynağı. */
    public ApiKeysResource apiKeys() {
        return apiKeys;
    }

    /** @return inAppMessages kaynağı. */
    public InAppMessagesResource inAppMessages() {
        return inAppMessages;
    }
}
