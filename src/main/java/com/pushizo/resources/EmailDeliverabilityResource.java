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
 * emailDeliverability kaynağı.
 */
public final class EmailDeliverabilityResource {
    private final Pushizo client;

    public EmailDeliverabilityResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<EmailDeliverabilitySettings> TYPE_0 = new TypeReference<EmailDeliverabilitySettings>() {};

    /**
     * E-posta teslim ayarları (BCC/arşiv, gönderim öncesi adres doğrulama, üçüncü taraf doğrulayıcı)
     *
     * {@code GET /v1/apps/{appId}/email-deliverability}
     */
    public EmailDeliverabilitySettings settings() {
        return settings(null);
    }

    /**
     * E-posta teslim ayarları (BCC/arşiv, gönderim öncesi adres doğrulama, üçüncü taraf doğrulayıcı)
     *
     * {@code GET /v1/apps/{appId}/email-deliverability}
     */
    public EmailDeliverabilitySettings settings(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/email-deliverability");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<EmailDeliverabilitySettings> TYPE_1 = new TypeReference<EmailDeliverabilitySettings>() {};

    /**
     * E-posta teslim ayarlarını güncelle (doğrulayıcı anahtarı zarf şifreli saklanır, geri okunmaz)
     *
     * {@code PUT /v1/apps/{appId}/email-deliverability}
     */
    public EmailDeliverabilitySettings update(DeliverabilitySettingsDto body) {
        return update(body, null);
    }

    /**
     * E-posta teslim ayarlarını güncelle (doğrulayıcı anahtarı zarf şifreli saklanır, geri okunmaz)
     *
     * {@code PUT /v1/apps/{appId}/email-deliverability}
     */
    public EmailDeliverabilitySettings update(DeliverabilitySettingsDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/email-deliverability");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<EmailAddressCheck> TYPE_2 = new TypeReference<EmailAddressCheck>() {};

    /**
     * Adres doğrulama testi (sözdizimi, MX, tek kullanımlık alan adı, rol hesabı, üçüncü taraf)
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/verify-address}
     */
    public EmailAddressCheck verify(VerifyAddressDto body) {
        return verify(body, null);
    }

    /**
     * Adres doğrulama testi (sözdizimi, MX, tek kullanımlık alan adı, rol hesabı, üçüncü taraf)
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/verify-address}
     */
    public EmailAddressCheck verify(VerifyAddressDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/email-deliverability/verify-address");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<EmailWarmupPlanList> TYPE_3 = new TypeReference<EmailWarmupPlanList>() {};

    /**
     * Isındırma planları (bugünkü limit/kullanım ve ileri günlere ayrılmış gönderimler)
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/warmup-plans}
     */
    public EmailWarmupPlanList plans() {
        return plans(null);
    }

    /**
     * Isındırma planları (bugünkü limit/kullanım ve ileri günlere ayrılmış gönderimler)
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/warmup-plans}
     */
    public EmailWarmupPlanList plans(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/email-deliverability/warmup-plans");
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<EmailWarmupPlan> TYPE_4 = new TypeReference<EmailWarmupPlan>() {};

    /**
     * Isındırma planı oluştur (günlük limit eğrisi veya başlangıç/çarpan/hedef; sağlayıcı payları)
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/warmup-plans}
     */
    public EmailWarmupPlan create(CreateWarmupPlanDto body) {
        return create(body, null);
    }

    /**
     * Isındırma planı oluştur (günlük limit eğrisi veya başlangıç/çarpan/hedef; sağlayıcı payları)
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/warmup-plans}
     */
    public EmailWarmupPlan create(CreateWarmupPlanDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/email-deliverability/warmup-plans");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<EmailWarmupPlan> TYPE_5 = new TypeReference<EmailWarmupPlan>() {};

    /**
     * Isındırma planı
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/warmup-plans/{planId}}
     */
    public EmailWarmupPlan get(String planId) {
        return get(planId, null);
    }

    /**
     * Isındırma planı
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/warmup-plans/{planId}}
     */
    public EmailWarmupPlan get(String planId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/email-deliverability/warmup-plans/{planId}");
        op.pathParam("planId", planId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<EmailWarmupPlan> TYPE_6 = new TypeReference<EmailWarmupPlan>() {};

    /**
     * Isındırma planını güncelle (duraklat/sürdür, eğri, paylar)
     *
     * {@code PATCH /v1/apps/{appId}/email-deliverability/warmup-plans/{planId}}
     */
    public EmailWarmupPlan updatePlan(String planId, UpdateWarmupPlanDto body) {
        return updatePlan(planId, body, null);
    }

    /**
     * Isındırma planını güncelle (duraklat/sürdür, eğri, paylar)
     *
     * {@code PATCH /v1/apps/{appId}/email-deliverability/warmup-plans/{planId}}
     */
    public EmailWarmupPlan updatePlan(String planId, UpdateWarmupPlanDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/email-deliverability/warmup-plans/{planId}");
        op.pathParam("planId", planId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<Ok> TYPE_7 = new TypeReference<Ok>() {};

    /**
     * Isındırma planını sil
     *
     * {@code DELETE /v1/apps/{appId}/email-deliverability/warmup-plans/{planId}}
     */
    public Ok delete(String planId) {
        return delete(planId, null);
    }

    /**
     * Isındırma planını sil
     *
     * {@code DELETE /v1/apps/{appId}/email-deliverability/warmup-plans/{planId}}
     */
    public Ok delete(String planId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/email-deliverability/warmup-plans/{planId}");
        op.pathParam("planId", planId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<EmailWarmupUsage> TYPE_8 = new TypeReference<EmailWarmupUsage>() {};

    /**
     * Isındırma planı gün × sağlayıcı kullanımı
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/warmup-plans/{planId}/usage}
     */
    public EmailWarmupUsage usage(String planId) {
        return usage(planId, null, null);
    }

    /**
     * Isındırma planı gün × sağlayıcı kullanımı
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/warmup-plans/{planId}/usage}
     */
    public EmailWarmupUsage usage(String planId, EmailDeliverabilityUsageParams params) {
        return usage(planId, params, null);
    }

    /**
     * Isındırma planı gün × sağlayıcı kullanımı
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/warmup-plans/{planId}/usage}
     */
    public EmailWarmupUsage usage(String planId, EmailDeliverabilityUsageParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/email-deliverability/warmup-plans/{planId}/usage");
        op.pathParam("planId", planId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<EmailHygieneStatus> TYPE_9 = new TypeReference<EmailHygieneStatus>() {};

    /**
     * Liste temizliği durumu: e-posta aboneliklerinin denetim dağılımı ve son doğrulama çalıştırması
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/hygiene}
     */
    public EmailHygieneStatus hygiene() {
        return hygiene(null);
    }

    /**
     * Liste temizliği durumu: e-posta aboneliklerinin denetim dağılımı ve son doğrulama çalıştırması
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/hygiene}
     */
    public EmailHygieneStatus hygiene(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/email-deliverability/hygiene");
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<EmailHygieneStart> TYPE_10 = new TypeReference<EmailHygieneStart>() {};

    /**
     * Listeyi doğrula: tüm e-posta aboneliklerini toplu, hız sınırlı doğrula (etkin çalıştırma varsa o döner)
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/hygiene-runs}
     */
    public EmailHygieneStart startHygiene(java.util.Map<String, Object> body) {
        return startHygiene(body, null);
    }

    /**
     * Listeyi doğrula: tüm e-posta aboneliklerini toplu, hız sınırlı doğrula (etkin çalıştırma varsa o döner)
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/hygiene-runs}
     */
    public EmailHygieneStart startHygiene(java.util.Map<String, Object> body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/email-deliverability/hygiene-runs");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_10);
    }

    private static final TypeReference<EmailHygieneRun> TYPE_11 = new TypeReference<EmailHygieneRun>() {};

    /**
     * Liste doğrulama çalıştırması (ilerleme ve özet)
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/hygiene-runs/{runId}}
     */
    public EmailHygieneRun hygieneRun(String runId) {
        return hygieneRun(runId, null);
    }

    /**
     * Liste doğrulama çalıştırması (ilerleme ve özet)
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/hygiene-runs/{runId}}
     */
    public EmailHygieneRun hygieneRun(String runId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/email-deliverability/hygiene-runs/{runId}");
        op.pathParam("runId", runId);
        return client.execute(op, options, TYPE_11);
    }

    private static final TypeReference<EmailHygieneSuppress> TYPE_12 = new TypeReference<EmailHygieneSuppress>() {};

    /**
     * Doğrulamada geçersiz bulunan adresleri bastır (abonelik invalid + suppression list)
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/hygiene-runs/{runId}/suppress}
     */
    public EmailHygieneSuppress suppressHygiene(String runId, java.util.Map<String, Object> body) {
        return suppressHygiene(runId, body, null);
    }

    /**
     * Doğrulamada geçersiz bulunan adresleri bastır (abonelik invalid + suppression list)
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/hygiene-runs/{runId}/suppress}
     */
    public EmailHygieneSuppress suppressHygiene(String runId, java.util.Map<String, Object> body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/email-deliverability/hygiene-runs/{runId}/suppress");
        op.pathParam("runId", runId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_12);
    }

    private static final TypeReference<EmailProviderInsights> TYPE_13 = new TypeReference<EmailProviderInsights>() {};

    /**
     * Posta sağlayıcısı bazında (Gmail, Outlook, Yahoo, diğer) teslim, açılma, tıklama, bounce ve şikâyet sayıları
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/insights}
     */
    public EmailProviderInsights insights() {
        return insights(null, null);
    }

    /**
     * Posta sağlayıcısı bazında (Gmail, Outlook, Yahoo, diğer) teslim, açılma, tıklama, bounce ve şikâyet sayıları
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/insights}
     */
    public EmailProviderInsights insights(EmailDeliverabilityInsightsParams params) {
        return insights(params, null);
    }

    /**
     * Posta sağlayıcısı bazında (Gmail, Outlook, Yahoo, diğer) teslim, açılma, tıklama, bounce ve şikâyet sayıları
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/insights}
     */
    public EmailProviderInsights insights(EmailDeliverabilityInsightsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/email-deliverability/insights");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_13);
    }

    private static final TypeReference<EmailBounceStats> TYPE_14 = new TypeReference<EmailBounceStats>() {};

    /**
     * E-posta bounce eğilimi (%2 hedef), tür/neden dağılımı ve en çok bounce alan alıcı alan adları
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/bounces}
     */
    public EmailBounceStats bounces() {
        return bounces(null, null);
    }

    /**
     * E-posta bounce eğilimi (%2 hedef), tür/neden dağılımı ve en çok bounce alan alıcı alan adları
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/bounces}
     */
    public EmailBounceStats bounces(EmailDeliverabilityBouncesParams params) {
        return bounces(params, null);
    }

    /**
     * E-posta bounce eğilimi (%2 hedef), tür/neden dağılımı ve en çok bounce alan alıcı alan adları
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/bounces}
     */
    public EmailBounceStats bounces(EmailDeliverabilityBouncesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/email-deliverability/bounces");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_14);
    }

    private static final TypeReference<PostmasterStats> TYPE_15 = new TypeReference<PostmasterStats>() {};

    /**
     * Google Postmaster itibar kayıtları
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/postmaster}
     */
    public PostmasterStats postmaster() {
        return postmaster(null);
    }

    /**
     * Google Postmaster itibar kayıtları
     *
     * {@code GET /v1/apps/{appId}/email-deliverability/postmaster}
     */
    public PostmasterStats postmaster(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/email-deliverability/postmaster");
        return client.execute(op, options, TYPE_15);
    }

    private static final TypeReference<PostmasterStats> TYPE_16 = new TypeReference<PostmasterStats>() {};

    /**
     * Google Postmaster dünkü itibarını oku
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/postmaster/sync}
     */
    public PostmasterStats syncPostmaster() {
        return syncPostmaster(null);
    }

    /**
     * Google Postmaster dünkü itibarını oku
     *
     * {@code POST /v1/apps/{appId}/email-deliverability/postmaster/sync}
     */
    public PostmasterStats syncPostmaster(RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/email-deliverability/postmaster/sync");
        return client.execute(op, options, TYPE_16);
    }
}
