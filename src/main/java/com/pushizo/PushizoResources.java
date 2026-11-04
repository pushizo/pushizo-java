// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo;

import com.pushizo.resources.*;

/** İstemciye kaynak erişimcilerini ekleyen üretilmiş taban sınıf. */
public abstract class PushizoResources {
    /** SDK'nın üretildiği OpenAPI sözleşmesinin sürümü. */
    public static final String API_VERSION = "1.0.0";

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
    private final AdsResource ads;
    private final CannedResponsesResource cannedResponses;
    private final CatalogsResource catalogs;
    private final CategoriesResource categories;
    private final ChannelScoresResource channelScores;
    private final ContentTablesResource contentTables;
    private final ConversationsResource conversations;
    private final DataFeedsResource dataFeeds;
    private final EmailDeliverabilityResource emailDeliverability;
    private final FeatureFlagsResource featureFlags;
    private final FormsResource forms;
    private final GeofencesResource geofences;
    private final GlobalControlResource globalControl;
    private final IdentityKeysResource identityKeys;
    private final IntegrationsResource integrations;
    private final JourneysResource journeys;
    private final LandingPagesResource landingPages;
    private final LiveActivitiesResource liveActivities;
    private final McpResource mcp;
    private final PredictionsResource predictions;
    private final PreferencesResource preferences;
    private final PromoCodeListsResource promoCodeLists;
    private final ReverseEtlResource reverseEtl;
    private final RfmResource rfm;
    private final SmsKeywordsResource smsKeywords;
    private final SurveysResource surveys;
    private final VerifyResource verify;
    private final WalletResource wallet;
    private final WarehouseExportsResource warehouseExports;
    private final WebCampaignsResource webCampaigns;
    private final WhatsappResource whatsapp;

    protected PushizoResources() {
        this.notifications = new NotificationsResource((Pushizo) this);
        this.users = new UsersResource((Pushizo) this);
        this.aliases = new AliasesResource((Pushizo) this);
        this.subscriptions = new SubscriptionsResource((Pushizo) this);
        this.events = new EventsResource((Pushizo) this);
        this.segments = new SegmentsResource((Pushizo) this);
        this.templates = new TemplatesResource((Pushizo) this);
        this.campaigns = new CampaignsResource((Pushizo) this);
        this.inAppMessages = new InAppMessagesResource((Pushizo) this);
        this.inbox = new InboxResource((Pushizo) this);
        this.suppressions = new SuppressionsResource((Pushizo) this);
        this.exports = new ExportsResource((Pushizo) this);
        this.imports = new ImportsResource((Pushizo) this);
        this.webhooks = new WebhooksResource((Pushizo) this);
        this.channels = new ChannelsResource((Pushizo) this);
        this.analytics = new AnalyticsResource((Pushizo) this);
        this.apps = new AppsResource((Pushizo) this);
        this.apiKeys = new ApiKeysResource((Pushizo) this);
        this.organization = new OrganizationResource((Pushizo) this);
        this.ads = new AdsResource((Pushizo) this);
        this.cannedResponses = new CannedResponsesResource((Pushizo) this);
        this.catalogs = new CatalogsResource((Pushizo) this);
        this.categories = new CategoriesResource((Pushizo) this);
        this.channelScores = new ChannelScoresResource((Pushizo) this);
        this.contentTables = new ContentTablesResource((Pushizo) this);
        this.conversations = new ConversationsResource((Pushizo) this);
        this.dataFeeds = new DataFeedsResource((Pushizo) this);
        this.emailDeliverability = new EmailDeliverabilityResource((Pushizo) this);
        this.featureFlags = new FeatureFlagsResource((Pushizo) this);
        this.forms = new FormsResource((Pushizo) this);
        this.geofences = new GeofencesResource((Pushizo) this);
        this.globalControl = new GlobalControlResource((Pushizo) this);
        this.identityKeys = new IdentityKeysResource((Pushizo) this);
        this.integrations = new IntegrationsResource((Pushizo) this);
        this.journeys = new JourneysResource((Pushizo) this);
        this.landingPages = new LandingPagesResource((Pushizo) this);
        this.liveActivities = new LiveActivitiesResource((Pushizo) this);
        this.mcp = new McpResource((Pushizo) this);
        this.predictions = new PredictionsResource((Pushizo) this);
        this.preferences = new PreferencesResource((Pushizo) this);
        this.promoCodeLists = new PromoCodeListsResource((Pushizo) this);
        this.reverseEtl = new ReverseEtlResource((Pushizo) this);
        this.rfm = new RfmResource((Pushizo) this);
        this.smsKeywords = new SmsKeywordsResource((Pushizo) this);
        this.surveys = new SurveysResource((Pushizo) this);
        this.verify = new VerifyResource((Pushizo) this);
        this.wallet = new WalletResource((Pushizo) this);
        this.warehouseExports = new WarehouseExportsResource((Pushizo) this);
        this.webCampaigns = new WebCampaignsResource((Pushizo) this);
        this.whatsapp = new WhatsappResource((Pushizo) this);
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
     * ads
     */
    public AdsResource ads() {
        return ads;
    }

    /**
     * cannedResponses
     */
    public CannedResponsesResource cannedResponses() {
        return cannedResponses;
    }

    /**
     * catalogs
     */
    public CatalogsResource catalogs() {
        return catalogs;
    }

    /**
     * categories
     */
    public CategoriesResource categories() {
        return categories;
    }

    /**
     * channelScores
     */
    public ChannelScoresResource channelScores() {
        return channelScores;
    }

    /**
     * contentTables
     */
    public ContentTablesResource contentTables() {
        return contentTables;
    }

    /**
     * conversations
     */
    public ConversationsResource conversations() {
        return conversations;
    }

    /**
     * dataFeeds
     */
    public DataFeedsResource dataFeeds() {
        return dataFeeds;
    }

    /**
     * emailDeliverability
     */
    public EmailDeliverabilityResource emailDeliverability() {
        return emailDeliverability;
    }

    /**
     * featureFlags
     */
    public FeatureFlagsResource featureFlags() {
        return featureFlags;
    }

    /**
     * forms
     */
    public FormsResource forms() {
        return forms;
    }

    /**
     * geofences
     */
    public GeofencesResource geofences() {
        return geofences;
    }

    /**
     * globalControl
     */
    public GlobalControlResource globalControl() {
        return globalControl;
    }

    /**
     * identityKeys
     */
    public IdentityKeysResource identityKeys() {
        return identityKeys;
    }

    /**
     * integrations
     */
    public IntegrationsResource integrations() {
        return integrations;
    }

    /**
     * journeys
     */
    public JourneysResource journeys() {
        return journeys;
    }

    /**
     * landingPages
     */
    public LandingPagesResource landingPages() {
        return landingPages;
    }

    /**
     * liveActivities
     */
    public LiveActivitiesResource liveActivities() {
        return liveActivities;
    }

    /**
     * mcp
     */
    public McpResource mcp() {
        return mcp;
    }

    /**
     * predictions
     */
    public PredictionsResource predictions() {
        return predictions;
    }

    /**
     * preferences
     */
    public PreferencesResource preferences() {
        return preferences;
    }

    /**
     * promoCodeLists
     */
    public PromoCodeListsResource promoCodeLists() {
        return promoCodeLists;
    }

    /**
     * reverseEtl
     */
    public ReverseEtlResource reverseEtl() {
        return reverseEtl;
    }

    /**
     * rfm
     */
    public RfmResource rfm() {
        return rfm;
    }

    /**
     * smsKeywords
     */
    public SmsKeywordsResource smsKeywords() {
        return smsKeywords;
    }

    /**
     * surveys
     */
    public SurveysResource surveys() {
        return surveys;
    }

    /**
     * verify
     */
    public VerifyResource verify() {
        return verify;
    }

    /**
     * wallet
     */
    public WalletResource wallet() {
        return wallet;
    }

    /**
     * warehouseExports
     */
    public WarehouseExportsResource warehouseExports() {
        return warehouseExports;
    }

    /**
     * webCampaigns
     */
    public WebCampaignsResource webCampaigns() {
        return webCampaigns;
    }

    /**
     * whatsapp
     */
    public WhatsappResource whatsapp() {
        return whatsapp;
    }
}
