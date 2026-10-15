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
 * emailDeliverability kaynağı.
 */
public final class EmailDeliverabilityResource {
    private final HeroSignal client;

    public EmailDeliverabilityResource(HeroSignal client) {
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
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
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
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
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
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
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
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
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
}
