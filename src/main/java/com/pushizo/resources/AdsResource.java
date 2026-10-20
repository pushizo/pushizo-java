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
 * ads kaynağı.
 */
public final class AdsResource {
    private final Pushizo client;

    public AdsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<AdAccountList> TYPE_0 = new TypeReference<AdAccountList>() {};

    /**
     * Bağlı reklam hesapları
     *
     * {@code GET /v1/apps/{appId}/ads/accounts}
     */
    public AdAccountList listAccounts() {
        return listAccounts(null);
    }

    /**
     * Bağlı reklam hesapları
     *
     * {@code GET /v1/apps/{appId}/ads/accounts}
     */
    public AdAccountList listAccounts(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/accounts");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<AdAudienceList> TYPE_1 = new TypeReference<AdAudienceList>() {};

    /**
     * Reklam kitleleri
     *
     * {@code GET /v1/apps/{appId}/ads/audiences}
     */
    public AdAudienceList listAudiences() {
        return listAudiences(null, null);
    }

    /**
     * Reklam kitleleri
     *
     * {@code GET /v1/apps/{appId}/ads/audiences}
     */
    public AdAudienceList listAudiences(AdsListAudiencesParams params) {
        return listAudiences(params, null);
    }

    /**
     * Reklam kitleleri
     *
     * {@code GET /v1/apps/{appId}/ads/audiences}
     */
    public AdAudienceList listAudiences(AdsListAudiencesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/audiences");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<AdAudience> TYPE_2 = new TypeReference<AdAudience>() {};

    /**
     * Reklam kitlesi oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/audiences}
     */
    public AdAudience createAudience(CreateAdAudienceDto body) {
        return createAudience(body, null);
    }

    /**
     * Reklam kitlesi oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/audiences}
     */
    public AdAudience createAudience(CreateAdAudienceDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ads/audiences");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<AdAudience> TYPE_3 = new TypeReference<AdAudience>() {};

    /**
     * Reklam kitlesi ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdAudience getAudience(String audienceId) {
        return getAudience(audienceId, null);
    }

    /**
     * Reklam kitlesi ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdAudience getAudience(String audienceId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/audiences/{audienceId}");
        op.pathParam("audienceId", audienceId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<AdAudience> TYPE_4 = new TypeReference<AdAudience>() {};

    /**
     * Reklam kitlesini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdAudience updateAudience(String audienceId, UpdateAdAudienceDto body) {
        return updateAudience(audienceId, body, null);
    }

    /**
     * Reklam kitlesini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdAudience updateAudience(String audienceId, UpdateAdAudienceDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/ads/audiences/{audienceId}");
        op.pathParam("audienceId", audienceId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<AdOk> TYPE_5 = new TypeReference<AdOk>() {};

    /**
     * Reklam kitlesini sil
     *
     * {@code DELETE /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdOk removeAudience(String audienceId) {
        return removeAudience(audienceId, null, null);
    }

    /**
     * Reklam kitlesini sil
     *
     * {@code DELETE /v1/apps/{appId}/ads/audiences/{audienceId}}
     */
    public AdOk removeAudience(String audienceId, AdsRemoveAudienceParams params) {
        return removeAudience(audienceId, params, null);
    }

    /**
     * Reklam kitlesini sil
     *
     * {@code DELETE /v1/apps/{appId}/ads/audiences/{audienceId}}
     *
     * Parametreler: delete_on_platform — Değerler: "true", "false".
     */
    public AdOk removeAudience(String audienceId, AdsRemoveAudienceParams params, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/ads/audiences/{audienceId}");
        op.pathParam("audienceId", audienceId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<AdAudienceSyncQueued> TYPE_6 = new TypeReference<AdAudienceSyncQueued>() {};

    /**
     * Senkronu şimdi çalıştır
     *
     * {@code POST /v1/apps/{appId}/ads/audiences/{audienceId}/sync}
     */
    public AdAudienceSyncQueued sync(String audienceId, SyncAdAudienceDto body) {
        return sync(audienceId, body, null);
    }

    /**
     * Senkronu şimdi çalıştır
     *
     * {@code POST /v1/apps/{appId}/ads/audiences/{audienceId}/sync}
     */
    public AdAudienceSyncQueued sync(String audienceId, SyncAdAudienceDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ads/audiences/{audienceId}/sync");
        op.pathParam("audienceId", audienceId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<AdAudienceSyncList> TYPE_7 = new TypeReference<AdAudienceSyncList>() {};

    /**
     * Senkron geçmişi
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}/syncs}
     */
    public AdAudienceSyncList syncs(String audienceId) {
        return syncs(audienceId, null, null);
    }

    /**
     * Senkron geçmişi
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}/syncs}
     */
    public AdAudienceSyncList syncs(String audienceId, AdsSyncsParams params) {
        return syncs(audienceId, params, null);
    }

    /**
     * Senkron geçmişi
     *
     * {@code GET /v1/apps/{appId}/ads/audiences/{audienceId}/syncs}
     */
    public AdAudienceSyncList syncs(String audienceId, AdsSyncsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/audiences/{audienceId}/syncs");
        op.pathParam("audienceId", audienceId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<AdAudience> TYPE_8 = new TypeReference<AdAudience>() {};

    /**
     * Benzer kitle (lookalike) oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/audiences/{audienceId}/lookalikes}
     */
    public AdAudience lookalike(String audienceId, CreateLookalikeDto body) {
        return lookalike(audienceId, body, null);
    }

    /**
     * Benzer kitle (lookalike) oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/audiences/{audienceId}/lookalikes}
     */
    public AdAudience lookalike(String audienceId, CreateLookalikeDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ads/audiences/{audienceId}/lookalikes");
        op.pathParam("audienceId", audienceId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<AdEntityList> TYPE_9 = new TypeReference<AdEntityList>() {};

    /**
     * Kampanya / reklam seti / reklam listesi ve metrikler
     *
     * {@code GET /v1/apps/{appId}/ads/campaigns}
     */
    public AdEntityList list() {
        return list(null, null);
    }

    /**
     * Kampanya / reklam seti / reklam listesi ve metrikler
     *
     * {@code GET /v1/apps/{appId}/ads/campaigns}
     */
    public AdEntityList list(AdsListParams params) {
        return list(params, null);
    }

    /**
     * Kampanya / reklam seti / reklam listesi ve metrikler
     *
     * {@code GET /v1/apps/{appId}/ads/campaigns}
     *
     * Parametreler: level — Değerler: "campaign", "ad_set", "ad".; status — Değerler: "active", "paused", "pending", "rejected", "archived", "deleted", "unknown".
     */
    public AdEntityList list(AdsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/campaigns");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<AdEntity> TYPE_10 = new TypeReference<AdEntity>() {};

    /**
     * Kampanya / reklam seti / reklam ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/ads/campaigns/{entityId}}
     */
    public AdEntity get(String entityId) {
        return get(entityId, null);
    }

    /**
     * Kampanya / reklam seti / reklam ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/ads/campaigns/{entityId}}
     */
    public AdEntity get(String entityId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/campaigns/{entityId}");
        op.pathParam("entityId", entityId);
        return client.execute(op, options, TYPE_10);
    }

    private static final TypeReference<AdEntity> TYPE_11 = new TypeReference<AdEntity>() {};

    /**
     * Durum ve günlük bütçe değişikliği
     *
     * {@code PATCH /v1/apps/{appId}/ads/campaigns/{entityId}}
     */
    public AdEntity update(String entityId, UpdateAdCampaignDto body) {
        return update(entityId, body, null);
    }

    /**
     * Durum ve günlük bütçe değişikliği
     *
     * {@code PATCH /v1/apps/{appId}/ads/campaigns/{entityId}}
     */
    public AdEntity update(String entityId, UpdateAdCampaignDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/ads/campaigns/{entityId}");
        op.pathParam("entityId", entityId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_11);
    }

    private static final TypeReference<AdRefreshQueued> TYPE_12 = new TypeReference<AdRefreshQueued>() {};

    /**
     * Kampanyaları ve metrikleri şimdi yenile
     *
     * {@code POST /v1/apps/{appId}/ads/accounts/{accountId}/refresh}
     */
    public AdRefreshQueued refresh(String accountId) {
        return refresh(accountId, null);
    }

    /**
     * Kampanyaları ve metrikleri şimdi yenile
     *
     * {@code POST /v1/apps/{appId}/ads/accounts/{accountId}/refresh}
     */
    public AdRefreshQueued refresh(String accountId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ads/accounts/{accountId}/refresh");
        op.pathParam("accountId", accountId);
        return client.execute(op, options, TYPE_12);
    }

    private static final TypeReference<AdSpendReport> TYPE_13 = new TypeReference<AdSpendReport>() {};

    /**
     * Harcama ve performans raporu
     *
     * {@code GET /v1/apps/{appId}/ads/reports/spend}
     */
    public AdSpendReport spend(String from, String to) {
        return spend(from, to, null, null);
    }

    /**
     * Harcama ve performans raporu
     *
     * {@code GET /v1/apps/{appId}/ads/reports/spend}
     */
    public AdSpendReport spend(String from, String to, AdsSpendParams params) {
        return spend(from, to, params, null);
    }

    /**
     * Harcama ve performans raporu
     *
     * {@code GET /v1/apps/{appId}/ads/reports/spend}
     *
     * Parametreler: group_by — Değerler: "day", "platform", "account", "campaign", "ad_set".
     */
    public AdSpendReport spend(String from, String to, AdsSpendParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/reports/spend");
        op.query("from", from);
        op.query("to", to);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_13);
    }

    private static final TypeReference<AdAttributionReport> TYPE_14 = new TypeReference<AdAttributionReport>() {};

    /**
     * Birleşik atribüsyon raporu (ROAS, CAC)
     *
     * {@code GET /v1/apps/{appId}/ads/reports/attribution}
     */
    public AdAttributionReport attribution(String from, String to) {
        return attribution(from, to, null, null);
    }

    /**
     * Birleşik atribüsyon raporu (ROAS, CAC)
     *
     * {@code GET /v1/apps/{appId}/ads/reports/attribution}
     */
    public AdAttributionReport attribution(String from, String to, AdsAttributionParams params) {
        return attribution(from, to, params, null);
    }

    /**
     * Birleşik atribüsyon raporu (ROAS, CAC)
     *
     * {@code GET /v1/apps/{appId}/ads/reports/attribution}
     *
     * Parametreler: model — Değerler: "last_click", "first_click", "linear", "time_decay".; group_by — Değerler: "channel", "campaign", "ad_set".
     */
    public AdAttributionReport attribution(String from, String to, AdsAttributionParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/reports/attribution");
        op.query("from", from);
        op.query("to", to);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_14);
    }

    private static final TypeReference<AdLtvReport> TYPE_15 = new TypeReference<AdLtvReport>() {};

    /**
     * Kohort LTV raporu
     *
     * {@code GET /v1/apps/{appId}/ads/reports/ltv}
     */
    public AdLtvReport ltv() {
        return ltv(null, null);
    }

    /**
     * Kohort LTV raporu
     *
     * {@code GET /v1/apps/{appId}/ads/reports/ltv}
     */
    public AdLtvReport ltv(AdsLtvParams params) {
        return ltv(params, null);
    }

    /**
     * Kohort LTV raporu
     *
     * {@code GET /v1/apps/{appId}/ads/reports/ltv}
     */
    public AdLtvReport ltv(AdsLtvParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/reports/ltv");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_15);
    }

    private static final TypeReference<AdCapiConfigList> TYPE_16 = new TypeReference<AdCapiConfigList>() {};

    /**
     * Conversions API yapılandırmaları
     *
     * {@code GET /v1/apps/{appId}/ads/conversions-api/configs}
     */
    public AdCapiConfigList capiConfigs() {
        return capiConfigs(null);
    }

    /**
     * Conversions API yapılandırmaları
     *
     * {@code GET /v1/apps/{appId}/ads/conversions-api/configs}
     */
    public AdCapiConfigList capiConfigs(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/conversions-api/configs");
        return client.execute(op, options, TYPE_16);
    }

    private static final TypeReference<AdCapiDeliveryList> TYPE_17 = new TypeReference<AdCapiDeliveryList>() {};

    /**
     * Conversions API teslim geçmişi
     *
     * {@code GET /v1/apps/{appId}/ads/conversions-api/deliveries}
     */
    public AdCapiDeliveryList capiDeliveries() {
        return capiDeliveries(null, null);
    }

    /**
     * Conversions API teslim geçmişi
     *
     * {@code GET /v1/apps/{appId}/ads/conversions-api/deliveries}
     */
    public AdCapiDeliveryList capiDeliveries(AdsCapiDeliveriesParams params) {
        return capiDeliveries(params, null);
    }

    /**
     * Conversions API teslim geçmişi
     *
     * {@code GET /v1/apps/{appId}/ads/conversions-api/deliveries}
     *
     * Parametreler: status — Değerler: "pending", "sent", "failed", "skipped".
     */
    public AdCapiDeliveryList capiDeliveries(AdsCapiDeliveriesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/conversions-api/deliveries");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_17);
    }

    private static final TypeReference<AdBudgetAlertRuleList> TYPE_18 = new TypeReference<AdBudgetAlertRuleList>() {};

    /**
     * Bütçe uyarı kuralları
     *
     * {@code GET /v1/apps/{appId}/ads/alert-rules}
     */
    public AdBudgetAlertRuleList rules() {
        return rules(null);
    }

    /**
     * Bütçe uyarı kuralları
     *
     * {@code GET /v1/apps/{appId}/ads/alert-rules}
     */
    public AdBudgetAlertRuleList rules(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/alert-rules");
        return client.execute(op, options, TYPE_18);
    }

    private static final TypeReference<AdBudgetAlertRule> TYPE_19 = new TypeReference<AdBudgetAlertRule>() {};

    /**
     * Bütçe uyarı kuralı oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/alert-rules}
     */
    public AdBudgetAlertRule createRule(CreateBudgetAlertRuleDto body) {
        return createRule(body, null);
    }

    /**
     * Bütçe uyarı kuralı oluştur
     *
     * {@code POST /v1/apps/{appId}/ads/alert-rules}
     */
    public AdBudgetAlertRule createRule(CreateBudgetAlertRuleDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/ads/alert-rules");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_19);
    }

    private static final TypeReference<AdBudgetAlertRule> TYPE_20 = new TypeReference<AdBudgetAlertRule>() {};

    /**
     * Bütçe uyarı kuralını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/ads/alert-rules/{ruleId}}
     */
    public AdBudgetAlertRule updateRule(String ruleId, UpdateBudgetAlertRuleDto body) {
        return updateRule(ruleId, body, null);
    }

    /**
     * Bütçe uyarı kuralını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/ads/alert-rules/{ruleId}}
     */
    public AdBudgetAlertRule updateRule(String ruleId, UpdateBudgetAlertRuleDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/ads/alert-rules/{ruleId}");
        op.pathParam("ruleId", ruleId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_20);
    }

    private static final TypeReference<AdOk> TYPE_21 = new TypeReference<AdOk>() {};

    /**
     * Bütçe uyarı kuralını sil
     *
     * {@code DELETE /v1/apps/{appId}/ads/alert-rules/{ruleId}}
     */
    public AdOk removeRule(String ruleId) {
        return removeRule(ruleId, null);
    }

    /**
     * Bütçe uyarı kuralını sil
     *
     * {@code DELETE /v1/apps/{appId}/ads/alert-rules/{ruleId}}
     */
    public AdOk removeRule(String ruleId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/ads/alert-rules/{ruleId}");
        op.pathParam("ruleId", ruleId);
        return client.execute(op, options, TYPE_21);
    }

    private static final TypeReference<AdBudgetAlertList> TYPE_22 = new TypeReference<AdBudgetAlertList>() {};

    /**
     * Tetiklenen bütçe uyarıları
     *
     * {@code GET /v1/apps/{appId}/ads/alerts}
     */
    public AdBudgetAlertList alertHistory() {
        return alertHistory(null, null);
    }

    /**
     * Tetiklenen bütçe uyarıları
     *
     * {@code GET /v1/apps/{appId}/ads/alerts}
     */
    public AdBudgetAlertList alertHistory(AdsAlertHistoryParams params) {
        return alertHistory(params, null);
    }

    /**
     * Tetiklenen bütçe uyarıları
     *
     * {@code GET /v1/apps/{appId}/ads/alerts}
     */
    public AdBudgetAlertList alertHistory(AdsAlertHistoryParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/ads/alerts");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_22);
    }
}
