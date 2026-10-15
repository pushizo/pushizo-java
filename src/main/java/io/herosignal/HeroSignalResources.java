// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal;

import io.herosignal.resources.*;

/** İstemciye kaynak erişimcilerini ekleyen üretilmiş taban sınıf. */
public abstract class HeroSignalResources {
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
    private final InAppMessagesResource inAppMessages;
    private final InboxResource inbox;
    private final SuppressionsResource suppressions;
    private final ExportsResource exports;
    private final ImportsResource imports;
    private final WebhooksResource webhooks;
    private final ChannelsResource channels;
    private final AnalyticsResource analytics;
    private final AppsResource apps;
    private final ApiKeysResource apiKeys;
    private final OrganizationResource organization;
    private final CategoriesResource categories;
    private final IdentityKeysResource identityKeys;
    private final JourneysResource journeys;
    private final PreferencesResource preferences;

    protected HeroSignalResources() {
        this.notifications = new NotificationsResource((HeroSignal) this);
        this.users = new UsersResource((HeroSignal) this);
        this.aliases = new AliasesResource((HeroSignal) this);
        this.subscriptions = new SubscriptionsResource((HeroSignal) this);
        this.events = new EventsResource((HeroSignal) this);
        this.segments = new SegmentsResource((HeroSignal) this);
        this.templates = new TemplatesResource((HeroSignal) this);
        this.campaigns = new CampaignsResource((HeroSignal) this);
        this.inAppMessages = new InAppMessagesResource((HeroSignal) this);
        this.inbox = new InboxResource((HeroSignal) this);
        this.suppressions = new SuppressionsResource((HeroSignal) this);
        this.exports = new ExportsResource((HeroSignal) this);
        this.imports = new ImportsResource((HeroSignal) this);
        this.webhooks = new WebhooksResource((HeroSignal) this);
        this.channels = new ChannelsResource((HeroSignal) this);
        this.analytics = new AnalyticsResource((HeroSignal) this);
        this.apps = new AppsResource((HeroSignal) this);
        this.apiKeys = new ApiKeysResource((HeroSignal) this);
        this.organization = new OrganizationResource((HeroSignal) this);
        this.categories = new CategoriesResource((HeroSignal) this);
        this.identityKeys = new IdentityKeysResource((HeroSignal) this);
        this.journeys = new JourneysResource((HeroSignal) this);
        this.preferences = new PreferencesResource((HeroSignal) this);
    }

    /**
     * Bildirim gönderme, durum, iptal, teslimatlar ve geçmiş dışa aktarımı.
     */
    public NotificationsResource notifications() {
        return notifications;
    }

    /**
     * Kullanıcı oluşturma/güncelleme (tag, özellik), arama ve abonelik ekleme.
     */
    public UsersResource users() {
        return users;
    }

    /**
     * Kullanıcı kimlikleri (alias): ekleme ve kaldırma.
     */
    public AliasesResource aliases() {
        return aliases;
    }

    /**
     * Abonelik (cihaz/e-posta/SMS) okuma, güncelleme, silme ve sahip atama.
     */
    public SubscriptionsResource subscriptions() {
        return subscriptions;
    }

    /**
     * Özel olay gönderimi ve olay tanımları.
     */
    public EventsResource events() {
        return events;
    }

    /**
     * Segment yönetimi, önizleme ve kitle tahmini.
     */
    public SegmentsResource segments() {
        return segments;
    }

    /**
     * Şablon yönetimi, sürümler ve önizleme.
     */
    public TemplatesResource templates() {
        return templates;
    }

    /**
     * Kampanya yaşam döngüsü (zamanlama, gönderim, duraklatma, onay) ve istatistikler.
     */
    public CampaignsResource campaigns() {
        return campaigns;
    }

    /**
     * Uygulama içi (in-app) mesaj yönetimi ve durum değişiklikleri.
     */
    public InAppMessagesResource inAppMessages() {
        return inAppMessages;
    }

    /**
     * Kullanıcı bildirim kutusu (inbox): listeleme, okundu işaretleme ve arşivleme.
     */
    public InboxResource inbox() {
        return inbox;
    }

    /**
     * E-posta/SMS gönderim engeli (suppression) listesi.
     */
    public SuppressionsResource suppressions() {
        return suppressions;
    }

    /**
     * Veri dışa aktarma işleri.
     */
    public ExportsResource exports() {
        return exports;
    }

    /**
     * Veri içe aktarma işleri (CSV, multipart).
     */
    public ImportsResource imports() {
        return imports;
    }

    /**
     * Giden webhook uç noktaları, teslimatlar ve yeniden gönderim.
     */
    public WebhooksResource webhooks() {
        return webhooks;
    }

    /**
     * Kanal (APNs, FCM, Web Push, e-posta, SMS) yapılandırması ve doğrulaması.
     */
    public ChannelsResource channels() {
        return channels;
    }

    /**
     * Analitik raporları.
     */
    public AnalyticsResource analytics() {
        return analytics;
    }

    /**
     * App listesi ve ayarları.
     */
    public AppsResource apps() {
        return apps;
    }

    /**
     * App API anahtarları: oluşturma, kapsam/IP izin listesi güncelleme, rotasyon ve iptal.
     */
    public ApiKeysResource apiKeys() {
        return apiKeys;
    }

    /**
     * Organizasyon, üyeler ve denetim kayıtları.
     */
    public OrganizationResource organization() {
        return organization;
    }

    /**
     * categories
     */
    public CategoriesResource categories() {
        return categories;
    }

    /**
     * identityKeys
     */
    public IdentityKeysResource identityKeys() {
        return identityKeys;
    }

    /**
     * journeys
     */
    public JourneysResource journeys() {
        return journeys;
    }

    /**
     * preferences
     */
    public PreferencesResource preferences() {
        return preferences;
    }
}
